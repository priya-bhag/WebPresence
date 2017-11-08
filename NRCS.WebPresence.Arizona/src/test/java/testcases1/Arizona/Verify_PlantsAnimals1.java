package testcases1.Arizona;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.Arizona.CivilRights1;
import pages1.Arizona.PlantsAnimals1;
import utility.Helper;

public class Verify_PlantsAnimals1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/az/plantsanimals/");
		Helper.capturescreenshot(driver, "PlantsAnimalsAZ_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		PlantsAnimals1 home = PageFactory.initElements(driver, PlantsAnimals1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		PlantsAnimals1.validateURL();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
