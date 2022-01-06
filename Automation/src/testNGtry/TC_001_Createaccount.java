package testNGtry;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TC_001_Createaccount {
	@Test
	public void createAc()
	{
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
		WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://marimallappawomenscollege.org/contactus.php?current=contactus");
	}

}
