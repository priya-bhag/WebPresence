package testcases1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.TechnicalResources;
import pages1.TechnicalResources1;
import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.Home_Page;

public class Verify_TechnicalResources1 {
	
WebDriver driver;
	
	@BeforeClass

	public void SetUp()
		
	{
		
		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/technical/");
		
	}
	
	@Test(priority=1)
	
	public void testHomePage(){

	
		TechnicalResources1 home =PageFactory.initElements(driver,TechnicalResources1.class);
	
	
	//System.out.println("Title of URL1 is "+home.getApplicationTitle1());
	
	System.out.println("\t");
		
	TechnicalResources1.validateURL1();
     	
	}
	
	
	
	
	 
	@AfterClass
	
	public void teardown(){
		
		driver.close();
	}
}