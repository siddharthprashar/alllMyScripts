package assinmentGoibibo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomForGoiboLogin {
	public PomForGoiboLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "get_sign_in") private WebElement signLink;
	@FindBy(name = "phone") private WebElement phoneTextField;
	@FindBy(xpath = "//input[@value='Continue']") private WebElement continueBtn;
	@FindBy(name = "email") private WebElement emailTextBox;
	@FindBy(xpath = "//button[text()=\"Lets Go\"]") private WebElement letsGoButton;
	@FindBy(partialLinkText = "Flights") private WebElement flightModule;


	

	


	public WebElement getSignLink() {
		return signLink;
	}

	public WebElement getPhoneTextField() {
		return phoneTextField;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getLetsGoButton() {
		return letsGoButton;
	}

	public WebElement getFlightModule() {
		return flightModule;
	}
	
	
	
	


	
	

}
