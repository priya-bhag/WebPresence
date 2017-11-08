package testcases1.Indiana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.Agronomy;
import pages.HealthyForestsReserveProgram;
import pages1.Indiana.HealthyForestsReserveProgram1;
import utility.Helper;

public class Verify_HealthyForestsReserveProgram1 {

	WebDriver driver;

	@BeforeClass

	public void SetUp()

	{

		driver = BrowserFactory.getBrowser("firefox");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl1() + "main/in/programs/easements/forests/");

		Helper.capturescreenshot(driver, "HealthyForestReserveProgramIN_Prod");

	}

	@Test(priority = 1)

	public void testHomePage() {

		HealthyForestsReserveProgram1 home = PageFactory.initElements(driver, HealthyForestsReserveProgram1.class);

		// ystem.out.println("Title of URL1 is "+home.getApplicationTitle1());

		System.out.println("\t");

		HealthyForestsReserveProgram1.validateURL();

		// Agronomy.getApplicationTitle2();

		System.out.println("\t");

	}

	@AfterClass

	public void teardown() {

		driver.close();

	}
}
