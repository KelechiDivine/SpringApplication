package com.example.demo.student;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Component
public class StudentService {
	
	public List<Student> getStudents() {
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

