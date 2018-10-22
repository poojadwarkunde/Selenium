package com.testng.practice;

import org.testng.annotations.Test;

public class TestNGFeatures {
@Test
public void test1() {
	System.out.println("Test 1");
//	int i =3/0;
}

@Test(dependsOnMethods="test1")
public void test2() {
	System.out.println("Test 2");
}

@Test(dependsOnMethods="test1")
public void test3() {
	System.out.println("Test 3");
}

@Test(dependsOnMethods="test1")
public void test4() {
	System.out.println("Test 4");
}
}
