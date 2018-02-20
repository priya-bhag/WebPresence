package testcase_demo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import page_demo.OutreachAdvocacy1;
import utility.Helper;

public class Verify_OutreachAdvocacy1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp() throws IOException

	{

		driver = BrowserFactory.getBrowser(DataProviderFactory.getExcel().getdata(1, 0, 0));

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()
				+ DataProviderFactory.getExcel().getdata(0, 48, 0));

		Helper.capturescreenshot(driver, "OutreachAdvocacyin_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() throws IOException, InterruptedException {

		OutreachAdvocacy1 home = PageFactory.initElements(driver, OutreachAdvocacy1.class);

		System.out.println("\t");

		OutreachAdvocacy1.validateURL();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
