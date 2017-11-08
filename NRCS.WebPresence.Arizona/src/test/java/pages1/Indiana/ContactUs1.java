package pages1.Indiana;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.DataProviderFactory;
import junit.framework.Assert;
import utility.Helper;

public class ContactUs1 {

	static WebDriver driver;

	public ContactUs1(WebDriver Idriver) {
		this.driver = Idriver;
	}

	// Prod Elements

	@FindBy(xpath = ".//*[@id='overview']/h2/a")
	static WebElement headingProd;

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbProd;

	@FindBy(xpath = ".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[3]/table/tbody/tr/td/table/tbody/tr/td")
	static WebElement INProd;

	@FindBy(xpath = ".//*[@id='selectedTree']/ul/li/a[2]")
	static List<WebElement> Table_MainelementsProd;

	@FindBy(xpath = ".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[1]/table/tbody/tr[6]/td/table/tbody/tr/td/div")
	static WebElement Table2_HeaderProd;

	@FindBy(xpath = ".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[1]/table/tbody/tr[6]/td/table/tbody/tr/td/div/ul/li/a")
	static List<WebElement> Table2_ElementsProd;

	// Test Elements

	@FindBy(xpath = ".//*[@id='layoutContainers']/div/table/tbody/tr/td/table/tbody/tr/td/div/section/div[2]/div[2]/div[2]/h2/a")
	static WebElement headingTest;

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbTest;

	@FindBy(xpath = ".//*[@id='layoutContainers']/div/table/tbody/tr/td/table/tbody/tr/td/div/section/div[2]/div[2]/div[2]")
	static WebElement INTest;

	@FindBy(xpath = ".//*[@id='firstElement']/ul/li/a[2]")
	static List<WebElement> Table_MainelementsTest;

	@FindBy(xpath = ".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[1]/table/tbody/tr[6]/td/table/tbody/tr/td/div")
	static WebElement Table2_HeaderTest;

	@FindBy(xpath = ".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[1]/table/tbody/tr[6]/td/table/tbody/tr/td/div/ul/li/a")
	static List<WebElement> Table2_ElementsTest;

	// Comparison Arrays

	public static List<String> LinksArrayProd = null;

	public static List<String> LinksArrayTest = null;

	public static List<String> BreadCrumbArrayProd = null;

	public static List<String> BreadCrumbArrayTest = null;

	public static List<String> LeftMainArrayProd = null;

	public static List<String> LeftMainArrayTest = null;

	public static List<String> LeftTable2ArrayProd = null;

	public static List<String> LeftTable2ArrayTest = null;

