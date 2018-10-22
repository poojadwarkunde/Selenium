package com.testng.practice;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount =3)
	public void test1() {
		System.out.println("Test 1");
	}
}


//<class name="com.testng.practice.ExceptionTimeOutTest"></class>
//<class name="com.testng.practice.GoogleTest"></class>
//<class name ="com.testng.practice.GoogleTitleTest"></class>
//<class name ="com.testng.practice.InvocationCount"></class>
//<class name ="com.testng.practice.TestNGBasics"></class>
//<class name ="com.testng.practice.TestNGFeatures"></class>