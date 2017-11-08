package testcases1.Arizona;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.Arizona.Features1;
import pages1.Arizona.PublicationsFactSheets1;
import utility.Helper;

public class Verify_PublicationsFactSheets1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/az/newsroom/factsheets/");

		Helper.capturescreenshot(driver, "PublicationsFactSheetsAZ_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		PublicationsFactSheets1 home = PageFactory.initElements(driver, PublicationsFactSheets1.class);

		System.out.println("\t");

		PublicationsFactSheets1.validateProd();

		// Agronomy.getApplicationTitle2();

		System.out.println("\t");

	}

	@AfterClass

	public void teardown() {

		driver.close();

	}
}