package br.com.facio.labs.stress.pool.http;

import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.DefaultHttpClient;
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

    @Bean
    public HttpClient httpClient() {
        HttpClient client = new DefaultHttpClient(createHttpPool());

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
        if (!performanceIssue) {
            LOG.info("Fixed. Performance OK !!!");
            cm.setDefaultMaxPerRoute(60);
            cm.setMaxTotal(600);
        } else {
            LOG.warn(" -----> Houston We Have a Problem performance problem !!!!!");
        }

        return cm;
    }
}
