package testcases1.Indiana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.Indiana.AirQuality1;
import utility.Helper;

public class Verify_AirQuality1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/in/air/quality/");
		Helper.capturescreenshot(driver, "AirQualityIN_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		AirQuality1 home = PageFactory.initElements(driver, AirQuality1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		AirQuality1.validateURL();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
