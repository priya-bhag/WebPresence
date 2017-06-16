package pages1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import factory.DataProviderFactory;
import junit.framework.Assert;

public class Home_Page1 {

	
	
	
	static WebDriver driver;
	

	
	
	public Home_Page1(WebDriver Idriver)
	
	{
	
	this.driver=Idriver;
		
	}
	
	//Elements in URL1
	
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
	
	

	@FindBy(xpath=".//*[@id='topics']/li")
	static List<WebElement> TopicsTable_MainMenuURL1;

	@FindBy(xpath=".//*[@id='topics']/li/ul/li/a[1]")
	static List<WebElement> TopicsTable_SubMenuURL1;
	
	@FindBy(xpath=".//*[@id='nav']/li[4]/ul/li/a")
	static List<WebElement> ProgramsTableURL1;

	@FindBy(xpath=".//*[@id='nav']/li[6]/ul/li/a")
	static List<WebElement> NewsRoomTableURL1;

	@FindBy(xpath=".//*[@id='specialId']/li/a")
	static List<WebElement> ContactUsTableURL1;


	
	
	
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


	
	
	
	
	
	
	//Common Methods of 
	
	

public static void mouseOver_TopicsLink(WebElement element){
	
	Actions builder=new Actions(driver);

	builder.moveToElement(element).build().perform();
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
}



public static void mouseOver_ProgramsLink(WebElement element){
		
	Actions builder=new Actions(driver);


	builder.moveToElement(element).build().perform();
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
		
	}

	
public static void mouseOver_NewsRoomLink(WebElement element){
	
	Actions builder=new Actions(driver);

    builder.moveToElement(element).build().perform();
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
		
	
}


public static void mouseOver_ContactUs(WebElement element){
	
	
	Actions builder=new Actions(driver);

	   builder.moveToElement(element).build().perform();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
	
}



//methods of URL1



public static void MenuElementsURL1(){
	
	mouseOver_TopicsLink(TopicsLinkURL1);
	
	
	List<String> Topics_MenuArrayURL1 = new ArrayList<String>();


	List<WebElement> Topics_MainMenuElementURL1=TopicsTable_MainMenuURL1;
	

	
	for(int i=0; i<= Topics_MainMenuElementURL1.size()-1; i++){
		
		
		String text = Topics_MainMenuElementURL1.get(i).getText();
		
		Topics_MenuArrayURL1.add(text);
		
	}
	
	System.out.println(Topics_MenuArrayURL1);

	button1URL1.click();
	button2URL1.click();
	button3URL1.click();
	button4URL1.click();
	button5URL1.click();
	button6URL1.click();
	button7URL1.click();
	button8URL1.click();
	
	
	System.out.println("\t");
	
List<String> TopicsArrayURL1 = new ArrayList<String>();
	
List<WebElement> Topics_SubMenuElementURL1=TopicsTable_SubMenuURL1;
	
	
	for(int i=0; i<= Topics_SubMenuElementURL1.size()-1; i++){
		
		//System.out.println("Topics table elements are "  + Topics_SubMenuElement.get(i).getText());
		
		
		String text=Topics_SubMenuElementURL1.get(i).getText();
		
		TopicsArrayURL1.add(text);
		
	}
	
	System.out.println(TopicsArrayURL1);

	
	mouseOver_ProgramsLink(ProgramsLinkURL1);
	
	List<String> ProgramsArrayURL1 = new ArrayList<String>();

	List<WebElement>Programs_ElementsURL1=ProgramsTableURL1;
	
	
	for(int i=0; i<= Programs_ElementsURL1.size()-1; i++){
		
		//System.out.println("Programs table elements are "  + Programs_Elements.get(i).getText());
		

		String text=Programs_ElementsURL1.get(i).getText();
		
		ProgramsArrayURL1.add(text);
		

	}
	
	System.out.println(ProgramsArrayURL1);

	
	mouseOver_NewsRoomLink(NewsRoomLinkURL1);
	
	
	List<String> NewsRoomArrayURL1 = new ArrayList<String>();
	
	List<WebElement>NewsRoom_ElementsURL1=NewsRoomTableURL1;
	
	
	for(int i=0; i<= NewsRoom_ElementsURL1.size()-1; i++){
		
		//System.out.println("NewsRoom table elements are "  + NewsRoom_Elements.get(i).getText());
		

		String text=NewsRoom_ElementsURL1.get(i).getText();
		
		NewsRoomArrayURL1.add(text);
		
	}
	
	System.out.println(NewsRoomArrayURL1);

	
	mouseOver_ContactUs(ContactUsURL1);
	
	

	List<String> ContactUsArrayURL1 = new ArrayList<String>();
	
	List<WebElement>ContactUS_ElementsURL1=ContactUsTableURL1;
	
	
	for(int i=0; i<=ContactUS_ElementsURL1.size()-1; i++){
		
		//System.out.println("ContactUS table elements are "  + ContactUS_Elements.get(i).getText());
		

		String text= ContactUS_ElementsURL1.get(i).getText();
		
		ContactUsArrayURL1.add(text);
		
	}
	
	System.out.println(ContactUsArrayURL1);


//URL2 Methods



driver.get(DataProviderFactory.getConfig().getApplicationUrl2()+"home/");

mouseOver_TopicsLink(TopicsLinkURL2);
	
	
	List<String> Topics_MenuArrayURL2 = new ArrayList<String>();


	List<WebElement> Topics_MainMenuElementURL2=TopicsTable_MainMenuURL2;
	

	
	for(int i=0; i<= Topics_MainMenuElementURL2.size()-1; i++){
		
		
		String text = Topics_MainMenuElementURL2.get(i).getText();
		
		Topics_MenuArrayURL2.add(text);
		
	}
	
	System.out.println(Topics_MenuArrayURL2);

	button1URL2.click();
	button2URL2.click();
	button3URL2.click();
	button4URL2.click();
	button5URL2.click();
	button6URL2.click();
	button7URL2.click();
	button8URL2.click();
	
	
	System.out.println("\t");
	
List<String> TopicsArrayURL2 = new ArrayList<String>();
	
List<WebElement> Topics_SubMenuElementURL2=TopicsTable_SubMenuURL2;
	
	
	for(int i=0; i<= Topics_SubMenuElementURL2.size()-1; i++){
		
		//System.out.println("Topics table elements are "  + Topics_SubMenuElement.get(i).getText());
		
		
		String text=Topics_SubMenuElementURL2.get(i).getText();
		
		TopicsArrayURL2.add(text);
		
	}
	
	System.out.println(TopicsArrayURL2);

	
	mouseOver_ProgramsLink(ProgramsLinkURL2);
	
	List<String> ProgramsArrayURL2 = new ArrayList<String>();

	List<WebElement>Programs_ElementsURL2=ProgramsTableURL2;
	
	
	for(int i=0; i<= Programs_ElementsURL2.size()-1; i++){
		
		//System.out.println("Programs table elements are "  + Programs_Elements.get(i).getText());
		

		String text=Programs_ElementsURL2.get(i).getText();
		
		ProgramsArrayURL2.add(text);
		

	}
	
	System.out.println(ProgramsArrayURL2);

	
	mouseOver_NewsRoomLink(NewsRoomLinkURL2);
	
	
	List<String> NewsRoomArrayURL2 = new ArrayList<String>();
	
	List<WebElement>NewsRoom_ElementsURL2=NewsRoomTableURL2;
	
	
	for(int i=0; i<= NewsRoom_ElementsURL2.size()-1; i++){
		
		//System.out.println("NewsRoom table elements are "  + NewsRoom_Elements.get(i).getText());
		

		String text=NewsRoom_ElementsURL2.get(i).getText();
		
		NewsRoomArrayURL2.add(text);
		
	}
	
	System.out.println(NewsRoomArrayURL2);

	
	mouseOver_ContactUs(ContactUsURL2);
	
	

	List<String> ContactUsArrayURL2 = new ArrayList<String>();
	
	List<WebElement>ContactUS_ElementsURL2=ContactUsTableURL2;
	
	
	for(int i=0; i<=ContactUS_ElementsURL2.size()-1; i++){
		
		//System.out.println("ContactUS table elements are "  + ContactUS_Elements.get(i).getText());
		

		String text= ContactUS_ElementsURL2.get(i).getText();
		
		ContactUsArrayURL2.add(text);
		
	}
	
	System.out.println(ContactUsArrayURL2);

	Arrays.equals(Topics_MenuArrayURL1.toArray(),Topics_MenuArrayURL2.toArray());
	
	Arrays.equals(TopicsArrayURL1.toArray(),TopicsArrayURL2.toArray());
	
	Arrays.equals(ProgramsArrayURL1.toArray(),ProgramsArrayURL1.toArray());
	
	Arrays.equals(NewsRoomArrayURL1.toArray(),NewsRoomArrayURL1.toArray());
	
	Arrays.equals(ContactUsArrayURL1.toArray(),ContactUsArrayURL1.toArray());

	
}



	
}
