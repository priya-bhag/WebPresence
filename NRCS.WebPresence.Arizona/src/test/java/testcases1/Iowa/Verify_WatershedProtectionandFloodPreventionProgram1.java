package testcases1.Iowa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.Iowa.WatershedProtectionandFloodPreventionProgram1;
import utility.Helper;

public class Verify_WatershedProtectionandFloodPreventionProgram1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/ia/programs/planning/wpfp/");

		Helper.capturescreenshot(driver, "WatershedProtectionandFloodPreventionProgramin_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		WatershedProtectionandFloodPreventionProgram1 home = PageFactory.initElements(driver,
				WatershedProtectionandFloodPreventionProgram1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		WatershedProtectionandFloodPreventionProgram1.validateURL1();

		System.out.println("\t");

	}

	@AfterClass

	public void teardown() {

		driver.close();

	}
}
