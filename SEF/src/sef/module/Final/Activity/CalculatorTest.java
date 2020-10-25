package sef.module.Final.Activity;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

	private MyCalculator theCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		
		theCalculator = new MyCalculator();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}


	public void testGetSum() {
		
		int a = 8;
		int b = 10;			
		assertEquals(18, (theCalculator.getSum(a,b)));
		assertEquals(18, (theCalculator.getSum(b,a)));		

		a = -3;		
		b = 10;		
		assertEquals(7, (theCalculator.getSum(a,b)));
		assertEquals(7, (theCalculator.getSum(b,a)));
		
		a = -8;		
		b = -10;		
		assertEquals(-18, (theCalculator.getSum(a,b)));
		assertEquals(-18, (theCalculator.getSum(b,a)));
	}

	public void testGetDifference() {
		
		int a = 5;
		int b = 4;		
		assertEquals(1, (theCalculator.getDifference(a,b)));		
		assertEquals(-1, (theCalculator.getDifference(b,a)));

		a = 5;
		b = -4;
		assertEquals(9, (theCalculator.getDifference(a,b)));		
		assertEquals(-9, (theCalculator.getDifference(b,a)));	
	
		a = -10;
		b = -5;
		assertEquals(-5, (theCalculator.getDifference(a,b)));		
		assertEquals(5, (theCalculator.getDifference(b,a)));			
	}

	public void testGetProduct() {
		
		double a = 6;
		double b = 10;			
		assertEquals(60, (theCalculator.getProduct(a,b)),0);
		assertEquals(60, (theCalculator.getProduct(b,a)),0);		

		a = -6;		
		b = 10;		
		assertEquals(-60, (theCalculator.getProduct(a,b)),0);
		assertEquals(-60, (theCalculator.getProduct(b,a)),0);
		
		a = -3;		
		b = -10;		
		assertEquals(30, (theCalculator.getProduct(a,b)),0);
		assertEquals(30, (theCalculator.getProduct(b,a)),0);
	}

	public void testGetQuotient() {

		double a = 10;	double b = 5;		
		assertEquals(2, (theCalculator.getQuotient(a,b)),0);		
		assertEquals(0.5, (theCalculator.getQuotient(b,a)),0);

		a = 9;	b = -3;
		assertEquals(-3, (theCalculator.getQuotient(a,b)),0);		
		assertEquals(-0.33, (theCalculator.getQuotient(b,a)),0.007);	
	
		a = -10;	b = -5;
		assertEquals(2, (theCalculator.getQuotient(a,b)),0);		
		assertEquals(0.5, (theCalculator.getQuotient(b,a)),0);			
		}
		
}

