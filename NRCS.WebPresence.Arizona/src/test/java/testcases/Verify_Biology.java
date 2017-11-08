package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.Biology;
import pages.DataMapsAnalysis;

public class Verify_Biology {
	
	
WebDriver driver;
	
	@BeforeClass

	public void SetUp()
		
	{
		
		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/technical/ecoscience/bio/");
		
	}
	
@Test(priority=1)
	
	public void testHomePage(){

	Biology home =PageFactory.initElements(driver,Biology.class);
	
	System.out.println("\t");
			
	Biology.validateURL();
	
	System.out.println("\t");
	
}


@AfterClass

public void teardown(){
	
	driver.close();
}
}
