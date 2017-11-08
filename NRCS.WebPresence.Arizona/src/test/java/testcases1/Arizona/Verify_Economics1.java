package testcases1.Arizona;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.ConservationTechnicalAssistance;
import pages.Economics;
import pages1.Arizona.Economics1;
import utility.Helper;

public class Verify_Economics1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/az/technical/dma/econ/");
		Helper.capturescreenshot(driver, "EconomicsAZ_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		Economics1 home = PageFactory.initElements(driver, Economics1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		Economics1.validateProd();

		System.out.println("\t");

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}

}
