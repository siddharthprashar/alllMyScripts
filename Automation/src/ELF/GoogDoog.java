package ELF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogDoog {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/doodles");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(; ;) {
			try {
				driver.findElement(By.linkText("Christopher Reeve's 69th birthday")).click();
				break;
			}catch(NoSuchElementException e) {
				js.executeScript("window.scrollBy(0,1000);")
			
				
			}
			
		}
		
	}

}
