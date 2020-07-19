package com.example.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Student;
import com.example.service.StudentService;
import com.example.studentbo.Studentbo;

@RestController
@RequestMapping("/Student")
public class StudentController {

	@Autowired
	private StudentService studentservice;

	@GetMapping("/getAllStudents")
	public Iterable<Student> getAllStudent() {
		return studentservice.findAllStudents();
	}

	@PostMapping("/saveStudent")
	public Student saveStudent(@Valid @RequestBody Student student) {
		System.out.println(student);
		return studentservice.saveStudent(student);
	}
	

	@DeleteMapping("/deleteStudent/{id}")
	public Boolean deleteStudent(@PathVariable("id") Integer id) {
		System.out.println(id);
		return studentservice.deleteStudent(id);
	}
	

	@GetMapping("/findOneInAll/{id}")
	public Optional<Student> findOneInAll1(@PathVariable("id") Integer id) {
		return studentservice.findStudentById(id);

	}
	

	@GetMapping("/findByStudentid/{id}")
	public Studentbo findOneInAll2(@PathVariable("id") Integer id) {
		return studentservice.findOneInAll3(id);
	}

}