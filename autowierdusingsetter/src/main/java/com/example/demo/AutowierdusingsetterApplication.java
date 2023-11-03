package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Controller.StuController;

@SpringBootApplication
public class AutowierdusingsetterApplication {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(AutowierdusingsetterApplication.class, args);
	    StuController s=ac.getBean(StuController.class);
	    System.out.println(s.access());
	    
	
	}

}
