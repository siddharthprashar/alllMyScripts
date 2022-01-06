package TestNGTryDistributionBatchExecution;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DistributionExecution_TC_002 {
	@Test
	public void modifyAcc() {
		Reporter.log("from modify account");
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
		WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.close();

}
}
