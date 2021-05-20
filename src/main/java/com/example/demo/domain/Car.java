package com.example.demo.domain;

public class Car {
	private String name;
	private Integer price;
	private String owner;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", owner=" + owner + "]";
	}
	
	
}
