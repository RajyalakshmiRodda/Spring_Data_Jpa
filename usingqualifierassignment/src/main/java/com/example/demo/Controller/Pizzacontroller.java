package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;

import com.example.demo.Service.Pizza;

@Component
public class Pizzacontroller {
	private Pizza p;
	public Pizzacontroller(@Qualifier("Nonvegpizza")Pizza p) {
		super();
		this.p=p;
		// TODO Auto-generated constructor stub
	}
	
	public String getorder() {
		return p.getpizza();
		
	}

}
