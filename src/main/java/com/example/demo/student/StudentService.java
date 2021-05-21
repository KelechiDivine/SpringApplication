package com.example.demo.student;

<<<<<<< HEAD
import org.springframework.stereotype.Component;

=======
>>>>>>> 1b8e8b071c3968f8b2bd19dbb2283ba6de9cf241
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

<<<<<<< HEAD
@Component
public class StudentService {
	
=======
public class StudentService {
	
	
>>>>>>> 1b8e8b071c3968f8b2bd19dbb2283ba6de9cf241
	public List<Student> getStudents(){
		return List.of(
				new Student(
						1l,
						"Mariam",
						21,
						LocalDate.of(2000, Month.JANUARY, 5),
						"mariam.jamal@gmail.com"
				)
		);
	}
}
