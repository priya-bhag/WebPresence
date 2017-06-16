package testcases1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.Agronomy;
import pages.WatershedProtectionandFloodPreventionProgram;
import pages1.WatershedProtectionandFloodPreventionProgram1;

public class Verify_WatershedProtectionandFloodPreventionProgram1 {
	
WebDriver driver;
	


	@BeforeClass

	public void SetUp()
		
	{

		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/programs/planning/wpfp/");
		
		
		
	}
@Test(priority=1)
	
	public void testHomePage(){

	
	WatershedProtectionandFloodPreventionProgram1 home =PageFactory.initElements(driver,WatershedProtectionandFloodPreventionProgram1.class);
	
	
	//System.out.println("Title of URL1 is "+home.getApplicationTitle1());
		
	System.out.println("\t");
			
	WatershedProtectionandFloodPreventionProgram1.validateURL();
		
	
	
	System.out.println("\t");
	
	}
	
	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
		
	}
}
