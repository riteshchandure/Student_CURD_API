package com.demo.service;

import java.util.List;

import com.demo.model.Student;

public interface StudentService {

	List<Student> findAll();

	Student save(Student s);

	int deleteBySid(int id);

}
