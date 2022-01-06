import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class TC_A_001 {
	@Parameter("siddharth")
	@Test()
	public void createAccount(String a) {
		Reporter.log(a);
		Reporter.log("account is created",true);
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
		WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("https://www.swiggy.com/");
		System.out.println(a);
		driver.close();
	
	}

}
