package GoIboBo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoIbiBoCode{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
		WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com");
		driver.findElement(By.xpath("//p[text()='Login or Signup']")).click();
		driver.findElement(By.name("phone")).sendKeys("7508373667");
		driver.findElement(By.xpath("//input[@value=\"Continue\"]")).click();
		driver.findElement(By.name("email")).sendKeys("prasharsiddharth85@gmail.com");
		driver.findElement(By.xpath("//button[text()=\"Lets Go\"]"));
		

	
}
}