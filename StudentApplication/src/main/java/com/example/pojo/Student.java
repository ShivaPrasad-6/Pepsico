package com.example.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="student")
@Getter
@Setter
public class Student {
	
	@Id
	private int id;
	
	@NotEmpty(message = "name required")
	@Size(min=1, max=4)
	private String name;
	
	@NotNull(message = "age required")
	private int age;
	
	@NotEmpty(message = "gender required")
	private String gender;
	
	@NotNull(message = "clgid required")
	private int clgid;
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", clgid="
				+ clgid + "]";
	}


}
