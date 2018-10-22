package selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliGoogle {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		Initializer.initilize();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Screen s = new Screen();
		Pattern signin = new Pattern("SignIn.png");
		
//		driver.findElement(By.id("lst-ib")).sendKeys("Pooja");
		
		s.wait(signin,2000);
		s.click();
		
		
		Thread.sleep(2000);
		driver.quit();
	}

}
