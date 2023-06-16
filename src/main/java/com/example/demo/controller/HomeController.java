package com.example.demo.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.example.demo.payload.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.Registration;
import com.example.demo.service.StudentService;

import javax.servlet.http.HttpServletRequest;

@RestController 
@RequestMapping("/Homepage")
public class HomeController {
	
	@Autowired
	StudentService stservice;
	
	 @PostMapping("/registration")
	 public ResponseEntity<Registration> addValues(@RequestBody Registration regi) throws Exception {
		 Registration res=this.stservice.addData(regi);
		 return new ResponseEntity<Registration>(res,HttpStatus.CREATED);
	 }
	 //Request Form
     @GetMapping("/user")
	 public String getUser(@RequestParam String name,@RequestParam(defaultValue = "25") int age){
            return "My name is  "+name +"  age is ="+age;
	 }

	 //PathVariable
	@GetMapping("/users/{name}/{age}/{country}")
	public  String printUserName(@PathVariable String name,
								 @PathVariable int age,
								 @PathVariable String country){
		 return  "My name is ="+name +"  age is  "+age+"  country is  "+country;
	}

	//HeaderFarms
	@GetMapping("/header")
	public  String handleRequestHeader(@RequestHeader Map<String,String> mapvalues){
		System.out.println("print the header ="+mapvalues);
		return "success";
	}

	@GetMapping("/my-endpoint")
	public String myEndpoint(@RequestHeader("Authorization") String authorizationHeader) {
		// Process the header parameter
		return "Received Authorization header: " + authorizationHeader;
	}


	 @GetMapping("/getRecords")
	 public ResponseEntity<List<Registration>> getData() {
		 List<Registration> res = this.stservice.getAllRecords();
		 return ResponseEntity.ok(res);
	 }

	//Fetch one record
	@GetMapping("/getParticularRecords/{id}")
	public  Registration getRecords(@PathVariable (value = "id") Integer id) {
		return this.stservice.getRecord(id);
		
	} 

	  @DeleteMapping("deleteRecord/{sid}")
	  public ResponseEntity<ApiResponse> deleteRecord(@PathVariable(value = "sid")Integer stid) {
		 stservice.deleteRecord(stid);
		 ApiResponse apiResponse=ApiResponse.builder()
				 .message("Record Deleted Successfully")
				 .status(String.valueOf(HttpStatus.OK))
				 .success(true)
				 .timestamp(new Date()).build();

         return new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.OK);

	  }
	    
	  @GetMapping("/getAllStu/{pageNo}/{recordCount}")
	  public List<Registration> getAllStu(@PathVariable Integer pageNo,@PathVariable Integer recordCount) {
		  return this.stservice.getAllStu(pageNo, recordCount);
	  }
}
