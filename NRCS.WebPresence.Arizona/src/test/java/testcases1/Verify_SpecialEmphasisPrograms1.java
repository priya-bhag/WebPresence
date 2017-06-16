package testcases1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.SpecialEmphasisPrograms;
import pages.TribalAssistance;
import pages1.SpecialEmphasisPrograms1;

public class Verify_SpecialEmphasisPrograms1 {
	
WebDriver driver;
	
	@BeforeClass

	public void SetUp()
		
	{
		
		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/about/outreach/sep/");
		
	}
	
	@Test(priority=1)
	
	public void testHomePage(){

	
		SpecialEmphasisPrograms1  home =PageFactory.initElements(driver,SpecialEmphasisPrograms1.class);
	

	
	//System.out.println("Title of URL1 is "+home.getApplicationTitle1());
	
	System.out.println("\t");
			
	SpecialEmphasisPrograms.validateURL();
	
		
	}

	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
	}
}
