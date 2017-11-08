package testcases1.Montana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.Montana.PhotosandVideos1;
import utility.Helper;

public class Verify_PhotosandVideos1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/mt/newsroom/photos/");

		Helper.capturescreenshot(driver, "PhotosAndVideosin_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		PhotosandVideos1 home = PageFactory.initElements(driver, PhotosandVideos1.class);

		System.out.println("\t");

		PhotosandVideos1.validateProd();

		// Agronomy.getApplicationTitle2();

		System.out.println("\t");

	}

	@AfterClass

	public void teardown() {

		driver.close();

	}
}
