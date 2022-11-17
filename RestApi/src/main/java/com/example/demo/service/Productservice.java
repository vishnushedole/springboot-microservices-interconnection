package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class Productservice {

	@Autowired
	ProductRepository repository;
	
	public Product save(Product product)
	{
		return repository.save(product);
	}
	public List<Product> saveAll(List<Product> products)
	{
		return repository.saveAll(products);
	}
	public Product findById(int id)
	{
		System.out.println("Fetching from Database");
		return repository.findById(id).orElse(null);
	}
	public List<Product> findAll()
	{
		System.out.println("Fetching from Database");
		return repository.findAll();
	}
}
