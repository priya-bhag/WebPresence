package page_demo;

import java.io.IOException;
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

	/*
	 * @FindBy(xpath=
	 * ".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[1]/table/tbody/tr[6]/td/table/tbody/tr/td/div")
	 * static WebElement Table2_HeaderProd;
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath=
	 * ".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[1]/table/tbody/tr[6]/td/table/tbody/tr/td/div/ul/li/a")
	 * static List<WebElement> Table2_ElementsProd;
	 */

	// Test Elements

	@FindBy(xpath = ".//*[@id='layoutContainers']/div/table/tbody/tr/td/table/tbody/tr/td/div/section/div[2]/div[2]/div[2]/h2/a")
	static WebElement headingTest;

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbTest;

	@FindBy(xpath = ".//*[@id='layoutContainers']")
	static WebElement INTest;

	@FindBy(xpath = ".//*[@id='selectedTree']/ul/li/a")
	static List<WebElement> Table_MainelementsTest;

	/*
	 * @FindBy(xpath=
	 * ".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[1]/table/tbody/tr[6]/td/table/tbody/tr/td/div")
	 * static WebElement Table2_HeaderTest;
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath=
	 * ".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[1]/table/tbody/tr[6]/td/table/tbody/tr/td/div/ul/li/a")
	 * static List<WebElement> Table2_ElementsTest;
	 */

	// Comparison Arrays

	public static List<String> LinksArrayProd = null;

	public static List<String> LinksArrayTest = null;

	public static List<String> BreadCrumbArrayProd = null;

	public static List<String> BreadCrumbArrayTest = null;

	public static List<String> LeftMainArrayProd = null;

	public static List<String> LeftMainArrayTest = null;

	public static List<String> LeftTable2ArrayProd = null;

	public static List<String> LeftTable2ArrayTest = null;

	public static void validateProd() throws IOException, InterruptedException {

		Logger log = Logger.getLogger("ContactUs1");
		
		

			Thread.sleep(10000);

			driver.get(DataProviderFactory.getConfig().getApplicationUrl3()
					+ DataProviderFactory.getExcel().getdata(0, 15, 1));


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
						
						 log.info(link_Test+"-"+httpURLConnect.getResponseMessage());


					} else {


						buildresponsesTest.append(link_Test + "--" + httpURLConnect.getResponseMessage() + "\n");
						 log.info(link_Test+"-"+httpURLConnect.getResponseMessage());

						if (httpURLConnect.getResponseMessage().contains("OK")) {

							counter_valid2 = counter_valid2 + 1;
						}
					}

				}

				catch (Exception e) {
					e.toString();
				}

			}



		}

	}
		
