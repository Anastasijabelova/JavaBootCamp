package sef.module.Final.Activity;

public class Employee extends Person {
	
	private String company;
	private String jobTitle;
	
	public Employee(){ 
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getjobTitle() {
		return jobTitle;
	}
	
	public void setjobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
}
