package com.example.pojo;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="college")
@Getter
@Setter
public class College {
	
	@Id
	private int collegeid;
	
	private String collegename;
	private String location;
	
	
	@Override
	public String toString() {
		return "College [collegeid=" + collegeid + ", collegename=" + collegename + ", location=" + location + "]";
	}
	

}
