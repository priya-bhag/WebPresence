package testcases.DD;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.DD.FarmBill1;
import utility.Helper;

public class Verify_FarmBill1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp() throws IOException

	{

		driver = BrowserFactory.getBrowser(DataProviderFactory.getExcel().getdata(1, 0, 0));

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()
				+ DataProviderFactory.getExcel().getdata(0, 28, 0));

		Helper.capturescreenshot(driver, "FarmBillIN_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() throws IOException, InterruptedException {

		FarmBill1 home = PageFactory.initElements(driver, FarmBill1.class);

		System.out.println("\t");

		FarmBill1.validateURL();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}

}
