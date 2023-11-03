package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entity.Address;
import com.example.demo.Entity.Order;
import com.example.demo.Repository.OrderRepository;

@SpringBootApplication
public class Onetoonemapping1Application implements CommandLineRunner {
	
	@Autowired
	private OrderRepository or;

	public static void main(String[] args) {
		SpringApplication.run(Onetoonemapping1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Order r=new Order();
		r.setId(1);
		r.setName("raji");
		r.setPrice(1000);
		
		Address a=new Address();
		a.setId(2);
		a.setCity("vinukonda");
		r.setAdd(a);
		
		or.save(r);
		
		
	}

}
