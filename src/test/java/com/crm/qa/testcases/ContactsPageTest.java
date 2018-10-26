package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

import junit.framework.Assert;

public class ContactsPageTest extends TestBase{
	
LoginPage loginPage;
HomePage homePage;
TestUtil testUtil;
ContactsPage contactsPage;

public ContactsPageTest() {
	super();
}

@BeforeMethod
public void setUp() throws InterruptedException {
	initialization();
	testUtil = new TestUtil();
	loginPage = new LoginPage();
	contactsPage = new ContactsPage();
	homePage = new HomePage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	testUtil.switchToFrame();
	contactsPage = homePage.clickOnContacts();
}

@Test(priority =1)
public void verifyContactsLabelTest() {
	Assert.assertTrue("Contacts lable is missing on the page",contactsPage.verifyContactsLabel());
}

@Test(priority =2)
public void selectSingleContactsTest() {
	contactsPage.selectContacts("A C");
}

@Test(priority =3)
public void selectMultipleContactsTest() {
	contactsPage.selectContacts("A C");
	contactsPage.selectContacts("S T");
}







@AfterMethod
public void tearDown() {
	driver.quit();
}

}
