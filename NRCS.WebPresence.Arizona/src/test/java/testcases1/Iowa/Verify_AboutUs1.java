package testcases1.Iowa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.Iowa.AboutUs1;
import utility.Helper;

public class Verify_AboutUs1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/ia/about/");

		Helper.capturescreenshot(driver, "AboutUsIN_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		AboutUs1 home = PageFactory.initElements(driver, AboutUs1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		AboutUs1.validateProd();

		System.out.println("\t");

	}

	@AfterClass

	public void teardown() {

		// driver.close();
	}
}
