package pages1.Indiana;

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

import factory.DataProviderFactory;
import utility.Helper;

public class Soils1 {

	static Logger log = Logger.getLogger("Soils1");
	static WebDriver driver;

	public Soils1(WebDriver Idriver) {
		this.driver = Idriver;
	}

	// Prod Elements

	@FindBy(xpath = ".//*[@id='overview']/h2/a")
	static WebElement headingProd;

	/*
	 * @FindBy(xpath=".//div[@id='player']") static WebElement Video1Prod;
	 */

	@FindBy(xpath = ".//*[@id='selectedTree']/ul/li/a[2]")
	static List<WebElement> Table_MainelementsProd;

	@FindBy(xpath = ".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[1]/table/tbody/tr[4]/td/table/tbody/tr/td/div")
	static WebElement Table2Prod;

	@FindBy(xpath = ".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[1]/table/tbody/tr[4]/td/table/tbody/tr/td/div/ul/li/a")
	static WebElement Table2Link1Prod;

	@FindBy(xpath = ".//*[@id='promobox']/div")
	static WebElement Table3Prod;

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbProd;

	@FindBy(xpath = ".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[3]/table/tbody/tr/td/table/tbody/tr/td")
	static WebElement INProd;

	// Test Elements

	@FindBy(xpath = ".//*[@id='layoutContainers']/div/table/tbody/tr/td/table/tbody/tr/td/div/section/div[2]/div[2]/div[2]/h2/a")
	static WebElement headingTest;

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbTest;

	@FindBy(xpath = ".//*[@id='layoutContainers']/div/table/tbody/tr/td/table/tbody/tr/td/div/section/div[2]/div[2]/div[2]")
	static WebElement INTest;

	@FindBy(xpath = ".//*[@id='firstElement']/ul/li/a[2]")
	static List<WebElement> Table_MainelementsTest;

	@FindBy(xpath = ".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[1]/table/tbody/tr[4]/td/table/tbody/tr/td/div")
	static WebElement Table2Test;

	@FindBy(xpath = ".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[1]/table/tbody/tr[4]/td/table/tbody/tr/td/div/ul/li/a")
	static WebElement Table2Link1Test;

	@FindBy(xpath = ".//*[@id='promobox']/div")
	static WebElement Table3Test;

	// Comparison Arrays

	public static List<String> LinksArrayProd = null;

	public static List<String> LinksArrayTest = null;

	public static List<String> BreadCrumbArrayProd = null;

	public static List<String> BreadCrumbArrayTest = null;

	public static List<String> LeftMainArrayProd = null;

	public static List<String> LeftMainArrayTest = null;

