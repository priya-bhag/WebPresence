package testcase_verfiy_Links;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import verify_Links.CIGProjectSearch1;
import utility.Helper;

public class Verify_CIGProjectSearch1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp() throws IOException

	{

		driver = BrowserFactory.getBrowser(DataProviderFactory.getExcel().getdata(1, 0, 0));

		driver.get(
				DataProviderFactory.getConfig().getApplicationUrl1() + DataProviderFactory.getExcel().getdata(0, 8, 0));

		Helper.capturescreenshot(driver, "CIGProjectSearchIN_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() throws InterruptedException, IOException {

		CIGProjectSearch1 home = PageFactory.initElements(driver, CIGProjectSearch1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		CIGProjectSearch1.validateProd();

		System.out.println("\t");

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
