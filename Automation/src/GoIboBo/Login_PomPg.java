package GoIboBo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PomPg {

		// TODO Auto-generated constructor stub
	
	public Login_PomPg(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
	//@SuppressWarnings("deprecation")
	//public static void main(String[] args) throws InterruptedException {
	//	System.setProperty("webdriver.chrome.driver","/Users/siddharth/Downloads/chromedriver-2");
	//	WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
	//	driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//	driver.get("https://www.goibibo.com");
	//	driver.findElement(By.xpath("//p[text()='Login or Signup"]")).click();
	//	driver.findElement(By.name("phone")).sendKeys("7508373667");
	//	driver.findElement(By.xpath("//input[@value=\"Continue\"]")).click();
	public void login (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "//p[text()='Login or Signup") private WebElement SignupButton;
@FindBy(name ="phone" ) private WebElement PhoneNumberTextField;
@FindBy(xpath = "//input[@value=\\\"Continue\\\"]") private WebElement ContinueButton;
@FindBy(name = "email") private WebElement EmailTextField;
@FindBy(xpath = "//button[text()=\"Lets Go\"]") private WebElement LetsGoButton;


public WebElement getSignupButton() {
	return SignupButton;
}
public WebElement getPhoneNumberTextField() {
	return  PhoneNumberTextField;
}
public WebElement getContinueButton()
{
	return ContinueButton;
}
public WebElement getEmailTextField() {
	return EmailTextField;
	
}
public WebElement getLetsGoButton() {
	return LetsGoButton;
	
}

	
}
