package selenium.sessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sagarborse/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@id ='signin_info']")).click();
		driver.findElement(By.id("login1")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(2000);
		
		Alert alert =driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
String alerttext = alert.getText();
		
		if(alerttext.equals("Please enter a valid user name")) {
			System.out.println("Correct alert is displayed");
		}else {
			System.out.println("Incorrect alert is displayed");
		}
		
		
		Thread.sleep(2000);
		
		alert.accept();
		
//		alert.dismiss();
		Thread.sleep(2000);
		driver.quit();
	}

}
