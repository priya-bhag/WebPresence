package testcases1.Missouri;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.Agronomy;
import pages.Cropland;
import pages1.Missouri.Cropland1;
import utility.Helper;

public class Verify_Cropland1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/mo/technical/landuse/cropland/");

		Helper.capturescreenshot(driver, "CroplandIN_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		Cropland1 home = PageFactory.initElements(driver, Cropland1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		Cropland1.validateURL();

		// Agronomy.getApplicationTitle2();

		System.out.println("\t");

	}

	@AfterClass

	public void teardown() {

		driver.close();

	}
}
