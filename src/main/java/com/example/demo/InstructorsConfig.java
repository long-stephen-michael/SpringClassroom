package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//@Bean(name="delTechTuesdayInstructors") 
		//Final Instructors delTechTuesdayInstructors() {
		//	return null;
		//}

	//}
	
	@Bean(name="delTechTuesdayInstructors") 
	private static Instructors delTechTuesdayInstructors() {
		return null;
		// TODO Auto-generated method stub
		
	}
	
	@Bean(name="delTechThursdayInstructors") 
	private static Instructors delTechThursdayInstructors() {
		return null;
		// TODO Auto-generated method stub
		
	}
	
	
	@Bean(name="delTechInstructors") @Primary
	private static Instructors delTechInstructors() {
		return null;
		// TODO Auto-generated method stub
		
	}

}
