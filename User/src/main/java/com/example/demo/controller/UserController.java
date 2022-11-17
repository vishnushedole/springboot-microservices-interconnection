package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userservice;
	
	
	@GetMapping("/getUsers/{id}")
	public User getUserProducts(@PathVariable String id)
	{
		User user;
		user = userservice.getUserById(id);
		user.setProduct(userservice.getProduct(user.getItemId()));
		return user;
	}
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user)
	{
		return userservice.save(user);
	}
}
