package pages1.DD.Link;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.log4j.PropertyConfigurator;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

import factory.DataProviderFactory;
import junit.framework.Assert;
import utility.Helper;
import utility.imageComparison;

public class AboutUs1 {

	static WebDriver driver;

	public AboutUs1(WebDriver Idriver) {
		this.driver = Idriver;
	}
	// Prod Elements

	@FindBy(xpath = ".//*[@id='overview']/h2/a")
	static WebElement headingProd;

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbProd;
	
	@FindBy(xpath = ".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[1]/table/tbody")
	static WebElement LeftNavProd;

	@FindBy(xpath = ".//*[@id='selectedTree']/ul/li/a[2]")
	static List<WebElement> Table_MainelementsProd;

	@FindBy(xpath = ".//*[@id='selectedTree']/ul/li[3]/ul/li/a[2]")
	static List<WebElement> Table_SubElementsProd;

	// buttons Prod

	@FindBy(xpath = ".//*[@id='selectedTree']/ul/li[3]/div")
	static WebElement button1Prod;
	
	@FindBy(xpath = "//div[@class='left']")
	static WebElement LeftNavTest;

	@FindBy(xpath = ".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[3]/table/tbody/tr/td/table/tbody/tr/td")
	static WebElement INProd;

	// Test Elements

	@FindBy(css = ".right>h2>a")
	static WebElement headingTest;

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbTest;

	@FindBy(xpath = ".//*[@id='selectedTree']/ul/li/a")
	static List<WebElement> Table_MainelementsTest;

	@FindBy(xpath = ".//*[@id='63b0b6ad-120c-4782-b9a8-c3bbe03ec35e']/ul/li/a")
	static List<WebElement> Table_SubElementsTest;

	@FindBy(xpath =".//div[@class='hitarea expandable-hitarea']")
	static WebElement button1Test;

	@FindBy(xpath = ".//*[@id='layoutContainers']/div/table/tbody/tr/td/table/tbody/tr/td/div/section/div[2]/div[2]/div[2]")
	static WebElement INTest;

	// Comparison Arrays

	public static List<String> LinksArrayProd = null;

	public static List<String> LinksArrayTest = null;

	public static List<String> BreadCrumbArrayProd = null;

	public static List<String> BreadCrumbArrayTest = null;

	public static List<String> LeftMainArrayProd = null;

	public static List<String> LeftMainArrayTest = null;

	public static List<String> LeftSubMenuArrayProd = null;

	public static List<String> LeftSubMenuArrayTest = null;

