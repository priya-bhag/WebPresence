package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.Agronomy;
import pages.Agronomy_DEV;
import pages.Agronomy_NScenario;
import pages.GIS;
import utility.Helper;

public class Verify_Agronomy_NScenario {
	
WebDriver driver;
	


	@BeforeClass

	public void SetUp()
		
	{

		driver=BrowserFactory.getBrowser("firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()+"main/az/technical/ecoscience/agronomy/");
		
		
		
	}
@Test(priority=1)
	
	public void testHomePage(){

	
	Agronomy_NScenario home =PageFactory.initElements(driver,Agronomy_NScenario.class);
	
	
	System.out.println("Title of URL1 is "+home.getApplicationTitle1());
		
	System.out.println("\t");
			
	home.validateURL();
		
	//Agronomy.getApplicationTitle2();
	
	System.out.println("\t");
	
	}
	

	
	@AfterClass
	
	public void teardown(){
		
		driver.close();
		
	}
}
