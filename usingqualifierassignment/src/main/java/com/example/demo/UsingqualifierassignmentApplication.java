package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Controller.Pizzacontroller;

@SpringBootApplication
public class UsingqualifierassignmentApplication {

	public static void main(String[] args) {
		ApplicationContext a= SpringApplication.run(UsingqualifierassignmentApplication.class, args);
	 Pizzacontroller pi=a.getBean(Pizzacontroller.class);
	 System.out.println(pi.getorder());
		
	}

}
