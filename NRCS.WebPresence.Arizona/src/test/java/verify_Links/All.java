package verify_Links;

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
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import utility.Helper;

public class All {

	static WebDriver driver;

	public All(WebDriver Idriver) {
		this.driver = Idriver;
	}

	// Test Elements


	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbTest;

	@FindBy(xpath = ".//*[@id='overview']")
	static WebElement INTest;


	public static void validateURL() throws IOException, InterruptedException {
		Logger log = Logger.getLogger("All");
		
		// Test Methods
		driver.get(DataProviderFactory.getConfig().getApplicationUrl3()
				+ DataProviderFactory.getExcel().getdata(0, 29, 1));
		Helper.capturescreenshot(driver, "FeaturesIN_Test");
		
		List<WebElement> subLinks_Test = INTest.findElements(By.tagName("a"));

		for (int k = 0; k <= subLinks_Test.size() - 1; k++) {

			List<WebElement> subLink_Test = INTest.findElements(By.tagName("a"));

			WebElement elementUrls = subLink_Test.get(k);
			 String hRef =null ;
				
				try{
					 hRef = elementUrls.getAttribute("href").toString();	
				}
				catch(Exception e){
					
					System.out.println("hRef null First Block");
				}
				
		try{
			if (!hRef.isEmpty())
					
			{
				if (!hRef.contains("FSE")){
						if (hRef.startsWith("http://ecm-test")){
							if (!hRef.startsWith("mailto"))
							driver.get(hRef);
						}
					}
				}
					
		}catch(Exception e){
			System.out.println("hRef is null");
		}
		Thread.sleep(10);
							String titleRedirect= driver.getTitle();
						if(titleRedirect.contentEquals("NRCS | NRCS") || titleRedirect.contentEquals("nrcs") ){
							log.info("Page with no Content " +hRef);
						}
						
						if(titleRedirect.contains("HTTP 404 Not Found")){
							
							log.info("Broken link " +hRef);
						}
						if(titleRedirect.toString().contains("This site isn’t secure")){
				
							log.info("Page Redirect is " +hRef);
							
							driver.get("javascript:document.getElementById('overridelink').click()");
							
							String title404 =driver.getTitle();
							
							if (title404.contains("HTTP 404 Not Found")){
								
								log.info("Broken Link : " +hRef);
							}
							
						}
			Thread.sleep(10000);

			driver.get(DataProviderFactory.getConfig().getApplicationUrl3()
					+ DataProviderFactory.getExcel().getdata(0, 29, 1));
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
	
			if (link_Test == null || link_Test.isEmpty()) {
			
				c3 = c3 + 1;
				continue;
			}

			if (link_Test.contains("@")) {
				c4 = c4 + 1;
				continue;
			}

			LinksArrayTest.add(link_Test);
			count1 = count1 + 1;

			try {

				URL url1 = new URL(link_Test);

				HttpURLConnection httpURLConnect = (HttpURLConnection) url1.openConnection();

				httpURLConnect.setConnectTimeout(3000);

				httpURLConnect.connect();

				if (httpURLConnect.getResponseCode() >= 400) {

					buildresponsesTest.append(link_Test + "__" + httpURLConnect.getResponseMessage() + "\n");
					 log.info(link_Test+"-"+httpURLConnect.getResponseMessage());

				} else {
					buildresponsesTest.append(link_Test + "__" + httpURLConnect.getResponseMessage() + "\n");
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
