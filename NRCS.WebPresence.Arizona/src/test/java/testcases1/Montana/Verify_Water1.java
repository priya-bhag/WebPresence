package testcases1.Montana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.Montana.Water1;
import utility.Helper;

public class Verify_Water1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/mt/water/");
		Helper.capturescreenshot(driver, "Waterin_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		Water1 home = PageFactory.initElements(driver, Water1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		Water1.validateURL();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
