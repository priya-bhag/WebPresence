package testcases.DD.Link;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages1.DD.Link.EventsDeadlines1;
import utility.Helper;

public class Verify_EventsDeadlines1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp() throws IOException

	{

		driver = BrowserFactory.getBrowser(DataProviderFactory.getExcel().getdata(1, 0, 0));

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()
				+ DataProviderFactory.getExcel().getdata(0, 27, 0));

		Helper.capturescreenshot(driver, "EventsDeadLinesIN_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() throws IOException {

		EventsDeadlines1 home = PageFactory.initElements(driver, EventsDeadlines1.class);

		System.out.println("\t");

		EventsDeadlines1.validateURL();

		// Agronomy.getApplicationTitle2();

		System.out.println("\t");

	}

	@AfterClass

	public void teardown() {

		driver.close();

	}
}
