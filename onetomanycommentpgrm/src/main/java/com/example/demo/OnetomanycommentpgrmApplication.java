package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entity.Comment;
import com.example.demo.Entity.Post;
import com.example.demo.Repository.CommentRepository;
import com.example.demo.Repository.PostRepository;

@SpringBootApplication
public class OnetomanycommentpgrmApplication implements CommandLineRunner {
	
	@Autowired
	private PostRepository pr;
	
	@Autowired
	private CommentRepository cr;

	public static void main(String[] args) {
		SpringApplication.run(OnetomanycommentpgrmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Post p=new Post("welcome","iam rajyalakshmi");
		
		Comment c=new Comment("nice");
		Comment c1=new Comment("very good");
		
		p.getA().add(c);
		p.getA().add(c1);

		pr.save(p);
		
		
	}

}
