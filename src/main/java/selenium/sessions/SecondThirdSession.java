package selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondThirdSession {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sagarborse/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();

		WebElement rgstr = driver.findElement(By.linkText("register"));

		rgstr.click();
		
//		Registration Pgae Elements
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id='firstname']"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement password =driver.findElement(By.id("PASSWORD"));
		WebElement pwdcheckbox = driver.findElement(By.xpath("//input[@name='checkbox-default']"));
		WebElement submit = driver.findElement(By.xpath("//div[@id='throbber']"));
		
		firstname.sendKeys("P");
		lastname.sendKeys("D");
		email.sendKeys("PD@gmail.com");
		password.sendKeys("ASDF*();");
//		pwdcheckbox.click();pwdcheckbox.click();
//		password.click();
//		driver.wait();
		submit.click();
		
		driver.quit();
	}

}
