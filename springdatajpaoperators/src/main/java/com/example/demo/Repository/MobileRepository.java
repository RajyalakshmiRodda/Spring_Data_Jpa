package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Mobile;

@Repository
public interface MobileRepository extends JpaRepository<Mobile, Integer> {
	List<Mobile> findBypriceGreaterThan(Long price);

	List<Mobile> findBypriceLessThan(Long price);
	
	List<Mobile> findBypriceBetween(Long price, Long price1);
	
	List<Mobile> findDistinctByprice(Long price);
}