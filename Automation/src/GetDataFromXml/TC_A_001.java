package GetDataFromXml;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import DistributionExecution_2.ConfiguationAnnotationBaseTest;


public class TC_A_001 extends ConfiguationAnnotationBaseTest {
	@Parameters("siddharth")
	@Test(groups="Smoke")
	public void createAcc(String a) {
		Reporter.log(a,true);
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.axis.com/en-in");	
		driver.close();

		
	}

}
