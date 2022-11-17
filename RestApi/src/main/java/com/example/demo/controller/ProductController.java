package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import com.example.demo.entity.Product;
import com.example.demo.service.Productservice;

@RestController
@EnableCaching
public class ProductController {
 
	@Autowired
	Productservice productservice;
	
	@PostMapping("/save")
	public Product save(@RequestBody Product product) 
	{
		return productservice.save(product);
	}
	@PostMapping("/saveAll")
	public List<Product> saveAll(@RequestBody  List<Product> products) 
	{
		return productservice.saveAll(products);
	}
	@GetMapping("/findById/{id}")
	@Cacheable(value="Product")
	public Product findById(@PathVariable int id)
	{
		return productservice.findById(id);
	}
	@GetMapping("/findAll")
	@Cacheable(value="Product")
	public List<Product> findAll()
	{
		return productservice.findAll();
	}
}
