package selenium.practice.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverExamples {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\owno\\for backup\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.google.com");
	String actualTitle = driver.getTitle();
	System.out.println(actualTitle);
	if(actualTitle.equals("Google")) {
		System.out.println("Correct Title");
	}
	else {
		System.out.println("incorrect title");
	}
	System.out.println("URL :" + driver.getCurrentUrl());
	System.out.println("URL :" + driver.getPageSource());
//	element googletextbox = driver.findElement(id = "lst-ib");
	driver.close();
	}

}
