package selenium.sessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicSearch {

	public static void main(String[] args) throws InterruptedException {
		Initializer.initilize();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

//		 driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// Implicit Wait

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("lst-ib")).sendKeys("Testing");
		
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
		System.out.println("total no of suggestions " + list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("testing interview questions")) {
				list.get(i).click();
				break;
			}
			Thread.sleep(3000);	
		}
		
		driver.quit();
	}

}
