package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;

@SpringBootApplication
public class CrudoperationusingspringdatajpaApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository sr;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudoperationusingspringdatajpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student s =new Student();
		s.setAddress("kommavaram");
		s.setName("raji");
		s.setAddress("hyderabad");
		s.setName("raj");
		sr.save(s);
		sr.deleteById(2);	
		
	}

}