	public static void validateProd() throws IOException, InterruptedException {

		String title1 = driver.getTitle();

	String LeftNavTextProd=LeftNavProd.getText().trim();

		String heading1 = headingProd.getText();

		Logger log = Logger.getLogger("AboutUs1");

		List<String> LeftMainArrayProd = new ArrayList<String>();

		List<WebElement> Left_MainMenuElementProd = Table_MainelementsProd;

		for (int i = 0; i <= Left_MainMenuElementProd.size() - 1; i++) {

			String text = Left_MainMenuElementProd.get(i).getText();

			LeftMainArrayProd.add(text);

		}

		/*
		 * log.info("Main menu elements are ");
		 * 
		 * log.info("Main menu elements are ");
		 * 
		 * 
		 * log.info(LeftMainArrayProd);
		 * 
		 * log.info("No of main menu elements "+LeftMainArrayProd.size());
		 * 
		 * 
		 * log.info("\t");
		 */

		button1Prod.click();

		String text1_subMenu_Prod = driver.findElement(By.linkText("Small & Limited and Beginning Farmers & Ranchers"))
				.getText();

		String text2_subMenu_Prod = driver.findElement(By.linkText("Tribal Assistance")).getText();

		String text3_subMenu_Prod = driver.findElement(By.linkText("Special Emphasis Programs")).getText();

		List<String> LeftSubMenuArrayProd = new ArrayList<String>();

		String text_SubMenu_Prod = text1_subMenu_Prod.concat(",").concat(text2_subMenu_Prod).concat(",")
				.concat(text3_subMenu_Prod);

		LeftSubMenuArrayProd.add(text_SubMenu_Prod);

		/*
		 * log.info("sub menu elements are;");
		 * 
		 * log.info(LeftSubMenuArrayProd);
		 */

		// log.info("No of sub menu elements " +LeftSubMenuArrayProd.size());

		List<String> BreadCrumbArrayProd = new ArrayList<String>();

		List<WebElement> BreadCrumbProd_elements = BreadCrumbProd.findElements(By.tagName("p"));

		for (int i = 0; i <= (BreadCrumbProd_elements).size() - 1; i++) {

			String text = BreadCrumbProd_elements.get(i).getText();

			String NewText = text.trim();

			BreadCrumbArrayProd.add(NewText);

		}

		log.info("The breadcrumb of Prod is " + BreadCrumbArrayProd);

		// log.info("\t");

		List<String> LinksArrayProd = new ArrayList<String>();

		List<WebElement> tableItems_Prod = INProd.findElements(By.tagName("a"));

		tableItems_Prod.addAll(INProd.findElements(By.tagName("img")));

		int count = 0;
		int c1 = 0;
		int c2 = 0;
		int counter_valid1 = 0;

		StringBuilder buildresponsesProd = new StringBuilder();

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
					// log.info(link_Prod+" -
					// "+httpURLConnect.getResponseMessage());

					buildresponsesProd.append(link_Prod + "--" + httpURLConnect.getResponseMessage() + "\n");

				} else {

					// log.info(link_Prod+"-"+httpURLConnect.getResponseMessage());

					buildresponsesProd.append(link_Prod + "--" + httpURLConnect.getResponseMessage() + "\n");

					if (httpURLConnect.getResponseMessage().contains("OK")) {

						counter_valid1 = counter_valid1 + 1;
					}
				}

			}

			catch (Exception e) {
				e.toString();
			}

		} /*
			 * log.info("No of emails are "+c2);
			 * 
			 * log.info("Total number of of links in Prod are "+count);
			 * 
			 * log.info("Total number of of Valid links in Prod are "
			 * +counter_valid1);
			 */

		// new code change ends

		// Test Methods

		driver.get(
				DataProviderFactory.getConfig().getApplicationUrl3() + DataProviderFactory.getExcel().getdata(0, 0, 1));

		Helper.capturescreenshot(driver, "AboutUsIN_Test");

		String heading2 = headingTest.getText();

		String title2 = driver.getTitle();

		
		 WebDriverWait wait = new WebDriverWait(driver, 100);
		
		 WebElement element =
		wait.until(ExpectedConditions.visibilityOf(LeftNavTest));
		
		String LeftNavTextTest=LeftNavTest.getText().trim();
		 

		log.info("Title of Prod is " + title1);

		log.info("\t");

		log.info("Title of Test is " + title2);
		log.info("\t");

		/*
		 * log.info("Heading of Prod is "+heading1); log.info("\t");
		 * 
		 * 
		 * 
		 * log.info("Heading of Test is " +heading2); log.info("\t");
		 */

		if (!(heading1.equals(heading2))) {

log.info("heading of both urls are  not same := "+ " Prod : " +heading1 + ", Test: " +heading2 );		}
		
		
		


		/*
		 * log.info("heading of both urls are same");
		 * 
		 * }else{ log.info("heading of both urls are  not same");
		 * 
		 * 
		 * }
		 * 
		 */
		// log.info("\t");

		if (!(title1.equals(title2))) {

			/*
			 * log.info("Titles of both URLs are same"); }else{
			 */
			log.info("Titles of both URLs are not same");

		}

		log.info("\t");

		if(!(LeftNavTextProd.equals(LeftNavTextTest))){
		log.info("Left Navigation Text : Prod and Test doesn't match");
		 log.info("LeftNavText in Prod Is");
		  log.info(LeftNavTextProd);
		log.info("LeftNavText in Test Is");
		log.info(LeftNavTextTest);
		
		  }
		  
		 

		List<String> LeftMainArrayTest = new ArrayList<String>();

		List<WebElement> Left_MainMenuElementTest = Table_MainelementsTest;

		for (int i = 0; i <= Left_MainMenuElementTest.size() - 1; i++) {

			String text = Left_MainMenuElementTest.get(i).getText();

			LeftMainArrayTest.add(text);

		}

		/*
		 * log.info("main menu elements are;");
		 * 
		 * log.info(LeftMainArrayTest);
		 * 
		 * log.info("No of main menu elements in  "+LeftMainArrayTest.size());
		 * 
		 * log.info("\t");
		 */
		button1Test.click();

		String text1_subMenu_Test = driver.findElement(By.linkText("Small & Limited and Beginning Farmers & Ranchers"))
				.getText();

		String text2_subMenu_Test = driver.findElement(By.linkText("Tribal Assistance")).getText();

		String text3_subMenu_Test = driver.findElement(By.linkText("Special Emphasis Programs")).getText();

		List<String> LeftSubMenuArrayTest = new ArrayList<String>();

		String text_SubMenu_Test = text1_subMenu_Test.concat(",").concat(text2_subMenu_Test).concat(",")
				.concat(text3_subMenu_Test);

		LeftSubMenuArrayTest.add(text_SubMenu_Test);

		/*
		 * log.info("sub menu elements are;");
		 * 
		 * log.info(LeftSubMenuArrayTest);
		 */

		Boolean value = Arrays.equals(LeftMainArrayProd.toArray(), LeftMainArrayTest.toArray());

		try {
			if (!value == true)

			{

				/*
				 * log.info("Left menu items on both Env: are same"); }else{
				 */

				log.info("Left menu  items on both Env: are Not same");

			}
		} catch (Exception e) {

			log.info(e.toString());
		}

		Boolean value1 = Arrays.equals(LeftSubMenuArrayProd.toArray(), LeftSubMenuArrayProd.toArray());

		if (!value1 == true) {

			/*
			 * log.info("Left menu sub items on both Env: are same"); }else{
			 */
			log.info("Left menu sub items on both Env: are  Not same");

		}

		List<String> BreadCrumbArrayTest = new ArrayList<String>();

		List<WebElement> BreadCrumbTest_elements = BreadCrumbTest.findElements(By.tagName("p"));

		for (int i = 0; i <= (BreadCrumbTest_elements).size() - 1; i++) {

			String text = BreadCrumbTest_elements.get(i).getText();

			String NewText = text.trim();

			BreadCrumbArrayTest.add(NewText);

		}

		/*
		 * log.info("The breadcrumb of Test is " +BreadCrumbArrayTest);
		 */
		log.info("\t");

		Boolean value2 = Arrays.equals(BreadCrumbArrayTest.toArray(), BreadCrumbArrayProd.toArray());

		try {

			if (!value2 == true) {

				/*
				 * log.info("Breadcrumb on both Env: are same"); }
				 * 
				 * 
				 * if(value2==false){
				 */
				log.info("Breadcrumb of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

		log.info("\t");

		List<WebElement> subLinks_Test = INTest.findElements(By.tagName("a"));

		//subLinks_Test.addAll(INTest.findElements(By.tagName("img")));


		for (int k = 0; k <= subLinks_Test.size() - 1; k++) {
			
			
			List<WebElement> subLink_Test = INTest.findElements(By.tagName("a"));

			//subLink_Test.addAll(INTest.findElements(By.tagName("img")));

			WebElement elementUrls = subLink_Test.get(k);
			
			//log.info("elements in links are "+elementUrls);
			

			String hRef = elementUrls.getAttribute("href").toString();
			
			
			//log.info("inside href are " +hRef);
			
		if(!hRef.isEmpty()){
			//log.info("inside if condn " +hRef);

			if (hRef.startsWith("http://ecm-test")){
				
			if (!hRef.contains(".pdf")) {
				
				driver.get(hRef);
				
			}
		}
		}
		List<String> BreadCrumbArrayLinkProd = new ArrayList<String>();

		List<WebElement> BreadCrumbLinkProd_elements = BreadCrumbTest.findElements(By.tagName("p"));

		for (int i = 0; i <= (BreadCrumbLinkProd_elements).size() - 1; i++) {

			String text = BreadCrumbLinkProd_elements.get(i).getText();
			
			String NewText = text.trim();

			BreadCrumbArrayLinkProd.add(NewText);
			
		}
	//log.info("Inside Breadcrumb of link is " +BreadCrumbArrayLinkProd);
	

	String  breadCrumbLink = BreadCrumbArrayLinkProd.get(2);
	
	if(breadCrumbLink.contains("Home")){
String uRL =driver.getCurrentUrl();
log.info("Page with No Content  is " +uRL);
	}
	
		Thread.sleep(10000);
		driver.get(
				DataProviderFactory.getConfig().getApplicationUrl3() + DataProviderFactory.getExcel().getdata(0, 0, 1));
		}


		List<String> LinksArrayTest = new ArrayList<String>();

		List<WebElement> tableItems_Test = INTest.findElements(By.tagName("a"));

		tableItems_Test.addAll(INTest.findElements(By.tagName("img")));

		int count1 = 0;
		int c3 = 0;
		int c4 = 0;
		int counter_valid2 = 0;

		StringBuilder buildresponsesTest = new StringBuilder();

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

					buildresponsesTest.append(link_Test + "--" + httpURLConnect.getResponseMessage() + "\n");

					// log.info(link_Test+" -
					// "+httpURLConnect.getResponseMessage());

				} else {

					// log.info(link_Test+"-"+httpURLConnect.getResponseMessage());

					buildresponsesTest.append(link_Test + "--" + httpURLConnect.getResponseMessage() + "\n");

					if (httpURLConnect.getResponseMessage().contains("OK")) {

						counter_valid2 = counter_valid2 + 1;
					}
				}

			}

			catch (Exception e) {
				e.toString();
			}

		}

		/*
		 * log.info("No of links in Test are "+count1);
		 * 
		 * //log.info("No of links with href null Test are "+c3);
		 * 
		 * 
		 * log.info("No of email  links in Test are "+c4);
		 * 
		 * 
		 * 
		 * log.info("Total number of of Valid links in Test are "+counter_valid2
		 * );
		 */

		// log.info(LinksArrayTest);

		log.info("\t");

		try {
			if (!(count == count1)) {
				/*
				 * log.
				 * info("Both Env: has got same number of internal and external links"
				 * ); }
				 * 
				 * else{
				 */
				log.info("No of links doesnt match in both Env:");
				log.info("Total number of of links in Prod are " + count);
				log.info("Total number of of links in Test are " + count1);

				log.info(buildresponsesProd);
				log.info(buildresponsesTest);

			}

		} catch (Exception e) {

			log.info(e.getMessage());
		}

		try {
			if (!(counter_valid1 == counter_valid2)) {
				/*
				 * log.info("Both Env: has got same number of valid links"); }
				 * 
				 * else{
				 */

				log.info("No of valid links doesnt match in both env:");

				log.info("Total number of of Valid links in Prod are " + counter_valid1);
				log.info("Total number of of Valid links in Test are " + counter_valid2);
				log.info(buildresponsesProd);
				log.info(buildresponsesTest);

			}

		} catch (Exception e) {

			log.info(e.getMessage());
		}

		try {
			if (!(c2 == c4)) {/*
								 * 
								 * log.
								 * info("Both Env: has got same number of email links"
								 * ); }
								 * 
								 * else{
								 */

				log.info("No of email links does not match in both Env:");
				log.info("No of email links " + c2);
				log.info("No of email links " + c4);

			}

		} catch (Exception e) {

			log.info(e.getMessage());
		}

	}

}
