package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@DependsOn({"instructors", "students"})
	
		@Bean(name="currentCohort") 
		private static Classroom currentCohort() {
			return null;
			// TODO Auto-generated method stub
			
		}
		
		@Bean(name="previousCohort") 
		private static Classroom previousCohort() {
			return null;
			// TODO Auto-generated method stub
			
		}

	}

//}
