package sef.module.Final.Activity;

import java.util.Arrays;
import java.util.Collections;

public class FirstActivitySorted implements Comparable <FirstActivitySorted> {
    private String name;
    private int salary;
 
    public FirstActivitySorted(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
 
    public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
    public int compareTo(FirstActivitySorted employee) {
        return this.salary - employee.salary;
    }

	public static void main(String[] args) throws CustomExceptionActivity {
		
		FirstActivitySorted[] employees = new FirstActivitySorted[3];
		 
		employees[0] = new FirstActivitySorted("Anna", 5000);
		employees[1] = new FirstActivitySorted("Michael", 1500);
		employees[2] = new FirstActivitySorted("Andrew", 3000);
		
		
		Arrays.sort(employees, Collections.reverseOrder());
		 
		System.out.println("Salary's from top to less: " + Arrays.toString(employees));
	}
	public String toString() {
	    return String.format("(%s, %d)", name, salary);
	}

}
