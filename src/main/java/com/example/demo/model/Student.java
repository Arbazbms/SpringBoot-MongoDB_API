package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
public class Student {

	@Id
	private String id;
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	private String  name;
	private int age;
	private int grade;
	
	
	public Student(String name, int age, int grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
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


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
}
