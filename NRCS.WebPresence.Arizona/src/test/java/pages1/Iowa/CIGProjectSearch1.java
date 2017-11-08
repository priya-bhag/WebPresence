package pages1.Iowa;

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
import org.openqa.selenium.support.ui.Select;

import factory.DataProviderFactory;
import utility.Helper;

public class CIGProjectSearch1 {

	static Logger log = Logger.getLogger("CIGProjectSearch1");

	static WebDriver driver;

	public CIGProjectSearch1(WebDriver Idriver) {
		this.driver = Idriver;
	}
	// Prod Elements

	@FindBy(xpath = ".//*[@id='cigSearch']/h2")
	static WebElement headingProd;

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbProd;

	@FindBy(xpath = ".//*[@id='cigSearch']")
	static WebElement INProd;;

	@FindBy(xpath = ".//*[@id='generalText']")
	static WebElement

	GeneralTextSearchProd;

	@FindBy(xpath = ".//*[@id='cigSearch']/table/tbody/tr[2]/td[2]/input")
	static WebElement

	SearchButton1Prod;

	@FindBy(xpath = ".//*[@id='keywords']")
	static WebElement KeywordsProd;

	@FindBy(xpath = ".//*[@id='cigSearch']/table/tbody/tr[4]/td[2]/div")
	static List<WebElement> SearchByGrantTypeProd;

	@FindBy(xpath = ".//*[@id='cigSearch']/table/tbody/tr[10]/td[2]/ul/li/input")
	static WebElement ResourceConcernsProd;

	@FindBy(xpath = ".//*[@id='projEcoReg']")
	static WebElement ProjectEcoregionProd;

	@FindBy(xpath = ".//*[@id='awardYear']")
	static List<WebElement> AwardYearProd;

	@FindBy(xpath = ".//*[@id='cigSearch']/table/tbody/tr[18]/td[2]")
	static List<WebElement> GeographiCAreaFocusProd;

	@FindBy(xpath = ".//*[@id='nationalFocus']")
	static List<WebElement> NationalFocusProd;

	@FindBy(xpath = ".//*[@id='nationalFocus']")
	static List<WebElement> RecipientStateTerritoryProd;

	@FindBy(xpath = ".//*[@id='docType']")
	static List<WebElement> DocumentTypeProd;

	@FindBy(xpath = ".//*[@id='projState']")
	static List<WebElement> ProjectActivityStateTerritoryProd;

	// Test Elements

	@FindBy(xpath = ".//*[@id='cigSearch']/h2")
	static WebElement headingTest;

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbTest;

	@FindBy(xpath = ".//*[@id='cigSearch']")
	static WebElement INTest;;

	@FindBy(xpath = ".//*[@id='generalText']")
	static WebElement

	GeneralTextSearchTest;

	@FindBy(xpath = ".//*[@id='cigSearch']/table/tbody/tr[2]/td[2]/input")
	static WebElement

	SearchButton1Test;

	@FindBy(xpath = ".//*[@id='keywords']")
	static WebElement KeywordsTest;

	@FindBy(xpath = ".//*[@id='cigSearch']/table/tbody/tr[4]/td[2]/div")
	static List<WebElement> SearchByGrantTypeTest;

	@FindBy(xpath = ".//*[@id='cigSearch']/table/tbody/tr[10]/td[2]/ul/li/input")
	static WebElement ResourceConcernsTest;

	@FindBy(xpath = ".//*[@id='projEcoReg']")
	static WebElement ProjectEcoregionTest;

	@FindBy(xpath = ".//*[@id='awardYear']")
	static List<WebElement> AwardYearTest;

	@FindBy(xpath = ".//*[@id='cigSearch']/table/tbody/tr[18]/td[2]")
	static List<WebElement> GeographiCAreaFocusTest;

	@FindBy(xpath = ".//*[@id='nationalFocus']")
	static List<WebElement> NationalFocusTest;

	@FindBy(xpath = ".//*[@id='nationalFocus']")
	static List<WebElement> RecipientStateTerritoryTest;

	@FindBy(xpath = ".//*[@id='docType']")
	static List<WebElement> DocumentTypeTest;

	@FindBy(xpath = ".//*[@id='projState']")
	static List<WebElement> ProjectActivityStateTerritoryTest;

	// Comparison Arrays

	public static List<String> LinksArrayProd = null;

	public static List<String> LinksArrayTest = null;

	public static List<String> BreadCrumbArrayProd = null;

	public static List<String> BreadCrumbArrayTest = null;

