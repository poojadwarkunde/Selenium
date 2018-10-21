package selenium.sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendarJS {

	public static void main(String[] args) throws InterruptedException {
		Initializer.initilize();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.spicejet.com");

		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		String dateVal = "30-12-2017";
		selectDateByJS(driver,element,dateVal);
		
		Thread.sleep(3000);
		
		driver.quit();

	}
	
	public static void selectDateByJS(WebDriver driver,WebElement element,String dateVal) {
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
		System.out.println("Select Date By JS method");
	}

}
