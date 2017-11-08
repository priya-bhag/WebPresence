package testcases1.Missouri;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.Economics;
import pages.NationalResourcesInventory;
import pages1.Missouri.NationalResourcesInventory1;
import utility.Helper;

public class Verify_NationalResourcesInventory1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/mo/technical/dma/nri/");

		Helper.capturescreenshot(driver, "NationalResourceInventoryIN_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		NationalResourcesInventory1 home = PageFactory.initElements(driver, NationalResourcesInventory1.class);

		// stem.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		NationalResourcesInventory1.validateProd();

		System.out.println("\t");

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
