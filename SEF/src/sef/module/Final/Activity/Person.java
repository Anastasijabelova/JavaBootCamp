package sef.module.Final.Activity;

public class Person {

	private String name;
	private int age;
	
	public Person(){
		this.name="Unknown";
		this.age = 0;
	}
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) throws CustomExceptionActivity {
		if (name.matches(".*\\d.*")) throw new CustomExceptionActivity();
        else this.name = name;
	}
		
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
	this.age = age;
	}
	
}