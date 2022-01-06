package ELF;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver " );
		ChromeDriver driver = new ChromeDriver();
//		System.out.println(System.getProperty("user.dir"));

	}

}