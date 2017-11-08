package pages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import factory.DataProviderFactory;

public class Navigation {

	static WebDriver driver;
	
	public Navigation(WebDriver Idriver){
		
		this.driver=Idriver;
	}
	
	//URL1 Elements
	
	@FindBy(xpath=".//*[@id='nav']/li[2]/a")
	public static WebElement TopicsLinkURL1;
	
	
	
	
	@FindBy(xpath=".//*[@id='nav']/li[4]/a")
	static WebElement ProgramsLinkURL1;
	
	

	
	@FindBy(xpath=".//*[@id='nav']/li[6]/a")
	static WebElement NewsRoomLinkURL1;
	

	
	@FindBy(xpath=".//*[@id='nav']/li[8]/a")
	static WebElement ContactUsURL1;
	
	

	//Arrays
	
	
	public static List<String> Topics_MenuArrayURL1  =null;
	
	public static List<String> Topics_MenuArrayURL2  =null;

	
	public static List<String> TopicsArrayURL1  =null;
	
	public static List<String> TopicsArrayURL2  =null;

	public static List<String> ProgramsArrayURL1  =null;
	
	public static List<String> ProgramsArrayURL2 =null;

	
	public static List<String> NewsRoomArrayURL1  =null;
	
	public static List<String> NewsRoomArrayURL2  =null;

	public static List<String> ContactUsArrayURL1  =null;
	
	public static List<String> ContactUsArrayURL2  =null;

	
	//+ 


	@FindBy(xpath=".//*[@id='level1_hitarea_101000000000000']") static WebElement button1URL1;
	

	@FindBy(xpath=".//*[@id='level1_hitarea_102000000000000']") static WebElement button2URL1;
	


	@FindBy(xpath=".//*[@id='level1_hitarea_121000000000000']") static WebElement button3URL1;
	


	@FindBy(xpath=".//*[@id='level1_hitarea_651000000000000']") static WebElement button4URL1;
	

	@FindBy(xpath=".//*[@id='level1_hitarea_122000000000000']") static WebElement button5URL1;
	

	@FindBy(xpath=".//*[@id='level1_hitarea_123000000000000']") static WebElement button6URL1;
	

	@FindBy(xpath=".//*[@id='level1_hitarea_124000000000000']") static WebElement button7URL1;
	

	@FindBy(xpath=".//*[@id='level1_hitarea_103000000000000']") static WebElement button8URL1;
	
	
	@FindBy(xpath="	.//*[@id='top_nav']/ul/li[1]/a") static WebElement aboutUSURL1;

	
	
	
	//Elements in URL2
	
	
	@FindBy(xpath="")
	static WebElement TopicsLinkURL2;
	
	
	
	
	@FindBy(xpath="")
	static WebElement ProgramsLinkURL2;
	
	

	
	@FindBy(xpath="")
	static WebElement NewsRoomLinkURL2;
	
	

	

	@FindBy(xpath="") static WebElement button1URL2;
	

	@FindBy(xpath="") static WebElement button2URL2;
	


	@FindBy(xpath="") static WebElement button3URL2;
	


	@FindBy(xpath="") static WebElement button4URL2;
	

	@FindBy(xpath="") static WebElement button5URL2;
	

	@FindBy(xpath="") static WebElement button6URL2;
	

	@FindBy(xpath="") static WebElement button7URL2;
	

	@FindBy(xpath="") static WebElement button8URL2;
	
	
	@FindBy(xpath="")
	static WebElement ContactUsURL2;
	
	@FindBy(xpath="	.//*[@id='top_nav']/ul/li[1]/a") static WebElement aboutUSURL2;


	@FindBy(xpath="")
	static List<WebElement> TopicsTable_MainMenuURL2;

	@FindBy(xpath="")
	static List<WebElement> TopicsTable_SubMenuURL2;
	
	@FindBy(xpath="")
	static List<WebElement> ProgramsTableURL2;

	@FindBy(xpath="")
	static List<WebElement> NewsRoomTableURL2;

	@FindBy(xpath="")
	static List<WebElement> ContactUsTableURL2;


	
	
	
	

public static void mouseOver_TopicsLink(WebElement element){
	
	Actions builder=new Actions(driver);

	builder.moveToElement(element).build().perform();
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
}



public static void mouseOver_ProgramsLink(WebElement element){
		
	Actions builder=new Actions(driver);


	builder.moveToElement(element).build().perform();
	
	driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);	
		
	}

	
public static void mouseOver_NewsRoomLink(WebElement element){
	
	Actions builder=new Actions(driver);

    builder.moveToElement(element).build().perform();
	
	driver.manage().timeouts().implicitlyWait(370,TimeUnit.SECONDS);	
		
	
}


public static void mouseOver_ContactUs(WebElement element){
	
	
	Actions builder=new Actions(driver);

	   builder.moveToElement(element).build().perform();
		
		driver.manage().timeouts().implicitlyWait(370,TimeUnit.SECONDS);	
	
}

	
	public static void validateURL() throws InterruptedException{
		
		mouseOver_TopicsLink(TopicsLinkURL1);
		
		Thread.sleep(10);

		button1URL1.click();
		button2URL1.click();
		button3URL1.click();
		button4URL1.click();
		button5URL1.click();
		button6URL1.click();
		button7URL1.click();
		button8URL1.click();
		
		
		driver.manage().timeouts().implicitlyWait(43077, TimeUnit.SECONDS);
		
		mouseOver_ProgramsLink(ProgramsLinkURL1);
		

		
		
		mouseOver_NewsRoomLink(NewsRoomLinkURL1);

		mouseOver_ContactUs(ContactUsURL1);


		aboutUSURL1.click();
/*		
driver.get(DataProviderFactory.getConfig().getApplicationUrl2()+"home/");

mouseOver_TopicsLink(TopicsLinkURL2);
	
	

	button1URL2.click();
	button2URL2.click();
	button3URL2.click();
	button4URL2.click();
	button5URL2.click();
	button6URL2.click();
	button7URL2.click();
	button8URL2.click();
	

	
	mouseOver_ProgramsLink(ProgramsLinkURL2);
	
	
	
	mouseOver_NewsRoomLink(NewsRoomLinkURL2);
	
	
	mouseOver_ContactUs(ContactUsURL2);
	
	
	aboutUSURL2.click();
	
	*/

	}
}
