package com.cisco.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.rest.model.Product;
import com.cisco.rest.repo.ProductRepository;

@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
	ProductRepository repo;
	@PostMapping
	public String addNewProduct(@RequestBody Product
			product) {
		repo.addProduct(product);
		return "New Product Added successfully";
	}
	@GetMapping
	public List<Product> getAllProducts(){
		return repo.getAllProducts();
	}
}


