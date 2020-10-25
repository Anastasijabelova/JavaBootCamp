package sef.module.Final.Activity;

public class CustomExceptionActivity extends Exception {

	public String getMessage() {
		String msg = "Numbers are not allowed in Name";
		return msg;
	}
	
}