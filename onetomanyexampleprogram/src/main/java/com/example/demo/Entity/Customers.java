package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customers {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String address;
	
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customers(String address) {
		super();
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
