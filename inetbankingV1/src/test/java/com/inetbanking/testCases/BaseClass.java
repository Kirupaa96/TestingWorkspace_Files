package com.inetbanking.testCases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.readConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	readConfig obj = new readConfig();
	
	public String baseUrl  =  obj.getApplicationUrl();
	public String username =  obj.userName();
	public String password =  obj.password();
	
	public static Logger log;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		
		if(br.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		
		else if(br.equalsIgnoreCase("firefox"))
		{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		}
		
		else if(br.equalsIgnoreCase("safari"))
		{
		WebDriverManager.safaridriver().setup();
		driver=new SafariDriver();
		}
		
		log = LogManager.getLogger(BaseClass.class.getName());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(baseUrl);
		log.info("URL is opened");
		
		
		
	}
	
	@AfterTest
	public void teardown()
	{
	    //driver.quit();
	    log.info("Browser closed");
	}
	
     
	
	
	
} 
