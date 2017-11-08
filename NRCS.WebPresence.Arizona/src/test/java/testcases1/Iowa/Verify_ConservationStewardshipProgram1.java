package testcases1.Iowa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.ConservationPlanning;
import pages.ConservationStewardshipProgram;
import pages.LandUse;
import pages1.Iowa.ConservationStewardshipProgram1;
import utility.Helper;

public class Verify_ConservationStewardshipProgram1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/ia/programs/financial/csp/");
		Helper.capturescreenshot(driver, "ConservationStewardshipProgramsIN_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		ConservationStewardshipProgram1 home = PageFactory.initElements(driver, ConservationStewardshipProgram1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		ConservationStewardshipProgram1.validateURL();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}

}
