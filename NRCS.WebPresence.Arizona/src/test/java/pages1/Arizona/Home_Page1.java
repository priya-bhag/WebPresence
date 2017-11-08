package pages1.Arizona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import factory.DataProviderFactory;
import junit.framework.Assert;
import utility.Helper;

public class Home_Page1 {

	static WebDriver driver;

	public Home_Page1(WebDriver Idriver)

	{

		this.driver = Idriver;

	}

	// Elements in Prod

	@FindBy(xpath = ".//*[@id='nav']/li[2]/a")
	public static WebElement TopicsLinkProd;

	@FindBy(xpath = ".//*[@id='nav']/li[4]/a")
	static WebElement ProgramsLinkProd;

	@FindBy(xpath = ".//*[@id='nav']/li[6]/a")
	static WebElement NewsRoomLinkProd;

	@FindBy(xpath = ".//*[@id='nav']/li[8]/a")
	static WebElement ContactUsProd;

	// Arrays

	public static List<String> Topics_MenuArrayProd = null;

	public static List<String> Topics_MenuArrayTest = null;

	public static List<String> TopicsArrayProd = null;

	public static List<String> TopicsArrayTest = null;

	public static List<String> ProgramsArrayProd = null;

	public static List<String> ProgramsArrayTest = null;

	public static List<String> NewsRoomArrayProd = null;

	public static List<String> NewsRoomArrayTest = null;

	public static List<String> ContactUsArrayProd = null;

	public static List<String> ContactUsArrayTest = null;

	// +

	@FindBy(xpath = ".//*[@id='level1_hitarea_101000000000000']")
	static WebElement button1Prod;

	@FindBy(xpath = ".//*[@id='level1_hitarea_102000000000000']")
	static WebElement button2Prod;

	@FindBy(xpath = ".//*[@id='level1_hitarea_121000000000000']")
	static WebElement button3Prod;

	@FindBy(xpath = ".//*[@id='level1_hitarea_651000000000000']")
	static WebElement button4Prod;

	@FindBy(xpath = ".//*[@id='level1_hitarea_122000000000000']")
	static WebElement button5Prod;

	@FindBy(xpath = ".//*[@id='level1_hitarea_123000000000000']")
	static WebElement button6Prod;

	@FindBy(xpath = ".//*[@id='level1_hitarea_124000000000000']")
	static WebElement button7Prod;

	@FindBy(xpath = ".//*[@id='level1_hitarea_103000000000000']")
	static WebElement button8Prod;

	@FindBy(xpath = ".//*[@id='topics']/li")
	static List<WebElement> TopicsTable_MainMenuProd;

	@FindBy(xpath = ".//*[@id='topics']/li/ul/li/a[1]")
	static List<WebElement> TopicsTable_SubMenuProd;

	@FindBy(xpath = ".//*[@id='nav']/li[4]/ul/li/a")
	static List<WebElement> ProgramsTableProd;

	@FindBy(xpath = ".//*[@id='nav']/li[6]/ul/li/a")
	static List<WebElement> NewsRoomTableProd;

	@FindBy(xpath = ".//*[@id='specialId']/li/a")
	static List<WebElement> ContactUsTableProd;

	// Elements in Test

	@FindBy(xpath = ".//*[@id='nav']/li[2]/a")
	public static WebElement TopicsLinkTest;

	@FindBy(xpath = ".//*[@id='nav']/li[4]/a")
	static WebElement ProgramsLinkTest;

	@FindBy(xpath = ".//*[@id='nav']/li[6]/a")
	static WebElement NewsRoomLinkTest;

	@FindBy(xpath = ".//*[@id='nav']/li[8]/a")
	static WebElement ContactUsTest;

	@FindBy(xpath = ".//*[@id='level1_hitarea_101000000000000']")
	static WebElement button1Test;

	@FindBy(xpath = ".//*[@id='level1_hitarea_102000000000000']")
	static WebElement button2Test;

	@FindBy(xpath = ".//*[@id='level1_hitarea_121000000000000']")
	static WebElement button3Test;

	@FindBy(xpath = ".//*[@id='level1_hitarea_651000000000000']")
	static WebElement button4Test;

	@FindBy(xpath = ".//*[@id='level1_hitarea_122000000000000']")
	static WebElement button5Test;

	@FindBy(xpath = ".//*[@id='level1_hitarea_123000000000000']")
	static WebElement button6Test;

	@FindBy(xpath = ".//*[@id='level1_hitarea_124000000000000']")
	static WebElement button7Test;

	@FindBy(xpath = ".//*[@id='level1_hitarea_103000000000000']")
	static WebElement button8Test;

