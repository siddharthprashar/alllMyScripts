package ELF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class alertPopup {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
		WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://marimallappawomenscollege.org/contactus.php?current=contactus");
		driver.findElement(By.name("Send")).click();
		Alert alertpopup=driver.switchTo().alert();
		String alertMessage=alertpopup.getText();
		System.out.println(alertMessage);
		alertpopup.accept();
		

	}

}
