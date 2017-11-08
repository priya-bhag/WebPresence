package testcases1.Indiana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utility.Helper;
import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.Indiana.TechnicalResources1;

public class Verify_TechnicalResources1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/in/technical/");
		Helper.capturescreenshot(driver, "TechnicalResourcesin_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		TechnicalResources1 home = PageFactory.initElements(driver, TechnicalResources1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		TechnicalResources1.validateProd();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}