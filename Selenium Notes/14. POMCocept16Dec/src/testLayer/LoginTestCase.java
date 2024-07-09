package testLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageLayer.Homepage;
import pageLayer.Loginpage;

public class LoginTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/index.html#");
		driver.manage().window().maximize();
		
		Homepage homepage_obj = new Homepage(driver);
		Loginpage loginpage_obj = new Loginpage(driver);
		
		homepage_obj.clickOnLoginLink();
		Thread.sleep(2000);
		loginpage_obj.enterUsername("testacc3");
		loginpage_obj.enterPassword("test");
		loginpage_obj.clickOnLoginButton();
		

	}
}
