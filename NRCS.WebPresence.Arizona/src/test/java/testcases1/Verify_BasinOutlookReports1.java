package testcases1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.BasinOutlookReports1;
import pages1.CivilRights1;

public class Verify_BasinOutlookReports1 {

WebDriver driver;
	
	@BeforeClass

	public void SetUp()
		
	{
		
		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/snow/waterproducts/basin/#");
		
	}
	
	@Test(priority=1)
	
	public void testHomePage(){

	
		BasinOutlookReports1  home =PageFactory.initElements(driver,BasinOutlookReports1.class);
	

	
	//System.out.println("Title of URL1 is "+home.getApplicationTitle1());
	
	System.out.println("\t");
			
	BasinOutlookReports1.validateURL1();
	
		
	}

	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
	}
	
}
