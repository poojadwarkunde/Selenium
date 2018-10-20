package selenium.sessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowsPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sagarborse/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//Implicit Wait
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://popuptest.com/goodpopups.html");
		
//		WebElement popup1 =driver.findElement(By.linkText("Good PopUp #1"));
//		popup1.click();
//		WebElement popup2 =driver.findElement(By.linkText("Good PopUp #2"));
//		popup2.click();
		WebElement popup3 =driver.findElement(By.linkText("Good PopUp #3"));
		popup3.click();
//		WebElement popup4 =driver.findElement(By.linkText("Good PopUp #4"));
//		popup4.click();
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it  = handler.iterator();
		
		String parentWId = it.next();
		
		System.out.println("Parent Window ID : " + parentWId);
		String parentTitle = driver.getTitle();
		System.out.println("Parent Window Title is " + parentTitle);
		
		String childWId = it.next();
		System.out.println("Parent Window ID : " + childWId);
		
		driver.switchTo().window(childWId);
		
		String childTitle = driver.getTitle();
		System.out.println("Child Window Title is " + childTitle);
		
		driver.close();
		
//		driver.switchTo().window(parentWId);
//		String parentTitle1 = driver.getTitle();
//		System.out.println("Parent Window Title is " + parentTitle1);
		
		driver.quit();
	}

}
