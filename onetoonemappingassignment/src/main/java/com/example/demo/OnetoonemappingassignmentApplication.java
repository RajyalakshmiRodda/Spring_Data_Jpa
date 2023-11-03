package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entity.Address;
import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepository;

@SpringBootApplication
public class OnetoonemappingassignmentApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository er;
	
	public static void main(String[] args) {
		SpringApplication.run(OnetoonemappingassignmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setId(1);
		e.setName("raji");
		e.setEmail("roddaraji@123");
		e.setMob("8328395198");
		e.setDesign("developer");
		
		Address a=new Address();
		a.setId(1);
		a.setStreet("main");
		a.setCity("vinukonda");
		a.setState("andhra pradesh");
		
		e.setAddrs(a);
		
		er.save(e);
		
		
		
		
		
		
		
	}

}
