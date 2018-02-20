package testcase_verfiy_Links;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import verify_Links.FeedbackForms1;
import utility.Helper;

public class Verify_FeedbackForms1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp() throws IOException

	{

		/*
		 * driver = BrowserFactory.getBrowser("firefox");
		 * 
		 * driver.get(DataProviderFactory.getConfig().getApplicationUrl1() +
		 * "contactus/in/contact/feedback/");
		 */

		driver = BrowserFactory.getBrowser(DataProviderFactory.getExcel().getdata(1, 0, 0));

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()
				+ DataProviderFactory.getExcel().getdata(0, 30, 0));

		driver.manage().window().maximize();

		Helper.capturescreenshot(driver, "FeedBackFormsIN_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() throws IOException {

		FeedbackForms1 home = PageFactory.initElements(driver, FeedbackForms1.class);

		System.out.println("\t");

		FeedbackForms1.validateProd();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}

}
