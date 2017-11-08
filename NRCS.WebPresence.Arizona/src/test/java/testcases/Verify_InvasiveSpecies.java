package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.InvasiveSpecies;
import pages.NationalResourcesInventory;

public class Verify_InvasiveSpecies {
	
WebDriver driver;
	
	@BeforeClass

	public void SetUp()
		
	{
		
		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/technical/ecoscience/invasive/");
		
	}
	
@Test(priority=1)
	
	public void testHomePage(){

	
	InvasiveSpecies  home =PageFactory.initElements(driver,InvasiveSpecies.class);
	

	
	System.out.println("Title of URL1 is "+home.getApplicationTitle1());
	
	System.out.println("\t");
			
	InvasiveSpecies.validateURL();
	
	System.out.println("\t");
	
	
	}
	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
	}
}