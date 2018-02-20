package testcase_verfiy_Links;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import utility.Helper;
import verify_Links.Footer;

public class Verify_Footer {

	WebDriver driver;

	@BeforeClass

	public void SetUp() throws IOException

	{

		driver = BrowserFactory.getBrowser(DataProviderFactory.getExcel().getdata(1, 0, 0));

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()
				+ DataProviderFactory.getExcel().getdata(0, 36, 0));

		Helper.capturescreenshot(driver, "Footer_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() throws IOException, InterruptedException {

		Footer home = PageFactory.initElements(driver, Footer.class);

		/*
		 * String titleURL1 =home.getApplicationTitle1();
		 * 
		 * System.out.println("Title of URL1 is "+titleURL1);
		 */

		System.out.println("\t");
		Footer.validateProd();

	}

	@AfterClass

	public void tearDown() {

		driver.close();

	}

}
