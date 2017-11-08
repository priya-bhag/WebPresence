package testcases1.Arizona;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.Arizona.WaterResources1;
import utility.Helper;

public class Verify_WaterResources1 {
	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/az/water/resources/");
		Helper.capturescreenshot(driver, "WaterResources1AZ_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		WaterResources1 home = PageFactory.initElements(driver, WaterResources1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		WaterResources1.validateURL();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
