package com.opencart.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pagelayer.Homepage;
import com.opencart.pagelayer.Loginpage;
import com.opencart.testbase.Testbase;
import com.opencart.utility.CommonComp;

public class LoginTest extends Testbase {

	@Test
	public void verifyLoginTestWithValidDetails()
	{
		String exppected_result = "My Account";
		Homepage homepage_obj = new Homepage(driver);
		Loginpage loginpage_obj = new Loginpage(driver);
		logger.info("Object Creation");
		
		homepage_obj.clickOnMyAccounntLink();
		homepage_obj.clickOnLoginLink();
		logger.info("on login page");
		
		loginpage_obj.enterEmail("davidtest14@gmail.com");
		loginpage_obj.enterPassword("Test@1234");
		loginpage_obj.clickOnLoginButton();
		logger.info("login details entered");
		
		String actual_result = driver.getTitle();
		System.out.println(actual_result);
		Assert.assertEquals(actual_result, exppected_result);
	}
	
	@Test
	public void verifyLoginTestWithInValidDetails()
	{
		String exppected_result = "Warning: No match for E-Mail Address and/or Password.";
		Homepage homepage_obj = new Homepage(driver);
		Loginpage loginpage_obj = new Loginpage(driver);
		CommonComp common_obj = new CommonComp(driver);
		logger.info("Object creation");
		
		homepage_obj.clickOnMyAccounntLink();
		homepage_obj.clickOnLoginLink();
		logger.info("on login page");
		
		loginpage_obj.enterEmail("davidtest14@gmail.com");
		loginpage_obj.enterPassword("Test");
		loginpage_obj.clickOnLoginButton();
		logger.info("login details entered");
		
		String actual_result = common_obj.getErrorMessage();
		System.out.println(actual_result);
		
		Assert.assertEquals(actual_result, exppected_result);
	}
}