	public static void validateURL() {

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

		log.info("Total number of of links in  Prod are " + count);

		log.info("Total number of of Valid links in  Prod are " + counter_valid1);

		/*
		 * Boolean video_present=Video1Prod.isDisplayed();
		 * 
		 * if(video_present){
		 * 
		 * log.
		 * info("Soil health lessons in a minute: soil stability test : Video is present on the soils page"
		 * ); }
		 */

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

		boolean table2_present = Table2Prod.isDisplayed();

		if (table2_present) {

			log.info("	Areas Of Focus MLRA Soil Region 11 is Prsent : Prod");
		} else {
			log.info("	Areas Of Focus MLRA Soil Region 11 is not Prsent : Prod");
		}

		log.info("Verifying links inside the table :Area of focus ");

		String url3 = Table2Link1Prod.getAttribute("href");

		if (Table2Link1Prod.getAttribute("href") != null) {

			verifyLinkActive(url3);

		}

		boolean table3_present = Table3Prod.isDisplayed();

		if (table3_present) {

			log.info("Unlock the Secrets in the Soil is present :Prod");
		} else {
			log.info("Unlock the Secrets in the Soil is not present :prod ");

		}

		// Test Methods

		driver.get(DataProviderFactory.getConfig().getApplicationUrl3() + "IN/soils/");

		Helper.capturescreenshot(driver, "SoilsIN_Test");

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

		log.info("\t");

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

				URL Prod = new URL(link_Test);

				HttpURLConnection httpURLConnect = (HttpURLConnection) Prod.openConnection();

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

		List<String> LeftMainArrayTest = new ArrayList<String>();

		List<WebElement> Left_MainMenuElementTest = Table_MainelementsTest;

		for (int i = 0; i <= Left_MainMenuElementTest.size() - 1; i++) {

			String text = Left_MainMenuElementTest.get(i).getText();

			LeftMainArrayTest.add(text);

		}

		log.info("main menu elements are;");

		log.info(LeftMainArrayTest);

		log.info("No of main menu elements in  " + LeftMainArrayTest.size());
		/*
		 * 
		 * Boolean video_present1=Video1Test.isDisplayed();
		 * 
		 * if(video_present1){
		 * 
		 * log.
		 * info("Soil health lessons in a minute: soil stability test : Video is present on the Test soils page"
		 * ); }
		 */

		boolean table2_presentT = Table2Test.isDisplayed();

		if (table2_presentT) {

			log.info("	Areas Of Focus MLRA Soil Region 11 is Prsent : Test");
		} else {
			log.info("	Areas Of Focus MLRA Soil Region 11 is not Prsent : Test");
		}

		log.info("Verifying links inside the table :Area of focus ");

		String url3T = Table2Link1Test.getAttribute("href");

		if (Table2Link1Test.getAttribute("href") != null) {

			verifyLinkActive(url3T);

		}

		boolean table3_presentT = Table3Test.isDisplayed();

		if (table3_presentT) {

			log.info("Unlock the Secrets in the Soil is present :Test");
		} else {
			log.info("Unlock the Secrets in the Soil is not present :Test ");

		}

		Boolean value = Arrays.equals(LeftMainArrayProd.toArray(), LeftMainArrayTest.toArray());

		try {
			if (value = true)

			{

				log.info("Left menu items on both Env: are same");
			} else {
				log.info("Left menu items on both Env: NOT  are same");

			}
		} catch (Exception e) {

			log.info(e.toString());
		}

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

		log.info("\t");
	}

	/*
	 * Boolean value3
	 * =Arrays.equals(LinksArrayProd.toArray(),LinksArrayTest.toArray());
	 * 
	 * try{
	 * 
	 * if (value3=true){
	 * 
	 * log.info("Links on both Env: are same"); }
	 * 
	 * }catch(Exception e){
	 * 
	 * log.info("The exception is "+e.getMessage()); }
	 */

	public static void verifyLinkActive(String linkUrl) {

		try {

			URL url = new URL(linkUrl);

			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

			httpURLConnect.setConnectTimeout(3000);

			httpURLConnect.connect();

			if (httpURLConnect.getResponseCode() == 200) {
				log.info(linkUrl + " - " + httpURLConnect.getResponseMessage());

				String text = linkUrl + " - " + httpURLConnect.getResponseMessage();
				if (text.contains("OK")) {

				}
			}
			if (!(httpURLConnect.getResponseCode() == 200)) {

				log.info(linkUrl + "-" + httpURLConnect.getResponseMessage());

				String text = linkUrl + " - " + httpURLConnect.getResponseMessage();

				if (text.contains("Found") || text.contains("Moved Permanently") || text.contains(" Forbidden")) {

				}
			}
			// log.info("No of links with response code other than OK are
			// "+count2);

			if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
				log.info(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - "
						+ HttpURLConnection.HTTP_NOT_FOUND);

				String text = linkUrl + " - " + httpURLConnect.getResponseMessage() + " - "
						+ HttpURLConnection.HTTP_NOT_FOUND;

				if (text.contains("HTTP_NOT_FOUND")) {
					// count3=count3+1;
				}

			}

			// log.info("No of links with response code OK are "+count1);
		} catch (Exception e) {

		}

	}

}
