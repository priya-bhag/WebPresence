package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.ConservationTechnicalAssistance;
import pages.DataMapsAnalysis;
import pages.TechnicalServiceProviders;

public class Verify_DataMapsAnalysis {
	
	
	
WebDriver driver;
	
	@BeforeClass

	public void SetUp()
		
	{
		
		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/technical/dma/");
		
	}
	
@Test(priority=1)
	
	public void testHomePage(){

	DataMapsAnalysis home =PageFactory.initElements(driver,DataMapsAnalysis.class);
	

	
	System.out.println("Title of URL1 is "+home.getApplicationTitle1());
	
	System.out.println("\t");
			
	DataMapsAnalysis.validateURL1();
	
	System.out.println("\t");
	
	
	}


@AfterClass

public void teardown(){
	
	driver.close();
}

}


