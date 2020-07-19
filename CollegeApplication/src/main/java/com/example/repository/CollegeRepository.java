package com.example.repository;
import org.springframework.data.repository.CrudRepository;

import com.example.pojo.College;

public interface CollegeRepository extends CrudRepository<College, Integer> {
	
	Iterable<College> findAll();
	// String findByCollegeId(String collegeId);

}
