package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//td[contains(text(),'Pooja Dwarkunde')]")
	WebElement userNameLabel;
	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement dealsLink;
	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	@FindBy(xpath = "//a[contains(text(),'Calendar')]")
	WebElement calendarLink;

	// Initialize the Page Objects

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyUserName() {
		return userNameLabel.isDisplayed();
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public ContactsPage clickOnContacts() {
		contactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDeals() {
		contactsLink.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasks() {
		contactsLink.click();
		return new TasksPage();
	}
}
