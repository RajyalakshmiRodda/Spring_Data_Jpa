package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Controller.Pizzacontroller;

@SpringBootApplication
public class AnnotationbasedApplication {

	public static void main(String[] args) {
		ApplicationContext a=SpringApplication.run(AnnotationbasedApplication.class, args);
		Pizzacontroller p=a.getBean(Pizzacontroller.class);
		System.out.println(p.getpizza());
	}

}
