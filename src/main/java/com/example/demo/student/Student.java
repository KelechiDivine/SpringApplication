package com.example.demo.student;

import java.time.LocalDate;

public class Student {
	
	private Long id;
	private  String name;
	private  int age;
	private LocalDate dateOfBirth;
	private String email;
	
	public Student() {
	}
	
	public Student(Long id,
				   String name,
				   int age,
				   LocalDate dateOfBirth,
				   String email) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
	}
	
//	A new constructor without an id is create because the data base will geneerate an id for us
	public Student(String name,
				   int age,
				   LocalDate dateOfBirth,
				   String email) {
		this.name = name;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
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
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
//	To string method is created
	
	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				", dateOfBirth=" + dateOfBirth +
				", email='" + email + '\'' +
				'}';
	}
}
