package testcases1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.Agronomy;
import pages.EventsDeadlines;
import pages1.EventsDeadlines1;

public class Verify_EventsDeadlines1 {
	
WebDriver driver;
	


	@BeforeClass

	public void SetUp()
		
	{

		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"events/az/newsroom/events/");
		
		
		
	}
@Test(priority=1)
	
	public void testHomePage(){

	
	EventsDeadlines1 home =PageFactory.initElements(driver,EventsDeadlines1.class);
	
	
	System.out.println("\t");
			
	EventsDeadlines1.validateURL();
		
	// Agronomy.getApplicationTitle2();
	
	System.out.println("\t");
	
	}
	
	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
		
	}
}
