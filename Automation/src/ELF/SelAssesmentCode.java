package ELF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelAssesmentCode {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		String flipkartTitle=driver.getTitle();
		System.out.println(flipkartTitle);
		String flipUrl=driver.getCurrentUrl();
		System.out.println(flipUrl);
		String flipPageSource=driver.getPageSource();
		System.out.println(flipPageSource);
		
	}

}
