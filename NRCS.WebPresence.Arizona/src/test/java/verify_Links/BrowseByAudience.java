package verify_Links;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

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

public class BrowseByAudience {

	static WebDriver driver;

	public BrowseByAudience(WebDriver Idriver) {
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
	
	
	@FindBy(xpath=".//*[@id='additional_links']/ul/li[1]/a")
	static WebElement BrowseTest;
	
	@FindBy(xpath=".//*[@id='layoutContainers']/div/table/tbody/tr/td/table/tbody/tr/td/div/section/div[2]/div[2]")
	static WebElement INTest;
	
	
	
	@FindBy(xpath=".//*[@id='overview']/div/table/tbody/tr/td/table/tbody/tr/td/div/section/div[2]/div[2]")
	static WebElement ErrorTest;
	
	

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbTest;

	@FindBy(xpath = ".//*[@id='selectedTree']/ul/li/a")
	static List<WebElement> Table_MainelementsTest;

	@FindBy(xpath = ".//*[@id='63b0b6ad-120c-4782-b9a8-c3bbe03ec35e']/ul/li/a")
	static List<WebElement> Table_SubElementsTest;

	@FindBy(xpath =".//div[@class='hitarea expandable-hitarea']")
	static WebElement button1Test;



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

		Logger log = Logger.getLogger("BrowseByAudience");


		driver.get(
				DataProviderFactory.getConfig().getApplicationUrl3() + DataProviderFactory.getExcel().getdata(0, 0, 1));


		BrowseTest.click();

		List<WebElement> subLinks_Test = INTest.findElements(By.tagName("a"));

		//subLinks_Test.addAll(INTest.findElements(By.tagName("img")));


		for (int k = 0; k <= subLinks_Test.size() - 1; k++) {
			
			
			List<WebElement> subLink_Test = INTest.findElements(By.tagName("a"));

			//subLink_Test.addAll(INTest.findElements(By.tagName("img")));

			WebElement elementUrls = subLink_Test.get(k);
			
			//log.info("elements in links are "+elementUrls);
			

			String hRef = elementUrls.getAttribute("href").toString();
			
			
			//log.info("inside href are " +hRef);
			
			
			
			
			if (!hRef.isEmpty()) {

				/*if (!hRef.contains("FSE"))*/ //{

					//if (hRef.startsWith("http://ecm-test"))
				if (!hRef.contains("FSE")){
				if (!hRef.startsWith("mailto"))

						driver.get(hRef);
					
				//}
					
					Thread.sleep(10);
					 
					String titleRedirect= driver.getTitle();
					
					if(  titleRedirect.contains("NRCS | NRCS") || titleRedirect.contains("nrcs") ){
						
						log.info("Page with no Content " +hRef);

						
					}
					
					//log.info(titleRedirect);
					
					if(titleRedirect.contains("HTTP 404 Not Found")){
						
						log.info("Broken link " +hRef);
					}
					
					
					//log.info("title is " +titleRedirect);
					
					
					if(titleRedirect.toString().contains("This site isn’t secure")){
						
						log.info("Page Redirect is " +hRef);
						
						driver.get("javascript:document.getElementById('overridelink').click()");
						
						String title404 =driver.getTitle();
						
						if (title404.contains("HTTP 404 Not Found")){
							
							log.info("Broken Link : " +hRef);
						}
						
					}
				}
			}
			
			
			
	/*		
		if(!hRef.isEmpty()){
			//log.info("inside if condn " +hRef);

			if (hRef.startsWith("http://ecm-test")){
				
			if (!hRef.contains(".pdf")) {
				
				driver.get(hRef);
				
			}
		}
		}
		
		String content = INTest.getText();
		
		if(content.contains("Content not available")){
			
			log.info("Page with No content is " +hRef);
			
			
			if(content.contains("The page cannot be found")){
				log.info("Page with No content is " +hRef); 
				
				return;
			}
		}*/
		driver.get("http://ecm-test.nrcs.usda.gov/wps/portal/nrcs/az/browseaudience");
		}

		
		
		/*
		WebDriverWait wait = new WebDriverWait(driver,10);
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='traversed']")));
		
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
		driver.get("http://ecm-test.nrcs.usda.gov/wps/portal/nrcs/az/browseaudience");
		}*/

		
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
					
					//log.info(buildresponsesTest);


				 log.info(link_Test+"_"+httpURLConnect.getResponseMessage());

				} else {

					// log.info(link_Test+"-"+httpURLConnect.getResponseMessage());

					buildresponsesTest.append(link_Test + "--" + httpURLConnect.getResponseMessage() + "\n");

					 log.info(link_Test+"_"+httpURLConnect.getResponseMessage());


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
