package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoMathTest1 {
	
	int a=10;
	int b=20;
	
	@Test
	public void sum() {
		System.out.println("SUM");
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	public void sub() {
		System.out.println("SUB");
		Assert.assertEquals(10, b-a);
	}
	
	@Test
	public void Mul() {
		System.out.println("MUL");
		Assert.assertEquals(200, a*b);
	}
	
	@Test
	public void Div() {
		System.out.println("DIV");
		Assert.assertEquals(2, b/a);
	}
	

}
