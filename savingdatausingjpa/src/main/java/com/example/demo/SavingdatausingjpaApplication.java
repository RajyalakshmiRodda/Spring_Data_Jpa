package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;

@SpringBootApplication
public class SavingdatausingjpaApplication implements CommandLineRunner {
	@Autowired
	private StudentRepository sr;

	public static void main(String[] args) {
		SpringApplication.run(SavingdatausingjpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setId(56);
		s.setName("raji");
		s.setAddress("kommavaram");
		sr.save(s);
		
	}

}
