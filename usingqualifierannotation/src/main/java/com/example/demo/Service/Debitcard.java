package com.example.demo.Service;

import org.springframework.stereotype.Component;

@Component
public class Debitcard implements Payment {

	@Override
	public String paybill() {
		return "using debit card";
		// TODO Auto-generated method stub
		
	}

}
