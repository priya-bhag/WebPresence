package testcases.DD;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.DD.Home_Page1;
import utility.Helper;

public class Verify_HomePage1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp() throws IOException

	{

		driver = BrowserFactory.getBrowser(DataProviderFactory.getExcel().getdata(1, 0, 0));

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()
				+ DataProviderFactory.getExcel().getdata(0, 36, 0));

		Helper.capturescreenshot(driver, "HomePageIN_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() throws IOException {

		Home_Page1 home = PageFactory.initElements(driver, Home_Page1.class);

		/*
		 * String titleURL1 =home.getApplicationTitle1();
		 * 
		 * System.out.println("Title of URL1 is "+titleURL1);
		 */

		System.out.println("\t");

		Home_Page1.MenuElementsProd();

		System.out.println("\t");
	}

	@AfterClass

	public void tearDown() {

		driver.close();

	}

}
