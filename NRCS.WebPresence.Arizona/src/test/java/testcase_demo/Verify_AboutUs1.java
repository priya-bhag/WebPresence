package testcase_demo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import page_demo.AboutUs1;
import utility.Helper;

public class Verify_AboutUs1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp() throws IOException

	{

		driver = BrowserFactory.getBrowser(DataProviderFactory.getExcel().getdata(1, 0, 0));

		driver.get(
				DataProviderFactory.getConfig().getApplicationUrl1() + DataProviderFactory.getExcel().getdata(0, 0, 0));

		Helper.capturescreenshot(driver, "AboutUsIN_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() throws IOException, InterruptedException {

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
