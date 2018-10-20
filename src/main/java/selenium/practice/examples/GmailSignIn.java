package selenium.practice.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class GmailSignIn {
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver","E:\\owno\\for backup\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		Initializer.initilize();
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
//		driver.manage().window().maximize();
//		driver.findElements(null).
		//XPATH
//		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Pooja");
//		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Borse");
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("poojaborse");
//		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("DwarBorse9096648553*");
//		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("DwarBorse9096648553*");
//		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		//ID
		driver.findElement(By.id("firstName")).sendKeys("Pooja");
		driver.findElement(By.id("lastName")).sendKeys("Borse");
		driver.findElement(By.id("username")).sendKeys("poojaborse");
		//NAME
		driver.findElement(By.name("Passwd")).sendKeys("DwarBorse9096648553*");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("DwarBorse9096648553*");
		//CLASS
//		driver.findElement(By.class("RveJvd snByac")).click();
		//LINK TEXT and Partial Link text : Not useful much
		//Class Name
//		driver.findElement(By.xpath("//div[@class='IMH1vc lUHSR Hj2jlf']")).click();
		Select selectlang = new Select(driver.findElement(By.id("lang-chooser")));
		selectlang.selectByVisibleText("‪Afrikaans‬");
//		driver.close();
	}
}
