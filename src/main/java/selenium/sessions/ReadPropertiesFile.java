package selenium.sessions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertiesFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		Properties prop =new Properties();
		
		FileInputStream ip = new FileInputStream("/Users/sagarborse/Documents/workspace/Pooja_java/SeleniumSessions/src/JavaTopics/config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("URL"));
		System.out.println(prop.getProperty("browser"));
		
		if(prop.getProperty("browser").equals("Chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/sagarborse/Downloads/chromedriver");

		driver = new ChromeDriver();
		}
		
		driver.get(prop.getProperty("URL"));
	}

}
