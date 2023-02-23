package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addCustomer {

	
	public addCustomer(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")
	private WebElement newCustomer;
	
	@FindBy(name="name")
	private WebElement cusName;
	
	@FindBy(name="rad1")
	private WebElement rdgender;
	
	@FindBy(name="dob")
	private WebElement DOB;
	
	@FindBy(name="addr")
	private WebElement address;

	@FindBy(name="city")
	private WebElement City;
	
	@FindBy(name="state")
	private WebElement State;
	
	@FindBy(name="pinno")
	private WebElement PIN;
	
	@FindBy(name="telephoneno")
	private WebElement Phone;
	
	@FindBy(name="emailid")
	private WebElement mailid;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	
	@FindBy(name="sub")
	private WebElement submitBtn;
	
	
	
	public void addNewCustomer()
	{
		newCustomer.click();
	}
	
	public void customerName(String name)
	{
		cusName.sendKeys(name);
	}
	
	public void gender()
	{
		rdgender.click();
	}
	
	public void enterDob(String yy, String mm, String dd) 
	{
		DOB.sendKeys(yy,mm,dd);
		
		//DOB.sendKeys(mm);
		
		//DOB.sendKeys(dd);
	} 
	
	public void enterAddress(String addr)
	{
		address.sendKeys(addr);
	}
	
	public void enterCity(String ccity)
	{
		City.sendKeys(ccity);
	}
	
	public void enterState(String cstate)
	{
		State.sendKeys(cstate);
	}
	
	public void enterPinNo(String cpin)
	{
		PIN.sendKeys(cpin);
	}
	
	public void enterPhone(String cphone)
	{
		Phone.sendKeys(String.valueOf(cphone));
	}
	
	public void entermailid(String cid)
	{
		mailid.sendKeys(cid);
	}
	
	public void enterpassword(String cpwd)
	{
		pwd.sendKeys(cpwd);
	}
	
	
	public void clickSubmitbtn()
	{
		submitBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
