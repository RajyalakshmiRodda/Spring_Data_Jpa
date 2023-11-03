package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.using3classes.stu1;
import com.example.demo.using3classes.stu2;
import com.example.demo.using3classes.stu3;

@SpringBootApplication
public class Componentannotation1Application {

	public static void main(String[] args) {
		ApplicationContext a=SpringApplication.run(Componentannotation1Application.class, args);
	    stu1 s=a.getBean(stu1.class);
	    s.getmarks();
	    stu2 s1=a.getBean(stu2.class);
	    s.getid();
	    stu3 s2=a.getBean(stu3.class);
	    s.getname();
	
	}

}
