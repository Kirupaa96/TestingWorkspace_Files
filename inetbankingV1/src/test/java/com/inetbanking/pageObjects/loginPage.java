package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class loginPage {

	
	@FindBy(name="uid") 
	private WebElement userid;
		
	@FindBy(name="password")
	private WebElement password;
		
	@FindBy(name="btnLogin")
	private WebElement loginbtn;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	private WebElement logout;
	
	
	public loginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void setUsername(String uname)
	{
		userid.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
		
	public void clickSubmit()
	{
		loginbtn.click();
	}
	
	public void clickLogout()
	{
		logout.click();
	}

	

}
