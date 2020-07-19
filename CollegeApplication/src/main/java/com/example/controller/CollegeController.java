package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.College;

import com.example.service.CollegeService;



@RestController
@RequestMapping("/College")
public class CollegeController {

	@Autowired
	private CollegeService collegeservice;

	@RequestMapping("/getAllColleges")
	public Iterable<College> getAllStudent() {
		return collegeservice.findAllColleges();
	}

	/*@PostMapping("/saveCollege")
	public ResponseEntity<String> saveCollege(@Valid @RequestBody College college, BindingResult bindingresult) {
		System.out.println(college);
		return collegeservice.saveCollege(college);
		 
	}*/

	@DeleteMapping("/deleteCollege/{id}")
	public Boolean deleteCollege(@PathVariable("id") Integer id) {
		System.out.println(id);
		return collegeservice.deleteStudent(id);
	}


	@GetMapping("/findOneInAll/{id}")
	public Optional<College> findOneInAll(@PathVariable("id") Integer id)
	{
		return collegeservice.findCollegeById(id);
		
	}
	
	/*
	 * @GetMapping("/{collegeid}") public Optional<College>getCollege(@PathVariable
	 * Integer collegeid) { return collegeservice.getCollege(collegeid); }
	 */
	
	@GetMapping("/collegeid/{collegeid}")  // we get college name
	public String getCollegename(@PathVariable(value = "collegeid") Integer collegeid) {
		System.out.println("Iam in college application");
		return collegeservice.getCollegename(collegeid);
		
	}
	
	
}