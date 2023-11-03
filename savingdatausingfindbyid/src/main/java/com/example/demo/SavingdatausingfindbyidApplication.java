package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entity.Bank;
import com.example.demo.Repository.BankRepository;

@SpringBootApplication
public class SavingdatausingfindbyidApplication implements CommandLineRunner  {
@Autowired
private BankRepository br;
	public static void main(String[] args) {
		SpringApplication.run(SavingdatausingfindbyidApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		b.setId(1);
		b.setName("raj");
		b.setSalary(10000);
		br.save(b);
		
		Bank b1=br.findById(b.getId()).get();
		System.out.println(b1);
		
		
	}

}
