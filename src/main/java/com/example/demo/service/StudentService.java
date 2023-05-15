package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.models.Registration;
import com.example.demo.repositry.JpaRepo;
 

//client.setRegion(Region.getRegion(Regions.EU_WEST_1));
 

@Service
public class StudentService {
	
	@Autowired
	JpaRepo jpa;
	
	public Registration addData(Registration regi) {
		
		return this.jpa.save(regi);
	}
	
	public List<Registration> getAllRecords(){
		  return this.jpa.findAll();
	}
	
	public Optional<Registration> getRecord(Integer id) {
		  return this.jpa.findById(id);
	}
	
	public String deleteRecord(Integer sid) {
		this.jpa.deleteById(sid);
		return "Successfully deleted";
	}
	 
	 
}

