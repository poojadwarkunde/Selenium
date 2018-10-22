package selenium.sessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		Initializer.initilize();
		WebDriver driver = new ChromeDriver();
		driver.get("https://makemysushi.com/Recipes/how-to-make-california-sushi-rolls");
		
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//		System.out.println("Before Login title :"+driver.getTitle());
//		
//		WebElement username = driver.findElement(By.name("username"));
//		WebElement password = driver.findElement(By.name("password"));
//		WebElement submit = driver.findElement(By.xpath("//input[@value = 'Login']"));
//		
//		username.clear();
//		username.sendKeys("pdwarkunde");
//		password.clear();
//		password.sendKeys("test@123");
//		Thread.sleep(3000);
//		submit.click();
//		
//		Thread.sleep(3000);
		
		//links : //a
		//images : //img
		
		//Get list of all the links and images
		
		System.out.println("title of the current page : "+ driver.getTitle());
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		
		linksList.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("Size of All links and images ===>" + linksList.size());
		
		List<WebElement> activeLinksList = new ArrayList<WebElement>();
		
		//Iterate linksList : exclude all links and images which dont have href attribute
		for(int i=0;i<linksList.size();i++) {
			if(linksList.get(i).getAttribute("href")!=null && (!linksList.get(i).getAttribute("href").contains("javascript")) && (!linksList.get(i).getAttribute("href").contains("mailto"))) {
//				System.out.println(linksList.get(i).getAttribute("href"));
				activeLinksList.add(linksList.get(i));
			}
		}
		//get the size of active links
		
		System.out.println("Size of active links and images ===>" + activeLinksList.size());
		
		//Check href url with httpconnection API
		
		for(int j=0;j<activeLinksList.size();j++) {
			HttpURLConnection connection= (HttpURLConnection)new URL(activeLinksList.get(j).getAttribute("href")).openConnection();
			
		connection.connect();
		int response = connection.getResponseCode();
		String resmes = connection.getResponseMessage();
		connection.disconnect();
		System.out.println(activeLinksList.get(j).getAttribute("href") + " ===> " + response +" " + resmes);
		}
		
		Thread.sleep(3000);
		driver.quit();
	}

}
