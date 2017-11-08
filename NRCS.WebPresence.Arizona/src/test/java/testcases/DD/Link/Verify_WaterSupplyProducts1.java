package testcases.DD.Link;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.DD.Link.WaterSupplyProducts1;
import utility.Helper;

public class Verify_WaterSupplyProducts1 {

	WebDriver driver;

	String screen1;

	@BeforeClass

	public void SetUp() throws IOException

	{

		driver = BrowserFactory.getBrowser(DataProviderFactory.getExcel().getdata(1, 0, 0));

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()
				+ DataProviderFactory.getExcel().getdata(0, 89, 0));

		Helper.capturescreenshot(driver, "WaterSupplyProducts_AZ");
	}

	@Test(priority = 1)

	public void testHomePage() throws IOException, InterruptedException {

		WaterSupplyProducts1 home = PageFactory.initElements(driver, WaterSupplyProducts1.class);

		// System.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		WaterSupplyProducts1.validateProd();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
