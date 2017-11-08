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

import factory.DataProviderFactory;
import utility.Helper;

public class Newsroom1 {

	static Logger log = Logger.getLogger("Newsroom1");

	static WebDriver driver;

	public Newsroom1(WebDriver Idriver) {

		this.driver = Idriver;
	}

	// Prod Elements

	@FindBy(xpath = ".//*[@id='overview']/h2/a")
	static WebElement headingProd;

	@FindBy(xpath = ".//*[@id='overview']/h3[2]/span/b/span/img")
	static WebElement Image1Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[4]/span/b/span/img")
	static WebElement Image2Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[6]/span/b/span/span/img")

	static WebElement Image3Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[7]/span/b/span/span/img")

	static WebElement Image4Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[8]/span/b/span/span/img")

	static WebElement Image5Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[9]/span/b/span/span/img")

	static WebElement Image6Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[10]/span/b/span/img")

	static WebElement Image7Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[11]/span/b/span/span/img")

	static WebElement Image8Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[12]/span/b/span/span/img")
	static WebElement Image9Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[13]/span/b/span/span/img")
	static WebElement Image10Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[14]/span/b/span/span/img")

	static WebElement Image11Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[15]/span/b/span/span/img")

	static WebElement Image12Prod;;

	@FindBy(xpath = ".//*[@id='overview']/h3[16]/span/b/span/span/img")

	static WebElement Image13Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[17]/span/b/span/span/img")

	static WebElement Image14Prod;
	
	
	


	@FindBy(xpath = ".//*[@id='overview']/h3[18]/span/b/span/img")

	static WebElement Image15Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[19]/span/b/span/img")

	static WebElement Image16Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[20]/span/b/span/img")

	static WebElement Image17Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[21]/span/b/span/img")

	static WebElement Image18Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[22]/span/b/span/span/img")

	static WebElement Image19Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[23]/span/b/span/span/img")
	static WebElement Image20Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[24]/span/b/span/span/img")
	static WebElement Image21Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[25]/span/b/span/img")
	static WebElement Image22Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[26]/span/b/span/img")

	static WebElement Image23Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[27]/span/b/span/span/img")
	static WebElement Image24Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[28]/span/b/span/span/img")
	static WebElement Image25Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[29]/span/b/span/span/img")
	static WebElement Image26Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[30]/span/b/span/span/strong/img")
	static WebElement Image27Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[31]/span/b/span/img")
	static WebElement Image28Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[32]/span/b/span/img")
	static WebElement Image29Prod;

	@FindBy(xpath = ".//*[@id='overview']/div[31]/h3/span/b/span/span/img")
	static WebElement Image30Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[33]/span/b/span/span/img")
	static WebElement Image31Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[34]/span/b/span/span/img")
	static WebElement Image32Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[36]/span/b/span/img")
	static WebElement Image33Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[37]/span/b/span/img")
	static WebElement Image34Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[38]/span/b/span/img")
	static WebElement Image35Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[39]/span/b/span/img")
	static WebElement Image36Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[40]/span/b/span/font/img")
	static WebElement Image37Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[41]/span/b/span/img")
	static WebElement Image38Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[42]/span/b/span/img")
	static WebElement Image39Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[43]/span/b/span/span/strong/img")
	static WebElement Image40Prod;


	
	@FindBy(xpath = ".//*[@id='overview']/h3[44]/b/img")
	static WebElement Image41Prod;
	
	
	@FindBy(xpath = ".//*[@id='overview']/h3[45]/b/img")
	static WebElement Image42Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[46]/b/font/img")
	static WebElement Image43Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[47]/b/font/img")
	static WebElement Image44Prod;

	@FindBy(xpath = ".//*[@id='overview']/h3[48]/b/img")
	static WebElement Image45Prod;

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbProd;

	@FindBy(xpath = ".//*[@id='selectedTree']/ul/li/a[2]")
	static List<WebElement> Table_MainelementsProd;

	@FindBy(xpath = ".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[3]/table/tbody/tr/td/table/tbody/tr/td")
	static WebElement AZProd;

	// Test Elements

	@FindBy(xpath = ".//*[@id='layoutContainers']/div/table/tbody/tr/td/table/tbody/tr/td/div/section/div[2]/div[2]/div[2]/h2/a")
	static WebElement headingTest;

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbTest;

