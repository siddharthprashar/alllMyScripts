package ELF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.performance.Performance;
import org.openqa.selenium.interactions.Actions;

public class ToMouseHovering {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.kalkifashion.com");
		driver.findElement(By.xpath("//button[text()=\"No thanks\"]")).click();
		Thread.sleep(2000);
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.linkText("MEN"))).perform();
		actions.click(driver.findElement(By.linkText("Sherwanis"))).perform();
		
		
		

	}

}
