package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newContactsLink;

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
	
	public void clickOnNewContactsLink() {
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactsLink.click();
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
