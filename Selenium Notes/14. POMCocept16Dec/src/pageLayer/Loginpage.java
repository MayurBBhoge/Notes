package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	private WebDriver driver;
	public Loginpage(WebDriver d)
	{
		driver = d;
	}
	
	// ------------- Obj repo ---------------------------
	
	private By username_textbox = By.xpath("//input[@id='loginusername']");
	private By password_textbox = By.xpath("//input[@id='loginpassword']");
	private By login_button = By.xpath("//button[contains(text(),'Log in')]");
		
		
	// ------------------- action methods ------------------------
	
	public void enterUsername(String username)
	{
		driver.findElement(username_textbox).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(password_textbox).sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		driver.findElement(login_button).click();
	}
}
