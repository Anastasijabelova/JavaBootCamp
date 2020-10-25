package sef.module6.activity;

import sef.module6.sample.Person_I;
import sef.module6.sample.Student_I;

public class InheritanceActivity {

	public static void main(String[] args) {
		
		// Create Person object p. Write code to and set name of Person as Sarah Johnson
		// and age as 21
		Person_I p = new Person_I();
		p.setName("Sarah Johnson");
		p.setAge(21);
		
		
		System.out.println("-----------------------------");
		//Create Employee object e and 
		// set salary as 70000, title as Developer, age as 32 and name as Shawn Cun
		Employee_I s = new Employee_I();
		s.setSalary(70000);
		s.setTitle("Developer Title");
		
		s.setName("Shawn Cun");
		s.setAge(32);
		
		// Print Info using Employee object
		System.out.println("-----------------------------");
		System.out.println("Employee's Name is   : " + s.getName());
		System.out.println("Employee's Age is    : " + s.getAge());
		System.out.println("Employee's Title is  : " + s.getTitle());
		System.out.println("Employee's Salary is : " + s.getSalary());
		
		
		// Print Info using Person object
		System.out.println("-----------------------------");
		System.out.println("Person's Name is    : " + p.getName());
		System.out.println("Person's Age is     : " + p.getAge());
		
			
		
	}

}
