package testcases1.Indiana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.Indiana.ThreatenedEndangeredSpecies1;
import utility.Helper;

public class Verify_ThreatenedEndangeredSpecies1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/in/technical/ecoscience/threat/");

		Helper.capturescreenshot(driver, "ThreatenedEndangeredSpeciesin_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		ThreatenedEndangeredSpecies1 home = PageFactory.initElements(driver, ThreatenedEndangeredSpecies1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		ThreatenedEndangeredSpecies1.validateProd();

		System.out.println("\t");

	}

	@AfterClass

	public void teardown() {

		driver.close();

	}
}
