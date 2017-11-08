package testcases1.Montana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.Montana.SoilSurveys1;
import utility.Helper;

public class Verify_SoilSurveys1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/mt/soils/surveys/");
		Helper.capturescreenshot(driver, "SoilSurveyin_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		SoilSurveys1 home = PageFactory.initElements(driver, SoilSurveys1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		SoilSurveys1.validate();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
