package ELF;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UrbanLadderOneWorking {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
		WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.get("https://www.urbanladder.com/");
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		Actions ac=new Actions(driver);
		ac.moveByOffset(397,182).perform();
		driver.findElement(By.xpath("//span[text()='Lounge Chairs']")).click();
		//Thread.sleep(6000);
		driver.findElement(By.linkText("Close")).click();
		WebElement product = driver.findElement(By.xpath("//ul[@class='productlist withdivider clearfix lounge_chairs productgrid']//li[3]"));
		wait.until(ExpectedConditions.visibilityOf(product));
		String price = product.getText();
		Set<String>childWindow=driver.getWindowHandles();
		char[] priceArray=price.toCharArray();
		String cost = "";
		for(char p:priceArray) {
			if(p>=48 && p<=57) {
				cost=cost+p;
			}
		

	}
		int productCost=Integer.parseInt(cost);
		if(productCost>=20000) {
			System.out.println("the product is more than 200000");
		}else {
			System.out.println("the product is less than 200000");
		}
		product.click();
		Set<String> allwindow = driver.getWindowHandles();
		allwindow.remove(parentwindow);
		for(String windowId:allwindow) {
			driver.switchTo().window(windowId);
		}
		driver.findElement(By.xpath("//button[@data-id=\"93407\"]")).click();
		
		
		

}
}
