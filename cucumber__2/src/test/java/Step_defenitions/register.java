package Step_defenitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class register {
WebDriver driver;
	
@Before("@Register")
public void openapp()
{
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}
	
@Given("^I navigate to the register page$")
public void registerpage() 
{
   driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");	
}	
	
@When("^I enter below details$")
public void details(DataTable data) // syntax
{
	    
	    // As a Single Map 
	    Map<String, String> datamap = data.asMap(String.class, String.class); //converting datatable into maps(Hashmap)
	    System.out.println(datamap);
	    
	    driver.findElement(By.id("input-firstname")).sendKeys(datamap.get("FirstName"));
	    driver.findElement(By.id("input-lastname")).sendKeys(datamap.get("LastName"));
	    driver.findElement(By.id("input-email")).sendKeys(datamap.get("Email"));
		driver.findElement(By.id("input-telephone")).sendKeys(datamap.get("Telephone"));
		driver.findElement(By.id("input-password")).sendKeys(datamap.get("Password"));
		driver.findElement(By.id("input-confirm")).sendKeys(datamap.get("Password"));
		
	
	   // As Array list 
	
	   List<List<String>> datalist = data.asLists(String.class);
	
	   System.out.println(datalist);
	   System.out.println(datalist.get(0).get(1)); 
	   
	   driver.findElement(By.id("input-firstname")).sendKeys(datalist.get(0).get(1));
	   driver.findElement(By.id("input-lastname")).sendKeys(datalist.get(1).get(1));
	   driver.findElement(By.id("input-email")).sendKeys(datalist.get(2).get(1));
	   driver.findElement(By.id("input-telephone")).sendKeys(datalist.get(3).get(1));
	   driver.findElement(By.id("input-password")).sendKeys(datalist.get(4).get(1));
	   driver.findElement(By.id("input-confirm")).sendKeys(datalist.get(5).get(1));
	 
	 
	   // As List of Maps, Use Only if you have multiple data for a single column.(ex:If u have many firstname or lastname)
	   /*
	   List<Map<String,String>> userList = data.asMaps(String.class,String.class);
	   
	   System.out.println(userList);
	   */
		
}
	
@And("^I select privacy policy option$")
public void selects_the_privacy_policy_option() 
{
  driver.findElement(By.name("agree")).click();
}

@And("^I click on continue button$")
public void clicks_on_Continue_button()
{
 driver.findElement(By.cssSelector("input[type='submit'][value='Continue']")).click();
}	

@Then("^User should be able to successfully register$")
public void success()
{
   try
   {
	WebElement a= driver.findElement(By.linkText("Success"));
   boolean answer= a.isDisplayed();
   Assert.assertTrue(answer);
   }
   catch(Exception e)
   {
	   System.out.println("Account creation failed");
   }
}




	
	
	
	
	
	
	
}
