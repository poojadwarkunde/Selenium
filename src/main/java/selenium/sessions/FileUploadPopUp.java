package selenium.sessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sagarborse/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.html.com/Input-type-file");
		
		driver.manage().window().maximize();
		
		WebElement uploadbutton = driver.findElement(By.id("fileupload"));
		
		uploadbutton.sendKeys("/Users/sagarborse/Documents/workspace/Pooja_java/TestNGProject/test-output/index.html");
	   WebElement submit = driver.findElement(By.xpath(""));
		
	   submit.click();
	   
		driver.quit();
	
	}

}
