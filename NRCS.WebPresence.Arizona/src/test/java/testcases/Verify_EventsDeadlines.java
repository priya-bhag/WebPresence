package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.Agronomy;
import pages.EventsDeadlines;

public class Verify_EventsDeadlines {
	
WebDriver driver;
	


	@BeforeClass

	public void SetUp()
		
	{

		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"events/az/newsroom/events/");
		
		
		
	}
@Test(priority=1)
	
	public void testHomePage(){

	
	EventsDeadlines home =PageFactory.initElements(driver,EventsDeadlines.class);
	
	
	System.out.println("\t");
			
	EventsDeadlines.validateURL();
		
	// Agronomy.getApplicationTitle2();
	
	System.out.println("\t");
	
	}
	
	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
		
	}
}
