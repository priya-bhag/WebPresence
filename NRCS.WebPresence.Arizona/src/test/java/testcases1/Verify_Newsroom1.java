package testcases1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.ConservationPlanning;
import pages.LandUse;
import pages.Newsroom;
import pages1.Newsroom1;

public class Verify_Newsroom1 {

WebDriver driver;
	
	@BeforeClass

	public void SetUp()
		
	{
		
		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/newsroom/#");
		
	}
	
	@Test(priority=1)
	
	public void testHomePage(){

	
		Newsroom1  home =PageFactory.initElements(driver,Newsroom1.class);
	
	System.out.println("\t");
			
	Newsroom1.validateURL();
	
		
	}

	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
	}
	
}
