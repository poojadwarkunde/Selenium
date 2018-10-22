package selenium.sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) throws InterruptedException {
		Initializer.initilize();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		Thread.sleep(2000);
		
		WebElement dd = driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']"));
		dd.click();
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));
		
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
				list.get(i).click();
				break;
		}
		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i).getText());
//			if(list.get(i).getText().contains("Angular")) {
//				list.get(i).click();
//				break;
//			}
//		}
		Thread.sleep(3000);
		driver.quit();
	}

}