	@FindBy(xpath = ".//*[@id='topics']/li")
	static List<WebElement> TopicsTable_MainMenuTest;

	@FindBy(xpath = ".//*[@id='topics']/li/ul/li/a[1]")
	static List<WebElement> TopicsTable_SubMenuTest;

	@FindBy(xpath = ".//*[@id='nav']/li[4]/ul/li/a")
	static List<WebElement> ProgramsTableTest;

	@FindBy(xpath = ".//*[@id='nav']/li[6]/ul/li/a")
	static List<WebElement> NewsRoomTableTest;

	@FindBy(xpath = ".//*[@id='specialId']/li/a")
	static List<WebElement> ContactUsTableTest;

	// Common Methods of

	public static void mouseOver_TopicsLink(WebElement element) {

		Actions builder = new Actions(driver);

		builder.moveToElement(element).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public static void mouseOver_ProgramsLink(WebElement element) {

		Actions builder = new Actions(driver);

		builder.moveToElement(element).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public static void mouseOver_NewsRoomLink(WebElement element) {

		Actions builder = new Actions(driver);

		builder.moveToElement(element).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public static void mouseOver_ContactUs(WebElement element) {

		Actions builder = new Actions(driver);

		builder.moveToElement(element).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	// methods of Prod

	public static void MenuElementsProd() {

		Logger log = Logger.getLogger("Home_Page1");

		mouseOver_TopicsLink(TopicsLinkProd);

		List<String> Topics_MenuArrayProd = new ArrayList<String>();

		List<WebElement> Topics_MainMenuElementProd = TopicsTable_MainMenuProd;

		for (int i = 0; i < Topics_MainMenuElementProd.size() ; i++) {

			String text = Topics_MainMenuElementProd.get(i).getText();

			Topics_MenuArrayProd.add(text);

		}

		log.info("Main menu elements under Topics in Prod are " + Topics_MenuArrayProd);

		button1Prod.click();
		button2Prod.click();
		button3Prod.click();
		button4Prod.click();
		button5Prod.click();
		button6Prod.click();
		button7Prod.click();
		button8Prod.click();

		log.info("\t");

		List<String> TopicsArrayProd = new ArrayList<String>();

		List<WebElement> Topics_SubMenuElementProd = TopicsTable_SubMenuProd;

		for (int i = 0; i < Topics_SubMenuElementProd.size() ; i++) {

			// log.info("Topics table elements are " +
			// Topics_SubMenuElement.get(i).getText());

			String text = Topics_SubMenuElementProd.get(i).getText();

			TopicsArrayProd.add(text);

		}

		log.info("Sub menu elements under Topics in Prod are " + TopicsArrayProd);

		mouseOver_ProgramsLink(ProgramsLinkProd);

		List<String> ProgramsArrayProd = new ArrayList<String>();

		List<WebElement> Programs_ElementsProd = ProgramsTableProd;

		for (int i = 0; i < Programs_ElementsProd.size() ; i++) {

			// log.info("Programs table elements are " +
			// Programs_Elements.get(i).getText());

			String text = Programs_ElementsProd.get(i).getText();

			ProgramsArrayProd.add(text);

		}

		log.info("Elements under Programs in Prod are" + ProgramsArrayProd);

		mouseOver_NewsRoomLink(NewsRoomLinkProd);

		List<String> NewsRoomArrayProd = new ArrayList<String>();

		List<WebElement> NewsRoom_ElementsProd = NewsRoomTableProd;

		for (int i = 0; i < NewsRoom_ElementsProd.size() ; i++) {

			// log.info("NewsRoom table elements are " +
			// NewsRoom_Elements.get(i).getText());

			String text = NewsRoom_ElementsProd.get(i).getText();

			NewsRoomArrayProd.add(text);

		}

		log.info("Elements under NewsRoom in Prod are" + NewsRoomArrayProd);

		mouseOver_ContactUs(ContactUsProd);

		List<String> ContactUsArrayProd = new ArrayList<String>();

		List<WebElement> ContactUS_ElementsProd = ContactUsTableProd;

		for (int i = 0; i < ContactUS_ElementsProd.size() ; i++) {

			// log.info("ContactUS table elements are " +
			// ContactUS_Elements.get(i).getText());

			String text = ContactUS_ElementsProd.get(i).getText();

			ContactUsArrayProd.add(text);

		}

		log.info("Elements under ContactUS in Prod are" + ContactUsArrayProd);

		// Test Methods

		driver.get(DataProviderFactory.getConfig().getApplicationUrl2() + "site/az/home/");

		Helper.capturescreenshot(driver, "HomePageAZ_Test");

		mouseOver_TopicsLink(TopicsLinkTest);

		List<String> Topics_MenuArrayTest = new ArrayList<String>();

		List<WebElement> Topics_MainMenuElementTest = TopicsTable_MainMenuTest;

		for (int i = 0; i < Topics_MainMenuElementTest.size() ; i++) {

			String text = Topics_MainMenuElementTest.get(i).getText();

			Topics_MenuArrayTest.add(text);

		}

		log.info("Main menu elements under Topics in Test are" + Topics_MenuArrayTest);

		button1Test.click();
		button2Test.click();
		button3Test.click();
		button4Test.click();
		button5Test.click();
		button6Test.click();
		button7Test.click();
		button8Test.click();

		log.info("\t");

		List<String> TopicsArrayTest = new ArrayList<String>();

		List<WebElement> Topics_SubMenuElementTest = TopicsTable_SubMenuTest;

		for (int i = 0; i < Topics_SubMenuElementTest.size() ; i++) {

			// log.info("Topics table elements are " +
			// Topics_SubMenuElement.get(i).getText());

			String text = Topics_SubMenuElementTest.get(i).getText();

			TopicsArrayTest.add(text);

		}

		log.info("Sub menu elements under Topics are" + TopicsArrayTest);

		mouseOver_ProgramsLink(ProgramsLinkTest);

		List<String> ProgramsArrayTest = new ArrayList<String>();

		List<WebElement> Programs_ElementsTest = ProgramsTableTest;

		for (int i = 0; i < Programs_ElementsTest.size() ; i++) {

			// log.info("Programs table elements are " +
			// Programs_Elements.get(i).getText());

			String text = Programs_ElementsTest.get(i).getText();

			ProgramsArrayTest.add(text);

		}

		log.info("Elements under Programs : Test is" + ProgramsArrayTest);

		mouseOver_NewsRoomLink(NewsRoomLinkTest);

		List<String> NewsRoomArrayTest = new ArrayList<String>();

		List<WebElement> NewsRoom_ElementsTest = NewsRoomTableTest;

		for (int i = 0; i < NewsRoom_ElementsTest.size() ; i++) {

			// log.info("NewsRoom table elements are " +
			// NewsRoom_Elements.get(i).getText());

			String text = NewsRoom_ElementsTest.get(i).getText();

			NewsRoomArrayTest.add(text);

		}

		log.info("Elements under NewsRoom in Test are:" + NewsRoomArrayTest);

		mouseOver_ContactUs(ContactUsTest);

		List<String> ContactUsArrayTest = new ArrayList<String>();

		List<WebElement> ContactUS_ElementsTest = ContactUsTableTest;

		for (int i = 0; i < ContactUS_ElementsTest.size() ; i++) {

			// log.info("ContactUS table elements are " +
			// ContactUS_Elements.get(i).getText());

			String text = ContactUS_ElementsTest.get(i).getText();

			ContactUsArrayTest.add(text);

		}

		log.info("Elements under ContactUs in Test are " + ContactUsArrayTest);

		Boolean a = Arrays.equals(Topics_MenuArrayProd.toArray(), Topics_MenuArrayTest.toArray());

		if (a == true) {

			log.info("Topics_Menu in Prod and Topics_Menu in Test are same");
		} else {
			log.info("Topics_Menu in Prod and Topics_Menu in Test are Not same");

		}
		Boolean B = Arrays.equals(TopicsArrayProd.toArray(), TopicsArrayTest.toArray());

		if (B == true) {

			log.info("Topics_SubMenu in Prod and Topics_Menu in Test are same");
		} else {
			log.info("Topics_SubMenu in Prod and Topics_Menu in Test are Not same");

		}

		Boolean C = Arrays.equals(ProgramsArrayProd.toArray(), ProgramsArrayProd.toArray());

		if (C == true) {

			log.info("Programs Menu in Prod and Programs Menu in Test are same");
		} else {
			log.info("Programs Menu in Prod and Programs Menu in Test are Not same");

		}

		Boolean D = Arrays.equals(NewsRoomArrayProd.toArray(), NewsRoomArrayProd.toArray());

		if (D == true) {

			log.info("NewsRoom Menu in Prod and NewsRoom  Menu in Test are same");
		} else {
			log.info("NewsRoom  Menu in Prod and NewsRoom  Menu in Test are Not same");

		}

		boolean E = Arrays.equals(ContactUsArrayProd.toArray(), ContactUsArrayProd.toArray());

		if (E == true) {

			log.info("ContactUs Menu in Prod and ContactUs Menu in Test are same");
		} else {
			log.info("ContactUs  Menu in Prod and ContactUs Menu in Test are Not same");

		}
	}

}
