package selenium.sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown1 {

	public static void main(String[] args) throws InterruptedException {
	Initializer.initilize();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://getbootstrap.com/docs/4.1/components/dropdowns/");
		Thread.sleep(2000);
		
		WebElement dd= driver.findElement(By.id("dropdownMenu2"));
		dd.click();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='dropdown-menu show']//button"));
		
		System.out.println(list.size());
		
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Action")) {
				list.get(i).click();
			}
		}
		
		Thread.sleep(2000);
		driver.quit();
	}

}
