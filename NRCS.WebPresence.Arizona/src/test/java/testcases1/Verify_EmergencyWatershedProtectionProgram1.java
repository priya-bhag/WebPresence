package testcases1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.ConservationPlanning;
import pages.EmergencyWatershedProtectionProgram;
import pages.LandUse;
import pages1.EmergencyWatershedProtectionProgram1;

public class Verify_EmergencyWatershedProtectionProgram1{

WebDriver driver;
	
	@BeforeClass

	public void SetUp()
		
	{
		
		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/programs/financial/ewp/");
		
	}
	
	@Test(priority=1)
	
	public void testHomePage(){

	
		EmergencyWatershedProtectionProgram1  home =PageFactory.initElements(driver,EmergencyWatershedProtectionProgram1.class);
	

	
	//System.out.println("Title of URL1 is "+home.getApplicationTitle1());
	
	System.out.println("\t");
			
	EmergencyWatershedProtectionProgram1.validateURL();
	
		
	}

	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
	}
	
}
