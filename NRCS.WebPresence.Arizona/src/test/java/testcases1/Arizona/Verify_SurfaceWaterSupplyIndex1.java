package testcases1.Arizona;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.Arizona.CivilRights1;
import pages1.Arizona.SurfaceWaterSupplyIndex1;
import utility.Helper;

public class Verify_SurfaceWaterSupplyIndex1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/az/snow/waterproducts/surface/");
		Helper.capturescreenshot(driver, "SurfaceWaterSupplyIndexAZ_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		SurfaceWaterSupplyIndex1 home = PageFactory.initElements(driver, SurfaceWaterSupplyIndex1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		SurfaceWaterSupplyIndex1.validateURL();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
