package ELF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HealthKart {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
		WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.healthkart.com/reviews/muscleblaze-biozyme-performance-whey-4-4-lb-rich-chocolate?storeVariantId=159123&productWise=true");
		
		driver.switchTo().alert().accept();
	WebElement starRating	=driver.findElement(By.xpath("//ul[@class=\"rating-stars js-give-star\"]"));
	Actions action=new Actions(driver);
	action.moveToElement(starRating, 30,0).perform();
	}

}
