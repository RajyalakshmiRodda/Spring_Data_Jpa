package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entity.Addresses;
import com.example.demo.Entity.Orders;
import com.example.demo.Repository.AddressesRepository;
import com.example.demo.Repository.OrdersRepository;

@SpringBootApplication
public class OnetoonebidirectionalassignmentApplication implements CommandLineRunner {

	@Autowired
	private OrdersRepository orr;
	
	@Autowired
	private AddressesRepository adr;
	
	public static void main(String[] args) {
		SpringApplication.run(OnetoonebidirectionalassignmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Orders o=new Orders();
		o.setStatus("delivered");
		o.setOrdtracknum("100");
		o.setTotalprice(new BigDecimal(2000));
		o.setTotalquqntity(1);
		
		Addresses a=new Addresses();
		a.setCity("vinukonda");
		a.setCountry("India");
		a.setOrder(o);
		a.setState("andhra pradesh");
		a.setStreet("mainroad");
		a.setZipcode("523265");
		
		o.setAds(a);
		orr.save(o);
		adr.save(a);
		
	}

}
