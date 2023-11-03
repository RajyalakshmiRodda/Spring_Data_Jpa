package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entity.Teacher;
import com.example.demo.Repository.TeacherRepository;

@SpringBootApplication
public class AssignmentonspringdatajpausingcountApplication implements CommandLineRunner {

	@Autowired
	private TeacherRepository tr;

	
	public static void main(String[] args) {
		SpringApplication.run(AssignmentonspringdatajpausingcountApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Teacher t=new Teacher();
		t.setId(5);
		t.setName("ram");
		t.setSal(20000);
		
		tr.save(t);
		
		System.out.println(tr.count());
		
		
	}

}
