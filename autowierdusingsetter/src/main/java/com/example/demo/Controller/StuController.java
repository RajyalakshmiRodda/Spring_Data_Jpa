package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Service.Student1;

public class StuController {
	
	private Student1 stu;
	@Autowired
	public StuController(Student1 stu) {
		super();
		this.stu=stu;
		// TODO Auto-generated constructor stub
	}
	
	public String access() {
		return stu.Student1();
		
	}
	

}
