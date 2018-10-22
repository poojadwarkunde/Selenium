package com.testng.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
		
	@BeforeSuite /// executed first
	public void setUp() {
		System.out.println(" Before Suite: Set System Property");
	}
	@BeforeClass  /// executed third
	public void launchBrowser() {
		System.out.println("Before Class : Launch Browser");
	}
	
	@BeforeMethod  /// executed fourth
	public void enterURL() {
		System.out.println("Before Method : Launch URL");
	}
	
	@BeforeTest  /// executed second
	public void login() {
		System.out.println("Before Test : Login");
	}
		
	@Test
	public void getTitle() {
		System.out.println("In test : Print google title");
	}
	
	@Test
	public void sample() {
		System.out.println("Sample second test case");
	}
	
	@Test  /// executed fifth
	public void All() {
		System.out.println("Third test Case");
	}
	
	@AfterMethod()  /// executed sixth
	public void logout() {
		System.out.println("After Method :Logout");
	}
	
	@AfterTest()
	public void deleteAllCookies() {
		System.out.println("After Test : Delete All Cookies");
	}
	
	@AfterClass()
	public void closeBrowser() {
		System.out.println("After Class : Close Browser");
	}
	
	@AfterSuite()
	public void generateReport() {
		System.out.println("After Suite : Genrate Reports");
	}
}
