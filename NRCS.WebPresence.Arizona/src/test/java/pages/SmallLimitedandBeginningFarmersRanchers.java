package pages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.DataProviderFactory;

public class SmallLimitedandBeginningFarmersRanchers {
static WebDriver driver;
	
	public SmallLimitedandBeginningFarmersRanchers(WebDriver Idriver){
		
		this.driver=Idriver;
	}
	
	//URL1 Elements
	
	
	
	@FindBy(xpath=".//*[@id='overview']/h2[1]/a")
	static	WebElement headingURL1;
	

	@FindBy(xpath=".//*[@id='overview']/h3[1]/img")
	static
	WebElement Image1URL1;

	
	@FindBy(xpath=".//*[@id='traversed']")
	static WebElement YouAreHereURL1;
	
	
	@FindBy(xpath=".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[3]/table/tbody/tr/td/table/tbody/tr/td")
	static WebElement BodyURL1;

	

	//URL2 Elements
		
		
		
		@FindBy(xpath="") static WebElement headingURL2;
		
		
		@FindBy(xpath="")
		static WebElement YouAreHereURL2;
		
		
		@FindBy(xpath="")
		static WebElement BodyURL2;



		@FindBy(xpath="")
		static
		WebElement Image1URL2;


		//Comparison Arrays
			
			
			public static List<String> LinksArrayURL1  =null;
			
			public static List<String> LinksArrayURL2  =null;


			public static List<String> YouAreHereArrayURL1  =null;
			
			public static List<String> YouAreHereArrayURL2  =null;


			public static List<Object> ImageArrayURL1=null;

			public static  List<Object> ImageArrayURL2 =null;
	


	
	public static void validateURL(){
		
		
		String title1 = driver.getTitle();	
		
		String heading1 = headingURL1.getText();
		
	//System.out.println("hading of url1 is "+heading1);
		
		
		List<String>YouAreHereArrayURL1  = new ArrayList<String>();


	List<WebElement> YouAreHereURL1_elements=YouAreHereURL1.findElements(By.tagName("p"));
	
	
	
	for(int i=0;i<=(YouAreHereURL1_elements).size()-1;i++){
		
		String text=YouAreHereURL1_elements.get(i).getText();
		
		String NewText = text.trim();
		YouAreHereArrayURL1.add(NewText);

	}
	
	System.out.println(YouAreHereArrayURL1);
	
	
	List<String> LinksArrayURL1 = new ArrayList<String>();

	List<WebElement>tableItems_URL1 = BodyURL1.findElements(By.tagName("a"));
			
				
	tableItems_URL1.addAll(BodyURL1.findElements(By.tagName("img")));
	
	
	int count=0;
	
			for(int j=0; j<=tableItems_URL1.size()-1;j++){
				
				WebElement element1 = tableItems_URL1.get(j);
				
				String url1=element1.getAttribute("href");
				
				
				
				  if(element1.getAttribute("href") != null){
	
					  LinksArrayURL1.add(url1);
count=count+1;
					  
				verifyLinkActive(url1);
				 
				  }
				  

			}
			
		System.out.println("No of links in URL1 are "+count);
		System.out.println("first url arrays are "+LinksArrayURL1);
		
		//image_check(Image1URL1);
		ImageArrayURL1 =image_check(Image1URL1);
		
		String content1=BodyURL1.getText();
		String title2= driver.getTitle();

		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl2()+"main/az/technical/cp/#");
		
		String content2=BodyURL2.getText();
		
		if (content1.contentEquals(content2)){
			System.out.println("Contents on both URLs are same");
		}

		
Assert.assertEquals(title1, title2);

	String heading2= headingURL2.getText();
	
	
	if (heading1.equals(heading2)){
		
		System.out.println("Both urls titles are same");
	}
	
//ystem.out.println(heading2);
	
	List<String>YouAreHereArrayURL2  = new ArrayList<String>();


	List<WebElement> YouAreHereURL2_elements=YouAreHereURL2.findElements(By.tagName("p"));
	
	
	
	for(int i=0;i<=(YouAreHereURL2_elements).size()-1;i++){
		
		String text=YouAreHereURL2_elements.get(i).getText();
		
		String NewText = text.trim();
		YouAreHereArrayURL2.add(NewText);

	}
	
	System.out.println(YouAreHereArrayURL2);
	
	
	
	List<String> LinksArrayURL2 = new ArrayList<String>();

	List<WebElement>tableItems_URL2 = BodyURL2.findElements(By.tagName("a"));
			
				
	tableItems_URL2.addAll(BodyURL2.findElements(By.tagName("img")));
	
	
	int count1=0;
	
			for(int j=0; j<=tableItems_URL2.size()-1;j++){
				
				WebElement element1 = tableItems_URL2.get(j);
				
				String URL2=element1.getAttribute("href");
				
				
				
				  if(element1.getAttribute("href") != null){
	
					  LinksArrayURL2.add(URL2);
count1=count1+1;
					  
		verifyLinkActive(URL2);
				 
				  }
				  

			}
			
		System.out.println("No of links in URL2 are "+count1);
		
		System.out.println(LinksArrayURL2);
			
				
	  //  image_check(Image1URL2);
		
		ImageArrayURL2=image_check(Image1URL2);


if(heading1.equals(heading2)){
		
		System.out.println("heading of both urls are same");
	}
Boolean value1=Arrays.equals(ImageArrayURL1.toArray(),ImageArrayURL2.toArray());

try{
	if(value1=true){
		
		System.out.println("Images on URL1 and URL2 are of same dimension and in same position");
	}
	

}catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
}
	
	Boolean value2 =Arrays.equals(YouAreHereArrayURL2.toArray(),YouAreHereArrayURL1.toArray());
	
	
try{	
	
if (value2=true){
		
		System.out.println("You are here items on both urls are same");
	}
}
catch(Exception e){
		
		System.out.println("The exception is "+e.getMessage());
	}
	

Boolean value3 =Arrays.equals(LinksArrayURL1.toArray(),LinksArrayURL2.toArray());
	
try{
	
if (value3=true){
	
	System.out.println("Links on both urls are same");
}

}catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
}
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
			
			ImageArray.add(width);
			ImageArray.add(height);
			ImageArray.add(Xposition);
			ImageArray.add(Yposition);
			
			
			System.out.println(ImageArray);
			return ImageArray;
			
	//System.out.println("x position is " +point.x);
	//System.out.println("y position is " +point.y);


	}
		


public  static void verifyLinkActive(String linkUrl) {
	
	

	try 
    {
		//System.setProperty("java.net.preferIPv4Stack" , "true");
		
       URL url = new URL(linkUrl);
       
       HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
       
       httpURLConnect.setConnectTimeout(3000);
       
       httpURLConnect.connect();
       
       if(httpURLConnect.getResponseCode()==200)
       {
           System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
       }
       
       if(!(httpURLConnect.getResponseCode()==200)){
    	   System.out.println(linkUrl+"-"+httpURLConnect.getResponseMessage());
    	 
       }
      if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
       {
           System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
           
        }
    } catch (Exception e) {
       
    }
}
}