	public static void validateProd() throws InterruptedException {

		String title1 = driver.getTitle();

		String heading1 = headingProd.getText();

		// log.info("Title of Prod is " +title1);

		// log.info("Heading of Prod is "+heading1);

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

		log.info("Total number of of links in Prod are " + count);

		log.info("Total number of of Valid links in Prod are " + counter_valid1);

		String contentProd = INProd.getText();

		log.info("The contents in Prod are ");
		log.info(contentProd);

		log.info("\t");
		/*
		 * List<WebElement>el=SearchByGrantTypeProd;
		 * 
		 * 
		 * 
		 * for(int i=0; i<=el.size()-1; i++){
		 * log.info("Search By Grant Type are "); log.info(el.get(i).getText());
		 * }
		 */
		// validating search (GeneralTextSearch)

		GeneralTextSearchProd.sendKeys("soil");

		SearchButton1Prod.click();

		String heading_searchResult = driver.findElement(By.xpath(".//*[@id='cigSearch']/h2")).getText();

		if (heading_searchResult.equalsIgnoreCase("Search Results - Conservation Innovation Grants")) {
			log.info(" search worked for : General Text Search :Prod");
		}

		driver.navigate().back();

		Thread.sleep(10000);
		// Validating search (Keywords)

		KeywordsProd.sendKeys("soil");

		SearchButton1Prod.click();

		String heading_searchResult2 = driver.findElement(By.xpath(".//*[@id='cigSearch']/h2")).getText();

		if (heading_searchResult2.equalsIgnoreCase("Search Results - Conservation Innovation Grants")) {
			log.info(" search worked for : Keyword Search : Prod");
		}

		/*
		 * 
		 * WebElement el1= ResourceConcernsProd;
		 * 
		 * List<WebElement>items = el1.findElements(By.tagName("li"));
		 * 
		 * for(int i=0; i<=items.size()-1; i++){
		 * log.info("SResource Concern(s) are " );
		 * 
		 * 
		 * log.info(items.get(i).getText()); }
		 * 
		 * 
		 * Select dropdown = new Select(ProjectEcoregionProd);
		 * List<WebElement>e2=dropdown.getOptions(); for(int
		 * i=0;i<=e2.size()-1;i++){
		 * log.info("Project Activity State/Territory ");
		 * 
		 * log.info(e2.get(i).getText()); }
		 * log.info("Project Activity State/Territory "+e2.size());
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Select dropdown1= new Select(ProjectEcoregionProd);
		 * List<WebElement>e3=dropdown.getOptions(); for(int
		 * i=0;i<=e3.size()-1;i++){ log.info("Project Ecoregion(s)");
		 * log.info(e3.get(i).getText()); }
		 * log.info("Project Ecoregion(s) "+e3.size());
		 * 
		 * 
		 */

		// Test Methods

		driver.get(DataProviderFactory.getConfig().getApplicationUrl3() + "ia/programs/financial/cig/cigsearch");

		Helper.capturescreenshot(driver, "CIGProjectSearchIN_Test");

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

			log.info("heading of both Env: are same");

		}

		log.info("\t");

		if (title1.equals(title2)) {

			log.info("Titles of both Env: are same");
		} else {
			log.info("Titles of both Env: are not same");

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

				log.info("You are here items on both Env: are same");
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

		String contentTest = INTest.getText();

		log.info("The contents in Test are ");
		log.info(contentTest);
		log.info("\t");

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

		if (contentProd.equals(contentTest)) {

			log.info("The contents in both Env: are same");
		}

		else {

			log.info("The contents in both Env: are not same");
		}

		log.info("\t");

		GeneralTextSearchTest.sendKeys("soil");

		SearchButton1Test.click();

		String GeneralText_searchResult_Test = driver.findElement(By.xpath(".//*[@id='cigSearch']/h2")).getText();

		if (heading_searchResult.equalsIgnoreCase("Search Results - Conservation Innovation Grants")) {
			log.info(" search worked for : General Text Search :Test");
		}

		driver.navigate().back();

		Thread.sleep(10000);
		// Validating search (Keywords)

		KeywordsTest.sendKeys("soil");

		SearchButton1Test.click();

		String Keyword_searchResult_Test = driver.findElement(By.xpath(".//*[@id='cigSearch']/h2")).getText();

		if (heading_searchResult2.equalsIgnoreCase("Search Results - Conservation Innovation Grants")) {
			log.info(" search worked for : Keyword Search : Test");
		}

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
	 * log.info("The exception is "+e.getMessage()); } }
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
