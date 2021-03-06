package testcases1.Indiana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.Indiana.TechnicalServiceProviders1;
import utility.Helper;

public class Verify_TechnicalServiceProviders1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/in/technical/cp/tsp/");
		driver.manage().window().maximize();

		Helper.capturescreenshot(driver, "TechnicalServiceProvidersin_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		TechnicalServiceProviders1 home = PageFactory.initElements(driver, TechnicalServiceProviders1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		TechnicalServiceProviders1.validateURL();

		System.out.println("\t");

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}

}
