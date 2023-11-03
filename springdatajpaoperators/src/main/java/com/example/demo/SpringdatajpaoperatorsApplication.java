package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entity.Mobile;
import com.example.demo.Repository.MobileRepository;

@SpringBootApplication
public class SpringdatajpaoperatorsApplication implements CommandLineRunner {
	@Autowired
	private MobileRepository mr;

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaoperatorsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Mobile m=new Mobile();
		m.setId(1);
		m.setName("vivo");
		m.setPrice(14000L);
		
		Mobile m1=new Mobile();
		m1.setId(2);
		m1.setName("1plus");
		m1.setPrice(24000L);
		
		Mobile m2=new Mobile();
		m2.setId(3);
		m2.setName("oppo");
		m2.setPrice(18000L);
		
		Mobile m3=new Mobile();
		m.setId(1);
		m.setName("vivo");
		m.setPrice(14000L);
	
		mr.saveAll(List.of(m,m1,m2,m3));
		List<Mobile> mob=mr.findBypriceGreaterThan(new Long(20000L));
		mob.forEach((e)->
		System.out.println(e));
			
		List<Mobile> mb=mr.findBypriceLessThan(new Long (24000L));
		mb.forEach((e1)->
		System.out.println(e1));
		
		List<Mobile> mb1=mr.findBypriceBetween(new Long(14000),new Long(24000));
		mb1.forEach((e2)->
		 System.out.println(e2));
		
		List<Mobile> mob1=mr.findDistinctByprice(new Long (14000L));
		mob1.forEach((ee)->
		System.out.println(ee));
		
	}

}
