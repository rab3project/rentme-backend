package com.rentme.controller;

import com.rentme.entities.Product;
import com.rentme.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(value = "/productinfo", method = RequestMethod.POST)
    public void createProduct(@Valid @RequestBody Product product){
        productRepository.save(product);

    }

}
