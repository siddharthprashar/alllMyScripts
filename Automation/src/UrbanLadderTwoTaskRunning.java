import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadderTwoTaskRunning {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
		WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com/");
		driver.findElement(By.id("search")).sendKeys("study table",Keys.ENTER);
		driver.findElement(By.partialLinkText("Close")).click();
		Actions action=new Actions(driver);
		
		driver.findElement(By.xpath("//div[contains(text(),'Price')]")).click();
		//Thread.sleep(3000);
		  String parentWinId = driver.getWindowHandle();
		//action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Price')]")));
		WebElement firstSlider=driver.findElement(By.xpath("//div[@class=\"noUi-handle noUi-handle-lower\"]"));
		
		Thread.sleep(3000);
		action.dragAndDropBy(firstSlider,48,0).perform();
		WebElement secSlider=driver.findElement(By.xpath("//div[@class=\"noUi-handle noUi-handle-upper\"]"));
		action.dragAndDropBy(secSlider,-188,0).perform();
	//	driver.findElement(By.xpath("//img[@title=\"Arizona Study Table (Exotic Teak)\"]")).click();
		WebElement product=driver.findElement(By.xpath("//ul[@class='productlist small-block-grid-3']//li[4]"));
		
		System.out.println(product.getText());
		//driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='productlist small-block-grid-3']//li[4]")).click();
	//	driver.findElement(By.xpath("//img[@title=\"Arizona Study Table (Exotic Teak)\"]")).click();
	Set<String> allWinId = driver.getWindowHandles();
	allWinId.remove(parentWinId);
	Object winId;
	for(String WinId:allWinId)
	{
		driver.switchTo().window(WinId).getTitle();
	}
	WebElement prodDetails=driver.findElement(By.xpath("(//div[@class='row clearfix productinfodetails'])[1]"));
	prodDetails.getText();
	WebElement warrantyDetails=driver.findElement(By.xpath("//span[text()=\"Know More\"]"));
	warrantyDetails.getText();
	driver.findElement(By.id("add-to-cart-button")).click();
	String expectedCartTitle=driver.getTitle();
		
		
		
		

	

}
}
