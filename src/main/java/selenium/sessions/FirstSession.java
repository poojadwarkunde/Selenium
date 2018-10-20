package selenium.sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSession {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sagarborse/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("Title is :" + title);
		
		String url = driver.getCurrentUrl();
		System.out.println("Current URL is " + url);
		
		String src =driver.getPageSource();
		System.out.println("Page Source is " + src);
		
//		if(title.equals("#1 Free CRM software in the cloud for sales and service")) {
//			System.out.println("Title is same");
//		}else {
//			System.out.println("Title is not same");
//		}
		
		driver.quit();
	}

}
