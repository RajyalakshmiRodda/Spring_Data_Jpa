package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Service.Creditcard;

@SpringBootApplication
public class AssignmentonconstructorApplication {

	public static void main(String[] args) {
		ApplicationContext a= SpringApplication.run(AssignmentonconstructorApplication.class, args);
	    Creditcard c=a.getBean(Creditcard.class);
	    c.paybill();
	    
	    
	
	}

}
