package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Student;
import com.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService ss;
	
	@GetMapping(value = "/")
	public List<Student> m1(){
		return ss.findAll();
	}
	
	@PostMapping(value = "/savestudent")
	public Student m2(@RequestBody Student s) {
		return ss.save(s);
	}
	
	@DeleteMapping(value = "deletestudentbyid/{id}")
	public int m3(@PathVariable int id) {
		return ss.deleteBySid(id);
	}
	
	@PutMapping(value = "/updatestudent")
	public Student m4(@RequestBody Student s) {
		return ss.save(s);
	}
	
}







