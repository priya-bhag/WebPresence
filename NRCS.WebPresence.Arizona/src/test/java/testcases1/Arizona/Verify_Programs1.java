package testcases1.Arizona;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.Programs;
import pages.TechnicalResources;
import pages1.Arizona.Programs1;
import utility.Helper;

public class Verify_Programs1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/az/programs/");
		Helper.capturescreenshot(driver, "ProgramsAZ_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		Programs1 home = PageFactory.initElements(driver, Programs1.class);

		System.out.println("\t");
		Programs1.ValidateProd();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
