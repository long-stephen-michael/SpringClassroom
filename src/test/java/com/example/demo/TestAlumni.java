package com.example.demo;

public class TestAlumni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOfInstructors = Instructor.size();
		int numberOfStudents = Student.size();
		double numberOfHoursToTeachEachStudent = 1200;
		double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
		double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;

	}

}
