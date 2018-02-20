package testcase_verfiy_Links;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import verify_Links.AgriculturalConservationEasementProgram1;
import utility.Helper;

public class Verify_AgriculturalConservationEasementProgram1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp() throws IOException

	{

		driver = BrowserFactory.getBrowser(DataProviderFactory.getExcel().getdata(1, 0, 0));

		driver.get(
				DataProviderFactory.getConfig().getApplicationUrl1() + DataProviderFactory.getExcel().getdata(0, 1, 0));

		Helper.capturescreenshot(driver, "AgriculturalConservationEasementProgramIN_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() throws InterruptedException, IOException {

		AgriculturalConservationEasementProgram1 home = PageFactory.initElements(driver,
				AgriculturalConservationEasementProgram1.class);

		System.out.println("\t");

		AgriculturalConservationEasementProgram1.validateURL();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
