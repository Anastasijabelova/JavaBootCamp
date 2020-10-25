package sef.module.Final.Activity;

import sef.module.Final.Activity.Employee;
import sef.module.Final.Activity.Person;

public class FinalPersonEmployee {
	
	public static void main(String[] args) {
		
		Person p = new Person ();
		p.setName("John Smith");
		p.setAge(27);
		
		
		Employee pe = new Employee();
		pe.setName("Anna Abele");
		pe.setAge(41);
		pe.setCompany("Accenture");
		pe.setjobTitle("Tester");
		

		System.out.println("-----------------------------");
		System.out.println("My Name is  " + p.getName() + "  and I am " + p.getAge());
		System.out.println("-----------------------------");
		System.out.println("My Name is  " + pe.getName() + "  and I am " + pe.getAge());
		System.out.println("I work as a " + pe.getjobTitle()+ " in company" + pe.getCompany());
	}
	
}
