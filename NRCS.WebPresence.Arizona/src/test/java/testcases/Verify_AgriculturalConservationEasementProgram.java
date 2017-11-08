package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.AgriculturalConservationEasementProgram;
import pages.ConservationPlanning;
import pages.LandUse;

public class Verify_AgriculturalConservationEasementProgram {

WebDriver driver;
	
	@BeforeClass

	public void SetUp()
		
	{
		
		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/programs/easements/acep/");
		
	}
	
	@Test(priority=1)
	
	public void testHomePage(){

	
		AgriculturalConservationEasementProgram  home =PageFactory.initElements(driver,AgriculturalConservationEasementProgram.class);
	

	
	System.out.println("Title of URL1 is "+home.getApplicationTitle1());
	
	System.out.println("\t");
			
	AgriculturalConservationEasementProgram.validateURL();
	
		
	}

	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
	}
}
