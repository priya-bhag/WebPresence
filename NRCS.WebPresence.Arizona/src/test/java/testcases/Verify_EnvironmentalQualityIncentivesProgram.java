package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.ConservationStewardshipProgram;
import pages.EnvironmentalQualityIncentivesProgram;

public class Verify_EnvironmentalQualityIncentivesProgram {

WebDriver driver;
	
	@BeforeClass

	public void SetUp()
		
	{
		
		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/programs/financial/eqip/");
		
	}
	
	@Test(priority=1)
	
	public void testHomePage(){

	
		EnvironmentalQualityIncentivesProgram   home =PageFactory.initElements(driver,EnvironmentalQualityIncentivesProgram .class);
	

	
	System.out.println("Title of URL1 is "+home.getApplicationTitle1());
	
	System.out.println("\t");
			
	EnvironmentalQualityIncentivesProgram .validateURL();
	
		
	}

	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
	}
	
}