	public static void validateProd() {

		Logger log = Logger.getLogger("ContactUs1");

		String title1 = driver.getTitle();

		String heading1 = headingProd.getText();

		List<String> BreadCrumbArrayProd = new ArrayList<String>();

		List<WebElement> BreadCrumbProd_elements = BreadCrumbProd.findElements(By.tagName("p"));

		for (int i = 0; i <= (BreadCrumbProd_elements).size() - 1; i++) {

			String text = BreadCrumbProd_elements.get(i).getText();

			String NewText = text.trim();

			BreadCrumbArrayProd.add(NewText);

		}

		log.info("The breadcrumb of Prod is " + BreadCrumbArrayProd);

		log.info("\t");

		List<String> LeftMainArrayProd = new ArrayList<String>();

		List<WebElement> Left_MainMenuElementProd = Table_MainelementsProd;

		for (int i = 0; i <= Left_MainMenuElementProd.size() - 1; i++) {

			String text = Left_MainMenuElementProd.get(i).getText();

			LeftMainArrayProd.add(text);

		}

		log.info("Main menu elements are ");

		log.info(LeftMainArrayProd);

		log.info("No of main menu elements " + LeftMainArrayProd.size());

		log.info("\t");

		Boolean Table2_Prod = Table2_HeaderProd.isDisplayed();

		if (Table2_Prod == true) {

			log.info("Related links with 12 links are displayed :Prod");
		}

		else {

			log.info("Related links with 12 links are not displayed :Prod");

		}

		List<String> LeftTable2ArrayProd = new ArrayList<String>();

		List<WebElement> table2Items_Prod = Table2_ElementsProd;

		for (int i = 0; i <= table2Items_Prod.size() - 1; i++) {

			String text = table2Items_Prod.get(i).getText();

			LeftTable2ArrayProd.add(text);

		}

		log.info("Links inside Related links in Prod are : ");

		log.info(LeftTable2ArrayProd);

		log.info("No of links inside Related links in Prod are  " + LeftTable2ArrayProd.size());

		log.info("\t");

		List<String> LinksArrayProd = new ArrayList<String>();

		List<WebElement> tableItems_Prod = INProd.findElements(By.tagName("a"));

		tableItems_Prod.addAll(INProd.findElements(By.tagName("img")));

		int count = 0;
		int c1 = 0;
		int c2 = 0;
		int counter_valid1 = 0;

		for (int j = 0; j <= tableItems_Prod.size() - 1; j++) {

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

		// log.info("Number of URL is either not configured for anchor tag or it
		// is empty are " +c1);

		// log.info("v is "+v);

		// log.info("first url arrays are "+LinksArrayProd);

		/*
		 * String contentProd =INProd.getText(); String NewcontentProd
		 * =contentProd.trim(); log.info("The contents in Prod are ");
		 * log.info(NewcontentProd); log.info("\t");
		 * 
		 */

		// Test Methods

		driver.get(DataProviderFactory.getConfig().getApplicationUrl3() + "IN/contact/");

		Helper.capturescreenshot(driver, "ContactUsIN_Test");

		String heading2 = headingTest.getText();

		String title2 = driver.getTitle();

		log.info("Title of Prod is " + title1);

		log.info("\t");

		log.info("Title of Test is " + title2);
		log.info("\t");

		log.info("Heading of Prod is " + heading1);
		log.info("\t");

		log.info("Heading of Test is " + heading2);
		log.info("\t");

		if (heading1.equals(heading2)) {

			log.info("Heading of both Env: are same");

		}

		log.info("\t");

		if (title1.equals(title2)) {

			log.info("Titles of both Env: are same");
		}

		else {
			log.info("Titles of both Env: are not same");

		}

		log.info("\t");

		List<String> LeftMainArrayTest = new ArrayList<String>();

		List<WebElement> Left_MainMenuElementTest = Table_MainelementsTest;

		for (int i = 0; i <= Left_MainMenuElementTest.size() - 1; i++) {

			String text = Left_MainMenuElementTest.get(i).getText();

			LeftMainArrayTest.add(text);

		}

		log.info("main menu elements are;");

		log.info(LeftMainArrayTest);

		log.info("No of main menu elements in  " + LeftMainArrayTest.size());

		Boolean Table2_Test = Table2_HeaderTest.isDisplayed();

		if (Table2_Test == true) {

			log.info("Related links with 12 links are displayed :Test");
		}

		else {

			log.info("Related links with 12 links are not displayed :Test");

		}

		List<String> LeftTable2ArrayTest = new ArrayList<String>();

		List<WebElement> table2Items_Test = Table2_ElementsTest;

		for (int i = 0; i <= table2Items_Test.size() - 1; i++) {

			String text = table2Items_Test.get(i).getText();

			LeftTable2ArrayTest.add(text);

		}

		log.info("Links inside Related links in Test are : ");

		log.info(LeftTable2ArrayTest);

		log.info("No of links inside Related links in Test are  " + LeftTable2ArrayTest.size());

		log.info("\t");

		Boolean value = Arrays.equals(LeftMainArrayProd.toArray(), LeftMainArrayTest.toArray());

		try {
			if (value == true)

			{

				log.info("Left menu items on both Env: are same");
			} else {

				log.info("Left menu  items on both Env: are Not same");

			}
		} catch (Exception e) {

			log.info(e.toString());
		}

		Boolean value1 = Arrays.equals(LeftTable2ArrayProd.toArray(), LeftTable2ArrayTest.toArray());

		try {
			if (value1 == true)

			{

				log.info("Links inside Related links  on both Env: are same");
			} else {

				log.info("Links inside Related links  on both Env: are not same");

			}
		} catch (Exception e) {

			log.info(e.toString());
		}

		List<String> BreadCrumbArrayTest = new ArrayList<String>();

		List<WebElement> BreadCrumbTest_elements = BreadCrumbTest.findElements(By.tagName("p"));

		for (int i = 0; i <= (BreadCrumbTest_elements).size() - 1; i++) {

			String text = BreadCrumbTest_elements.get(i).getText();

			String NewText = text.trim();

			BreadCrumbArrayTest.add(NewText);

		}

		log.info("The breadcrumb of Test is " + BreadCrumbArrayTest);

		log.info("\t");

		Boolean value2 = Arrays.equals(BreadCrumbArrayTest.toArray(), BreadCrumbArrayProd.toArray());

		try {

			if (value2 == true) {

				log.info("Breadcrumb on both Env: are same");
			}

			if (value2 == false) {
				log.info("Breadcrumb of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		log.info("\t");

		List<String> LinksArrayTest = new ArrayList<String>();

		List<WebElement> tableItems_Test = INTest.findElements(By.tagName("a"));

		tableItems_Test.addAll(INTest.findElements(By.tagName("img")));

		int count1 = 0;
		int c3 = 0;
		int c4 = 0;
		int counter_valid2 = 0;

		for (int j = 0; j <= tableItems_Test.size() - 1; j++) {

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

		// log.info(LinksArrayTest);

		log.info("\t");

		/*
		 * 
		 * String contentTest=INTest.getText();
		 * 
		 * String NewcontentTest =contentTest.trim();
		 * log.info("The contents in Test are "); log.info(NewcontentTest);
		 * log.info("\t");
		 */

		try {
			if (count == count1) {

				log.info("Both Env: has got same number of internal and external links");
			}

			else {

				log.info("No of links doesnt match in both Env:");
			}

		} catch (Exception e) {

			log.info(e.getMessage());
		}

		try {
			if (counter_valid1 == counter_valid2) {

				log.info("Both Env: has got same number of valid links");
			}

			else {

				log.info("No of valid links doesnt match in both env:");
			}

		} catch (Exception e) {

			log.info(e.getMessage());
		}

		try {
			if (c2 == c4) {

				log.info("Both Env: has got same number of email links");
			}

			else {

				log.info("No of email links does not match in both Env:");
			}

		} catch (Exception e) {

			log.info(e.getMessage());
		}

	}

}
