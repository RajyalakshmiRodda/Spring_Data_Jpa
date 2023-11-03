package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entity.Stationary;
import com.example.demo.Repository.StationaryRepository;

@SpringBootApplication
public class ExistingbyidinspringdatajpaApplication implements CommandLineRunner {

	@Autowired
	private StationaryRepository sr;
	
	public static void main(String[] args) {
		SpringApplication.run(ExistingbyidinspringdatajpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	    Integer id=1;
	    Stationary s=sr.findById(id).get();
	    s.setPenname("parker");
	    s.setPrice(1000);
	    sr.save(s);
		
//		Stationary s=new Stationary();
//		s.setPenname("black");
//		s.setPrice(10);
//		s.setPenname("parker");
//		s.setPrice(600);
//		sr.save(s);
//		
//		Boolean Status=sr.existsById(1);
//		System.out.println(Status);
//		
//		if (Status) {
//			System.out.println("id is present");
//		}
//		else {
//			System.out.println("id is not present");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
