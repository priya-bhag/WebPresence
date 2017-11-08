package testcases1.Arizona;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.NewsReleases;
import pages.StateOffice;
import pages1.Arizona.StateOffice1;
import utility.Helper;

public class Verify_StateOffice1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/az/contact/state/");
		Helper.capturescreenshot(driver, "StateOfficesAZ_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		StateOffice1 home = PageFactory.initElements(driver, StateOffice1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		StateOffice1.validateURL1();

		System.out.println("\t");

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
