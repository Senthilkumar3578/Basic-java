package com.example.demo.service;

import com.example.demo.common.BadREquestException;
import com.example.demo.common.Errors;
import com.example.demo.validator.NameValidator;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
//import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;


import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.models.Registration;
import com.example.demo.repositry.JpaRepo;
//import org.springframework.data.domain.Pageable; 

@Service
public class StudentService {

	@Autowired
	JpaRepo jpa;

	@Autowired
	private NameValidator nameValidator;


	public Registration addData(Registration regi) {

		//validation
		List<Errors> error = nameValidator.validateName(regi);
		if (error.size() > 0) {
			throw new BadREquestException("bad request", error);
		}
		return this.jpa.save(regi);
	}

	public List<Registration> getAllRecords() {
		return this.jpa.findAll();
	}

	public Registration getRecord(Integer id) {
		Registration reg=jpa.findById(id).orElseThrow(() -> new ResourceNotFoundException("Emploee not found in this id " + id));
		//return Optional.ofNullable(this.jpa.findById(id).orElseThrow(() -> new ResourceNotFoundException("Emploee not found in this id " + id)));
		return reg;
	}

	public String deleteRecord(Integer sid) {
		this.jpa.deleteById(sid);
		return "Successfully deleted";
	}

	public List<Registration> getAllStu(int pageNo, int recordCount) {
		Pageable pageable = PageRequest.of(pageNo, recordCount);
		return this.jpa.findAll(pageable).getContent();

	}
	/*
	 * public List<Registration> getAllStu(int pageNo, int recordCount) {
	 * PageRequest pageable = PageRequest.of(pageNo, recordCount);
	 * Page<Registration> pageResult = (Page<Registration>)
	 * this.jpa.findAll(pageable); return pageResult.getContent(); }
	 *
	 /
	*public List<Registration> getByStName(String stuName,int pageNo,int
	 * recordCount){ PageRequest pageable=PageRequest.of(pageNo, recordCount);
	 * return this.jpa.getByStName(stuName,pageable);
	 }
	 */


}