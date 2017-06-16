package testcases1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.CIGProjectSearch;
import pages.NationalResourcesInventory;
import pages1.CIGProjectSearch1;

public class Verify_CIGProjectSearch1 {
	
WebDriver driver;
	
	@BeforeClass

	public void SetUp()
		
	{
		
		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get("https://www.nrcs.usda.gov/wps/portal/nrcs/ciglanding/az/programs/financial/cig/cigsearch/");
		
	}
	
@Test(priority=1)
	
	public void testHomePage(){

	
	CIGProjectSearch1  home =PageFactory.initElements(driver,CIGProjectSearch1.class);
	

	
	//System.out.println("Title of URL1 is "+home.getApplicationTitle1());
	
	System.out.println("\t");
	
		CIGProjectSearch1.validateURL1();
	
	System.out.println("\t");
	
	
	}
	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
	}
}
