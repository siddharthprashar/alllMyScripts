package assinmentGoibibo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClassForGoibibo {
	public WebDriver driver;
	public PomForGoiboLogin page;
	@BeforeClass
	public void launchingBrowser(){
		
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.goibibo.com");
	
	}
	
	@BeforeMethod
	public void loginPage() {
		String actualPhnNo = "7508373667";
		page=new PomForGoiboLogin(driver);
		page.getSignLink().click();
		page.getPhoneTextField().sendKeys("7508373667");
		String expectedPhnNo = page.getPhoneTextField().getAttribute("value");
		page.getContinueBtn().click();
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(actualPhnNo, expectedPhnNo, "user is not enter the phone number");
		Reporter.log("user is successfully enter the phone number",true);
		
		
		
		
		
		
		
		
	}
	@AfterMethod
	public void logOut()
	{
		driver.close();
	}
	

}
