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

public class People1 {

	static WebDriver driver;

	public People1(WebDriver Idriver) {

		this.driver = Idriver;
	}

	// Prod Elements

	static String title1;

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbProd;

	@FindBy(xpath = ".//*[@id='selectedTree']/ul/li/a[2]")
	static List<WebElement> Table_MainelementsProd;

	// Test Elements

	String title2;

	@FindBy(id = "traversed")
	static WebElement BreadCrumbTest;

	@FindBy(xpath = ".//*[@id='selectedTree']/ul/li/a[2]")
	static List<WebElement> Table_MainelementsTest;

	// Arrays Comaparison

	public static List<String> BreadCrumbArrayProd = null;

	public static List<String> BreadCrumbArrayTest = null;

	public static List<String> LeftMainArrayProd = null;

	public static List<String> LeftMainArrayTest = null;

	public static void validateURL() {

		Logger log = Logger.getLogger("People1");

		title1 = driver.getTitle();

		List<String> BreadCrumbArrayProd = new ArrayList<String>();

		List<WebElement> BreadCrumbProd_elements = BreadCrumbProd.findElements(By.tagName("p"));

		for (int i = 0; i < (BreadCrumbProd_elements).size() ; i++) {

			String text = BreadCrumbProd_elements.get(i).getText();

			String NewText = text.trim();

			BreadCrumbArrayProd.add(NewText);

		}

		log.info("The breadcrumb of Prod is " + BreadCrumbArrayProd);

		log.info("\t");

		List<String> LeftMainArrayProd = new ArrayList<String>();

		List<WebElement> Left_MainMenuElementProd = Table_MainelementsProd;

		for (int i = 0; i < Left_MainMenuElementProd.size() ; i++) {

			String text = Left_MainMenuElementProd.get(i).getText();
			String NewText = text.trim();

			LeftMainArrayProd.add(NewText);

		}

		log.info("Main menu elements in Prod are ");

		log.info(LeftMainArrayProd);

		log.info("No of main menu elements in Prod " + LeftMainArrayProd.size());

		// Test Methods

		driver.get(DataProviderFactory.getConfig().getApplicationUrl3() + "az/people/");

		Helper.capturescreenshot(driver, "PeopleAZ_Test");

		String title2 = driver.getTitle();

		log.info("Title of Prod is " + title1);

		log.info("\t");

		log.info("Title of Test is " + title2);
		log.info("\t");

		if (title1.equals(title2)) {

			log.info("Titles of both Env: are same");
		}

		log.info("\t");

		List<String> LeftMainArrayTest = new ArrayList<String>();

		List<WebElement> Left_MainMenuElementTest = Table_MainelementsTest;

		for (int i = 0; i < Left_MainMenuElementTest.size() ; i++) {

			String text = Left_MainMenuElementTest.get(i).getText();
			String newText = text.trim();

			LeftMainArrayTest.add(newText);

		}

		log.info("main menu elements in Test are;");

		log.info(LeftMainArrayTest);

		log.info("No of main menu elements in Test are  " + LeftMainArrayTest.size());

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

		Boolean value = Arrays.equals(LeftMainArrayProd.toArray(), LeftMainArrayTest.toArray());

		try {
			if (value == true)

			{

				log.info("Left menu items on both Env: are same");
			} else {

				log.info("Left menu items on both Env are not same");
			}
		} catch (Exception e) {

			e.toString();
		}

		Boolean value2 = Arrays.equals(BreadCrumbArrayTest.toArray(), BreadCrumbArrayProd.toArray());

		try {

			if (value2 == true) {

				log.info("Breadcrumb  on both Env: are same");
			}

			if (value2 == false) {
				log.info("Breadcrumb of both Env: are not same");

			}

		} catch (Exception e) {

			log.info("The exception is " + e.getMessage());

		}

	}

}
