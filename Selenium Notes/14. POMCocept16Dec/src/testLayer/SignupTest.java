package testLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageLayer.Homepage;
import pageLayer.Signuppage;

public class SignupTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/index.html#");
		driver.manage().window().maximize();
		
		Homepage homepage_obj = new Homepage(driver);
		Signuppage signuppage_obj = new Signuppage(driver);
		homepage_obj.clickOnSignupLink();
		Thread.sleep(2000);
		signuppage_obj.enterUsername("testacc112");
		signuppage_obj.enterPassword("test");
		signuppage_obj.clickOnSignUpButton();
	}
}
