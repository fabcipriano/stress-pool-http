package br.com.facio.labs.stress.pool.http;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author fabianocp
 */
@SpringBootApplication
public class Main {
    private static Logger LOG = LoggerFactory.getLogger(Main.class);
    
    public static void main(String[] args) {
        LOG.info("Starting here ... ");
        SpringApplication.run(Main.class, args);
        LOG.info("FINISHED!!!");
    }

}
