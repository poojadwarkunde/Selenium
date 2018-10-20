package selenium.sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sagarborse/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		
//		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
//		Thread.sleep(5000);
//		driver.findElement(By.linkText("You 1st")).click();;
//		
//		driver.findElement(By.id("ControlGroupRetrieveBookingView_BookingRetrieveInputRetrieveBookingView_ButtonRetrieve")).click();
//		
//		driver.switchTo().alert().accept();
		
		action.moveToElement(driver.findElement(By.linkText("MENU"))).build().perform();
		Thread.sleep(4000);
		action.moveToElement(driver.findElement(By.linkText("Travel Info"))).build().perform();
		Thread.sleep(4000);
		action.moveToElement(driver.findElement(By.linkText("Citizen's Charter"))).click().build().perform();
		Thread.sleep(4000);
		driver.quit();
	}

}
