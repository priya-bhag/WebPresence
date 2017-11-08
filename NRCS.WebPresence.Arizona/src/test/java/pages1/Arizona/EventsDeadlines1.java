package pages1.Arizona;

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

	static Logger log = Logger.getLogger("EventsDeadlines1");

	public EventsDeadlines1(WebDriver Idriver) {
		this.driver = Idriver;
	}

	// Prod Elements

	static String title1;

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbProd;

	@FindBy(xpath = ".//*[@id='left_event_img']/img")
	static WebElement Image1Prod;

	@FindBy(xpath = ".//*[@id='eventList']/div")
	static WebElement AZProd;

	@FindBy(id = "eventsNav")
	static WebElement NRCSRSSFeedProd;

	// calendar months

	@FindBy(xpath = ".//*[@id='archivesSelected']")
	static WebElement ArchivesProd;

	// Test Elements

	static String title2;

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbTest;

	@FindBy(xpath = ".//*[@id='left_event_img']/img")
	static WebElement Image1Test;

	@FindBy(xpath = ".//*[@id='eventList']/div")
	static WebElement AZTest;

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

	public static List<String> LinksArrayProd = null;

	public static List<String> LinksArrayTest = null;

	public static List<Object> ImageArray1Prod = null;

	public static List<Object> ImageArray1Test = null;

	public static void validateURL() {

		Logger log = Logger.getLogger("EventsDeadlines1");

		String title1 = driver.getTitle();

		List<String> BreadCrumbArrayProd = new ArrayList<String>();

		List<WebElement> BreadCrumbProd_elements = BreadCrumbProd.findElements(By.tagName("p"));

		for (int i = 0; i < (BreadCrumbProd_elements).size() ; i++) {

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

		List<String> LinksArrayProd = new ArrayList<String>();

		List<WebElement> tableItems_Prod = AZProd.findElements(By.tagName("a"));

		tableItems_Prod.addAll(AZProd.findElements(By.tagName("img")));

		int count = 0;
		int c1 = 0;
		int c2 = 0;
		int counter_valid1 = 0;

		for (int j = 0; j < tableItems_Prod.size() ; j++) {

			WebElement element1 = tableItems_Prod.get(j);

			String link_Prod = element1.getAttribute("href");

			if (link_Prod == null || link_Prod.isEmpty()) {

				// log.info("URL is either not configured for anchor tag or it
				// is empty");

				c1 = c1 + 1;

				continue;
			}

			if (link_Prod.contains("@")) {
				// log.info("Link is an email");

				c2 = c2 + 1;

				continue;

			}

			count = count + 1;

			// verifyLinkActive(Prod);

			try {

				URL url = new URL(link_Prod);

				HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

				httpURLConnect.setConnectTimeout(3000);

				httpURLConnect.connect();

				if (httpURLConnect.getResponseCode() >= 400) {
					log.info(link_Prod + " - " + httpURLConnect.getResponseMessage());

				} else {

					log.info(link_Prod + "-" + httpURLConnect.getResponseMessage());

					if (httpURLConnect.getResponseMessage().contains("OK")) {

						counter_valid1 = counter_valid1 + 1;
					}
				}

			}

			catch (Exception e) {
				e.toString();
			}

		}
		log.info("No of emails are " + c2);

		log.info("Total number of of links in Prod are " + count);

		log.info("Total number of of Valid links in Prod are " + counter_valid1);

		ImageArray1Prod = image_check(Image1Prod);

		List<String> calendarProd = new ArrayList<String>();

		Select dropdown = new Select(ArchivesProd);
		List<WebElement> e2 = dropdown.getOptions();
		for (int i = 0; i < e2.size() ; i++) {

			String text = e2.get(i).getText();

			calendarProd.add(text);

		}

		log.info("Months in Prod are " + calendarProd);

		// Test Methods

		driver.get(DataProviderFactory.getConfig().getApplicationUrl3() + "az/newsroom/events");
		Helper.capturescreenshot(driver, "EventsDeadlinesAZ_Test");

		String title2 = driver.getTitle();

		log.info("Title of Prod is " + title1);

		log.info("\t");

		log.info("Title of Test is " + title2);
		log.info("\t");

		if (title1.equals(title2)) {

			log.info("Titles of both URLs are same");
		}

		log.info("\t");

		Boolean NRCS_RSS_Feed1 = NRCSRSSFeedTest.isDisplayed();

		if (NRCS_RSS_Feed1) {

			log.info("NRCS_RSS_Feed is displayed on the left side of Test ");
		} else {
			log.info("NRCS_RSS_Feed is not  displayed on the left side of Test ");

		}

		List<String> LinksArrayTest = new ArrayList<String>();

		List<WebElement> tableItems_Test = AZTest.findElements(By.tagName("a"));

		tableItems_Test.addAll(AZTest.findElements(By.tagName("img")));

		int count1 = 0;
		int c3 = 0;
		int c4 = 0;
		int counter_valid2 = 0;

		for (int j = 0; j < tableItems_Test.size() ; j++) {

			WebElement element1 = tableItems_Test.get(j);

			String link_Test = element1.getAttribute("href");
			// log.info("URL IS "+Test);

			if (link_Test == null || link_Test.isEmpty()) {
				// log.info("URL is either not configured for anchor tag or it
				// is empty");
				c3 = c3 + 1;
				continue;
			}

			if (link_Test.contains("@")) {
				// log.info("Link is an email");

				c4 = c4 + 1;
				continue;
			}

			LinksArrayTest.add(link_Test);
			count1 = count1 + 1;

			// verifyLinkActive(link_Test);
			try {

				URL url1 = new URL(link_Test);

				HttpURLConnection httpURLConnect = (HttpURLConnection) url1.openConnection();

				httpURLConnect.setConnectTimeout(3000);

				httpURLConnect.connect();

				if (httpURLConnect.getResponseCode() >= 400) {
					log.info(link_Test + " - " + httpURLConnect.getResponseMessage());

				} else {

					log.info(link_Test + "-" + httpURLConnect.getResponseMessage());

					if (httpURLConnect.getResponseMessage().contains("OK")) {

						counter_valid2 = counter_valid2 + 1;
					}
				}

			}

			catch (Exception e) {
				e.toString();
			}

		}

		log.info("No of links in Test are " + count1);

		// log.info("No of links with href null Test are "+c3);

		log.info("No of email  links in Test are " + c4);

		log.info("Total number of of Valid links in Test are " + counter_valid2);

		List<String> calendarTest = new ArrayList<String>();

		Select dropdown1 = new Select(ArchivesProd);
		List<WebElement> e = dropdown1.getOptions();
		for (int i = 0; i < e.size() ; i++) {

			String text = e.get(i).getText();

			calendarTest.add(text);

		}

		log.info("Months Test are " + calendarTest);

		ImageArray1Test = image_check(Image1Test);

		List<String> BreadCrumbArrayTest = new ArrayList<String>();

		List<WebElement> BreadCrumbTest_elements = BreadCrumbTest.findElements(By.tagName("p"));

		for (int i = 0; i < (BreadCrumbTest_elements).size() ; i++) {

			String text = BreadCrumbTest_elements.get(i).getText();

			String NewText = text.trim();

			BreadCrumbArrayTest.add(NewText);

		}

		log.info("The breadcrumb of Test is " + BreadCrumbArrayTest);

		log.info("\t");

		Boolean value = Arrays.equals(ImageArray1Prod.toArray(), ImageArray1Test.toArray());

		try {

			if (value == true) {

				log.info("Image1 on both urls are same");
			}

			if (value == false) {
				log.info("image1 of both urls are not same");

			}

		} catch (Exception e7) {

			log.info("The exception is " + e7.getMessage());

		}

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

	public static List<Object> image_check(WebElement image1Prod2) {

		WebElement ImageFile = image1Prod2;

		Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript(
				"return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
				ImageFile);

		if (!ImagePresent) {
			log.info("Image not displayed.");
		} else {
			log.info("Image displayed.");
		}

		List<Object> ImageArray = new ArrayList<Object>();

		Dimension dimensions = image1Prod2.getSize();

		// log.info("width is " + dimensions.width);

		int width = dimensions.width;
		int height = dimensions.height;

		// log.info("height is " + dimensions.height);

		Point point = image1Prod2.getLocation();

		int Xposition = point.x;
		int Yposition = point.y;

		ImageArray.add(width);
		ImageArray.add(height);
		ImageArray.add(Xposition);
		ImageArray.add(Yposition);

		log.info("width: height : Xposition : Yposition : Of Image is" + ImageArray);

		return ImageArray;

		// log.info("x position is " +point.x);
		// log.info("y position is " +point.y);

	}

}
