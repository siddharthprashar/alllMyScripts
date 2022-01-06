package TestNGTryDistributionBatchExecution;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DistributionExecutionTestNG {
	@Test
	public void createAcc() {
		Reporter.log("from create account");
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
		WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.close();
	}

}
