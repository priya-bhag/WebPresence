package testcases1.Arizona;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.Arizona.CivilRights1;
import pages1.Arizona.SoilHealth1;
import utility.Helper;

public class Verify_SoilHealth1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/az/soils/health/");
		Helper.capturescreenshot(driver, "SoilHealthAZ_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		SoilHealth1 home = PageFactory.initElements(driver, SoilHealth1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		SoilHealth1.validateURL();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
