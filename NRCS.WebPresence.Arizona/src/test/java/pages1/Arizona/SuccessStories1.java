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

public class SuccessStories1 {

	static Logger log = Logger.getLogger("SuccessStories1");
	static WebDriver driver;

	public SuccessStories1(WebDriver Idriver) {
		this.driver = Idriver;
	}

	// Prod Elements

	@FindBy(xpath = ".//*[@id='overview']/h2/a")
	static WebElement headingProd;

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbProd;

	@FindBy(xpath = ".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[3]/table/tbody/tr/td/table/tbody/tr/td")
	static WebElement AZProd;

	@FindBy(xpath = ".//*[@id='overview']/div/p/img")
	static WebElement Image1Prod;

	@FindBy(xpath = ".//*[@id='table29']/tbody/tr/td[1]/p/img")
	static WebElement Image2Prod;

	@FindBy(xpath = ".//*[@id='table28']/tbody/tr/td[1]/p/img")

	static WebElement Image3Prod;

	@FindBy(xpath = ".//*[@id='table27']/tbody/tr/td[1]/p/img")

	static WebElement Image4Prod;

	@FindBy(xpath = ".//*[@id='table26']/tbody/tr/td[1]/p/img")

	static WebElement Image5Prod;

	@FindBy(xpath = ".//*[@id='table25']/tbody/tr/td[1]/p/img")

	static WebElement Image6Prod;

	@FindBy(xpath = ".//*[@id='table24']/tbody/tr/td[1]/p/img")

	static WebElement Image7Prod;

	@FindBy(xpath = ".//*[@id='table23']/tbody/tr/td[1]/p/img")

	static WebElement Image8Prod;

	@FindBy(xpath = ".//*[@id='table22']/tbody/tr/td[1]/p/img")
	static WebElement Image9Prod;

	@FindBy(xpath = ".//*[@id='table21']/tbody/tr/td[1]/p/img")
	static WebElement Image10Prod;

	@FindBy(xpath = ".//*[@id='table20']/tbody/tr/td[1]/p/img")

	static WebElement Image11Prod;

	@FindBy(xpath = ".//*[@id='table19']/tbody/tr/td[1]/p/img")

	static WebElement Image12Prod;;

	@FindBy(xpath = ".//*[@id='table17']/tbody/tr/td[1]/p/img")

	static WebElement Image13Prod;

	@FindBy(xpath = ".//*[@id='table16']/tbody/tr/td[1]/p/img")

	static WebElement Image14Prod;

	@FindBy(xpath = ".//*[@id='table11']/tbody/tr/td[1]/p/img")

	static WebElement Image15Prod;

	@FindBy(xpath = ".//*[@id='table15']/tbody/tr/td[1]/p/img")

	static WebElement Image16Prod;

	@FindBy(xpath = ".//*[@id='table4']/tbody/tr/td[1]/p/img")

	static WebElement Image17Prod;

	@FindBy(xpath = ".//*[@id='table18']/tbody/tr/td[1]/p/img")

	static WebElement Image18Prod;

	// Test Elements

	@FindBy(xpath = ".//*[@id='layoutContainers']/div/table/tbody/tr/td/table/tbody/tr/td/div/section/div[2]/div[2]/div[2]/h2/a")
	static WebElement headingTest;

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbTest;

	@FindBy(xpath = ".//*[@id='layoutContainers']/div/table/tbody/tr/td/table/tbody/tr/td/div/section/div[2]/div[2]/div[2]")
	static WebElement AZTest;

	@FindBy(xpath = ".//*[@id='layoutContainers']/div/table/tbody/tr/td/table/tbody/tr/td/div/section/div[2]/div[2]/div[2]/div/p/img")
	static WebElement Image1Test;

	@FindBy(xpath = ".//*[@id='table29']/tbody/tr/td[1]/p/img")
	static WebElement Image2Test;

	@FindBy(xpath = ".//*[@id='table28']/tbody/tr/td[1]/p/img")

	static WebElement Image3Test;

	@FindBy(xpath = ".//*[@id='table27']/tbody/tr/td[1]/p/img")

	static WebElement Image4Test;

	@FindBy(xpath = ".//*[@id='table26']/tbody/tr/td[1]/p/img")

	static WebElement Image5Test;

	@FindBy(xpath = ".//*[@id='table25']/tbody/tr/td[1]/p/img")

	static WebElement Image6Test;

	@FindBy(xpath = ".//*[@id='table24']/tbody/tr/td[1]/p/img")

	static WebElement Image7Test;

	@FindBy(xpath = ".//*[@id='table23']/tbody/tr/td[1]/p/img")

	static WebElement Image8Test;

	@FindBy(xpath = ".//*[@id='table22']/tbody/tr/td[1]/p/img")
	static WebElement Image9Test;

	@FindBy(xpath = ".//*[@id='table21']/tbody/tr/td[1]/p/img")
	static WebElement Image10Test;

	@FindBy(xpath = ".//*[@id='table20']/tbody/tr/td[1]/p/img")

	static WebElement Image11Test;

	@FindBy(xpath = ".//*[@id='table19']/tbody/tr/td[1]/p/img")

	static WebElement Image12Test;;

	@FindBy(xpath = ".//*[@id='table17']/tbody/tr/td[1]/p/img")

	static WebElement Image13Test;

	@FindBy(xpath = ".//*[@id='table16']/tbody/tr/td[1]/p/img")

	static WebElement Image14Test;

	@FindBy(xpath = ".//*[@id='table11']/tbody/tr/td[1]/p/img")

	static WebElement Image15Test;

	@FindBy(xpath = ".//*[@id='table15']/tbody/tr/td[1]/p/img")

	static WebElement Image16Test;

	@FindBy(xpath = ".//*[@id='table4']/tbody/tr/td[1]/p/img")

	static WebElement Image17Test;

	@FindBy(xpath = ".//*[@id='table18']/tbody/tr/td[1]/p/img")

	static WebElement Image18Test;

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

	public static void validateURL() {

		Logger log = Logger.getLogger("SuccessStories1");

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

		log.info("Total number of of links in  Prod are " + count);

		log.info("Total number of of Valid links in  Prod are " + counter_valid1);

		// image_check(Image1Prod);
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

		/*
		 * String content1=BodyProd.getText();
		 */

		driver.get(DataProviderFactory.getConfig().getApplicationUrl3() + "az/newsroom/stories/");

		Helper.capturescreenshot(driver, "SuccessStoriesAZ_Test");

		/*
		 * String content2=BodyTest.getText();
		 * 
		 * if (content1.contentEquals(content2)){
		 * log.info("Contents on both Env: are same"); }
		 * 
		 */

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

		for (int i = 0; i < (BreadCrumbTest_elements).size() ; i++) {

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

		Boolean value6 = Arrays.equals(ImageArray3Prod.toArray(), ImageArray3Test.toArray());

		try {

			if (value6 == true) {

				log.info("Image3 on both Env: are same");
			}

			if (value6 == false) {
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