	@FindBy(xpath = ".//*[@id='layoutContainers']/div/table/tbody/tr/td/table/tbody/tr/td/div/section/div[2]/div[2]/div[2]")
	static WebElement AZTest;

	@FindBy(xpath = ".//*[@id='tree']/li/ul/li/a[2]")
	static List<WebElement> Table_MainelementsTest;

	@FindBy(xpath = ".//*[@id='overview']/h3[2]/span/b/span/img")
	static WebElement Image1Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[4]/span/b/span/img")
	static WebElement Image2Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[6]/span/b/span/span/img")

	static WebElement Image3Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[7]/span/b/span/span/img")

	static WebElement Image4Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[8]/span/b/span/span/img")

	static WebElement Image5Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[9]/span/b/span/span/img")

	static WebElement Image6Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[10]/span/b/span/img")

	static WebElement Image7Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[11]/span/b/span/span/img")

	static WebElement Image8Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[12]/span/b/span/span/img")
	static WebElement Image9Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[13]/span/b/span/span/img")
	static WebElement Image10Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[14]/span/b/span/span/img")

	static WebElement Image11Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[15]/span/b/span/span/img")

	static WebElement Image12Test;;

	@FindBy(xpath = ".//*[@id='overview']/h3[16]/span/b/span/span/img")

	static WebElement Image13Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[17]/span/b/span/span/img")

	static WebElement Image14Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[20]/span/b/span/img")

	static WebElement Image15Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[19]/span/b/span/img")

	static WebElement Image16Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[20]/span/b/span/img")

	static WebElement Image17Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[21]/span/b/span/img")

	static WebElement Image18Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[22]/span/b/span/span/img")

	static WebElement Image19Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[23]/span/b/span/span/img")
	static WebElement Image20Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[24]/span/b/span/span/img")
	static WebElement Image21Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[25]/span/b/span/img")
	static WebElement Image22Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[26]/span/b/span/img")

	static WebElement Image23Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[27]/span/b/span/span/img")
	static WebElement Image24Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[28]/span/b/span/span/img")
	static WebElement Image25Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[29]/span/b/span/span/img")
	static WebElement Image26Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[30]/span/b/span/span/strong/img")
	static WebElement Image27Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[31]/span/b/span/img")
	static WebElement Image28Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[32]/span/b/span/img")
	static WebElement Image29Test;

	@FindBy(xpath = ".//*[@id='overview']/div[31]/h3/span/b/span/span/img")
	static WebElement Image30Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[33]/span/b/span/span/img")
	static WebElement Image31Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[34]/span/b/span/span/img")
	static WebElement Image32Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[36]/span/b/span/img")
	static WebElement Image33Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[37]/span/b/span/img")
	static WebElement Image34Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[38]/span/b/span/img")
	static WebElement Image35Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[39]/span/b/span/img")
	static WebElement Image36Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[40]/span/b/span/font/img")
	static WebElement Image37Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[41]/span/b/span/img")
	static WebElement Image38Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[42]/span/b/span/img")
	static WebElement Image39Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[43]/span/b/span/span/strong/img")
	static WebElement Image40Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[45]/b/img")
	static WebElement Image41Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[46]/b/font/img")
	static WebElement Image42Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[47]/b/font/img")
	static WebElement Image43Test;

	@FindBy(xpath = ".//*[@id='overview']/h3[47]/b/font/img")
	static WebElement Image44Test;

	// Comparison Arrays

	public static List<String> LinksArrayProd = null;

	public static List<String> LinksArrayTest = null;

	public static List<String> BreadCrumbArrayProd = null;

	public static List<String> BreadCrumbArrayTest = null;

	public static List<Object> ImageArray1Prod = null;

	public static List<Object> ImageArray1Test = null;

	public static List<Object> ImageArray2Prod = null;

	public static List<Object> ImageArray2Test = null;

	public static List<Object> ImageArray3Prod = null;

	public static List<Object> ImageArray3Test = null;

	public static List<Object> ImageArray4Prod = null;

	public static List<Object> ImageArray4Test = null;

	public static List<Object> ImageArray5Prod = null;

	public static List<Object> ImageArray5Test = null;

	public static List<Object> ImageArray6Prod = null;

	public static List<Object> ImageArray6Test = null;

	public static List<Object> ImageArray7Prod = null;

