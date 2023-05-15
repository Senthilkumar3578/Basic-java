package com.example.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Registration;

public interface JpaRepo extends JpaRepository<Registration, Integer>{
	
}

