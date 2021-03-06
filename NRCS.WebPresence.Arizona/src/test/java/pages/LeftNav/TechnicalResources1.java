package pages.LeftNav;

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

	@FindBy(xpath = ".//*[@id='overview']/div/table/tbody/tr/td/table/tbody/tr/td/div/section/div[2]/div[2]/div[2]/h2/a")
	static WebElement headingTest;

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbTest;

	@FindBy(xpath = ".//*[@id='tree']/li/ul/li/a[2]")
	static List<WebElement> Table_MainelementsTest;

	@FindBy(xpath = ".//*[@id='tree']/li/ul/li/ul/li/a[2]")
	static List<WebElement> Table_SubElementsTest;

	@FindBy(xpath =".//*[@id='layoutContainers']/div/table/tbody/tr/td/table/tbody/tr/td/div/section/div[2]/div[2]/div[1]")
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

	@FindBy(xpath = ".//*[@id='firstElement']/ul/li[2]/div")
	static WebElement button2Test;

	@FindBy(xpath = ".//*[@id='firstElement']/ul/li[3]/div")
	static WebElement button3Test;

	@FindBy(xpath = ".//*[@id='firstElement']/ul/li[5]/div")
	static WebElement button4Test;

	@FindBy(xpath = ".//*[@id='firstElement']/ul/li[6]/div")
	static WebElement button5Test;

	public static void validateProd() throws IOException, InterruptedException {

		Logger log = Logger.getLogger("TechnicalResources1");

		
		// Test Methods

		driver.get(DataProviderFactory.getConfig().getApplicationUrl3()
				+ DataProviderFactory.getExcel().getdata(0, 76, 1));

		Helper.capturescreenshot(driver, "TechnicalResourcesIN_Test");

		List<WebElement> subLinks_Test = INTest.findElements(By.tagName("a"));

		for (int k = 0; k <= subLinks_Test.size() - 1; k++) {

			List<WebElement> subLink_Test = INTest.findElements(By.tagName("a"));

			WebElement elementUrls = subLink_Test.get(k);

String hRef =null ;
			
			try{
				 hRef = elementUrls.getAttribute("href").toString();	
			}
			catch(Exception e){
				
				System.out.println("hRef null");
			}
			
			
			//log.info("inside href are " +hRef);
			
	
			if (!hRef.isEmpty())

			{
				
				
				if (!hRef.contains("FSE")){

					if (hRef.startsWith("http://ecm-test")){
						
						if (!hRef.startsWith("mailto"))


						driver.get(hRef);
					
			
					}
				}
			}
					
					Thread.sleep(10);
					 
					String titleRedirect= driver.getTitle();
					String text =INTest.getText();
					if(text.contains("Page Not Found")){
						log.info("Page Not Found : Content not available " + " On Page " +hRef);
					}
					if(titleRedirect.contentEquals("NRCS | NRCS") || titleRedirect.contentEquals("nrcs") ){
						
						log.info("Page with no Content " +hRef);

						
					}
					
					//log.info(titleRedirect);
					
					if(titleRedirect.contains("HTTP 404 Not Found")){
						
						log.info("Broken link " +hRef);
					}
					
					
					//log.info("title is " +titleRedirect);
					
					
					if(titleRedirect.toString().contains("This site isn�t secure")){
						
						log.info("Page Redirect is " +hRef);
						
						driver.get("javascript:document.getElementById('overridelink').click()");
						
						String title404 =driver.getTitle();
						
						if (title404.contains("HTTP 404 Not Found")){
							
							log.info("Broken Link : " +hRef);
						}
						
					}
			Thread.sleep(10000);


			driver.get(DataProviderFactory.getConfig().getApplicationUrl3()
					+ DataProviderFactory.getExcel().getdata(0, 76, 1));


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

					buildresponsesTest.append(link_Test + "__" + httpURLConnect.getResponseMessage() + "\n");

					// log.info(link_Test+" -
					// "+httpURLConnect.getResponseMessage());
					 log.info(link_Test+"-"+httpURLConnect.getResponseMessage());

				} else {

					// log.info(link_Test+"-"+httpURLConnect.getResponseMessage());

					buildresponsesTest.append(link_Test + "__" + httpURLConnect.getResponseMessage() + "\n");

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
