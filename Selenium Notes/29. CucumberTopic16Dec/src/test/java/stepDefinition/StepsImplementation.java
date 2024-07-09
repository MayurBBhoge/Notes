package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsImplementation {

	WebDriver driver;
	
	@Given("user launch the browser")
	public void userlaunchthebrowser()
	{
		driver = new ChromeDriver();
		driver.get("https://demoblaze.com/index.html#");
		driver.manage().window().maximize();
	}
	
	@When("user navigate on the login page")
	public void usernavigateontheloginpage()
	{
		driver.findElement(By.xpath("//a[@id='login2']")).click();
	}
	
	@When("user enter username and password")
	public void userenterusernameandpassword() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("testacc3");
		driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("Test");
	}
	
	@When("user click on login button")
	public void userclickonloginbutton ()
	{
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	}
	
	@Then("user get successful message")
	public void usergetsuccessfulmessage()
	{
		System.out.println("Logged in By xyz user");
	}
	
	@Then("user will not logged in")
	public void user_will_not_logged_in() {
	   System.out.println("not logged in");
	}
	
	@When("user navigate on the signup page")
	public void user_navigate_on_the_signup_page() {
		driver.findElement(By.xpath("//a[@id='signin2']")).click();
	}
	@When("user enter username and password on signup")
	public void user_enter_username_and_password_on_signup() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys("testacc3");
		driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys("Test");
	}
	@When("user click on signup button")
	public void user_click_on_signup_button() {
		driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();
	}
	
}
