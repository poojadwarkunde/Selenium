package com.testng.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.practice.examples.Initializer;

public class GoogleTitleTest {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.out.println("Before Method");
		Initializer.initilize();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");

		// driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	public void googleTitle() {
		System.out.println("test title");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google ", "Title is not matched");
	}

	@Test(priority = 2, groups = "Logo")
	public void googleLogo() {
		System.out.println("test logo");
		boolean b = driver.findElement(By.id("1hplogo")).isDisplayed();
		Assert.assertTrue(b);
	}

	@AfterMethod
	public void teardown() {
		System.out.println("After Method");
		driver.quit();
	}
}
