package pages1.prod_lInks;

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
import org.testng.Assert;
import org.testng.annotations.Test;

import factory.DataProviderFactory;
import pages.Home_Page;
import utility.Helper;

public class TechnicalResources1 {

	static WebDriver driver;

	public TechnicalResources1(WebDriver Idriver) {
		this.driver = Idriver;
	}

	// Prod Elements

	@FindBy(xpath = ".//*[@id='overview']/h2/a")
	static WebElement headingProd;

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbProd;

	@FindBy(xpath = ".//*[@id='selectedTree']/ul/li")
	static List<WebElement> Table_MainelementsProd;

	@FindBy(xpath = ".//*[@id='selectedTree']/ul/li/ul/li/a[2]")
	static List<WebElement> Table_SubElementsProd;

	@FindBy(xpath = ".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[3]/table/tbody/tr/td/table/tbody/tr/td")
	static WebElement INProd;

	// Test Elements

	@FindBy(xpath = ".//*[@id='layoutContainers']/div/table/tbody/tr/td/table/tbody/tr/td/div/section/div[2]/div[2]/div[2]/h2/a")
	static WebElement headingTest;

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbTest;

	@FindBy(xpath = ".//*[@id='tree']/li/ul/li/a[2]")
	static List<WebElement> Table_MainelementsTest;

	@FindBy(xpath = ".//*[@id='tree']/li/ul/li/ul/li/a[2]")
	static List<WebElement> Table_SubElementsTest;

	@FindBy(xpath = ".//*[@id='layoutContainers']/div/table/tbody/tr/td/table/tbody/tr/td/div/section/div[2]/div[2]/div[2]")
	static WebElement INTest;

	// Comparison Arrays

	public static List<String> LeftMainArrayProd = null;

	public static List<String> LeftMainArrayTest = null;

	public static List<String> LeftSubMenuArrayProd = null;

	public static List<String> LeftSubMenuArrayTest = null;

	public static List<String> LinksArrayProd = null;

	public static List<String> LinksArrayTest = null;

	public static List<String> BreadCrumbArrayProd = null;

	public static List<String> BreadCrumbArrayTest = null;

	// buttons Prod

	@FindBy(xpath = ".//*[@id='firstElement']/div")
	static WebElement button1Prod;

	@FindBy(xpath = ".//*[@id='selectedTree']/ul/li[2]/div")
	static WebElement button2Prod;

	@FindBy(xpath = ".//*[@id='selectedTree']/ul/li[3]/div")
	static WebElement button3Prod;

	@FindBy(xpath = ".//*[@id='selectedTree']/ul/li[5]/div")
	static WebElement button4Prod;

	@FindBy(xpath = ".//*[@id='selectedTree']/ul/li[6]/div")
	static WebElement button5Prod;

	// buttons Test

	@FindBy(xpath = ".//*[@id='firstElement']/div")
	static WebElement button1Test;

	@FindBy(xpath = ".//*[@id='bea5d1d0-e335-45ed-9fa1-823d6b5337a7']/div")
	static WebElement button2Test;

	@FindBy(xpath = ".//*[@id='f75f3b7f-a934-4e13-9ebc-5386c90fe6ed']/div")
	static WebElement button3Test;

	@FindBy(xpath = ".//*[@id='add1c7f7-c658-4e82-b3e2-7266d8c1b666']/div")
	static WebElement button4Test;

	@FindBy(xpath = ".//*[@id='9ad6e741-9cb9-413c-bd0b-a71ad19e81ff']/div")
	static WebElement button5Test;

	public static void validateProd() throws IOException, InterruptedException {

		Logger log = Logger.getLogger("TechnicalResources1");

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

		// log.info("first url arrays are "+LinksArrayProd);
		/*
		 * 
		 * 
		 * String contentProd =BodyProd.getText();
		 * 
		 * log.info("The contents in Prod are " +contentProd);
		 * 
		 * log.info("\t");
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

		button1Prod.click();
		button2Prod.click();
		button3Prod.click();
		button4Prod.click();
		button5Prod.click();

		List<String> LeftSubMenuArrayProd = new ArrayList<String>();

		List<WebElement> Left_SubMenuElementProd = Table_SubElementsProd;

		for (int i = 0; i <= Left_SubMenuElementProd.size() - 1; i++) {

			String text = Left_SubMenuElementProd.get(i).getText();

			LeftSubMenuArrayProd.add(text);

		}

		log.info("sub menu elements are;");

		log.info(LeftSubMenuArrayProd);

		log.info("No of sub menu elements " + LeftSubMenuArrayProd.size());

		// Test Methods

		driver.get(DataProviderFactory.getConfig().getApplicationUrl3()
				+ DataProviderFactory.getExcel().getdata(0, 76, 1));

		Helper.capturescreenshot(driver, "TechnicalResourcesIN_Test");

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
			;

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

		List<String> LeftMainArrayTest = new ArrayList<String>();

		List<WebElement> Left_MainMenuElementTest = Table_MainelementsTest;

		for (int i = 0; i <= Left_MainMenuElementTest.size() - 1; i++) {

			String text = Left_MainMenuElementTest.get(i).getText();

			LeftMainArrayTest.add(text);

		}

		log.info("main menu elements are;");

		log.info(LeftMainArrayTest);

		log.info("No of main menu elements in  " + LeftMainArrayTest.size());

		log.info("\t");

		button1Test.click();
		button2Test.click();
		button3Test.click();
		button4Test.click();
		button5Test.click();

		List<String> LeftSubMenuArrayTest = new ArrayList<String>();

		List<WebElement> Left_SubMenuElementTest = Table_SubElementsTest;

		for (int i = 0; i <= Left_SubMenuElementTest.size() - 1; i++) {

			String text = Left_SubMenuElementTest.get(i).getText();

			LeftSubMenuArrayTest.add(text);

		}

		log.info("sub menu elements are;");
		log.info(LeftSubMenuArrayTest);

		log.info("No of sub menu elements " + LeftSubMenuArrayTest.size());

		/*
		 * 
		 * 
		 * String contentTest=BodyTest.getText();
		 * 
		 * log.info("The contents in Test are " +contentTest);
		 * 
		 * log.info("\t");
		 */

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

		Boolean value1 = Arrays.equals(LeftSubMenuArrayProd.toArray(), LeftSubMenuArrayProd.toArray());

		if (value1 == true) {

			log.info("Left menu sub items on both Env: are same");
		} else {
			log.info("Left menu sub items on both Env: are  Not same");

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

				log.info("No of email links doesnt match in both Env:");
			}

		} catch (Exception e) {

			log.info(e.getMessage());
		}

		log.info("\t");

		/*
		 * if( contentProd.equals(contentTest)){
		 * 
		 * log.info("The contents in both Env: are same"); }
		 * 
		 * else{
		 * 
		 * log.info("The contents in both Env: are not same"); }
		 * 
		 * log.info("\t");
		 */
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

}
