package com.rentme.controller;

import com.rentme.dtos.ProductDto;
import com.rentme.entities.ProductEntity;
import com.rentme.repositories.ProductRepository;
import com.rentme.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Id;
import javax.validation.Valid;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService pService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void createProduct(@RequestParam Long id ,@RequestBody ProductDto pdto) {
    pService.addProducts(id, pdto);
	}
	
}
