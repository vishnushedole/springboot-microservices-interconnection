package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Repository.UserRepository;
import com.example.demo.entity.Product;
import com.example.demo.entity.User;

@Service
public class UserService {
	
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	UserRepository userrepository;
	
	public Product getProduct(int Id)
	{
		return restTemplate.getForObject("http://localhost:8080//findById/"+Id, Product.class);
	}
	public User getUserById(String Id)
	{

		 
		return userrepository.findById(Id).orElse(null);
	}

	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userrepository.findAll();
	}
	public User save(User user)
	{
		return userrepository.save(user);
	}
}
