package selenium.sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sagarborse/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement submit = driver.findElement(By.xpath("//input[@value = 'Login']"));

		Thread.sleep(6000);

		username.sendKeys("pdwarkunde");
		password.sendKeys("test@123");
		submit.click();
		Thread.sleep(6000);
		driver.switchTo().frame("mainpanel");
		WebElement contact = driver.findElement(By.xpath("//a[contains(text(),\"New Contact\")]"));
		Thread.sleep(6000);

		contact.click();

		driver.quit();
	}

}
