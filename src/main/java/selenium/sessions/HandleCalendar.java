package selenium.sessions;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleCalendar {

	public static void main(String[] args) throws InterruptedException {
		Initializer.initilize();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.freecrm.com");

		// driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// Implicit Wait

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement submit = driver.findElement(By.xpath("//input[@value = 'Login']"));

		username.clear();
		Thread.sleep(1000);
		username.sendKeys("pdwarkunde");
		password.clear();
		Thread.sleep(1000);
		password.sendKeys("test@123");
		Thread.sleep(3000);
		submit.click();
		Thread.sleep(3000);

		driver.switchTo().frame("mainpanel");

		String date = "35-June-2018";
		String datearr[] = date.split("-");
		String day = datearr[0];
		String month = datearr[1];
		String year = datearr[2];

		Select sel1 = new Select(driver.findElement(By.name("slctMonth")));
		sel1.selectByVisibleText(month);

		Select sel2 = new Select(driver.findElement(By.name("slctYear")));
		sel2.selectByVisibleText(year);

		// *[@id="crmcalendar"]//descendant::td[@class="calendarcell"]
		// *[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[3]/td[5]

		String beforex = "//*[@id=\"crmcalendar\"]/table/tbody/tr[2]/td/table/tbody/tr[";
		String afterx = "]/td[";

		final int totalWeekDays = 7;
		String dayval =null;

		boolean flag = false;
		for (int r = 2; r <= 7; r++) {
			for (int c = 1; c <= 7; c++) {
				try {
				 dayval = driver.findElement(By.xpath(beforex + r + afterx + c + "]")).getText();
				}catch(NoSuchElementException e) {
					System.out.println("Please enter correct date");
					flag=false;
					break;
				}
				System.out.println(dayval);
				if (dayval.equals(day)) {
					driver.findElement(By.xpath(beforex + r + afterx + c + "]")).click();
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}

		Thread.sleep(3000);

		driver.quit();
	}

}
