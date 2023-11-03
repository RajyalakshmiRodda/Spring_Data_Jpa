package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entity.Company;
import com.example.demo.Repository.CompanyRepository;

@SpringBootApplication
public class SavingdmultiplevaluesusingsdjApplication implements CommandLineRunner {

	@Autowired
	private CompanyRepository cr;
	
	public static void main(String[] args) {
		SpringApplication.run(SavingdmultiplevaluesusingsdjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Company c=new Company();
		c.setId(56);
		c.setName("raj");
		c.setDept("tech");
		
		Company c1=new Company();
		c.setId(1);
		c.setName("raji");
		c.setDept("developer");
		
		cr.saveAll(List.of(c,c1));
		
		
		
	}

}
