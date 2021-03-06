package testcases1.Indiana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.EcologicalScience;
import pages.Economics;
import pages1.Indiana.EcologicalScience1;
import utility.Helper;

public class Verify_EcologicalScience1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/in/technical/ecoscience/");

		Helper.capturescreenshot(driver, "EcologicalScienceIN_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		EcologicalScience1 home = PageFactory.initElements(driver, EcologicalScience1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		EcologicalScience1.validateProd();

		System.out.println("\t");

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
