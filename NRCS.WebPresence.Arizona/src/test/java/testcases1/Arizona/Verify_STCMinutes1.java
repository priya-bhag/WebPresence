package testcases1.Arizona;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.STCMinutes;
import pages.StateTechnicalCommittee;
import pages1.Arizona.STCMinutes1;
import utility.Helper;

public class Verify_STCMinutes1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/az/technical/stc/minutes/");
		Helper.capturescreenshot(driver, "STCMinutesAZ_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		STCMinutes1 home = PageFactory.initElements(driver, STCMinutes1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		STCMinutes1.validateProd();

		System.out.println("\t");

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
