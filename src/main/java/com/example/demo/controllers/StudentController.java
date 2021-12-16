package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repositories.StudentRepository;
@RestController
public class StudentController {

	@Autowired
	public StudentRepository studentRepository;
	
	@GetMapping(value = "/all")
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
		
	}
	
	@GetMapping(value = "/{id}")
	public Optional<Student> getStudentById(@PathVariable String id){
		Optional<Student> student =  studentRepository.findById(id);
		return student;
		
	}
	
	
	@PostMapping(value = "/create")
	public Student createStudent(@RequestBody Student student) {
		Student insertedStudent = studentRepository.insert(student);
		return insertedStudent;
		
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable String id){
		studentRepository.deleteById(id);
		return "deleted: " + id;
		
	}
	
	@PutMapping("/{id}")
	public Student updateStudent(@RequestBody Student student, @PathVariable String id) {
		student.setId(id);
		studentRepository.save(student);
		return student;
	}
	
}
