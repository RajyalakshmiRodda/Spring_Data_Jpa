package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Stationary {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="pen_name")
	private String penname;
	private int price;
	
	public Stationary() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Stationary(int id, String penname, int price) {
		super();
		this.id = id;
		this.penname = penname;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPenname() {
		return penname;
	}
	public void setPenname(String penname) {
		this.penname = penname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Stationary [id=" + id + ", penname=" + penname + ", price=" + price + "]";
	}
	

}
