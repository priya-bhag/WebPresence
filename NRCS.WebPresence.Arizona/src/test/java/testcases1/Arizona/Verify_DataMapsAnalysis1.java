package testcases1.Arizona;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.ConservationTechnicalAssistance;
import pages.DataMapsAnalysis;
import pages.TechnicalServiceProviders;
import pages1.Arizona.DataMapsAnalysis1;
import utility.Helper;

public class Verify_DataMapsAnalysis1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/az/technical/dma/");

		Helper.capturescreenshot(driver, "DataMapAnalysisAZ_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		DataMapsAnalysis1 home = PageFactory.initElements(driver, DataMapsAnalysis1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		DataMapsAnalysis1.validateProd();

		System.out.println("\t");

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}

}
