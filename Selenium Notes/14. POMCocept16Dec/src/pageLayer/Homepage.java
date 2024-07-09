package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

	private WebDriver driver;
	public Homepage(WebDriver d) 
	{
		driver = d;
	}
	
	// ------------- Obj repo ---------------------------
	
	private By login_link = By.xpath("//a[@id='login2']");
	private By signup_link = By.xpath("//a[@id='signin2']");
	
	
	// ------------------- action methods ------------------------
	public void clickOnLoginLink()
	{
		driver.findElement(login_link).click();
	}
	
	public void clickOnSignupLink()
	{
		driver.findElement(signup_link).click();
	}
	
}
