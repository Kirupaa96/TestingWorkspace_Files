package com.inetbanking.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.addCustomer;
import com.inetbanking.pageObjects.loginPage;

public class Tc_addCustomer extends BaseClass {
	
	
	@Test
	public void addNewCustomer() throws InterruptedException
	{
	    loginPage lp = new loginPage(driver);
	    addCustomer ac = new addCustomer(driver);
	    
	    lp.setUsername(username);
	    lp.setPassword(password);
	    lp.clickSubmit();
	    
	    
	    ac.addNewCustomer();
	    ac.customerName("zoya");
	    ac.gender();
	    ac.enterDob("2012","10","15"); 
	    Thread.sleep(3000);
	    ac.enterAddress("123ABC");
	    ac.enterCity("chennai");
	    ac.enterState("TN");
	    ac.enterPinNo("657898");
	    ac.enterPhone("9846238570");
	    
	    ac.entermailid(randomString()+"@gmail.com"); // This will create random mail id everytime 
	    ac.enterpassword(randomString());  // this will gene random pwd 
	    
	    ac.clickSubmitbtn();
	    
	    
	    boolean result= driver.getPageSource().contains("Customer Registered Successfully!!!");
	    
	    if (result==true)
	    {
	    	Assert.assertTrue(true);
	    	log.info("Test passed");
	    }
	    
	    else if (result==false)
	    {
	    	Assert.assertTrue(false);
	    	log.info("Test failed");
	    }
	    
	  }
	
	
	     // To create Random Alphabets 
	
	public String randomString()
	{
	  String genString= RandomStringUtils.randomAlphabetic(5); // this will generate 5 random alphabets
	  return genString;
	}
	
	
	
	
	

}
