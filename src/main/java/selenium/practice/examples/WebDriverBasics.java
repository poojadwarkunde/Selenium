package selenium.practice.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverBasics {
	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver", "E:\\owno\\for backup\\Downloads\\geckodriver-v0.21.0-win32\\geckodriver.exe");
//		WebDriver driverF = new FirefoxDriver();
//		driverF.get("http://www.google.com");
//		driverF.close();
//		
//		System.setProperty("webdriver.chrome.driver", "E:\\owno\\for backup\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driverC = new ChromeDriver();
//		driverC.get("http://www.google.com");
//		driverC.close();
		
		System.setProperty("webdriver.ie.driver", "E:\\owno\\for backup\\Downloads\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		WebDriver driverI = new InternetExplorerDriver();
		driverI.get("http://www.google.com");
		driverI.close();
	}
}
