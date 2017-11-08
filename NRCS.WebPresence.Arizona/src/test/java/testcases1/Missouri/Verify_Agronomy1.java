package testcases1.Missouri;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.Agronomy;
import pages.GIS;
import pages1.Missouri.Agronomy1;
import utility.Helper;

public class Verify_Agronomy1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/mo/technical/ecoscience/agronomy/");

		Helper.capturescreenshot(driver, "AgronomyIN_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		Agronomy1 home = PageFactory.initElements(driver, Agronomy1.class);

		System.out.println("\t");

		Agronomy1.validateURL();

		// Agronomy.getApplicationTitle2();

		System.out.println("\t");

	}

	@AfterClass

	public void teardown() {

		driver.close();

	}
}
