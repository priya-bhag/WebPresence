package testcases.DD;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.DD.PublicationsFactSheets1;
import utility.Helper;

public class Verify_PublicationsFactSheets1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp() throws IOException

	{

		driver = BrowserFactory.getBrowser(DataProviderFactory.getExcel().getdata(1, 0, 0));

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()
				+ DataProviderFactory.getExcel().getdata(0, 55, 0));

		Helper.capturescreenshot(driver, "PublicationsFactSheetsin_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() throws IOException, InterruptedException {

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