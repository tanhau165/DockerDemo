package com.controller;

import com.domain.Product;
import com.reponsitory.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @RequestMapping(value = "products")
    public ResponseEntity<List<Product>> getAll(){
        return new ResponseEntity<>(productRepository.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "product/{name}")
    public ResponseEntity<Product> get(@PathVariable(value = "name") String name){
        Product product = productRepository.getOne(name);

        if(product==null){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(product, HttpStatus.OK);

    }

}
