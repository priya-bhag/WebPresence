package testcases1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.ConservationInnovationGrants;
import pages.NationalResourcesInventory;
import pages1.ConservationInnovationGrants1;

public class Verify_ConservationInnovationGrants1 {
	
WebDriver driver;
	
	@BeforeClass

	public void SetUp()
		
	{
		
		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/programs/financial/cig/");
		
	}
	
@Test(priority=1)
	
	public void testHomePage(){

	
	ConservationInnovationGrants1 home =PageFactory.initElements(driver,ConservationInnovationGrants1.class);
	

	
	//System.out.println("Title of URL1 is "+home.getApplicationTitle1());
	
	System.out.println("\t");
			
	ConservationInnovationGrants1.validateURL1();
	
	System.out.println("\t");
	
	
	}
	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
	}
}
