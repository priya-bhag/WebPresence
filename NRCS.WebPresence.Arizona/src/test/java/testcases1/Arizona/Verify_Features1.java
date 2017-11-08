package testcases1.Arizona;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.EventsDeadlines;
import pages.Features;
import pages1.Arizona.Features1;
import utility.Helper;

public class Verify_Features1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/az/newsroom/features/");

		Helper.capturescreenshot(driver, "FeaturesAZ_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		Features1 home = PageFactory.initElements(driver, Features1.class);

		System.out.println("\t");

		Features1.validateURL();

		// Agronomy.getApplicationTitle2();

		System.out.println("\t");

	}

	@AfterClass

	public void teardown() {

		driver.close();

	}
}
