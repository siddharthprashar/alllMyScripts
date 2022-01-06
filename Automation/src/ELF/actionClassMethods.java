package ELF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class actionClassMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
		WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		WebElement targetEle=driver.findElement(By.xpath("//span[text()='Profile']"));
		Actions act=new Actions(driver);
		//Store the single action or composite action using action class methods
		act.moveToElement(targetEle).perform();
		
	}

}
