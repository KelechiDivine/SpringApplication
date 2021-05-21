package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

//Requested for a request mapping that allows and gives a new address to our api
@RequestMapping(path = "api/v1/student")

public class StudentController {
	private final StudentService studentService;
	
	//generated a constructor for student service
	
	 @Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	
	@GetMapping
	public List<Student> getStudents() {
		return studentService.getStudents();
	}
	
}
