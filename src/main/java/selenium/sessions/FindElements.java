package selenium.sessions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sagarborse/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//		List <WebElement> linkList =driver.findElements(By.tagName("button")); //35
		List <WebElement> linkList =driver.findElements(By.tagName("a")); //199
		
		System.out.println(linkList.size());
		
		for(int i=0;i<linkList.size();i++) {
			String linkText = linkList.get(i).getText();
			System.out.println(linkText);
		}
		
		driver.quit();
	}

}