	public static List<Object> ImageArray7Test = null;
	public static List<Object> ImageArray8Prod = null;

	public static List<Object> ImageArray8Test = null;
	public static List<Object> ImageArray9Prod = null;

	public static List<Object> ImageArray9Test = null;
	public static List<Object> ImageArray10Prod = null;

	public static List<Object> ImageArray10Test = null;
	public static List<Object> ImageArray11Prod = null;

	public static List<Object> ImageArray11Test = null;

	public static List<Object> ImageArray12Prod = null;

	public static List<Object> ImageArray12Test = null;

	public static List<Object> ImageArray13Prod = null;

	public static List<Object> ImageArray13Test = null;

	public static List<Object> ImageArray14Prod = null;

	public static List<Object> ImageArray14Test = null;

	public static List<Object> ImageArray15Prod = null;

	public static List<Object> ImageArray15Test = null;

	public static List<Object> ImageArray16Prod = null;

	public static List<Object> ImageArray16Test = null;

	public static List<Object> ImageArray17Prod = null;

	public static List<Object> ImageArray17Test = null;

	public static List<Object> ImageArray18Prod = null;

	public static List<Object> ImageArray18Test = null;

	public static List<Object> ImageArray19Prod = null;

	public static List<Object> ImageArray19Test = null;

	public static List<Object> ImageArray20Prod = null;

	public static List<Object> ImageArray20Test = null;

	public static List<Object> ImageArray21Prod = null;

	public static List<Object> ImageArray21Test = null;
	public static List<Object> ImageArray22Prod = null;

	public static List<Object> ImageArray22Test = null;

	public static List<Object> ImageArray23Prod = null;

	public static List<Object> ImageArray23Test = null;

	public static List<Object> ImageArray24Prod = null;

	public static List<Object> ImageArray24Test = null;

	public static List<Object> ImageArray25Prod = null;

	public static List<Object> ImageArray25Test = null;

	public static List<Object> ImageArray26Prod = null;

	public static List<Object> ImageArray26Test = null;

	public static List<Object> ImageArray27Prod = null;

	public static List<Object> ImageArray27Test = null;

	public static List<Object> ImageArray28Prod = null;

	public static List<Object> ImageArray28Test = null;

	public static List<Object> ImageArray29Prod = null;

	public static List<Object> ImageArray29Test = null;

	public static List<Object> ImageArray30Prod = null;

	public static List<Object> ImageArray30Test = null;

	public static List<Object> ImageArray31Prod = null;

	public static List<Object> ImageArray31Test = null;

	public static List<Object> ImageArray32Prod = null;

	public static List<Object> ImageArray32Test = null;

	public static List<Object> ImageArray33Prod = null;

	public static List<Object> ImageArray33Test = null;

	public static List<Object> ImageArray34Prod = null;

	public static List<Object> ImageArray34Test = null;

	public static List<Object> ImageArray35Prod = null;

	public static List<Object> ImageArray35Test = null;

	public static List<Object> ImageArray36Prod = null;

	public static List<Object> ImageArray36Test = null;

	public static List<Object> ImageArray37Prod = null;

	public static List<Object> ImageArray37Test = null;

	public static List<Object> ImageArray38Prod = null;

	public static List<Object> ImageArray38Test = null;

	public static List<Object> ImageArray39Prod = null;

	public static List<Object> ImageArray39Test = null;

	public static List<Object> ImageArray40Prod = null;

	public static List<Object> ImageArray40Test = null;

	public static List<Object> ImageArray41Prod = null;

	public static List<Object> ImageArray41Test = null;

	public static List<Object> ImageArray42Prod = null;

	public static List<Object> ImageArray42Test = null;

	public static List<Object> ImageArray43Prod = null;

	public static List<Object> ImageArray43Test = null;

	public static List<Object> ImageArray44Prod = null;

	public static List<Object> ImageArray44Test = null;

	public static List<String> Table_MainelementsArrayProd = null;

	public static List<String> Table_MainelementsArrayTest = null;

