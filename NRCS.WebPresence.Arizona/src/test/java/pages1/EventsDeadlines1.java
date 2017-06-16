package pages1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import factory.DataProviderFactory;

public class EventsDeadlines1 {

	static WebDriver driver;
	
	public EventsDeadlines1(WebDriver Idriver){
		this.driver=Idriver;
	}
	
	//URL1 Elements
	
	static String title1;
	
	@FindBy(xpath=".//*[@id='traversed']")
	static WebElement YouAreHereURL1;
	
	
	
	
	

	@FindBy(xpath=".//*[@id='left_event_img']/img")
	static
	WebElement Image1URL1;
	
	
	
	

	@FindBy(id="eventsNav")
	static WebElement NRCSRSSFeedURL1;
	
//calendar months
	@FindBy(xpath=".//*[@id='archivesSelected']")
	static WebElement 	
	ArchivesURL1;
	
	//URL2 Elements
		
	String title2;
		
		@FindBy(id="traversed")
		static WebElement YouAreHereURL2;

		

		@FindBy(xpath="")
		static
		WebElement Image1URL2;

		@FindBy(xpath=".//*[@id='eventsNav']")
		static WebElement NRCSRSSFeedURL2;
		
		
		
		//calendar months
			@FindBy(xpath=".//*[@id='archivesSelected']")
			static WebElement 	
			ArchivesURL2;
		
//Arrays Comaparison

		public static List<String> YouAreHereArrayURL1  =null;
		
		public static List<String> YouAreHereArrayURL2  =null;
		
		public static List<String> CalendarURL1 =null;


		public static List<String> CalendarURL2  =null;
	

		public static List<Object> ImageArray1URL1=null;

		public static  List<Object> ImageArray1URL2 =null;
		public static void validateURL(){
	
			String title1 = driver.getTitle();
			
			
			List<String>YouAreHereArrayURL1  = new ArrayList<String>();


		List<WebElement> YouAreHereURL1_elements=YouAreHereURL1.findElements(By.tagName("p"));
		
		
		
		for(int i=0;i<=(YouAreHereURL1_elements).size()-1;i++){
			
			String text=YouAreHereURL1_elements.get(i).getText();
			
			String NewText = text.trim();
			
			YouAreHereArrayURL1.add(NewText);

		}
		
		System.out.println("The breadcrumb of url1 is " +YouAreHereArrayURL1);
		
		
		System.out.println("\t");
		
		
		
		Boolean NRCS_RSS_Feed= NRCSRSSFeedURL1.isDisplayed();
		
		if(NRCS_RSS_Feed){
			
			
			System.out.println("NRCS_RSS_Feed is displayed on the left side ");
		}
		
		

		
		ImageArray1URL1 =image_check(Image1URL1);

		List<String>calendarURL1  = new ArrayList<String>();

		
		Select dropdown = new Select(ArchivesURL1);
		List<WebElement>e2=dropdown.getOptions();
		for(int i=0;i<=e2.size()-1;i++){
			
			String text =e2.get(i).getText();
			
			calendarURL1.add(text);
		
		}
		
		
		System.out.println("MonthsURL1 are " +calendarURL1);
		
		
		
//URL2 Methods

	driver.get(DataProviderFactory.getConfig().getApplicationUrl3()+"main/az/about/");

	String title2=driver.getTitle();

	System.out.println("Title of URL1 is " +title1);
	
	System.out.println("\t");


	System.out.println("Title of URL2 is " +title2);
	System.out.println("\t");

if(title1.equals(title2)){

System.out.println("Titles of both URLs are same");
}

System.out.println("\t");


Boolean NRCS_RSS_Feed1= NRCSRSSFeedURL2.isDisplayed();

if(NRCS_RSS_Feed1){
	
	
	System.out.println("NRCS_RSS_Feed is displayed on the left side of URL2 ");
}



List<String>calendarURL2  = new ArrayList<String>();


Select dropdown1 = new Select(ArchivesURL1);
List<WebElement>e=dropdown1.getOptions();
for(int i=0;i<=e.size()-1;i++){
	
	String text =e.get(i).getText();
	
	calendarURL2.add(text);

}


System.out.println("MonthsURL2 are " +calendarURL2);

ImageArray1URL2=image_check(Image1URL2);

List<String>YouAreHereArrayURL2  = new ArrayList<String>();


	List<WebElement> YouAreHereURL2_elements=YouAreHereURL2.findElements(By.tagName("p"));
	
	
	
	for(int i=0;i<=(YouAreHereURL2_elements).size()-1;i++){
		
		String text=YouAreHereURL2_elements.get(i).getText();
		
		String NewText = text.trim();
		
		YouAreHereArrayURL2.add(NewText);

	}
	
	System.out.println("The breadcrumb of url2 is " +YouAreHereArrayURL2);
	
	System.out.println("\t");


Boolean value =Arrays.equals(ImageArray1URL1.toArray(),ImageArray1URL2.toArray());


try{	

if (value==true){
	
	System.out.println("Image1 on both urls are same");
}


if(value==false){
System.out.println("image1 of both urls are not same");

}

}
catch(Exception e7){
	
	System.out.println("The exception is "+e7.getMessage());
	
}
	
	Boolean value2 =Arrays.equals(YouAreHereArrayURL2.toArray(),YouAreHereArrayURL1.toArray());
	
	
try{	
	
if (value2==true){
		
		System.out.println("You are here items on both urls are same");
	}


if(value2==false){
System.out.println("Breadcrumb of both urls are not same");
	
}

}
catch(Exception e1){
		
		System.out.println("The exception is "+e1.getMessage());
		
	}



Boolean value5 =Arrays.equals(calendarURL2.toArray(),calendarURL1.toArray());


try{	

if (value5==true){
	
	System.out.println("months in both urls are same");
}


if(value5==false){
System.out.println("months in  both urls are not same");

}

}
catch(Exception e3){
	
	System.out.println("The exception is "+e3.getMessage());
	
}



System.out.println("\t");

		}
	

public static List<Object> image_check(WebElement image1url12){
	

		
		WebElement ImageFile = image1url12;
	    
		Boolean ImagePresent = (Boolean)((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);    
	 
		if (!ImagePresent)
	    {
	         System.out.println("Image not displayed.");
	    }
	    else
	    {
	        System.out.println("Image displayed.");
	    }
			
		List<Object> ImageArray= new ArrayList<Object>();
		
			Dimension dimensions = image1url12.getSize();
			
			//System.out.println("width is " + dimensions.width);
			
			int width =dimensions.width;
			int height=dimensions.height;
			
			//System.out.println("height is " + dimensions.height);
			 
			Point point =image1url12.getLocation();
			
			int Xposition=point.x;
			int Yposition=point.y;
			
			//ImageArray.add(width);
			//ImageArray.add(height);
			ImageArray.add(Xposition);
			ImageArray.add(Yposition);
			
			
			System.out.println("X position and Y position of image "+ImageArray);
			return ImageArray;
			
	//System.out.println("x position is " +point.x);
	//System.out.println("y position is " +point.y);


	}
		
}

