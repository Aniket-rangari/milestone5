package com.example.mileston_5.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ElectronicDevice {
	
	@Id
	private int id;
	private String name;
	private String Category;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public ElectronicDevice(int id, String name, String category, int price) {
		super();
		this.id = id;
		this.name = name;
		Category = category;
		this.price = price;
	}
	public ElectronicDevice() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
}
