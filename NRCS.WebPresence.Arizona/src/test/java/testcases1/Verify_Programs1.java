package testcases1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.Programs;
import pages.TechnicalResources;
import pages1.Programs1;

public class Verify_Programs1 {
	
WebDriver driver;
	
	@BeforeClass

	public void SetUp()
		
	{
		
		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/programs/");
		
	}
	
	@Test(priority=1)
	
	public void testHomePage(){

	
		Programs1 home =PageFactory.initElements(driver,Programs1.class);
	
	System.out.println("\t");
	Programs1.ValidateURL1();
     	
	}
	

	 
	@AfterClass
	
	public void teardown(){
		
		driver.close();
	}
}
