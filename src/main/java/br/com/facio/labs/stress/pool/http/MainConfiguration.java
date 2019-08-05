package br.com.facio.labs.stress.pool.http;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.httpclient.HttpClientMetricNameStrategies;
import com.codahale.metrics.httpclient.InstrumentedHttpClientConnectionManager;
import com.codahale.metrics.httpclient.InstrumentedHttpClients;
import com.codahale.metrics.httpclient.InstrumentedHttpRequestExecutor;
import com.codahale.metrics.jmx.JmxReporter;
import java.util.concurrent.TimeUnit;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author fabianocp
 */
@Configuration
public class MainConfiguration {

    private static Logger LOG = LoggerFactory.getLogger(MainConfiguration.class);

    @Value("${stresspool.http.connection.timeout}")
    private String connectionTimeout;

    @Value("${stresspool.http.read.timeout}")
    private String readTimeout;

    @Value("${stresspool.http.performance.issue}")
    private boolean performanceIssue;

    @Value("${stresspool.http.max.conn.per.route}")
    private int maxConnPerRoute;

    @Value("${stresspool.http.max.conn.total}")
    private int maxConnTotal;

    @Value("${stresspool.http.max.conn.ttl.inseconds}")
    private int maxConnTtlInSeconds;

    @Bean
    public MetricRegistry metricRegistryJMX() {
        LOG.info("Creating Metrics with JMX report ...");
        MetricRegistry registry = new MetricRegistry();
        JmxReporter reporter = JmxReporter.forRegistry(registry).build();
        reporter.start();
        LOG.info("JMX report started.");

        return registry;
    }

    @Bean
    public CloseableHttpClient httpClient(MetricRegistry registry) {
        CloseableHttpClient client = null;
        if (!performanceIssue) {
            LOG.info("------> Default HTTP, Fixed. Performance OK !!!");
            client = newHttpClient(registry);
        } else {
            LOG.warn("------> Houston We Have a Problem performance problem !!!!!");
            client = oldSchoolHttpClient();
        }

        return client;
    }

    private CloseableHttpClient newHttpClient(MetricRegistry registry) throws NumberFormatException {
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectionRequestTimeout(Integer.parseInt(connectionTimeout))
                .setConnectTimeout(Integer.parseInt(connectionTimeout))
                .setSocketTimeout(Integer.parseInt(readTimeout)).build();
        
        InstrumentedHttpClientConnectionManager connManager = InstrumentedHttpClientConnectionManager
                .builder(registry).connTTL(maxConnTtlInSeconds).connTTLTimeUnit(TimeUnit.SECONDS).build();
        connManager.setDefaultMaxPerRoute(maxConnPerRoute);
        connManager.setMaxTotal(maxConnTotal);
        connManager.setDefaultConnectionConfig(ConnectionConfig.DEFAULT);
                
        CloseableHttpClient client = HttpClientBuilder.create()
                .setDefaultRequestConfig(requestConfig)
                .disableAutomaticRetries()
                .setRequestExecutor(
                        new InstrumentedHttpRequestExecutor(registry, HttpClientMetricNameStrategies.HOST_AND_METHOD))
                .setConnectionManager(connManager).build();
        
        return client;
    }

    private CloseableHttpClient oldSchoolHttpClient() throws NumberFormatException {
        CloseableHttpClient client = new DefaultHttpClient(createHttpPool());
        org.apache.http.params.HttpConnectionParams.setSoTimeout(client.getParams(),
                Integer.parseInt(readTimeout));
        org.apache.http.params.HttpConnectionParams.setConnectionTimeout(
                client.getParams(), Integer.parseInt(connectionTimeout));
        return client;
    }

    private ClientConnectionManager createHttpPool() {
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(
                new Scheme("http", 80, PlainSocketFactory.getSocketFactory()));

        PoolingClientConnectionManager cm = new PoolingClientConnectionManager(schemeRegistry);
        return cm;
    }
}
