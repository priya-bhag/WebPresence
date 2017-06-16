package testcases1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.CivilRights1;
import pages1.SiteMetadataInformation1;

public class Verify_SiteMetadataInformation1 {

WebDriver driver;
	
	@BeforeClass

	public void SetUp()
		
	{
		
		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/snow/products/info/");
		
	}
	
	@Test(priority=1)
	
	public void testHomePage(){

	
		SiteMetadataInformation1  home =PageFactory.initElements(driver,SiteMetadataInformation1.class);
	

	
	//System.out.println("Title of URL1 is "+home.getApplicationTitle1());
	
	System.out.println("\t");
			
	SiteMetadataInformation1.validateURL();
	
		
	}

	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
	}
}
