package pages.LeftNav;


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


public class A_Z_Index {
	
	static WebDriver driver;

	public A_Z_Index(WebDriver Idriver) {
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
	
	
	@FindBy(xpath = ".//*[@id='additional_links']/ul/li[3]/a")
	static WebElement AZindexTest;
	
	@FindBy(xpath = ".//*[@id='siteNavigation']/ul/li/a")
	static List<WebElement>AZindexLinksTest;
	


	@FindBy(xpath = ".//*[@id='selectedTree']/ul/li/a")
	static List<WebElement> Table_MainelementsTest;

	@FindBy(xpath = ".//*[@id='63b0b6ad-120c-4782-b9a8-c3bbe03ec35e']/ul/li/a")
	static List<WebElement> Table_SubElementsTest;

	@FindBy(xpath =".//div[@class='hitarea expandable-hitarea']")
	static WebElement button1Test;

	@FindBy(xpath = ".//*[@id='overview']")
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
		

		Logger log = Logger.getLogger("A_Z_Index");


		driver.get(
				DataProviderFactory.getConfig().getApplicationUrl3() + DataProviderFactory.getExcel().getdata(0, 0, 1));

		
		
		
		Thread.sleep(1000);
		
		AZindexTest.click();
		
		
		
		StringBuilder buildresponsesTest = new StringBuilder();

		

		for (int k = 0; k <= AZindexLinksTest.size() - 1; k++){
			
		
			WebElement elementUrls = AZindexLinksTest.get(k);
			
			String link_Test = elementUrls.getAttribute("href");

		try {

			URL url1 = new URL(link_Test);

			HttpURLConnection httpURLConnect = (HttpURLConnection) url1.openConnection();

			httpURLConnect.setConnectTimeout(3000);

			httpURLConnect.connect();

			if (httpURLConnect.getResponseCode() >= 400) {

				buildresponsesTest.append(link_Test + "--" + httpURLConnect.getResponseMessage() + "\n");
				 log.info(link_Test+"-"+httpURLConnect.getResponseMessage());

				// log.info(link_Test+" -
				// "+httpURLConnect.getResponseMessage());

			} else if(httpURLConnect.getResponseCode()==200) {


				buildresponsesTest.append(link_Test + "--" + httpURLConnect.getResponseMessage() + "\n");

				 log.info(link_Test+"-"+httpURLConnect.getResponseMessage());

				if (httpURLConnect.getResponseMessage().contains("OK")) {
				}
			}
			else{
				
				buildresponsesTest.append(link_Test + "--" + httpURLConnect.getResponseMessage() + "\n");

			}

		}

		catch (Exception e) {
			e.toString();
		}

	}
		
	}

}
