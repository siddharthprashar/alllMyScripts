package ELF;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipkartRemoveFromCartRunning {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
		WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		String parenWinId=driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("mobiles",Keys.ENTER);
		driver.navigate().refresh();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='realme C21Y (Cross Blue, 32 GB)']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='realme C21Y (Cross Black, 64 GB)']")).click();
		driver.findElement(By.xpath("//div[text()='realme Narzo 50A (Oxygen Green, 64 GB)']")).click();
		Set<String> allWinIds=driver.getWindowHandles();
		allWinIds.remove(parenWinId);
		for(String allWindowIds:allWinIds)
		{
			//Thread.sleep(2000);
			driver.switchTo().window(allWindowIds);
			//driver.navigate().refresh();
			//Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		}
		driver.switchTo().window(parenWinId);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		driver.navigate().refresh();
		JavascriptExecutor js=(JavascriptExecutor) driver;
	
		//Thread.sleep(2000);
		//driver.navigate().refresh();
		//WebElement elemToRemove=driver.findElement(By.xpath("//a[text()='POCO C31 (Shadow Gray, 64 GB)']"));
		//js.executeScript("argument[0].scrollIntoView(true);",elemToRemove);
		//js.executeScript("window.scrollBy(o,document.body.scrollHeight);");
		//Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,1800);");
		driver.findElement(By.xpath("//a[text()='realme C21Y (Cross Black, 64 GB)']/../../../..//div[text()='Remove']")).click();
		driver.findElement(By.xpath("//div[text()='Remove Item']/..//div[text()='Remove']")).click();
		
		
		
		
		

		
	}

}