	public static void validateURL() {

		Logger log = Logger.getLogger("Newsroom1");

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

		List<String> Table_MainelementsArrayProd = new ArrayList<String>();

		List<WebElement> Table_MainelementsProd_elements = Table_MainelementsProd;

		for (int i = 0; i < (Table_MainelementsProd_elements).size() ; i++) {

			String text = Table_MainelementsProd_elements.get(i).getText();

			// String NewText = text.trim();

			// log.info("array elements are "+ text);

			Table_MainelementsArrayProd.add(text);

		}

		log.info("The Left menu items are of Prod is " + Table_MainelementsArrayProd);

		log.info("Number of Left menu items in Prod is " + Table_MainelementsArrayProd.size());

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
		/*
		 * String contentProd =BodyProd.getText();
		 * 
		 * log.info("The contents in Prod are " +contentProd); log.info("\t");
		 */

		ImageArray1Prod = image_check(Image1Prod);

		ImageArray2Prod = image_check(Image2Prod);

		ImageArray3Prod = image_check(Image3Prod);

		ImageArray4Prod = image_check(Image4Prod);

		ImageArray5Prod = image_check(Image5Prod);

		ImageArray6Prod = image_check(Image6Prod);

		ImageArray7Prod = image_check(Image7Prod);

		ImageArray8Prod = image_check(Image8Prod);

		ImageArray9Prod = image_check(Image9Prod);

		ImageArray10Prod = image_check(Image10Prod);
		;

		ImageArray11Prod = image_check(Image11Prod);

		ImageArray12Prod = image_check(Image12Prod);

		ImageArray13Prod = image_check(Image13Prod);

		ImageArray14Prod = image_check(Image14Prod);

		ImageArray15Prod = image_check(Image15Prod);

		ImageArray16Prod = image_check(Image16Prod);

		ImageArray17Prod = image_check(Image17Prod);

		ImageArray18Prod = image_check(Image18Prod);

		ImageArray19Prod = image_check(Image19Prod);

		ImageArray20Prod = image_check(Image20Prod);

		ImageArray21Prod = image_check(Image21Prod);

		ImageArray22Prod = image_check(Image22Prod);

		ImageArray23Prod = image_check(Image23Prod);

		ImageArray24Prod = image_check(Image24Prod);

		ImageArray25Prod = image_check(Image25Prod);

		ImageArray26Prod = image_check(Image26Prod);

		ImageArray27Prod = image_check(Image27Prod);

		ImageArray28Prod = image_check(Image28Prod);

		ImageArray29Prod = image_check(Image29Prod);

		ImageArray30Prod = image_check(Image30Prod);

		ImageArray31Prod = image_check(Image31Prod);

		ImageArray32Prod = image_check(Image32Prod);

		ImageArray33Prod = image_check(Image33Prod);

		ImageArray34Prod = image_check(Image34Prod);

		ImageArray35Prod = image_check(Image35Prod);

		ImageArray36Prod = image_check(Image36Prod);

		ImageArray37Prod = image_check(Image37Prod);

		ImageArray38Prod = image_check(Image38Prod);

		ImageArray39Prod = image_check(Image39Prod);

		ImageArray40Prod = image_check(Image40Prod);

		ImageArray41Prod = image_check(Image41Prod);

		ImageArray42Prod = image_check(Image42Prod);

		ImageArray43Prod = image_check(Image43Prod);

		ImageArray44Prod = image_check(Image44Prod);

		// Test Methods

		driver.get(DataProviderFactory.getConfig().getApplicationUrl3() + "az/newsroom/#");

		Helper.capturescreenshot(driver, "NewsRoomAZ_Test");

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
		}
		log.info("\t");

		List<String> Table_MainelementsArrayTest = new ArrayList<String>();

		List<WebElement> Table_MainelementsTest_elements = Table_MainelementsTest;

		for (int i = 0; i < (Table_MainelementsTest_elements).size() ; i++) {

			String text = Table_MainelementsTest_elements.get(i).getText();

			// String NewText = text.trim();

			// log.info("array elements are "+ text);

			Table_MainelementsArrayTest.add(text);

		}

		log.info("The Left menu items are of Test is " + Table_MainelementsArrayTest);

		log.info("Number of Left menu items in Test is " + Table_MainelementsArrayTest.size());

		ImageArray1Test = image_check(Image1Test);

		ImageArray2Test = image_check(Image2Test);

		ImageArray3Test = image_check(Image3Test);

		ImageArray4Test = image_check(Image4Test);

