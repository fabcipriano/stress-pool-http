package br.com.facio.labs.stress.pool.http.controller;

import br.com.facio.labs.stress.pool.http.service.ProductSOAService;
import br.com.facio.labs.stress.pool.http.service.ProductService;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fabianocp
 */
@RestController
public class SimpleController {

    private static Logger LOG = LoggerFactory.getLogger(ProductSOAService.class);
    
    @Autowired
    private ProductService product;

    @GetMapping
    public ResponseEntity<?> sayHello() {
        return ResponseEntity.status(HttpStatus.OK).body("Welcome to this simple Sprint boot for stress test");
    }

    @GetMapping(path = "/list" )
    public ResponseEntity<?> getList() {

        List list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Zero");
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @GetMapping(value = "/assets/{id}/{target}")
    public String getAssets(@PathVariable String id, @PathVariable String target) {
        LOG.info("start request ...");

        product.queryAssets(id, target);

        return "";
    }

}
