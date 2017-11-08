package testcases1.Arizona;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.Agronomy;
import pages.Forestry;
import pages1.Arizona.Forestry1;
import utility.Helper;

public class Verify_Forestry1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/az/technical/landuse/forestry/");

		Helper.capturescreenshot(driver, "ForestryAZ_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		Forestry1 home = PageFactory.initElements(driver, Forestry1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		Forestry1.validateURL();

		// Agronomy.getApplicationTitle2();

		System.out.println("\t");

	}

	@AfterClass

	public void teardown() {

		driver.close();

	}
}
