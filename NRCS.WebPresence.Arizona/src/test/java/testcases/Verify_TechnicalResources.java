package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.TechnicalResources;
import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.Home_Page;

public class Verify_TechnicalResources {
	
WebDriver driver;
	
	@BeforeClass

	public void SetUp()
		
	{
		
		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/technical/");
		
	}
	
	@Test(priority=1)
	
	public void testHomePage(){

	
		TechnicalResources home =PageFactory.initElements(driver,TechnicalResources.class);
	
	
	System.out.println("Title of URL1 is "+home.getApplicationTitle1());
	
	System.out.println("\t");
		
     	
	}
	
	
	
	
	
	@Test(priority=2)
	
	public void Validate(){
		
		
		TechnicalResources.testMenuItems();
		

	}
	 
	@AfterClass
	
	public void teardown(){
		
		driver.close();
	}
}