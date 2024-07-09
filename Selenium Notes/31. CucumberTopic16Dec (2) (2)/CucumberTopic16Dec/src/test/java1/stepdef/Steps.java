package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	WebDriver driver;
	
	@Given("user launch the browser")
	public void user_launch_the_browser() {
		driver = new ChromeDriver();
		driver.get("https://demoblaze.com/index.html#");
		driver.manage().window().maximize();
	}
	
	@When("user navigate on the login page")
	public void user_navigate_on_the_login_page() {
		driver.findElement(By.xpath("//a[@id='login2']")).click();
	}
	
	@When("user enter username {string} and password {string}")
	public void user_enter_username_and_password(String username, String password) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys(password);
	}
	
	@When("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	}
	
	@Then("user get successful message {string}")
	public void user_get_successful_message(String expectedresult) throws InterruptedException {
		Thread.sleep(4000);
		String actual_result = driver.findElement(By.xpath("//a[@id='nameofuser']")).getText();
		Assert.assertEquals(actual_result, expectedresult);
	}
	

	@When("user navigate on the signup page")
	public void user_navigate_on_the_signup_page() {
		driver.findElement(By.xpath("//a[@id='signin2']")).click();
	}
	@When("user enter username {string} and password {string} on signup")
	public void user_enter_username_and_password_on_signup(String username, String password) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys(password);
	}
	@When("user click on signup button")
	public void user_click_on_signup_button() {
		driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();
	}
	
	@When("user navigate on the contact page")
	public void user_navigate_on_the_contact_page() {
		driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
	}
	
	@When("user enter email {string} and name {string} and message {string}")
	public void user_enter_email_and_name_and_message(String email, String name, String message) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='recipient-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='recipient-name']")).sendKeys(name);
		driver.findElement(By.xpath("//textarea[@id='message-text']")).sendKeys(message);
	}
	
	@When("user clicked on send message")
	public void user_clicked_on_send_message() {
		driver.findElement(By.xpath("//button[contains(text(),'Send message')]")).click();
	}
	@Then("user get message on contact as {string}")
	public void user_get_message_on_contact_as(String expected_result) throws InterruptedException {
		Thread.sleep(2000);
		String actaul_result = driver.switchTo().alert().getText();
		Assert.assertEquals(actaul_result, expected_result);
	}
}
