package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Registration;
import com.example.demo.service.StudentService;
 
@RestController 
@Component
@RequestMapping("/Homepage")
public class HomeController {
	
	@Autowired
	StudentService stservice;
	
	 @PostMapping("/registration")
	 public Registration addValues(@RequestBody Registration regi) {
		 return this.stservice.addData(regi);
	 }
	 
	 @GetMapping("/getRecords")
	 public List<Registration> getData() {
		return this.stservice.getAllRecords();
		 
	 }
	   	
	 //Fetch one record
	@GetMapping("/getParticularRecords/{id}")
	public Optional<Registration> getRecords(@PathVariable (value = "id") Integer id){
		return this.stservice.getRecord(id);
		
	} 
	
	  @DeleteMapping("deleteRecord/{sid}")
	  public String deleteRecord(@PathVariable(value = "sid")Integer stid) {
		    
		  return this.stservice.deleteRecord(stid);
	  }
	 
	

}
