package assinmentGoibibo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_003 extends BaseClassForGoibibo{
	@Test
	public void homepage() {
		page=new PomForGoiboLogin(driver);
		
		
		page=new PomForGoiboLogin(driver);
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
	
			e.printStackTrace();
		}
		
		page.getEmailTextBox().sendKeys("prasharsiddharth85@gmail.com");
		page.getLetsGoButton().click();
		System.out.println(driver.getCurrentUrl());
		String actualUrl="https://www.goibibo.com/";
		String expectedUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl,"user  credentials are not valid");
		
		
		
	
			
			
			String flightMod = page.getFlightModule().getText();
			
			String expectedFlightModule = "Flights";
			String actualFlightModule = page.getFlightModule().getText();
			Assert.assertEquals(expectedFlightModule, actualFlightModule,"flight module is not displayed on the homepage ");;
			
		}
	}


