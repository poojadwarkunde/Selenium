package selenium.sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXPath {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "/Users/sagarborse/Downloads/chromedriver");
		Initializer.initilize();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
//		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement searchid = driver.findElement(By.xpath("//input[@id = 'gh-ac']"));
		searchid.sendKeys("By ID");
		Thread.sleep(500);
		searchid.clear();
		Thread.sleep(500);
		
		WebElement searchname = driver.findElement(By.xpath("//input[@name = '_nkw']"));
		searchname.sendKeys("By Name");
		Thread.sleep(500);
		searchname.clear();
		Thread.sleep(500);
		
		WebElement searchcontains = driver.findElement(By.xpath("//input[contains(@id,'gh-ac')]"));
		searchcontains.sendKeys("By Contains");
		Thread.sleep(500);
		searchcontains.clear();
		Thread.sleep(500);
		
		WebElement searchstart = driver.findElement(By.xpath("//input[starts-with(@id,'gh-ac')]"));
		searchstart.sendKeys("By Starts with");
		Thread.sleep(500);
		searchstart.clear();
		Thread.sleep(500);
		
//		WebElement searchends = driver.findElement(By.xpath("//input[ends-with(@name,'_nkw')]"));
//		searchends.sendKeys("By Ends with");
//		Thread.sleep(500);
//		searchends.clear();
//		Thread.sleep(500);
		
		driver.quit();
	}

}
