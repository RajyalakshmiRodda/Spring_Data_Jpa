package com.example.demo.Service;

import org.springframework.stereotype.Component;

@Component
public class Nonvegpizza implements Pizza {

	@Override
	public String getpizza() {
		// TODO Auto-generated method stub
		return "i want nonveg pizza";
	}

}
