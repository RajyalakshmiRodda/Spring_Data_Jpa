package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepository;


@SpringBootApplication
public class SpringDataJpaExample1Application implements CommandLineRunner {
StudentRepository sr;
       public SpringDataJpaExample1Application(StudentRepository sr) {
    	   super();
    	   this.sr=sr;
       }

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaExample1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student s=new Student();
		s.setName("raji");
		s.setAddress("hyder");
		sr.save(s);
		
	}

}
