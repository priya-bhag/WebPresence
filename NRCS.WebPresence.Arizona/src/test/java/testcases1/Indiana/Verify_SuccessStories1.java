package testcases1.Indiana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.Indiana.SuccessStories1;
import utility.Helper;

public class Verify_SuccessStories1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/in/newsroom/stories/");
		Helper.capturescreenshot(driver, "SuccessStoriesin_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		SuccessStories1 home = PageFactory.initElements(driver, SuccessStories1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		SuccessStories1.validateURL();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}

}
