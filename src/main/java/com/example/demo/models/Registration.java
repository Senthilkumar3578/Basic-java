package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentRegistration")
public class Registration {
        
	 @Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE)
	 @Column(name="Studen_Id")
	 private int id;
	 
	 @Column(name="Student_Name")
	 private String name;
	  
	 @Column(name="Student_Age")
	 private int age;

	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 
}
