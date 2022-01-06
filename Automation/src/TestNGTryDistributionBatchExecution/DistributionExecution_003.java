package TestNGTryDistributionBatchExecution;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DistributionExecution_003 {
@Test
public void loanAcc() {
	Reporter.log("from loan account");
	System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
	WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
	driver.get("https://www.axis.com/en-in");	
	driver.close();
}
}
