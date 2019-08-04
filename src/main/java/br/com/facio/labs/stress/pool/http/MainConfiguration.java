package br.com.facio.labs.stress.pool.http;

import java.util.concurrent.TimeUnit;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
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
    public CloseableHttpClient httpClient() {
        CloseableHttpClient client = null;
        if (!performanceIssue) {
            LOG.info("------> Default HTTP, Fixed. Performance OK !!!");
            client = newHttpClient();
        } else {
            LOG.warn("------> Houston We Have a Problem performance problem !!!!!");
            client = oldSchoolHttpClient(client);
        }

        return client;
    }

    private CloseableHttpClient newHttpClient() throws NumberFormatException {
        CloseableHttpClient client;
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectionRequestTimeout(Integer.parseInt(connectionTimeout))
                .setConnectTimeout(Integer.parseInt(connectionTimeout))
                .setSocketTimeout(Integer.parseInt(readTimeout)).build();
        HttpClientBuilder builder = HttpClientBuilder.create()
                .setDefaultRequestConfig(requestConfig)
                .setConnectionTimeToLive(maxConnTtlInSeconds, TimeUnit.SECONDS)
                .setMaxConnPerRoute(maxConnPerRoute)
                .setMaxConnTotal(maxConnTotal);
        client = builder.build();
        return client;
    }

    private CloseableHttpClient oldSchoolHttpClient(CloseableHttpClient client) throws NumberFormatException {
        client = new DefaultHttpClient(createHttpPool());
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