		ImageArray5Test = image_check(Image5Test);

		ImageArray6Test = image_check(Image6Test);

		ImageArray7Test = image_check(Image7Test);

		ImageArray8Test = image_check(Image8Test);

		ImageArray9Test = image_check(Image9Test);

		ImageArray10Test = image_check(Image10Test);
		;

		ImageArray11Test = image_check(Image11Test);

		ImageArray12Test = image_check(Image12Test);

		ImageArray13Test = image_check(Image13Test);

		ImageArray14Test = image_check(Image14Test);

		ImageArray15Test = image_check(Image15Test);

		ImageArray16Test = image_check(Image16Test);

		ImageArray17Test = image_check(Image17Test);

		ImageArray18Test = image_check(Image18Test);

		ImageArray19Test = image_check(Image19Test);

		ImageArray20Test = image_check(Image20Test);

		ImageArray21Test = image_check(Image21Test);

		ImageArray22Test = image_check(Image22Test);

		ImageArray23Test = image_check(Image23Test);

		ImageArray24Test = image_check(Image24Test);

		ImageArray25Test = image_check(Image25Test);

		ImageArray26Test = image_check(Image26Test);

		ImageArray27Test = image_check(Image27Test);

		ImageArray28Test = image_check(Image28Test);

		ImageArray29Test = image_check(Image29Test);

		ImageArray30Test = image_check(Image30Test);

		ImageArray31Test = image_check(Image31Test);

		ImageArray32Test = image_check(Image32Test);

		ImageArray33Test = image_check(Image33Test);

		ImageArray34Test = image_check(Image34Test);

		ImageArray35Test = image_check(Image35Test);

		ImageArray36Test = image_check(Image36Test);

		ImageArray37Test = image_check(Image37Test);

		ImageArray38Test = image_check(Image38Test);

		ImageArray39Test = image_check(Image39Test);

		ImageArray40Test = image_check(Image40Test);

		ImageArray41Test = image_check(Image41Test);

		ImageArray42Test = image_check(Image42Test);

		ImageArray43Test = image_check(Image43Test);

		ImageArray44Test = image_check(Image44Test);

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

