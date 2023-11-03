package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo.Service.Payment;
@Component
public class Paymentprocessor {
	private Payment p;

	public Paymentprocessor(@Qualifier("creditcard")Payment p) {
		super();
		this.p=p;
		// TODO Auto-generated constructor stub
	}
	
	public String makepayment() {
		return p.paybill();
		
		
	}

}
