package com.inetbanking.testCases;

import java.io.IOException;


import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.loginPage;
import com.inetbanking.utilities.XLUtil;

public class Tc_DataDriven extends BaseClass{
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String user, String pwd)
	{
        loginPage lp = new loginPage(driver);
        lp.setUsername(user);
        log.info("username is entered");
        
	    lp.setPassword(pwd); 
	    log.info("password is entered");
	    
	    lp.clickSubmit();
	    
	  if(isAlertPresent()==true)
	  {
		  driver.switchTo().alert().accept();
		  driver.switchTo().defaultContent();
		  Assert.assertTrue(false);
		  log.info("Login failed");
	  }
	  else   
	  {
		  Assert.assertTrue(true);
		  log.info("Login passed");
		  
		  lp.clickLogout();
		  driver.switchTo().alert().accept();
		  driver.switchTo().defaultContent();
	  }
	 }
	
	public boolean isAlertPresent()
	{
		try
		{
		 driver.switchTo().alert();
		 return true;
		}
		
		catch (NoAlertPresentException e)
		{
			return false;
		}
	}
	
	
	@DataProvider(name="LoginData")
	String[][] getdata() throws IOException
	{
		String path = System.getProperty("user.dir")+ "/src/test/java/com/inetbanking/testData/logindata.xlsx";
		
		int rownum = XLUtil.getRowCount(path, "Sheet1");
		int colcount = XLUtil.getCellCount(path, "Sheet1", 1);
		
		
		String loginData[][] = new String[rownum][colcount];
		
		for (int i=1; i<=rownum; i++)
		{
			for (int j=0; j<colcount; j++)
			{
			  loginData[i-1][j]= XLUtil.getCellData(path, "Sheet1", i, j);
			}
		}
	  return loginData;
		
	}
}
 