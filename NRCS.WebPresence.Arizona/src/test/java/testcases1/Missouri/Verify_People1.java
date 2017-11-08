package testcases1.Missouri;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.Missouri.People1;
import utility.Helper;

public class Verify_People1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/mo/people/");
		Helper.capturescreenshot(driver, "Peoplein_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		People1 home = PageFactory.initElements(driver, People1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		People1.validateURL();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
