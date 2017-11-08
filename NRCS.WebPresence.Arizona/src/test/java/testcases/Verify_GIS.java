package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.Economics;
import pages.GIS;

public class Verify_GIS {
WebDriver driver;
	
	@BeforeClass

	public void SetUp()
		
	{
		
		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/technical/dma/gis/");
		
	}
@Test(priority=1)
	
	public void testHomePage(){

	
	GIS  home =PageFactory.initElements(driver,GIS.class);

	
	System.out.println("Title of URL1 is "+home.getApplicationTitle1());
	
	System.out.println("\t");
			
	GIS.validateURL1();
	

	}
	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
	}
	
}
