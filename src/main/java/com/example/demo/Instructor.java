package com.example.demo;

public class Instructor extends Person implements Teacher{

	Instructor(long id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void teach(Learner learner, double numberOfHours) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
		// TODO Auto-generated method stub
		//double numberOfHoursPerLearner = numberOfHours / learners.length;
		
	}

	public static int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
