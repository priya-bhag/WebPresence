package testcases1.Arizona;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.ConservationPlanning;
import pages.TechnicalResources;
import pages1.Arizona.ConservationPlanning1;
import utility.Helper;

public class Verify_ConservationPlanning1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/az/technical/cp/#");

		Helper.capturescreenshot(driver, "ConservationPlanningAZ_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		ConservationPlanning1 home = PageFactory.initElements(driver, ConservationPlanning1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		ConservationPlanning1.validateURL();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}

}
