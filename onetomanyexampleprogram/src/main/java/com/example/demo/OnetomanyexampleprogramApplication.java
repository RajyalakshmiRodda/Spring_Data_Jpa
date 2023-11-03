package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entity.Bank;
import com.example.demo.Entity.Customers;
import com.example.demo.Repository.BankRepository;
import com.example.demo.Repository.CustomerRepository;

@SpringBootApplication
public class OnetomanyexampleprogramApplication implements CommandLineRunner {

	@Autowired
	private BankRepository br;
	
	@Autowired
	private CustomerRepository cr;
	
	public static void main(String[] args) {
		SpringApplication.run(OnetomanyexampleprogramApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Bank b=new Bank("raji","1234pnb");
		
		Customers c=new Customers("kommavaram");
		Customers c1=new Customers("edara");
		
		b.getC().add(c);
		b.getC().add(c1);
		br.save(b);
		
	}

}
