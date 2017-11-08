package pages1.DD.Link;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import factory.DataProviderFactory;
import utility.Helper;

public class EventsDeadlines1 {

	static WebDriver driver;

	public EventsDeadlines1(WebDriver Idriver) {
		this.driver = Idriver;
	}

	// Prod Elements

	static String title1;

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbProd;

	@FindBy(id = "eventsNav")
	static WebElement NRCSRSSFeedProd;

	// calendar months

	@FindBy(xpath = ".//*[@id='archivesSelected']")
	static WebElement ArchivesProd;

	// Test Elements

	static String title2;

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbTest;

	@FindBy(id = "eventsNav")
	static WebElement NRCSRSSFeedTest;

	// calendar months

	@FindBy(xpath = ".//*[@id='archivesSelected']")
	static WebElement ArchivesTest;

	// Arrays Comaparison

	public static List<String> BreadCrumbArrayProd = null;

	public static List<String> BreadCrumbArrayTest = null;

	public static List<String> CalendarProd = null;

	public static List<String> CalendarTest = null;

	public static List<Object> ImageArray1Prod = null;

	public static List<Object> ImageArray1Test = null;

	public static void validateURL() throws IOException {

		Logger log = Logger.getLogger("EventsDeadlines1");

		String title1 = driver.getTitle();

		List<String> BreadCrumbArrayProd = new ArrayList<String>();

		List<WebElement> BreadCrumbProd_elements = BreadCrumbProd.findElements(By.tagName("p"));

		for (int i = 0; i <= (BreadCrumbProd_elements).size() - 1; i++) {

			String text = BreadCrumbProd_elements.get(i).getText();

			String NewText = text.trim();

			BreadCrumbArrayProd.add(NewText);

		}

		log.info("The breadcrumb of Prod is " + BreadCrumbArrayProd);

		log.info("\t");

		Boolean NRCS_RSS_Feed = NRCSRSSFeedProd.isDisplayed();

		if (NRCS_RSS_Feed) {

			log.info("NRCS_RSS_Feed is displayed on the left side : Prod ");
		} else {

			log.info("NRCS_RSS_Feed is not  displayed on the left side : Prod ");

		}

		// ImageArray1Prod =image_check(Image1Prod);

		List<String> calendarProd = new ArrayList<String>();

		Select dropdown = new Select(ArchivesProd);
		List<WebElement> e2 = dropdown.getOptions();
		for (int i = 0; i <= e2.size() - 1; i++) {

			String text = e2.get(i).getText();

			calendarProd.add(text);

		}

		log.info("Months in Prod are " + calendarProd);

		// Test Methods

		driver.get(DataProviderFactory.getConfig().getApplicationUrl3()
				+ DataProviderFactory.getExcel().getdata(0, 27, 1));

		Helper.capturescreenshot(driver, "EventDeadlinesIN_Test");

		String title2 = driver.getTitle();

		log.info("Title of Prod is " + title1);

		log.info("\t");

		log.info("Title of Test is " + title2);
		log.info("\t");

		if (title1.equals(title2)) {

			log.info("Titles of both URLs are same");
		}

		else {
			log.info("Titles of both Env: are not same");

		}

		log.info("\t");

		Boolean NRCS_RSS_Feed1 = NRCSRSSFeedTest.isDisplayed();

		if (NRCS_RSS_Feed1) {

			log.info("NRCS_RSS_Feed is displayed on the left side of Test ");
		} else {
			log.info("NRCS_RSS_Feed is not  displayed on the left side of Test ");

		}

		List<String> calendarTest = new ArrayList<String>();

		Select dropdown1 = new Select(ArchivesProd);
		List<WebElement> e = dropdown1.getOptions();
		for (int i = 0; i <= e.size() - 1; i++) {

			String text = e.get(i).getText();

			calendarTest.add(text);

		}

		log.info("Months Test are " + calendarTest);

		// ImageArray1Test=image_check(Image1Test);

		List<String> BreadCrumbArrayTest = new ArrayList<String>();

		List<WebElement> BreadCrumbTest_elements = BreadCrumbTest.findElements(By.tagName("p"));

		for (int i = 0; i <= (BreadCrumbTest_elements).size() - 1; i++) {

			String text = BreadCrumbTest_elements.get(i).getText();

			String NewText = text.trim();

			BreadCrumbArrayTest.add(NewText);

		}

		log.info("The breadcrumb of Test is " + BreadCrumbArrayTest);

		log.info("\t");

		/*
		 * Boolean value
		 * =Arrays.equals(ImageArray1Prod.toArray(),ImageArray1Test.toArray());
		 * 
		 * 
		 * try{
		 * 
		 * if (value==true){
		 * 
		 * log.info("Image1 on both urls are same"); }
		 * 
		 * 
		 * if(value==false){ log.info("image1 of both urls are not same");
		 * 
		 * }
		 * 
		 * } catch(Exception e7){
		 * 
		 * log.info("The exception is "+e7.getMessage());
		 * 
		 * }
		 */

		Boolean value2 = Arrays.equals(BreadCrumbArrayTest.toArray(), BreadCrumbArrayProd.toArray());

		try {

			if (value2 == true) {

				log.info("Breadcrumb of both urls are same");
			}

			if (value2 == false) {
				log.info("Breadcrumb of both urls are not same");

			}

		} catch (Exception e1) {

			log.info("The exception is " + e1.getMessage());

		}

		Boolean value5 = Arrays.equals(calendarTest.toArray(), calendarProd.toArray());

		try {

			if (value5 == true) {

				log.info("months in both Env: are same");
			}

			if (value5 == false) {
				log.info("months in  both Env: are not same");

			}

		} catch (Exception e3) {

			log.info("The exception is " + e3.getMessage());

		}

		log.info("\t");

	}

}
