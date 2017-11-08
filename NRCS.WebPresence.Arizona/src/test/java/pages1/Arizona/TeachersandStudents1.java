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

public class TeachersandStudents1 {

	static Logger log = Logger.getLogger("TeachersandStudents1");
	static WebDriver driver;

	public TeachersandStudents1(WebDriver Idriver) {
		this.driver = Idriver;
	}

	// Prod Elements

	@FindBy(xpath = ".//*[@id='overview']/h2/a")
	static WebElement headingProd;

	@FindBy(xpath = ".//*[@id='anch_115']/div/img")
	static WebElement Image1Prod;

	@FindBy(xpath = ".//*[@id='overview']/table/tbody/tr[2]/td[2]/div/img")
	static WebElement Image2Prod;

	@FindBy(xpath = ".//*[@id='anch_121']/div/img")

	static WebElement Image3Prod;

	@FindBy(xpath = ".//*[@id='overview']/table/tbody/tr[5]/td[2]/div/img")

	static WebElement Image4Prod;

	@FindBy(xpath = ".//*[@id='overview']/table/tbody/tr[6]/td[2]/div/img")

	static WebElement Image5Prod;

	@FindBy(xpath = ".//*[@id='overview']/table/tbody/tr[7]/td[2]/div/img")

	static WebElement Image6Prod;

	@FindBy(xpath = ".//*[@id='overview']/table/tbody/tr[8]/td[2]/div/img")

	static WebElement Image7Prod;

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbProd;

	@FindBy(xpath = ".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[3]/table/tbody/tr/td/table/tbody/tr/td")
	static WebElement AZProd;

	// Test Elements

	@FindBy(xpath = ".//*[@id='layoutContainers']/div/table/tbody/tr/td/table/tbody/tr/td/div/section/div[2]/div[2]/div[2]/h2/a")
	static WebElement headingTest;

	@FindBy(xpath = ".//*[@id='anch_115']/img")
	static WebElement Image1Test;

	@FindBy(xpath = ".//*[@id='overview']/table/tbody/tr[2]/td[2]/img")
	static WebElement Image2Test;

	@FindBy(xpath = ".//*[@id='anch_121']/img")

	static WebElement Image3Test;

	@FindBy(xpath = ".//*[@id='overview']/table/tbody/tr[5]/td[2]/img")

	static WebElement Image4Test;

	@FindBy(xpath = ".//*[@id='overview']/table/tbody/tr[6]/td[2]/img")

	static WebElement Image5Test;

	@FindBy(xpath = ".//*[@id='overview']/table/tbody/tr[7]/td[2]/img")

	static WebElement Image6Test;

	@FindBy(xpath = ".//*[@id='overview']/table/tbody/tr[8]/td[2]/img")

	static WebElement Image7Test;
	
	
	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbTest;

	@FindBy(xpath = ".//*[@id='layoutContainers']/div/table/tbody/tr/td/table/tbody/tr/td/div/section/div[2]/div[2]/div[2]")
	static WebElement AZTest;

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

	public static void validateURL() {

		Logger log = Logger.getLogger("TeachersandStudents1");

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

		// log.info("first url arrays are "+LinksArrayProd);

		/*
		 * 
		 * String contentProd =BodyProd.getText();
		 * 
		 * log.info("The contents in Prod are " +contentProd); log.info("\t");
		 * 
		 */

		ImageArray1Prod = image_check(Image1Prod);

		ImageArray2Prod = image_check(Image2Prod);

		ImageArray3Prod = image_check(Image3Prod);

		ImageArray4Prod = image_check(Image4Prod);

		ImageArray5Prod = image_check(Image5Prod);

		ImageArray6Prod = image_check(Image6Prod);

		ImageArray7Prod = image_check(Image7Prod);

		// Test Methods

		driver.get(DataProviderFactory.getConfig().getApplicationUrl3() + "az/people/teachers/");

		Helper.capturescreenshot(driver, "TeachersAndStudentsAZ_Test");

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

		ImageArray1Test = image_check(Image1Test);

		ImageArray2Test = image_check(Image2Test);

		ImageArray3Test = image_check(Image3Test);

		ImageArray4Test = image_check(Image4Test);

		ImageArray5Test = image_check(Image5Test);

		ImageArray6Test = image_check(Image6Test);

		ImageArray7Test = image_check(Image7Test);

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
