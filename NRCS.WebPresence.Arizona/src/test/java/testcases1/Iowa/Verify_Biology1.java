package testcases1.Iowa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.DataMapsAnalysis;
import pages1.Iowa.Biology1;
import utility.Helper;

public class Verify_Biology1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/ia/technical/ecoscience/bio/");
		Helper.capturescreenshot(driver, "BiologyIN_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		Biology1 home = PageFactory.initElements(driver, Biology1.class);

		System.out.println("\t");

		Biology1.validateProd();

		System.out.println("\t");

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
