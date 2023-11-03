package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.User;
import com.example.demo.Entity.Userprofile;

@Repository
public interface UserprofileRepository  extends JpaRepository<Userprofile, Integer>{

	void save(User u);

}
