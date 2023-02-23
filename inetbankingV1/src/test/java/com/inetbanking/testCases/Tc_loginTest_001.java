package com.inetbanking.testCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import com.inetbanking.pageObjects.loginPage;


public class Tc_loginTest_001 extends BaseClass
{

	@Test
	public void loginTest()
	{
	
		loginPage lp = new loginPage(driver);
		
		lp.setUsername(username);
		log.info("username is entered");
		
		lp.setPassword(password);
		log.info("password is entered");
		
		lp.clickSubmit();
		log.info("submit button is clicked");
		
		String actual_title   = driver.getTitle();
		String expected_title = "Guru99 Bank Manager HomePage";
		
		if(actual_title.equals(expected_title))
		{
			Assert.assertTrue(true);
			log.info("Login Test passed");
		}
		else
		{
			Assert.assertFalse(false);
			log.info("Login Test failed");
		}
	}
	
	
	
	
	
	
	
	
}
