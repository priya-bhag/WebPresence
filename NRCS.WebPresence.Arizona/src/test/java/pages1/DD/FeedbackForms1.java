package pages1.DD;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import factory.DataProviderFactory;
import junit.framework.Assert;
import utility.Helper;

public class FeedbackForms1 {
	static WebDriver driver;

	public FeedbackForms1(WebDriver Idriver) {
		this.driver = Idriver;
	}
	// Prod Elements

	@FindBy(xpath = ".//*[@id='feedbackform']/h2")
	static WebElement headingProd;

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbProd;

	@FindBy(id = "contactusNode")
	static WebElement SelectaSubjectAreaProd;

	@FindBy(id = "yourname")
	static WebElement YournameProd;

	@FindBy(id = "email")
	static WebElement YouremailaddressProd;

	@FindBy(id = "subject")
	static WebElement subjectProd;

	@FindBy(id = "comment")
	static WebElement commentProd;

	@FindBy(xpath = ".//*[@id='comment_form']/p/input")
	static WebElement SendNowProd;

	// Test Elements

	@FindBy(xpath = ".//*[@id='feedbackform']/h2")
	static WebElement headingTest;

	@FindBy(xpath = ".//*[@id='traversed']")
	static WebElement BreadCrumbTest;

	@FindBy(id = "contactusNode")
	static WebElement SelectaSubjectAreaTest;

	@FindBy(id = "yourname")
	static WebElement YournameTest;

	@FindBy(id = "email")
	static WebElement YouremailaddressTest;

	@FindBy(id = "subject")
	static WebElement subjectTest;

	@FindBy(id = "comment")
	static WebElement commentTest;

	@FindBy(xpath = ".//*[@id='comment_form']/p/input")
	static WebElement SendNowTest;

	// Comparison Arrays

	public static List<String> LinksArrayProd = null;

	public static List<String> LinksArrayTest = null;

	public static List<String> BreadCrumbArrayProd = null;

	public static List<String> BreadCrumbArrayTest = null;

	public static void validateProd() throws IOException {

		Logger log = Logger.getLogger("FeedbackForms1");

		String title1 = driver.getTitle();

		String heading1 = headingTest.getText();

		log.info("heading of Prod is: " + heading1);

		Select dropdown1Prod = new Select(SelectaSubjectAreaProd);

		List<WebElement> e2 = dropdown1Prod.getOptions();

		for (int i = 0; i <= e2.size() - 1; i++) {
			log.info("Select a Subject Area: in Prod are " + e2.get(i).getText());
		}
		log.info("Select a Subject Area: in prod are " + e2.size());

		// validation part

		dropdown1Prod.selectByVisibleText("Education");
		YournameProd.sendKeys("priya");

		YouremailaddressProd.sendKeys("abc@gmail.com");

		subjectProd.sendKeys("soils");

		commentProd.sendKeys("comment submitted");

		SendNowProd.click();

		driver.get(DataProviderFactory.getConfig().getApplicationUrl3()
				+ DataProviderFactory.getExcel().getdata(0, 30, 1));

		Helper.capturescreenshot(driver, "FeedBackFormsIN_Test");

		String heading2 = headingTest.getText();

		log.info("heading of Test is " + heading2);

		if (heading1.equals(heading2)) {

			log.info("heading of both Env: are same");

		}

		String title2 = driver.getTitle();

		log.info("Title of Prod is " + title1);

		log.info("Title of Test is " + title2);

		Assert.assertEquals(title1, title2);

		Select dropdown1Test = new Select(SelectaSubjectAreaProd);

		List<WebElement> e3 = dropdown1Test.getOptions();

		for (int i = 0; i <= e3.size() - 1; i++) {
			log.info("Select a Subject Area: in Test are " + e3.get(i).getText());
		}
		log.info("Select a Subject Area: in  Test are  " + e3.size());

		// validation part

		dropdown1Prod.selectByVisibleText("Education");

		/*
		 * YournameProd.sendKeys("priya");
		 * 
		 * YouremailaddressProd.sendKeys("abc@gmail.com");
		 * 
		 * subjectProd.sendKeys("soils");
		 * 
		 * 
		 * commentProd.sendKeys("comment submitted");
		 * 
		 * 
		 * SendNowProd.click();
		 */

	}

}
