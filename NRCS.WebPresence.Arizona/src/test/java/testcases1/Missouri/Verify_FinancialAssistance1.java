package testcases1.Missouri;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.ConservationPlanning;
import pages.FinancialAssistance;
import pages.LandUse;
import pages1.Missouri.FinancialAssistance1;
import utility.Helper;

public class Verify_FinancialAssistance1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/mo/programs/financial/");
		Helper.capturescreenshot(driver, "FinancialAssistanceIN_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		FinancialAssistance1 home = PageFactory.initElements(driver, FinancialAssistance1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		FinancialAssistance1.validateURL();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}

}
