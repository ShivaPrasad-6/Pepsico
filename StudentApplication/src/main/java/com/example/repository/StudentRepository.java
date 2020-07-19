package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.pojo.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{	
	
	Iterable<Student> findAll();

}