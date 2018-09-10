package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;
	

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\Ajay\\eclipse-workspace\\freecrm\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
			driver = new ChromeDriver();
		}
//		else if(browserName.equals("FF")){
//			System.setProperty("webdriver.gecko.driver", "E:\\owno\\for backup\\Downloads\\geckodriver-v0.21.0-win32");
//		 driver = new FirefoxDriver();
//		}
		else if (browserName.equals("internet explorer")) {
			System.setProperty("webdriver.internetexplorer.driver",
					"E:\\owno\\for backup\\Downloads\\IEDriverServer_Win32_3.14.0");
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("No browser is mentioned");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
//		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
//		System.out.println(prop.getProperty("url"));
		
	}

}
