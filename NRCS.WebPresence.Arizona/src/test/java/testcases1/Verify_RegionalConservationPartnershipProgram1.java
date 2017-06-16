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
import pages.RegionalConservationPartnershipProgram;
import pages1.RegionalConservationPartnershipProgram1;

public class Verify_RegionalConservationPartnershipProgram1 {


WebDriver driver;
	
	@BeforeClass

	public void SetUp()
		
	{
		
		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/programs/farmbill/rcpp/");
		
	}
	
	@Test(priority=1)
	
	public void testHomePage(){

	RegionalConservationPartnershipProgram1  home =PageFactory.initElements(driver,RegionalConservationPartnershipProgram1.class);
	

		
	System.out.println("\t");
			
	RegionalConservationPartnershipProgram1.validateURL();
	
		
	}

	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
	}
	
}
