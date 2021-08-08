package com.mnt.model;

import java.util.List;

import lombok.Data;

@Data
public class Student {
	
	   private Integer id;
	   
	   private String name;
	   
	   private String mail;
	   
	   private List<String> hobbies;
}
