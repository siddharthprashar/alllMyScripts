package GoIboBo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClassForGoIbibo {
	public WebDriver driver;
	public Login_PomPg goIbi;

	
	@BeforeClass
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.goibibo.com");
	}
	@BeforeMethod 
	public void fetchMethods() {
		goIbi=new Login_PomPg(driver);
		goIbi.getSignupButton().click();
		goIbi.getPhoneNumberTextField().sendKeys("46747675");
		goIbi.getContinueButton();
	
		goIbi.getEmailTextField().sendKeys("prasharsiddharth85@gmail.com");
		goIbi.getLetsGoButton().click();
		
	}
	

}
