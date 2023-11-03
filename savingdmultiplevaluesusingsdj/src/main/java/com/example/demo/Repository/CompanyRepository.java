package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
	
	

}
