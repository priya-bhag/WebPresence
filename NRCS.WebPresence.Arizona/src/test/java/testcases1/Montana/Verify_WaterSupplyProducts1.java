package testcases1.Montana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.Montana.CivilRights1;
import pages1.Montana.WaterSupplyProducts1;
import utility.Helper;

public class Verify_WaterSupplyProducts1 {

	WebDriver driver;

	String screen1;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/mt/snow/waterproducts/");

		Helper.capturescreenshot(driver, "WaterSupplyProducts_AZ");
	}

	@Test(priority = 1)

	public void testHomePage() {

		WaterSupplyProducts1 home = PageFactory.initElements(driver, WaterSupplyProducts1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		WaterSupplyProducts1.validateProd();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
