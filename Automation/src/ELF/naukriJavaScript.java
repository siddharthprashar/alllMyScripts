package ELF;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukriJavaScript {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		String parenWinId=driver.getWindowHandle();
		Set<String> allWinIds=driver.getWindowHandles();
		allWinIds.remove(parenWinId);
		for(String allWindowIds: allWinIds)
		{
			driver.switchTo().window(allWindowIds);
			driver.close();
		}
		driver.switchTo().window(parenWinId);
		//driver.findElement(By.xpath("//label[@id=\"wdgt-file-upload\"]")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String idAttriVal="wdgt-file-upload";
		js.executeScript("document.getElementById("+idAttriVal+".scrollIntoView(false)" );
		
		
		
		
		
		
	}

}
