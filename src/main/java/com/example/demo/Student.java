package com.example.demo;

public class Student extends Person implements Learner {
	double totalStudyTime;

	Student(long id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void learn(double numberOfHours) {
		// TODO Auto-generated method stub
		
		totalStudyTime += numberOfHours;
		
	}
	
	public double getTotalStudyTime(){
		return getTotalStudyTime();
		
		
	}

	public static int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
