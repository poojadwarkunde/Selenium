package selenium.sessions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		Initializer.initilize();

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.freecrm.com");

//		 driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// Implicit Wait

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement submit = driver.findElement(By.xpath("//input[@value = 'Login']"));

		username.clear();
		Thread.sleep(1000);
		username.sendKeys("pdwarkunde");
		password.clear();
		Thread.sleep(1000);
		password.sendKeys("test@123");
		Thread.sleep(3000);
		 submit.click();
		 Thread.sleep(3000);
		 driver.switchTo().frame("mainpanel");
		 Thread.sleep(3000);
		 WebElement contact = driver.findElement(By.xpath("//a[contains(text(),\"Contact\")]"));
		 contact.click();
		 
		 Thread.sleep(3000);
		 
		// Xpath for tables:
			//*[@id='vContactsForm']/table/tbody/tr[4]/td[2]/a
			//*[@id='vContactsForm']/table/tbody/tr[5]/td[2]/a
			//*[@id='vContactsForm']/table/tbody/tr[6]/td[2]/a
			//*[@id='vContactsForm']/table/tbody/tr[7]/td[2]/a
		   //*[@id='vContactsForm']/table/tbody/tr[8]/td[2]/a
		   //*[@id='vContactsForm']/table/tbody/tr[9]/td[2]/a
		 
		 //Method 1
		 
//		 String firstXpath = "//*[@id='vContactsForm']/table/tbody/tr[";
//		 String lastXpath ="]/td[2]/a";
//		 
//		 for(int i =4;i<=9;i++) {
//			 String name = driver.findElement(By.xpath(firstXpath+i+lastXpath)).getText();
//			 System.out.println(name);
//			 if(name.contains("P R")) {
//				 driver.findElement(By.xpath(firstXpath + i + "]/td[1]/input")).click();
//			 }
//		 }
		 
//		 Method 2:
		 driver.findElement(By.xpath("//a[contains(text(),'P R')]/parent::td//preceding-sibling::td/child::input[@name='contact_id']")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'S T')]/parent::td//preceding-sibling::td/child::input[@name='contact_id']")).click();
		 Thread.sleep(3000);
		 driver.quit();
	}

}
