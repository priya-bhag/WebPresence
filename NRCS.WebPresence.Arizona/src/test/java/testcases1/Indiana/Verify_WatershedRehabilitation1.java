package testcases1.Indiana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.Indiana.WatershedRehabilitation1;
import utility.Helper;

public class Verify_WatershedRehabilitation1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/in/programs/planning/wr/");
		Helper.capturescreenshot(driver, "WatershedRehabilitationin_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		WatershedRehabilitation1 home = PageFactory.initElements(driver, WatershedRehabilitation1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		WatershedRehabilitation1.validateURL();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
