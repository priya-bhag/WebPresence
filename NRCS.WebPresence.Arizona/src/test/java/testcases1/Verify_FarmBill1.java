package testcases1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.ConservationPlanning;
import pages.FarmBill;
import pages.LandUse;
import pages1.FarmBill1;

public class Verify_FarmBill1 {

WebDriver driver;
	
	@BeforeClass

	public void SetUp()
		
	{
		
		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/programs/farmbill/");
		
	}
	
	@Test(priority=1)
	
	public void testHomePage(){

	
		FarmBill1  home =PageFactory.initElements(driver,FarmBill1.class);
	
	System.out.println("\t");
			
	FarmBill1.validateURL();
	
		
	}

	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
	}
	
}
