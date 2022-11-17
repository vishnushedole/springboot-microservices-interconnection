package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user1")
public class User {

	private String name;
	@Id
	private String id;
	public User(String name, String id, int itemId, Product product) {
		super();
		this.name = name;
		this.id = id;
		this.itemId = itemId;
		this.product = product;
	}
	private int itemId;
	private Product product;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	

	
}
