package testcases1.Arizona;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.Arizona.WaterSheds1;
import utility.Helper;

public class Verify_WaterSheds1 {
	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/az/water/watersheds/");
		Helper.capturescreenshot(driver, "WaterSupplyAZ_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		WaterSheds1 home = PageFactory.initElements(driver, WaterSheds1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		WaterSheds1.validateURL();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
