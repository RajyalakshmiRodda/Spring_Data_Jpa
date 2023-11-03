package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Controller.Paymentprocessor;

@SpringBootApplication
public class UsingqualifierannotationApplication {

	public static void main(String[] args) {
		 ApplicationContext a= SpringApplication.run(UsingqualifierannotationApplication.class, args);
	     Paymentprocessor pa=a.getBean(Paymentprocessor.class);
	     System.out.println(pa.makepayment());
	
	}

}
