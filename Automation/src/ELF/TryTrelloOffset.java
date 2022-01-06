package ELF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TryTrelloOffset {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://trello.com");
		driver.findElement(By.xpath("//span[text()=\"Log in\"]")).click();
		driver.findElement(By.id("user")).sendKeys("prasharsiddharth85@gmail.com");
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Macbook@99");
		Thread.sleep(3000);
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.xpath("//div[text()=\"Atul hiralkar\"]")).click();
		Actions actions=new Actions(driver);

		WebElement sourceElement=driver.findElement(By.xpath("//div[@class=\"list js-list-content\"]/.//span[text()='java']"));
		WebElement targetElement=driver.findElement(By.xpath("//h2[text()=\"Doing\"]/../..//span[text()='Add a card']"));
		
		actions.dragAndDrop(sourceElement,targetElement).perform();
		WebElement srcElment2=driver.findElement(By.xpath("ff"));
		WebElement tarElement=driver.findElement(By.xpath("//h2[text()=\"Doing\"]/../..//span[text()=\"Add a card\"]"));
		actions.dragAndDrop(srcElment2,tarElement).perform();	
		

	}

}
