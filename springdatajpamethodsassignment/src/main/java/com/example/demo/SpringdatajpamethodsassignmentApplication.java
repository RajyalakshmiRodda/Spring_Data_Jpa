package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entity.Meesho;
import com.example.demo.Repository.MeeshoRepository;

@SpringBootApplication
public class SpringdatajpamethodsassignmentApplication implements CommandLineRunner {

	@Autowired
	private MeeshoRepository mr;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpamethodsassignmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// using save method
		Meesho m=new Meesho();
		m.setId(1);
		m.setProname("dress");
		m.setProprice(500);
		mr.save(m);
		
		// using saveall method
		Meesho m1=new Meesho();
		m1.setId(56);
		m1.setProname("jeans");
		m1.setProprice(1000);
		mr.saveAll(List.of(m,m1));
		
		// using fingById method
		Meesho mm=mr.findById(m.getId()).get();
		System.out.println(mm);
		
		// using findall method
		List<Meesho> m2=mr.findAll();
		m2.forEach((e-> {
			System.out.println(e.getProname());
		}));
		
		//using count method
		Meesho m3=new Meesho();
		System.out.println(mr.count());
		
	
		
	}

}
