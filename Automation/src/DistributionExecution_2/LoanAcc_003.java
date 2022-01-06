package DistributionExecution_2;

import javax.xml.crypto.Data;

import org.openqa.selenium.WebDriver;


import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerImp.class)

public class LoanAcc_003 {
	public static WebDriver driver;
	@Test(groups ="Smoke")
	
	public void loanAcc003() {
		Reporter.log("from loan acc003",true);
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
	 driver=new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("https://www.onlinesbi.com/");
		int i=1/0;
		driver.close();

}
}
