package DistributionExecution_2;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Createacc_002 extends ConfiguationAnnotationBaseTest {
	@Test

	public void createAcc02() {
		Reporter.log("from create acc02");
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
		WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("https://www.axis.com/en-in");	
		driver.close();

}
}
