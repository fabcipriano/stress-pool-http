package br.com.facio.labs.stress.pool.http;

import br.com.facio.labs.stress.pool.http.service.ProductService;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

/**
 *
 * @author fabianocp
 */
@Configuration
public class MainConfiguration {

    @Value("${stresspool.http.connection.timeout}")
    private String connectionTimeout;

    @Value("${stresspool.http.read.timeout}")
    private String readTimeout;

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
        
        ClientConnectionManager cm = new PoolingClientConnectionManager(schemeRegistry);
        
        return cm;
    }
}
