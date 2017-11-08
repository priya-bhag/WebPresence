package testcases1.Indiana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.CIGProjectSearch;
import pages.NationalResourcesInventory;
import pages1.Indiana.CIGProjectSearch1;
import utility.Helper;

public class Verify_CIGProjectSearch1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get("https://www.nrcs.usda.gov/wps/portal/nrcs/ciglanding/in/programs/financial/cig/cigsearch/");
		Helper.capturescreenshot(driver, "CIGProjectSearchIN_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() throws InterruptedException {

		CIGProjectSearch1 home = PageFactory.initElements(driver, CIGProjectSearch1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		CIGProjectSearch1.validateProd();

		System.out.println("\t");

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
