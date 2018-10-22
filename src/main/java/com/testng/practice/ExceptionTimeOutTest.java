package com.testng.practice;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
	@Test(timeOut=2000,expectedExceptions=NumberFormatException.class)
	public void test1() {
		String x = "100A";
		Integer.parseInt(x);
	}
}
