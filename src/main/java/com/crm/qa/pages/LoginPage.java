package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory/Object Repository for login page
	
	@FindBy(name="username") WebElement username;
	
	@FindBy(name="password") WebElement password;
	
	@FindBy(xpath="//input[@type='submit']") WebElement loginbtn;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up']") WebElement signupbtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]") WebElement crmlogo;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMImage() {
		return crmlogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) throws InterruptedException {
		username.sendKeys(un);
		password.sendKeys(pwd);
		Thread.sleep(3000);
		loginbtn.click();
		Thread.sleep(3000);
		return new HomePage();
	}
	
	
	
}
