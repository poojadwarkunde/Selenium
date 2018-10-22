package selenium.sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli {

	public static void main(String[] args) throws InterruptedException, FindFailed {
			Initializer.initilize();
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.youtube.com/watch?v=ckPCZ8eT9qE");
			
			Screen s = new Screen();
//			Pattern pauseImg = new Pattern("YT_Pause.png");
//			s.wait(pauseImg,2000);
//			s.click();
//			s.click();
			
			Pattern NextImg = new Pattern("YT_PlayNext.png");
			s.wait(NextImg,2000);
			s.click();
			s.click();
			
//			Pattern settingsImg = new Pattern("YT_Settings.png");
//			s.wait(settingsImg,2000);
//			s.click();
//			s.click();
			
			Thread.sleep(2000);
			driver.quit();
	}

}
