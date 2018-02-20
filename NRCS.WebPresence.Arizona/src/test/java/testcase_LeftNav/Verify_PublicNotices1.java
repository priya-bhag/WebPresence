package testcase_LeftNav;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.LeftNav.PublicNotices1;
import utility.Helper;

public class Verify_PublicNotices1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp() throws IOException

	{

		driver = BrowserFactory.getBrowser(DataProviderFactory.getExcel().getdata(1, 0, 0));

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()
				+ DataProviderFactory.getExcel().getdata(0, 56, 0));

		Helper.capturescreenshot(driver, "PublicNoticesin_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() throws IOException, InterruptedException {

		PublicNotices1 home = PageFactory.initElements(driver, PublicNotices1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		PublicNotices1.validateProd();

		System.out.println("\t");

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
