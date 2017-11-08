package testcases1.Montana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.Montana.CivilRights1;
import pages1.Montana.DataAnalysis1;
import utility.Helper;

public class Verify_DataAnalysis1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/mt/snow/products/data/");

		Helper.capturescreenshot(driver, "DataAnalysisAZ_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		DataAnalysis1 home = PageFactory.initElements(driver, DataAnalysis1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		DataAnalysis1.validateProd();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
