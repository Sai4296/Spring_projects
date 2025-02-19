package com.sai.Security.Controller;

import java.util.*;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sai.Security.Entity.Student;

import jakarta.servlet.http.HttpServletRequest;



@RestController
public class StudentController {
	
	private List<Student> students = new ArrayList<>(List.of(
			new Student( 1, "Sai", 85),
			new Student( 2, "Priya", 87)
			));
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return students;
	}
	
	@GetMapping("/csrf-token")
	public CsrfToken getCsrfToken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student){
		students.add(student);
		return student;
	}
}
