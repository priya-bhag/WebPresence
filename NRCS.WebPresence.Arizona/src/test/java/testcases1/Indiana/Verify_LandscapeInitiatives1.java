package testcases1.Indiana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.ConservationPlanning;
import pages.LandUse;
import pages.LandscapeInitiatives;
import pages1.Indiana.LandscapeInitiatives1;
import utility.Helper;

public class Verify_LandscapeInitiatives1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/in/programs/landscape/#");

		Helper.capturescreenshot(driver, "LandScapeInitiativesIN_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		LandscapeInitiatives1 home = PageFactory.initElements(driver, LandscapeInitiatives1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		LandscapeInitiatives1.validateURL();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
