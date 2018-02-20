package testcase_demo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import page_demo.SmallLimitedandBeginningFarmersRanchers1;
import utility.Helper;

public class Verify_SmallLimitedandBeginningFarmersRanchers1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp() throws IOException

	{

		driver = BrowserFactory.getBrowser(DataProviderFactory.getExcel().getdata(1, 0, 0));

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1()
				+ DataProviderFactory.getExcel().getdata(0, 62, 0));

		Helper.capturescreenshot(driver, "SmallLimitedandBeginningFarmersRancherin_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() throws IOException, InterruptedException {

		SmallLimitedandBeginningFarmersRanchers1 home = PageFactory.initElements(driver,
				SmallLimitedandBeginningFarmersRanchers1.class);

		System.out.println("\t");

		SmallLimitedandBeginningFarmersRanchers1.validateURL();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}
}
