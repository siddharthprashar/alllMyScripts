package ELF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUptoAnElement {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://meesho.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.findElement(By.xpath("//strong[text()=\"Beauty & Makeup\"]"));
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		

	}

}
