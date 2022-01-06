package ELF;

import java.sql.Driver;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.interactions.Actions;

public class MAeMyTripDotCom {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
		WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		LocalDateTime ldt=LocalDateTime.now().plusMonths(6);
		String monthNAme=ldt.getMonth().toString();
		monthNAme=monthNAme.substring(0,3);
		String month=""+monthNAme.substring(0, 1).toUpperCase()+monthNAme.substring(1, 3);
		int Date=ldt.getDayOfMonth();
		int year=ldt.getYear();
		driver.get("https://www.makemytrip.com/");
		Actions actions=new Actions(driver);
		//actions.click().perform();
		driver.navigate().refresh();
		driver.navigate().refresh();
		actions.click().perform();
		driver.findElement(By.xpath("//label[@for=\"departure\"]")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100);");
		Thread.sleep(2000);
		selectCalenderDate(driver,month,Date,year);
	
	public static void selectCalenderDate() {
		for(;;){
			try {
			driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).
				
			}
			catch{
				
				
				
				
			
		}
		
		
		
		
		

	}

}
