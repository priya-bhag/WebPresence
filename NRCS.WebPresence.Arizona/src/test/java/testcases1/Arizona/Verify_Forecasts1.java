package testcases1.Arizona;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.Arizona.CivilRights1;
import pages1.Arizona.Forecasts1;
import utility.Helper;

public class Verify_Forecasts1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/az/snow/waterproducts/forecasts/");

		Helper.capturescreenshot(driver, "ForecastsAZ_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		Forecasts1 home = PageFactory.initElements(driver, Forecasts1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		Forecasts1.validateURL();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
