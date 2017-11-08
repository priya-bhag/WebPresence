package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.EcologicalScience;
import pages.Economics;

public class Verify_EcologicalScience {
	
WebDriver driver;
	
	@BeforeClass

	public void SetUp()
		
	{
		
		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/technical/ecoscience/");
		
	}
@Test(priority=1)
	
	public void testHomePage(){

	
	EcologicalScience  home =PageFactory.initElements(driver,EcologicalScience.class);
	

	
	System.out.println("Title of URL1 is "+home.getApplicationTitle1());
	
	System.out.println("\t");
			
	EcologicalScience.validateURL1();
	
	System.out.println("\t");
	
	
	
	}

	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
	}
}
