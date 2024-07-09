package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signuppage {
	
	public Signuppage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//---------- Obj repo --------------
	@FindBy(xpath = "//input[@id='sign-username']")
	private WebElement username_textbox;
	
	@FindBy(xpath = "//input[@id='sign-password']")
	private WebElement password_textbox;
	
	@FindBy(xpath = "//button[contains(text(),'Sign up')]")
	private WebElement signup_button;
	
	
	//----------- action method-----------------
	public void enterUsername(String username)
	{
		username_textbox.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		password_textbox.sendKeys(password);
	}
	
	public void clickOnSignUpButton()
	{
		signup_button.click();
	}
}
