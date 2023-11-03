package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Stationary;
@Repository
public interface StationaryRepository extends JpaRepository<Stationary, Integer> {
	
}
