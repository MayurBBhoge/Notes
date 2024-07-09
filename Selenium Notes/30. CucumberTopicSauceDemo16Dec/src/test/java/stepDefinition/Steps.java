package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    driver = new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
	    driver.manage().window().maximize();
	}
	
	
	@When("user enter username {string} and password {string}")
	public void user_enter_username_and_password(String username, String password) throws InterruptedException {
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	}
	
	@When("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	
	@Then("user gets logged in and url is {string}")
	public void user_gets_logged_in_and_url_is(String expected_url) {
	   String actual_url = driver.getCurrentUrl();
	   Assert.assertEquals(actual_url, expected_url);
	}
}
