package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Service.Creditcard;

public class Paymentprocessor {
	private Creditcard ccard;
@Autowired
	public Paymentprocessor() {
		super();
		this.ccard=ccard;
		// TODO Auto-generated constructor stub
	}
	public String access() {
		return "ccard.paybill()";
		
	}
	

}
