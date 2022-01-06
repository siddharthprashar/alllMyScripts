package ELF;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlipkartAgain {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
		WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		
		driver.get("https://www.flipkart.com/");
		String parentWinId=driver.getWindowHandle();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(10000);
		
		
		driver.findElement(By.xpath("//img[@alt=\"Mobiles\"]")).click();
		
		Thread.sleep(10000);

		
		
		driver.findElement(By.xpath("//img[@class=\"_1aPR5_\"]")).click();
		Thread.sleep(10000);

		
		driver.findElement(By.xpath("//div[text()=\"realme C25Y (Metal Grey, 64 GB)\"]")).click();
		Thread.sleep(10000);

		
		driver.findElement(By.xpath("//div[text()=\"realme C25Y (Glacier Blue, 64 GB)\"]")).click();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//div[text()='realme Narzo 50A (Oxygen Blue, 128 GB)']")).click();
		//driver.findElement(By.xpath("//div[text()=\"realme Narzo 50A (Oxygen Blue, 64 GB)\"]")).click();
		Thread.sleep(10000);

		
		Set<String>allWinIds=driver.getWindowHandles();
		allWinIds.remove(parentWinId);
		for(String winId:allWinIds)
		{
			driver.switchTo().window(winId);
			Thread.sleep(10000);

		
		
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		
		
		}
	
		
		
	
	//driver.switchTo().window(parentWinId);
	//Thread.sleep(10000);

//		driver.findElement(By.xpath("//span[text()='Cart']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()=\"realme C25Y (Metal Grey, 64 GB)\"]/../../../..//div[text()=\"Remove\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()=\"Remove\"]")).click();
//driver.findElement(By.xpath("//div[text()='Cancel']/../../..//div[text()='Remove']")).click();
		
			
			
	}
		

	



		
	}


	
