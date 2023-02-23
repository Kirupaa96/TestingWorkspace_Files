package com.inetbanking.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class listeners implements ITestListener {
	
	public ExtentSparkReporter reporter;
	public ExtentReports extent;
	public ExtentTest test;
	ThreadLocal<ExtentTest> extentTestThread = new ThreadLocal<ExtentTest>(); //making it thread safe
	
	
	@Override
	public void onStart(ITestContext context)
	{
		//String extentReportPath = System.getProperty("user.dir")+"\\ExtentReport\\MyReport.html";
	    String	extentReportPath ="target/Spark.html";
		reporter = new ExtentSparkReporter(extentReportPath);
		reporter.config().setDocumentTitle("Extent Reports");
		reporter.config().setReportName("iNetBanking");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Operating System","Macbook Air");
		extent.setSystemInfo("Tested By","Kirupaa shankar");
	}
	
	

	@Override()
	public void onTestStart(ITestResult tr)
	{
		test = extent.createTest(tr.getName());
		extentTestThread.set(test);
	}
	
	
	@Override()
	public void onTestSuccess(ITestResult tr)
	{
		extentTestThread.get().log(Status.PASS, "Test Passed");
	}
	
	
	@Override()
	public void onTestFailure(ITestResult tr)
	{
		
	}
	
	
	@Override()
	public void onFinish(ITestContext tc)
	{
		extent.flush();
	}
	
	
}
