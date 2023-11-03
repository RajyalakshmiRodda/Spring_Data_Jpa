package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Meesho;

@Repository
public interface MeeshoRepository extends JpaRepository<Meesho, Integer> {

}
