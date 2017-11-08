package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.ConservationPlanning;
import pages.OutreachAdvocacy;

public class Verify_OutreachAdvocacy {
	
WebDriver driver;
	
	@BeforeClass

	public void SetUp()
		
	{
		
		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/about/outreach/slbfr/");
		
	}
	
	@Test(priority=1)
	
	public void testHomePage(){

	
		OutreachAdvocacy  home =PageFactory.initElements(driver,OutreachAdvocacy.class);
	
	System.out.println("\t");
			
	OutreachAdvocacy.validateURL();
	
		
	}

	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
	}
}
