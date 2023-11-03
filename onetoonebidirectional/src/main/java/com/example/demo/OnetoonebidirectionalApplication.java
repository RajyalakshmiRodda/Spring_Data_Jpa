package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entity.User;
import com.example.demo.Entity.Userprofile;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Repository.UserprofileRepository;

@SpringBootApplication
public class OnetoonebidirectionalApplication implements CommandLineRunner {

	@Autowired
	private UserRepository ur;
	
	@Autowired
	private UserprofileRepository upr;
	
	
	public static void main(String[] args) {
		SpringApplication.run(OnetoonebidirectionalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u =new User();
		u.setName("raji");
		u.setEmail("roddaraji123@gmail.com");
		
		Userprofile p=new Userprofile();
		p.setPhonenumber("8328395198");
		p.setAddress("kommavaram");
		
		u.setUserpro(p);
		p.setUser(u);
		
		ur.save(u);
		upr.save(p);
		
	}

}
