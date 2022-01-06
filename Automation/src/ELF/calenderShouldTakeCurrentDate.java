package ELF;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class calenderShouldTakeCurrentDate {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
		WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		LocalDateTime ldt=LocalDateTime.now().plusMonths(6);
		int monthName=ldt.getDayOfMonth();
		int year=ldt.getYear();
		driver.get("https://www.makemytrip.com/");
		Actions action=new Actions(driver);
		action.click().perform();
		Thread.sleep(4000);
		driver.findElement(By.className("langCandClose")).click();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;{
			js.executeScript("window.scrollBy(0,100);");
			Thread.sleep(2000);
			selectCalenderDate(driver,month,date,year);
				
		}
		public static void selectCalender
		
		
		

	}

}
