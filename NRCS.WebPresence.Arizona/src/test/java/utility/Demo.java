package utility;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo {

	WebDriver driver;
	String homePage = "https://www.nrcs.usda.gov/wps/portal/nrcs/main/az/people/volunteers/";
	static WebElement element1;
	static List<WebElement> tableItems_URL2;
	static String URL2;

	@Test

	public void test() {

		driver = new FirefoxDriver();

		driver.get("https://www.nrcs.usda.gov/wps/portal/nrcs/main/az/snow/waterproducts/");

		WebElement BodyURL2 = driver.findElement(By.xpath(
				".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[3]/table/tbody/tr/td/table/tbody/tr/td"));

		// driver.get("https://www.nrcs.usda.gov/wps/portal/nrcs/main/az/people/volunteers/");

		List<WebElement> tableItems_URL2 = BodyURL2.findElements(By.tagName("a"));

		tableItems_URL2.addAll(BodyURL2.findElements(By.tagName("img")));

		for (int j = 0; j <= tableItems_URL2.size() - 1; j++)

		{
			String linkText = tableItems_URL2.get(j).getText();

			// System.out.println("The links present are" +linkText);
		}

		int count1 = 0;
		int c = 0;
		int c2 = 0;
		int v = 0;

		for (int j = 0; j <= tableItems_URL2.size() - 1; j++) {

			WebElement element1 = tableItems_URL2.get(j);

			String URL2 = element1.getAttribute("href");

			// System.out.println("url2 is"+URL2);
			if (URL2 == null || URL2.isEmpty()) {

				c2 = c2 + 1;

				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}
			if (URL2.contains("@")) {
				c = c + 1;

				System.out.println("Link is an email");
				continue;

			}
			if (!URL2.contains("https")) {
				c = c + 1;

				System.out.println("Link is an email");
				continue;

			}
			count1 = count1 + 1;

			System.out.println("url2 is " + URL2);

			// Find_brokenLinks.verifyLinkActive(URL2);

			// System.out.println("\t");
			//
			// System.out.println("No of emails are "+c);

			System.out.println("No of links in URL2 are " + count1);

			// System.out.println("Number of URL is either not configured for
			// anchor tag or it is empty are " +c2);*/

			try {

				URL url = new URL(URL2);

				HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

				// System.out.println( (HttpURLConnection)url.openConnection());

				httpURLConnect.setConnectTimeout(3000);

				httpURLConnect.connect();
				System.out.println(httpURLConnect.getResponseCode());

				if (httpURLConnect.getResponseCode() >= 400) {
					System.out.println(URL2 + " - " + httpURLConnect.getResponseMessage() + " - "
							+ HttpURLConnection.HTTP_NOT_FOUND);

				} else {

					System.out.println(URL2 + " - " + httpURLConnect.getResponseMessage());

					if (httpURLConnect.getResponseMessage().contains("OK")) {
						v = v + 1;
					}

				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		System.out.println("NUMBER OF VALID links" + v);

		System.out.println("no of broken links are" + (count1 - v));

	}
}