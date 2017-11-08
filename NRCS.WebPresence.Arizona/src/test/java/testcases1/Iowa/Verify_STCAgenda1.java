package testcases1.Iowa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.Iowa.STCAgenda1;
import utility.Helper;

public class Verify_STCAgenda1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/ia/technical/stc/agenda/");
		Helper.capturescreenshot(driver, "STCAgendain_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		STCAgenda1 home = PageFactory.initElements(driver, STCAgenda1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		STCAgenda1.validateProd();

		System.out.println("\t");

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
