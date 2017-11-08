package testcases1.Indiana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.Economics;
import pages.GIS;
import pages1.Indiana.GIS1;
import utility.Helper;

public class Verify_GIS1 {
	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/in/technical/dma/gis/");
		Helper.capturescreenshot(driver, "GISIN_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		GIS1 home = PageFactory.initElements(driver, GIS1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		GIS1.validateProd();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}

}
