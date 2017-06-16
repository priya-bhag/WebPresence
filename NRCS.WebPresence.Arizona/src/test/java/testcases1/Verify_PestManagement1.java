package testcases1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.Agronomy;
import pages.PestManagement;
import pages1.PestManagement1;

public class Verify_PestManagement1 {
	
WebDriver driver;
	


	@BeforeClass

	public void SetUp()
		
	{

		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/technical/ecoscience/pest/");
		
		
		
	}
@Test(priority=1)
	
	public void testHomePage(){

	
	PestManagement1  home =PageFactory.initElements(driver,PestManagement1.class);
	
	
	//System.out.println("Title of URL1 is "+home.getApplicationTitle1());
		
	System.out.println("\t");
			
	PestManagement1.validateURL();
		
	// Agronomy.getApplicationTitle2();
	
	System.out.println("\t");
	
	}
	
	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
		
	}
}
