package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.Features;
import pages.PhotosandVideos;

public class Verify_PhotosandVideos {
	
WebDriver driver;
	


	@BeforeClass

	public void SetUp()
		
	{

		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/newsroom/photos/");
		
		
		
	}
@Test(priority=1)
	
	public void testHomePage(){

	
	PhotosandVideos home =PageFactory.initElements(driver,PhotosandVideos.class);
	
	
	System.out.println("\t");
			
	PhotosandVideos.validateURL();
		
	// Agronomy.getApplicationTitle2();
	
	System.out.println("\t");
	
	}
	
	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
		
	}
}
