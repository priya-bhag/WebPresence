package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.WatershedProtectionandFloodPreventionProgram;
import pages.WatershedSurveysandPlanning;

public class Verify_WatershedSurveysandPlanning {
	
WebDriver driver;
	


	@BeforeClass

	public void SetUp()
		
	{

		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/programs/planning/wsp/");
		
		
		
	}
@Test(priority=1)
	
	public void testHomePage(){

	
	WatershedSurveysandPlanning home =PageFactory.initElements(driver,WatershedSurveysandPlanning.class);
	
	
	System.out.println("Title of URL1 is "+home.getApplicationTitle1());
		
	System.out.println("\t");
			
	WatershedSurveysandPlanning.validateURL();
		
	
	
	System.out.println("\t");
	
	}
	
	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
		
	}
}
