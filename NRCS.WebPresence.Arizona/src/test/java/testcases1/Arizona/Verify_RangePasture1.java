package testcases1.Arizona;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.ConservationPlanning;
import pages.RangePasture;
import pages1.Arizona.RangePasture1;
import utility.Helper;

public class Verify_RangePasture1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/az/technical/landuse/pasture/");
		Helper.capturescreenshot(driver, "RangePasturesAZ_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		RangePasture1 home = PageFactory.initElements(driver, RangePasture1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		RangePasture1.validateURL();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}

}
