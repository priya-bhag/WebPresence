package testcases1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.ConservationPlanning;
import pages1.SmallLimitedandBeginningFarmersRanchers1;

public class Verify_SmallLimitedandBeginningFarmersRanchers1 {
	
WebDriver driver;
	
	@BeforeClass

	public void SetUp()
		
	{
		
		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/about/outreach/slbfr/");
		
	}
	
	@Test(priority=1)
	
	public void testHomePage(){

	
		SmallLimitedandBeginningFarmersRanchers1  home =PageFactory.initElements(driver,SmallLimitedandBeginningFarmersRanchers1.class);
		
	System.out.println("\t");
			
	SmallLimitedandBeginningFarmersRanchers1.validateURL();
	
		
	}

	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
	}
}
