package testcases1.Missouri;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.Missouri.NRCSEmployees1;
import utility.Helper;

public class Verify_NRCSEmployees1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/mo/people/employees/");
		Helper.capturescreenshot(driver, "NRCSEmployeesin_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		NRCSEmployees1 home = PageFactory.initElements(driver, NRCSEmployees1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		NRCSEmployees1.validateProd();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
