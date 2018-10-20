package selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibility {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sagarborse/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.freecrm.com/register/");

		WebElement submt = driver.findElement(By.xpath("//input[@name =\"submitButton\"]"));

		System.out.println("*************Submit Button *************");

		System.out.println("Displayed :" + submt.isDisplayed());
		System.out.println("Enabled :" + submt.isEnabled());
		System.out.println("Selected :" + submt.isSelected());

		WebElement terms = driver.findElement(By.xpath("//input[@name ='agreeTerms']"));
		System.out.println("*************Terms Checkbox Button *************");

		System.out.println("Displayed :" + terms.isDisplayed());
		System.out.println("Enabled :" + terms.isEnabled());
		System.out.println("Selected :" + terms.isSelected());

		terms.click();

		System.out.println("*************Terms Checkbox is checked *************");

		System.out.println("Displayed :" + terms.isDisplayed());
		System.out.println("Enabled :" + terms.isEnabled());
		System.out.println("Selected :" + terms.isSelected());

		driver.quit();
	}

}
