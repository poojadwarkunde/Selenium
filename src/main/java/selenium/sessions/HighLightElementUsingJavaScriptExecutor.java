package selenium.sessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighLightElementUsingJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException, IOException {
//		System.setProperty("webdriver.chrome.driver", "/Users/pooja/Projects/chromedriver");
		
		Initializer.initilize();

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.freecrm.com");

//		 driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// Implicit Wait

//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//		WebElement username = driver.findElement(By.name("username"));
//		WebElement password = driver.findElement(By.name("password"));
//		WebElement submit = driver.findElement(By.xpath("//input[@value = 'Login']"));

//		username.clear();
//		Thread.sleep(1000);
//		username.sendKeys("pdwarkunde");
//		password.clear();
//		Thread.sleep(1000);
//		password.sendKeys("test@123");
//		Thread.sleep(3000);
		// submit.click();

//		flash(username, driver); // To highlight element
//
//		Thread.sleep(3000);
//
//		drawBorder(username, driver); // To draw border
//		Thread.sleep(3000);
//
//		TakesScreenshot ss = ((TakesScreenshot) driver);
//		File src = ss.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File(
//				"/Users/sagarborse/Documents/workspace/Pooja_java/SeleniumSessions/src/JavaTopics/FreeCRM.png"));
//		
//		generateAlert(driver,"There is an issue with username button");
//		Thread.sleep(3000);
//		
//		driver.switchTo().alert().accept();
//		Thread.sleep(3000);
//		
//		clickElementbyJS(submit,driver);
//		Thread.sleep(3000);
//		
//		refreshPage(driver);
//		Thread.sleep(3000);
//		
//		System.out.println(getPageTitle(driver));
//		Thread.sleep(3000);
		
//		System.out.println(innertext(driver));
//		Thread.sleep(3000);
		
		scroll(driver);
		Thread.sleep(3000);
		
		WebElement fgtpwd = driver.findElement(By.partialLinkText("Privacy Policy"));
		
		scrollUntilElementFound(fgtpwd, driver);
		
		fgtpwd.click();
		Thread.sleep(3000);
		
		driver.quit();
	}

	public static void scrollUntilElementFound(WebElement element,WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static void scroll(WebDriver driver) {
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	public static String innertext(WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			String s = js.executeScript("return document.documentElement.innerText;").toString();
			return s;
	}

	public static String getPageTitle(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}

	public static void refreshPage(WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor) driver) ;
			js.executeScript("history.go(0)");
	}

	public static void clickElementbyJS(WebElement element, WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", element);
	}

	public static void generateAlert(WebDriver driver,String message) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("alert('"+message+"')");
	}

	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border ='3px solid red'", element);
	}

	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgrounfColor");
		for (int i = 0; i < 10; i++) {
			changecolor("rgb(200,100,50)", element, driver);
			changecolor(bgcolor, element, driver);
		}
	}

	public static void changecolor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}
	}

}
