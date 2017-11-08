package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.CIGProjectSearch;
import pages.NationalResourcesInventory;

public class Verify_CIGProjectSearch {
	
WebDriver driver;
	
	@BeforeClass

	public void SetUp()
		
	{
		
		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get("https://www.nrcs.usda.gov/wps/portal/nrcs/ciglanding/az/programs/financial/cig/cigsearch/");
		
	}
	
@Test(priority=1)
	
	public void testHomePage(){

	
	CIGProjectSearch  home =PageFactory.initElements(driver,CIGProjectSearch.class);
	

	
	System.out.println("Title of URL1 is "+home.getApplicationTitle1());
	
	System.out.println("\t");
	
		CIGProjectSearch.validateURL1();
	
	System.out.println("\t");
	
	
	}
	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
	}
}
