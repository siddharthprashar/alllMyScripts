package ELF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrelloActions {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://trello.com");
		driver.findElement(By.xpath("//span[text()=\"Log in\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"user\"]")).sendKeys("prasharsiddharth85@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"login\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Macbook@99");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class=\"css-19r5em7\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"css-s0bv5z\"]")).sendKeys("Macbook@99");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=\"Log in\"]")).click();
		
		//driver.findElement(By.xpath("//span[text()=\"Continue with Google\"]")).click();
		//driver.findElement(By.xpath("//div[text()=\"Email or phone\"]")).sendKeys("prasharsiddharth85@gmail.com");
		//driver.findElement(By.xpath("//span[@jsname=\"V67aGc\"]")).click();
		
		
		//driver.findElement(By.xpath("//div[text()=\"siddharth prashar\"]")).click();
		//driver.findElement(By.xpath("//div[text()=\"Atul hiralkar\"]")).click();
		
	

	}

}
