package selenium.sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
			Initializer.initilize();
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("window-size=1400,800");
			options.addArguments("headless");
			
			WebDriver driver = new ChromeDriver(options);
			
			driver.get("http://www.freecrm.com");
			
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			System.out.println("Before Login title :"+driver.getTitle());
			
			WebElement username = driver.findElement(By.name("username"));
			WebElement password = driver.findElement(By.name("password"));
			WebElement submit = driver.findElement(By.xpath("//input[@value = 'Login']"));
			
			username.clear();
			username.sendKeys("pdwarkunde");
			password.clear();
			password.sendKeys("test@123");
			Thread.sleep(3000);
			submit.click();
			
			System.out.println("After Login title :"+driver.getTitle());
			
			driver.quit();
	}

}
