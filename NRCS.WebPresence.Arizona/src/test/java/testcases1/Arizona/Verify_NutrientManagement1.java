package testcases1.Arizona;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.Agronomy;
import pages.NutrientManagement;
import pages1.Arizona.NutrientManagement1;
import utility.Helper;

public class Verify_NutrientManagement1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/az/technical/ecoscience/nutrient/");

		Helper.capturescreenshot(driver, "NutrientManagementAZ_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		NutrientManagement1 home = PageFactory.initElements(driver, NutrientManagement1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		NutrientManagement1.validateURL();

		// Agronomy.getApplicationTitle2();

		System.out.println("\t");

	}

	@AfterClass

	public void teardown() {

		driver.close();

	}
}
