package testcases1.Indiana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.FeedbackForms;
import pages.SuccessStories;
import pages1.Indiana.FeedbackForms1;
import utility.Helper;

public class Verify_FeedbackForms1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "contactus/in/contact/feedback/");
		driver.manage().window().maximize();
		Helper.capturescreenshot(driver, "FeedBackFormsIN_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		FeedbackForms1 home = PageFactory.initElements(driver, FeedbackForms1.class);

		System.out.println("\t");

		FeedbackForms1.validateProd();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}

}
