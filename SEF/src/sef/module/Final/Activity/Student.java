package sef.module.Final.Activity;

import sef.module.Final.Activity.Person;

public class Student extends Person {

	private String school;
	
	public Student(){ 	 
	}
	
	public String getSchool() {
		return school;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}
	
	public static void main (String [] args ) {
		String school;
		school= "BSA";
		System.out.println("I study in university " + school );
	}
		
}
