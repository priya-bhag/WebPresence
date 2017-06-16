package testcases1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.Agronomy;
import pages.LandscapePlanning;
import pages1.LandscapePlanning1;

public class Verify_LandscapePlanning1 {
	
WebDriver driver;
	


	@BeforeClass

	public void SetUp()
		
	{

		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/programs/planning/");
		
		
		
	}
@Test(priority=1)
	
	public void testHomePage(){

	
	LandscapePlanning1 home =PageFactory.initElements(driver,LandscapePlanning1.class);
	
	
	//System.out.println("Title of URL1 is "+home.getApplicationTitle1());
		
	System.out.println("\t");
			
	LandscapePlanning1.validateURL();
		
	// Agronomy.getApplicationTitle2();
	
	System.out.println("\t");
	
	}
	
	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
		
	}
}
