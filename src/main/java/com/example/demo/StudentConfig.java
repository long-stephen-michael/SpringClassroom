package com.example.demo;

import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	@Bean(name="students")
	public Students currentStudents() {
		return null;
			
	}
	@Bean(name="previousStudents")
	public Students previousStudents() {
		return null;
			
	}
}
	
