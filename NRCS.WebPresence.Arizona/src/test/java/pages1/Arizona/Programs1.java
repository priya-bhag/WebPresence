package pages1.Arizona;

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
import utility.Helper;

public class Programs1 {

	static Logger log = Logger.getLogger("Programs1");

	static WebDriver driver;

	public Programs1(WebDriver Idriver) {

		this.driver = Idriver;
	}

	// Prod Elements

	@FindBy(xpath = ".//*[@id='overview']/h2/a")
	static WebElement headingProd;

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbProd;

	@FindBy(xpath = ".//*[@id='selectedTree']/ul/li/a[2]")
	static List<WebElement> Table_MainelementsProd;

	@FindBy(xpath = ".//*[@id='selectedTree']/ul/li/ul/li/a[2]")
	static List<WebElement> Table_SubElementsProd;

	@FindBy(xpath = ".//*[@id='selectedTree']/ul/li[2]/ul/li[1]/ul/li/a[2]")
	static WebElement Table_SubElement_CIGProd;

	@FindBy(xpath = "//div[@class='box']/p")
	static WebElement Table2_HeadingProd;

	@FindBy(xpath = "//div[@class='box']/ul/li/a")
	static WebElement Table2_SubElementProd;

	@FindBy(xpath = ".//*[@id='promobox']/div[1]")
	static WebElement Table3Prod;

	@FindBy(xpath = ".//*[@id='promobox']/div[1]/p/a")
	static WebElement Table3_LinkProd;

	@FindBy(xpath = ".//*[@id='promobox']/div[2]")
	static WebElement Table4Prod;

	@FindBy(xpath = ".//*[@id='promobox']/div[2]/p/a")
	static String Table4LinkProd;

	@FindBy(xpath = ".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[3]/table/tbody/tr/td/table/tbody/tr/td")
	static WebElement AZProd;

	
	
	
	// Test Elements
	
	
	
	@FindBy(xpath = ".//*[@id='layoutContainers']/div/table/tbody/tr/td/table/tbody/tr/td/div/section/div[2]/div[2]/div[2]/h2/a")
	static WebElement headingTest;

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbTest;

	@FindBy(xpath = ".//*[@id='tree']/li/ul/li/a[2]")
	static List<WebElement> Table_MainelementsTest;

	@FindBy(css = ".focusarea.hover")
	static WebElement Table_SubElement_CIGTest;

	@FindBy(xpath = ".//*[@id='layoutContainers']/div/table/tbody/tr/td/table/tbody/tr/td/div/section/div[2]/div[2]/div[1]/div[2]/p")
	static WebElement Table2_HeadingTest;

	@FindBy(xpath = ".//*[@id='layoutContainers']/div/table/tbody/tr/td/table/tbody/tr/td/div/section/div[2]/div[2]/div[1]/div[2]/ul/li/a")
	static WebElement Table2_SubElementTest;

	@FindBy(xpath = "//img[@alt='This DUNS SAMS Fact Sheet provides important info for entities appying for conservation programs']")
	static WebElement Table3Test;

	@FindBy(xpath = "//*[contains(text(),'Obtaining a Data Universal Numbering System (DUNS) Number')]")
	static WebElement Table3_LinkTest;

	@FindBy(xpath = "//img[@alt='This DUNS SAMS Fact Sheet provides important info for entities appying for conservation programs']")
	static WebElement Table4Test;

	@FindBy(xpath = "//a[contains(text(),'How to receive conservation assistance from NRCS')]")
	static String Table4LinkTest;

	@FindBy(xpath = ".//*[@id='firstElement']/ul/li/ul/li/a[2]")
	static List<WebElement> Table_SubElementsTest;

	@FindBy(xpath = ".//*[@id='layoutContainers']/div/table/tbody/tr/td/table/tbody/tr/td/div/section/div[2]/div[2]/div[2]")
	static WebElement AZTest;

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

	@FindBy(xpath = ".//*[@id='selectedTree']/ul/li[2]/ul/li[1]/div")
	static WebElement button3Prod;

	@FindBy(xpath = ".//*[@id='selectedTree']/ul/li[3]/div")
	static WebElement button4Prod;

	@FindBy(xpath = ".//*[@id='selectedTree']/ul/li[5]/div")
	static WebElement button5Prod;

	// buttons Test

	@FindBy(css = ".hitarea.collapsable-hitarea.expandable-hitarea")
	static WebElement button1Test;

	@FindBy(xpath = ".//*[@id='firstElement']/ul/li[2]/div")
	static WebElement button2Test;

	@FindBy(xpath = ".//*[@id='firstElement']/ul/li[2]/ul/li[1]/div")
	static WebElement button3Test;

