package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.Agronomy;
import pages.Forestry;

public class Verify_Forestry {
	
WebDriver driver;
	


	@BeforeClass

	public void SetUp()
		
	{

		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/technical/landuse/forestry/");
		
		
		
	}
@Test(priority=1)
	
	public void testHomePage(){

	
	Forestry home =PageFactory.initElements(driver,Forestry.class);
	
	
	System.out.println("Title of URL1 is "+home.getApplicationTitle1());
		
	System.out.println("\t");
			
	Forestry.validateURL();
		
	// Agronomy.getApplicationTitle2();
	
	System.out.println("\t");
	
	}
	
	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
		
	}
}
