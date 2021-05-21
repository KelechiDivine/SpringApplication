package com.example.demo.student;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
=======
>>>>>>> 1b8e8b071c3968f8b2bd19dbb2283ba6de9cf241
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

//Requested for a request mapping that allows and gives a new address to our api
@RequestMapping(path = "api/v1/student")

public class StudentController {
	private final StudentService studentService;
	
<<<<<<< HEAD
	//generated a constructor for student service
	
	 @Autowired
=======
>>>>>>> 1b8e8b071c3968f8b2bd19dbb2283ba6de9cf241
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	
	@GetMapping
<<<<<<< HEAD
	public List<Student> getStudents() {
		return studentService.getStudents();
=======
	
	public List<Student> getStudents() {
	
>>>>>>> 1b8e8b071c3968f8b2bd19dbb2283ba6de9cf241
	}
	
}