	@FindBy(xpath = ".//*[@id='firstElement']/ul/li[3]/div")
	static WebElement button4Test;

	@FindBy(xpath = ".//*[@id='firstElement']/ul/li[5]/div")
	static WebElement button5Test;

	// @FindBy(xpath=".//*[@id='selectedTree']/ul/li[5]/div") static WebElement
	// button5Test;

	public static void ValidateProd() {

		Logger log = Logger.getLogger("Programs1");

		String title1 = driver.getTitle();

		String heading1 = headingProd.getText();

		List<String> BreadCrumbArrayProd = new ArrayList<String>();

		List<WebElement> BreadCrumbProd_elements = BreadCrumbProd.findElements(By.tagName("p"));

		for (int i = 0; i < (BreadCrumbProd_elements).size() ; i++) {

			String text = BreadCrumbProd_elements.get(i).getText();

			String NewText = text.trim();

			BreadCrumbArrayProd.add(NewText);

		}

		log.info("The breadcrumb of Prod is " + BreadCrumbArrayProd);

		log.info("\t");

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

		List<String> LeftMainArrayProd = new ArrayList<String>();

		List<WebElement> Left_MainMenuElementProd = Table_MainelementsProd;

		for (int i = 0; i < Left_MainMenuElementProd.size() ; i++) {

			String text = Left_MainMenuElementProd.get(i).getText();

			LeftMainArrayProd.add(text);

		}

		log.info("Left main menu elements are");

		log.info(LeftMainArrayProd);

		log.info("No of main menu elements " + LeftMainArrayProd.size());

		log.info("\t");

		button1Prod.click();
		button2Prod.click();
		button3Prod.click();
		button4Prod.click();

		List<String> LeftSubMenuArrayProd = new ArrayList<String>();

		List<WebElement> LeftSubMenu_ElementsProd = Table_SubElementsProd;

		for (int i = 0; i < LeftSubMenu_ElementsProd.size() ; i++) {

			String text = LeftSubMenu_ElementsProd.get(i).getText();

			LeftSubMenuArrayProd.add(text);

		}

		log.info("Left sub menu elements are");

		log.info(LeftSubMenuArrayProd);

		log.info("No of sub menu elements " + LeftSubMenuArrayProd.size());

		Boolean CIG_MenuPresent_Prod = Table_SubElement_CIGProd.isDisplayed();

		if (CIG_MenuPresent_Prod == true) {

			log.info("CIG Menu is present on the left Menu :Prod");
		} else {

			log.info("CIG Menu is not presen on the left menu:Prod ");
		}

		log.info("\t");

		Boolean Table2_Header_PresentProd = Table2_HeadingProd.isDisplayed();

		if (Table2_Header_PresentProd) {

			log.info("Soils is present on the let side of page : Prod");
		} else {
			log.info("Soils is not present on the let side of page : Prod");

		}

		log.info("\t");

		Boolean Table2_sub_present = Table2_SubElementProd.isDisplayed();

		if (Table2_sub_present) {

			log.info("Soil Health is present under Soils");
		} else {

			log.info("Soil Health is not present under Soils");
		}
		log.info("\t");

		Boolean Table3_present = Table3Prod.isDisplayed();

		if (Table3_present) {

			log.info(
					"This DUNS SAMS Fact Sheet provides important info for entities appying for conservation programs : image is present : Prod ");
		} else {
			log.info(
					"This DUNS SAMS Fact Sheet provides important info for entities appying for conservation programs : image is Not present :Prod ");

		}

		log.info("\t");

		Boolean Table3_link_present = Table3_LinkProd.isDisplayed();

		if (Table3_link_present) {

			log.info(
					"Link is present : Obtaining a Data Universal Numbering System (DUNS) Number:= under image :Prod ");
		} else {
			log.info(
					"Link is Not present : Obtaining a Data Universal Numbering System (DUNS) Number:= under image :Prod ");

		}

		log.info("\t");

		Boolean Table4present = Table4Prod.isDisplayed();

		if (Table4present) {
			log.info("Image with a link :=  Step by Step How to Get Assistance:= is present : Prod");

		} else {

			log.info("Image with a link :=  Step by Step How to Get Assistance:= is Not present :Prod");

		}

		verifyLinkActive(Table4LinkProd);

		// Test Methods

		driver.get(DataProviderFactory.getConfig().getApplicationUrl3() + "az/programs/");

		Helper.capturescreenshot(driver, "ProgramsAZ_Test");

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

		List<String> LeftMainArrayTest = new ArrayList<String>();

		List<WebElement> Left_MainMenuElementTest = Table_MainelementsTest;

		for (int i = 0; i < Left_MainMenuElementTest.size() ; i++) {

			String text = Left_MainMenuElementTest.get(i).getText();

			LeftMainArrayTest.add(text);

		}

		log.info(LeftMainArrayTest);

		log.info("No of main menu elements in  " + LeftMainArrayTest.size());

		log.info("\t");

		button1Test.click();
		button2Test.click();
		button3Test.click();
		button4Test.click();

		List<String> LeftSubMenuArrayTest = new ArrayList<String>();

		List<WebElement> Left_SubMenuElementTest = Table_SubElementsTest;

		for (int i = 0; i < Left_SubMenuElementTest.size() ; i++) {

			String text = Left_SubMenuElementTest.get(i).getText();

			LeftSubMenuArrayTest.add(text);

		}

		log.info(LeftSubMenuArrayTest);

		log.info("No of sub menu elements " + LeftSubMenuArrayTest.size());

		Boolean CIG_MenuPresent_Test = Table_SubElement_CIGTest.isDisplayed();

		if (CIG_MenuPresent_Test == true) {

			log.info("CIG Menu is present on the left Menu :Test");
		} else {

			log.info("CIG Menu is not presen on the left menu :Test");
		}

		List<String> BreadCrumbArrayTest = new ArrayList<String>();

		List<WebElement> BreadCrumbTest_elements = BreadCrumbTest.findElements(By.tagName("p"));

		for (int i = 0; i < (BreadCrumbTest_elements).size() ; i++) {

			String text = BreadCrumbTest_elements.get(i).getText();

			BreadCrumbArrayTest.add(text);
		}

		log.info(BreadCrumbArrayTest);

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

		verifyLinkActive(Table4LinkTest);

		Boolean value = Arrays.equals(LeftMainArrayProd.toArray(), LeftMainArrayTest.toArray());

		try {
			if (value = true) {

				log.info("Left menu items on both Env: are same");
			} else {
				log.info("Left menu items on both Env: are not same");
			}

			Boolean value1 = Arrays.equals(LeftSubMenuArrayProd.toArray(), LeftSubMenuArrayProd.toArray());

			if (value1 = true) {

				log.info("Left menu sub items on both Env: are same");
			}

			Boolean value2 = Arrays.equals(BreadCrumbArrayTest.toArray(), BreadCrumbArrayProd.toArray());

			if (value2 = true) {

				log.info("BreadCrumb on both Env: are same");
			} else {

				log.info("Breadcrumb on both Env: are not same");
			}
		} catch (Exception e) {
			e.toString();
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
		Boolean Table2_Header_PresentTest = Table2_HeadingTest.isDisplayed();

		if (Table2_Header_PresentTest) {

			log.info("Soils is present on the let side of page : Test");
		} else {
			log.info("Soils is not present on the let side of page : Test");

		}

		log.info("\t");

		Boolean Table2_sub_presentTest = Table2_SubElementTest.isDisplayed();

		if (Table2_sub_present) {

			log.info("Soil Health is present under Soils");
		} else {

			log.info("Soil Health is not present under Soils");
		}
		log.info("\t");

		Boolean Table3_presentTest = Table3Test.isDisplayed();

		if (Table3_present) {

			log.info(
					"This DUNS SAMS Fact Sheet provides important info for entities appying for conservation programs : image is present : Test ");
		} else {
			log.info(
					"This DUNS SAMS Fact Sheet provides important info for entities appying for conservation programs : image is Not present :Test ");

		}

		log.info("\t");

		Boolean Table3_link_presentTest = Table3_LinkTest.isDisplayed();

		if (Table3_link_present) {

			log.info(
					"Link is present : Obtaining a Data Universal Numbering System (DUNS) Number:= under image :Test ");
		} else {
			log.info(
					"Link is Not present : Obtaining a Data Universal Numbering System (DUNS) Number:= under image :Test ");

		}

		log.info("\t");

		Boolean Table4presentTest = Table4Test.isDisplayed();

		if (Table4present) {
			log.info("Image with a link :=  Step by Step How to Get Assistance:= is present : Test");

		} else {

			log.info("Image with a link :=  Step by Step How to Get Assistance:= is Not present :Test");

		}

		verifyLinkActive(Table4LinkTest);

	}

	public static void verifyLinkActive(String linkUrl) {

		try {

			URL url = new URL(linkUrl);

			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

			httpURLConnect.setConnectTimeout(3000);

			httpURLConnect.connect();

			if (httpURLConnect.getResponseCode() == 200) {
				log.info(linkUrl + " - " + httpURLConnect.getResponseMessage());
			}

			if (!(httpURLConnect.getResponseCode() == 200)) {
				log.info(linkUrl + "-" + httpURLConnect.getResponseMessage());

			}
			if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
				log.info(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - "
						+ HttpURLConnection.HTTP_NOT_FOUND);

			}
		} catch (Exception e) {

		}

	}

}
