import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MmtCalenderPopUp {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
		WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		LocalDateTime ldt=LocalDateTime.now(); //This method returns the current date-time.
		DayOfWeek dayOFWeek=ldt.getDayOfWeek(); //getting day of the weeek
		String day3=dayOFWeek.toString(); //Converting day of the week to string
		day3=day3.substring(0,3); //to convert the day of the week in particular format
		String day4=""+day3.substring(0,1).toUpperCase()+day3.substring(1,3).toLowerCase();
		System.out.println(day4);
		
		String monthName=ldt.getMonth().toString(); //system month
		monthName=monthName.substring(0,3);
		String month=""+monthName.substring(0,1).toUpperCase()+monthName.substring(1,3).toLowerCase();
		System.out.println(month);
		int date=ldt.getDayOfMonth();
		System.out.println(date);
		
		int year=ldt.getYear();//System year
		System.out.println(year);
		System.out.println("Todays Date: "+day4+"-"+date+"-"+month+"-"+year);
		
		
		driver.get("https://www.makemytrip.com/");
		Actions action=new Actions(driver);
		action.click().perform();
		driver.findElement(By.className("langCardClose")).click();
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100);");
		selectCalenderDate(driver,day4,month,date,year);
		driver.quit();
		
	}
	public static void selectCalenderDate(WebDriver driver,String day4,String month,int date,int year) {
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[@aria-label='\"+day4+\" \"+month+\" \"+date+\" \"+year+\"']")).click();
				break;
			}catch(NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
	}

}
