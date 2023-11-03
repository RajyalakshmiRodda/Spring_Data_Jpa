package com.example.demo.Service;

import org.springframework.stereotype.Component;

@Component 
public class Debitcard implements Payment {

	@Override
	public String paybill() {
		// TODO Auto-generated method stub
		return "using debit card";
		
	}

}