				log.info("Image1 on both Env: are same");
			}

			if (value == false) {
				log.info("image1 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		log.info("\t");

		Boolean value5 = Arrays.equals(ImageArray2Prod.toArray(), ImageArray2Test.toArray());

		try {

			if (value5 == true) {

				log.info("Image2 on both Env: are same");
			}

			if (value5 == false) {
				log.info("image2 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean a = Arrays.equals(ImageArray3Prod.toArray(), ImageArray3Test.toArray());

		try {

			if (a == true) {

				log.info("Image3 on both Env: are same");
			}

			if (a == false) {
				log.info("image3 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean b = Arrays.equals(ImageArray4Prod.toArray(), ImageArray4Test.toArray());

		try {

			if (b == true) {

				log.info("Image4 on both Env: are same");
			}

			if (b == false) {
				log.info("image4 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean c = Arrays.equals(ImageArray5Prod.toArray(), ImageArray5Test.toArray());

		try {

			if (c == true) {

				log.info("Image5 on both Env: are same");
			}

			if (c == false) {
				log.info("image5 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean d = Arrays.equals(ImageArray6Prod.toArray(), ImageArray6Test.toArray());

		try {

			if (d == true) {

				log.info("Image6 on both Env: are same");
			}

			if (d == false) {
				log.info("image6 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f = Arrays.equals(ImageArray7Prod.toArray(), ImageArray7Test.toArray());

		try {

			if (f == true) {

				log.info("Image7 on both Env: are same");
			}

			if (f == false) {
				log.info("image7 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean g = Arrays.equals(ImageArray8Prod.toArray(), ImageArray8Test.toArray());

		try {

			if (g == true) {

				log.info("Image8 on both Env: are same");
			}

			if (g == false) {
				log.info("image8 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f1 = Arrays.equals(ImageArray9Prod.toArray(), ImageArray9Test.toArray());

		try {

			if (f1 == true) {

				log.info("Image9 on both Env: are same");
			}

			if (f1 == false) {
				log.info("image9 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f2 = Arrays.equals(ImageArray10Prod.toArray(), ImageArray10Test.toArray());

		try {

			if (f2 == true) {

				log.info("Image10 on both Env: are same");
			}

			if (f2 == false) {
				log.info("image10 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f11 = Arrays.equals(ImageArray11Prod.toArray(), ImageArray11Test.toArray());

		try {

			if (f11 == true) {

				log.info("Image11 on both Env: are same");
			}

			if (f11 == false) {
				log.info("image11 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f12 = Arrays.equals(ImageArray12Prod.toArray(), ImageArray12Test.toArray());

		try {

			if (f12 == true) {

				log.info("Image12 on both Env: are same");
			}

			if (f12 == false) {
				log.info("image12 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f13 = Arrays.equals(ImageArray13Prod.toArray(), ImageArray13Test.toArray());

		try {

			if (f13 == true) {

				log.info("Image13 on both Env: are same");
			}

			if (f13 == false) {
				log.info("image13 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f14 = Arrays.equals(ImageArray14Prod.toArray(), ImageArray14Test.toArray());

		try {

			if (f14 == true) {

				log.info("Image14 on both Env: are same");
			}

			if (f14 == false) {
				log.info("image14 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f15 = Arrays.equals(ImageArray15Prod.toArray(), ImageArray15Test.toArray());

		try {

			if (f15 == true) {

				log.info("Image15 on both Env: are same");
			}

			if (f15 == false) {
				log.info("image15 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f16 = Arrays.equals(ImageArray16Prod.toArray(), ImageArray16Test.toArray());

		try {

			if (f16 == true) {

				log.info("Image16 on both Env: are same");
			}

			if (f16 == false) {
				log.info("image16 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f17 = Arrays.equals(ImageArray17Prod.toArray(), ImageArray17Test.toArray());

		try {

			if (f17 == true) {

				log.info("Image17 on both Env: are same");
			}

			if (f17 == false) {
				log.info("image17 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f18 = Arrays.equals(ImageArray18Prod.toArray(), ImageArray18Test.toArray());

		try {

			if (f18 == true) {

				log.info("Image18 on both Env: are same");
			}

			if (f18 == false) {
				log.info("image18 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f19 = Arrays.equals(ImageArray19Prod.toArray(), ImageArray19Test.toArray());

		try {

			if (f19 == true) {

				log.info("Image19 on both Env: are same");
			}

			if (f19 == false) {
				log.info("image19 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f0 = Arrays.equals(ImageArray20Prod.toArray(), ImageArray20Test.toArray());

		try {

			if (f0 == true) {

				log.info("Image20 on both Env: are same");
			}

			if (f0 == false) {
				log.info("image20 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f21 = Arrays.equals(ImageArray21Prod.toArray(), ImageArray21Test.toArray());

		try {

			if (f21 == true) {

				log.info("Image21 on both Env: are same");
			}

			if (f21 == false) {
				log.info("image21 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f22 = Arrays.equals(ImageArray22Prod.toArray(), ImageArray22Test.toArray());

		try {

			if (f22 == true) {

				log.info("Image22 on both Env: are same");
			}

			if (f22 == false) {
				log.info("image22 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f23 = Arrays.equals(ImageArray23Prod.toArray(), ImageArray23Test.toArray());

		try {

			if (f23 == true) {

				log.info("Image23 on both Env: are same");
			}

			if (f23 == false) {
				log.info("image23 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f24 = Arrays.equals(ImageArray24Prod.toArray(), ImageArray24Test.toArray());

		try {

			if (f24 == true) {

				log.info("Image24 on both Env: are same");
			}

			if (f24 == false) {
				log.info("image24 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f25 = Arrays.equals(ImageArray25Prod.toArray(), ImageArray25Test.toArray());

		try {

			if (f25 == true) {

				log.info("Image25 on both Env: are same");
			}

			if (f25 == false) {
				log.info("image25 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f26 = Arrays.equals(ImageArray26Prod.toArray(), ImageArray26Test.toArray());

		try {

			if (f26 == true) {

				log.info("Image26 on both Env: are same");
			}

			if (f26 == false) {
				log.info("image26 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f27 = Arrays.equals(ImageArray27Prod.toArray(), ImageArray27Test.toArray());

		try {

			if (f27 == true) {

				log.info("Image27 on both Env: are same");
			}

			if (f27 == false) {
				log.info("image27 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f28 = Arrays.equals(ImageArray28Prod.toArray(), ImageArray28Test.toArray());

		try {

			if (f28 == true) {

				log.info("Image28 on both Env: are same");
			}

			if (f28 == false) {
				log.info("image28 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f29 = Arrays.equals(ImageArray29Prod.toArray(), ImageArray29Test.toArray());

		try {

			if (f29 == true) {

				log.info("Image29 on both Env: are same");
			}

			if (f29 == false) {
				log.info("image29 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f30 = Arrays.equals(ImageArray30Prod.toArray(), ImageArray30Test.toArray());

		try {

			if (f30 == true) {

				log.info("Image30 on both Env: are same");
			}

			if (f30 == false) {
				log.info("image30 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f31 = Arrays.equals(ImageArray31Prod.toArray(), ImageArray31Test.toArray());

		try {

			if (f31 == true) {

				log.info("Image31 on both Env: are same");
			}

			if (f31 == false) {
				log.info("image31 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f32 = Arrays.equals(ImageArray32Prod.toArray(), ImageArray32Test.toArray());

		try {

			if (f32 == true) {

				log.info("Image32 on both Env: are same");
			}

			if (f32 == false) {
				log.info("image32 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f33 = Arrays.equals(ImageArray33Prod.toArray(), ImageArray33Test.toArray());

		try {

			if (f33 == true) {

				log.info("Image33 on both Env: are same");
			}

			if (f33 == false) {
				log.info("image33 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f34 = Arrays.equals(ImageArray34Prod.toArray(), ImageArray34Test.toArray());

		try {

			if (f34 == true) {

				log.info("Image34 on both Env: are same");
			}

			if (f34 == false) {
				log.info("image34 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f35 = Arrays.equals(ImageArray35Prod.toArray(), ImageArray35Test.toArray());

		try {

			if (f35 == true) {

				log.info("Image35 on both Env: are same");
			}

			if (f35 == false) {
				log.info("image35 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f36 = Arrays.equals(ImageArray36Prod.toArray(), ImageArray36Test.toArray());

		try {

			if (f36 == true) {

				log.info("Image36 on both Env: are same");
			}

			if (f36 == false) {
				log.info("image36 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f37 = Arrays.equals(ImageArray37Prod.toArray(), ImageArray37Test.toArray());

		try {

			if (f37 == true) {

				log.info("Image37 on both Env: are same");
			}

			if (f37 == false) {
				log.info("image37 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f38 = Arrays.equals(ImageArray38Prod.toArray(), ImageArray38Test.toArray());

		try {

			if (f38 == true) {

				log.info("Image38 on both Env: are same");
			}

			if (f38 == false) {
				log.info("image38 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f39 = Arrays.equals(ImageArray39Prod.toArray(), ImageArray39Test.toArray());

		try {

			if (f39 == true) {

				log.info("Image39 on both Env: are same");
			}

			if (f39 == false) {
				log.info("image39 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f40 = Arrays.equals(ImageArray40Prod.toArray(), ImageArray40Test.toArray());

		try {

			if (f40 == true) {

				log.info("Image40 on both Env: are same");
			}

			if (f40 == false) {
				log.info("image40 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f41 = Arrays.equals(ImageArray41Prod.toArray(), ImageArray41Test.toArray());

		try {

			if (f41 == true) {

				log.info("Image41 on both Env: are same");
			}

			if (f41 == false) {
				log.info("image41 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f42 = Arrays.equals(ImageArray42Prod.toArray(), ImageArray42Test.toArray());

		try {

			if (f42 == true) {

				log.info("Image42 on both Env: are same");
			}

			if (f42 == false) {
				log.info("image42 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f43 = Arrays.equals(ImageArray43Prod.toArray(), ImageArray43Test.toArray());

		try {

			if (f43 == true) {

				log.info("Image43 on both Env: are same");
			}

			if (f43 == false) {
				log.info("image43 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		Boolean f44 = Arrays.equals(ImageArray44Prod.toArray(), ImageArray44Test.toArray());

		try {

			if (f44 == true) {

				log.info("Image44 on both Env: are same");
			}

			if (f44 == false) {
				log.info("image44 of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

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
