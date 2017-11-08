package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.FeedbackForms;
import pages.SuccessStories;

public class Verify_FeedbackForms {
	
WebDriver driver;
	
	@BeforeClass

	public void SetUp()
		
	{
		
		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/technical/cp/");
	 driver.manage().window().maximize();
		
	}
	
	@Test(priority=1)
	
	public void testHomePage(){

			FeedbackForms  home =PageFactory.initElements(driver,FeedbackForms.class);
	
	System.out.println("\t");
			
	FeedbackForms.validateURL1();
	
		
	}

	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
	}
	
}
