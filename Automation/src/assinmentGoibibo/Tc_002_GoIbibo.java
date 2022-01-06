package assinmentGoibibo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc_002_GoIbibo extends BaseClassForGoibibo{
	@Test
	public void signIn() {
		
	
		page=new PomForGoiboLogin(driver);
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		page.getEmailTextBox().sendKeys("prasharsiddharth85@gmail.com");
		page.getLetsGoButton().click();
		System.out.println(driver.getCurrentUrl());
		String actualUrl="https://www.goibibo.com/";
		String expectedUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl,"user  credentials are not valid");
		
		
		
	
			
			
			
			
		}
		
	}


