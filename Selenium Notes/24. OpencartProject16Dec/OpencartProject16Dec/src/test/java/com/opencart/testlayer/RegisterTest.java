package com.opencart.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pagelayer.Homepage;
import com.opencart.pagelayer.Registerpage;
import com.opencart.testbase.Testbase;
import com.opencart.utility.CommonComp;

public class RegisterTest extends Testbase {

	@Test
	public void validateRegisteringAccountByProvidingValidAccountdetails()
	{
		String expected_result = "Your Account Has Been Created!";
		Homepage homepage_obj = new Homepage(driver);
		Registerpage registerpage_obj = new Registerpage(driver);
		
		homepage_obj.clickOnMyAccounntLink();
		homepage_obj.clickOnRegisterLink();
		
		registerpage_obj.enterFirstName("david");
		registerpage_obj.enterLastName("test14");
		registerpage_obj.enterEmail("davidtest14@gmail.com");
		registerpage_obj.entertelephone("665558658985");
		registerpage_obj.enterPassword("Test@1234");
		registerpage_obj.enterConfirmPassword("Test@1234");
		registerpage_obj.clickOnPrivacyPolicyCheckbox();
		registerpage_obj.clickOnContinueButton();
		
		String actual_result = driver.getTitle();
		System.out.println(actual_result);
		
		Assert.assertEquals(actual_result, expected_result);
	}
	
	@Test
	public void validateRegisteringAccountByProvidingExistingAccountdetails()
	{
		String expected_result = "Warning: E-Mail Address is already registered!";
		Homepage homepage_obj = new Homepage(driver);
		Registerpage registerpage_obj = new Registerpage(driver);
		CommonComp common_obj = new CommonComp(driver);
		
		homepage_obj.clickOnMyAccounntLink();
		homepage_obj.clickOnRegisterLink();
		
		registerpage_obj.enterFirstName("david");
		registerpage_obj.enterLastName("test13");
		registerpage_obj.enterEmail("davidtest13@gmail.com");
		registerpage_obj.entertelephone("665558658985");
		registerpage_obj.enterPassword("Test@1234");
		registerpage_obj.enterConfirmPassword("Test@1234");
		registerpage_obj.clickOnPrivacyPolicyCheckbox();
		registerpage_obj.clickOnContinueButton();
		
		String actual_result = common_obj.getErrorMessage();
		System.out.println(actual_result);
		
		Assert.assertEquals(actual_result, expected_result);
	}
	
	
	
}
