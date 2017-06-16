package testcases1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.ConservationCompliance;
import pages.ConservationPlanning;
import pages.LandUse;
import pages1.ConservationCompliance1;

public class Verify_ConservationCompliance1 {

WebDriver driver;
	
	@BeforeClass

	public void SetUp()
		
	{
		
		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/programs/farmbill/cc/");
		
	}
	
	@Test(priority=1)
	
	public void testHomePage(){

	
		ConservationCompliance1  home =PageFactory.initElements(driver,ConservationCompliance1.class);
	
	
	System.out.println("\t");
			
	ConservationCompliance1.validateURL();
	
		
	}

	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
	}
	
}
