package com.example.demo.Service;

import org.springframework.stereotype.Component;

@Component 
public class Mixpizza implements Pizza {

	@Override
	public String getpizza() {
		// TODO Auto-generated method stub
		return "i want mix pizza";
	}

}
