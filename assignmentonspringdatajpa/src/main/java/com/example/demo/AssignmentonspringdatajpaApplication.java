package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;

@SpringBootApplication
public class AssignmentonspringdatajpaApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository sr;
	
	public static void main(String[] args) {
		SpringApplication.run(AssignmentonspringdatajpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		List<Student> s=sr.findAll();
		s.forEach((p)-> {
			System.out.println(p.getName());
			System.out.println(p.getAge());
		});
		
//		Student s1=new Student();
//		System.out.println(sr.count());		
		
		
	}

}
