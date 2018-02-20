package page_demo;

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
	
	

	@FindBy(xpath = ".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[3]/table/tbody/tr/td/table/tbody/tr/td")
	static WebElement INProd;

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

		/*
		driver.get(
				DataProviderFactory.getConfig().getApplicationUrl3() + DataProviderFactory.getExcel().getdata(0, 0, 1));
*/
		List<WebElement> subLinks_Test = INProd.findElements(By.tagName("a"));

/*		subLinks_Test.addAll(INProd.findElements(By.tagName("img")));
*/

		for (int k = 0; k <= subLinks_Test.size() - 1; k++) {
			
			
			List<WebElement> subLink_Test = INProd.findElements(By.tagName("a"));

			//subLink_Test.addAll(INTest.findElements(By.tagName("img")));

			WebElement elementUrls = subLink_Test.get(k);
			
			//log.info("elements in links are "+elementUrls);
			

			String extLinksUrls =elementUrls.getAttribute("class").toString();
			
			
		if(extLinksUrls.contains("ext_url")){
			
			String hRef = elementUrls.getAttribute("href").toString();

			log.info(hRef);;

		}
			
				}
			}

		}
		