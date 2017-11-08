package testcases1.Montana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.Montana.AgriculturalConservationEasementProgram1;
import utility.Helper;

public class Verify_AgriculturalConservationEasementProgram1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/mt/programs/easements/acep/");
		Helper.capturescreenshot(driver, "AgriculturalConservationEasementProgramIN_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		AgriculturalConservationEasementProgram1 home = PageFactory.initElements(driver,
				AgriculturalConservationEasementProgram1.class);

		System.out.println("\t");

		AgriculturalConservationEasementProgram1.validateURL();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
