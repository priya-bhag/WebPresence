package pages1.Arizona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.DataProviderFactory;
import utility.Helper;

public class WatershedOperations1 {

	static WebDriver driver;

	public WatershedOperations1(WebDriver Idriver) {
		this.driver = Idriver;
	}

	// Prod Elements

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbProd;

	// Test Elements

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbTest;

	// Arrays Comaparison

	public static List<String> BreadCrumbArrayProd = null;

	public static List<String> BreadCrumbArrayTest = null;

	public static void validateURL() {

		Logger log = Logger.getLogger("WatershedOperations1");

		String title1 = driver.getTitle();

		List<String> BreadCrumbArrayProd = new ArrayList<String>();

		List<WebElement> BreadCrumbProd_elements = BreadCrumbProd.findElements(By.tagName("p"));

		for (int i = 0; i < (BreadCrumbProd_elements).size() ; i++) {

			String text = BreadCrumbProd_elements.get(i).getText();

			String NewText = text.trim();

			BreadCrumbArrayProd.add(NewText);
		}

		log.info(BreadCrumbArrayProd);

		// driver.get(DataProviderFactory.getConfig().getApplicationTest()+"az/technical/ecoscience/agronomy");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl3() + "az/programs/planning/wo/");

		Helper.capturescreenshot(driver, "WatershedOperationsAZ_Test");

		List<String> BreadCrumbArrayTest = new ArrayList<String>();

		List<WebElement> BreadCrumb_itemsTest = BreadCrumbTest.findElements(By.tagName("p"));

		for (int j = 0; j < BreadCrumb_itemsTest.size() ; j++) {

			// System.out.print(BreadCrumb_itemsTest.get(j).getText());

			String text = (BreadCrumb_itemsTest.get(j).getText());

			String NewText = text.trim();
			BreadCrumbArrayTest.add(NewText);

		}

		log.info(BreadCrumbArrayTest);

		String title2 = driver.getTitle();

		log.info("Title of Prod is " + title1);
		log.info("Title of Test is " + title2);

		if (title1.equals(title2)) {
			log.info("Both titles are equal");
		}

		log.info("\t");
		/*
		 * log.info("inside compare method1"+BreadCrumbArrayProd);
		 * 
		 * log.info("inside compare method2"+BreadCrumbArrayTest);
		 */
		Boolean value2 = Arrays.equals(BreadCrumbArrayTest.toArray(), BreadCrumbArrayProd.toArray());

		try {

			if (value2) {

				log.info("Breadcrumb on both Env: are same");
			}

			else {

				log.info("Breadcrumb of both Env: are not same ");
			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());
		}

	}
}
