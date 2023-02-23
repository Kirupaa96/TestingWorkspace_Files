package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readConfig {

	 Properties prop;
	
	public readConfig()
	{
	  File src = new File("./Configuration/config.properties");
	try
	{
	  FileInputStream fis = new FileInputStream(src);
	  prop = new Properties();
	  prop.load(fis);
	}
	catch(Exception e)
	{
	  System.out.println("Exception is "+ e.getMessage()); 	
	}
	
	}
	
	
	public String getApplicationUrl()
	{
		String URL = prop.getProperty("baseUrl");
		return URL;
	}
	
	public String userName()
	{
		String uname = prop.getProperty("username");
		return uname;
	}
	
	public String password()
	{
		String pwd = prop.getProperty("password");
		return pwd;
	}
	
	public String browser()
	{
		String browser = prop.getProperty("browser");
		return browser;
	}
	
	
	
	
	
	
	
	
	
	
	
}
