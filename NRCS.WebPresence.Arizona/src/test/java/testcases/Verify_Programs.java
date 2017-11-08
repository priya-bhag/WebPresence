package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.Programs;
import pages.TechnicalResources;

public class Verify_Programs {
	
WebDriver driver;
	
	@BeforeClass

	public void SetUp()
		
	{
		
		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/programs/");
		
	}
	
	@Test(priority=1)
	
	public void testHomePage(){

	
		Programs home =PageFactory.initElements(driver,Programs.class);
	
	
	System.out.println("Title of URL1 is "+home.getApplicationTitle1());
	
	System.out.println("\t");
		
     	
	}
	
	
	
	
	
	@Test(priority=2)
	
	public void Validate(){
		
		
		Programs.testMenuItems();
		

	}
	 
	@AfterClass
	
	public void teardown(){
		
		driver.close();
	}
}
