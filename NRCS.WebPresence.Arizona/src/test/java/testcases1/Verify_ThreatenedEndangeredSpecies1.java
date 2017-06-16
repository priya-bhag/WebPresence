package testcases1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.Agronomy;
import pages.ThreatenedEndangeredSpecies;
import pages1.ThreatenedEndangeredSpecies1;

public class Verify_ThreatenedEndangeredSpecies1 {
	
WebDriver driver;
	


	@BeforeClass

	public void SetUp()
		
	{

		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/technical/ecoscience/threat/");
		
		
		
	}
@Test(priority=1)
	
	public void testHomePage(){

	
	ThreatenedEndangeredSpecies1 home =PageFactory.initElements(driver,ThreatenedEndangeredSpecies1.class);
	
	
	//System.out.println("Title of URL1 is "+home.getApplicationTitle1());
		
	System.out.println("\t");
	
	
	ThreatenedEndangeredSpecies1.validateURL();
		
	
	System.out.println("\t");
	
	}
	
	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
		
	}
}
