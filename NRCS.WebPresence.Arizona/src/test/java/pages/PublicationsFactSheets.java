package pages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.DataProviderFactory;
import junit.framework.Assert;

public class PublicationsFactSheets {
	static WebDriver driver;

	public PublicationsFactSheets(WebDriver Idriver){
		this.driver=Idriver;
	}
	//URL1 Elements

	
	
	@FindBy(xpath=".//*[@id='traversed']")
	static WebElement YouAreHereURL1;
	
	//URL2 Elements
		
	
		
		
		@FindBy(xpath="")
		static WebElement YouAreHereURL2;
		
		
		//Comparison Arrays
		
		
		public static List<String> LinksArrayURL1  =null;
		
		public static List<String> LinksArrayURL2  =null;


		public static List<String> YouAreHereArrayURL1  =null;
		
		public static List<String> YouAreHereArrayURL2  =null;




		public static void validateURL1(){
			
			String title1 = driver.getTitle();	

			
			
			
			List<String>YouAreHereArrayURL1  = new ArrayList<String>();


		List<WebElement> YouAreHereURL1_elements=YouAreHereURL1.findElements(By.tagName("p"));
		
		
		
		for(int i=0;i<=(YouAreHereURL1_elements).size()-1;i++){
			
			String text=YouAreHereURL1_elements.get(i).getText();
			
			String NewText = text.trim();
			YouAreHereArrayURL1.add(NewText);

			YouAreHereArrayURL1.add(text);
		}
		
		System.out.println(YouAreHereArrayURL1);
		
		List<String> LinksArrayURL1 = new ArrayList<String>();

		

//URL2 Methods

driver.get(DataProviderFactory.getConfig().getApplicationUrl2()+"main/az/technical/dma/econ/");
	
String title2=driver.getTitle();
Assert.assertEquals(title1,title2);


List<String>YouAreHereArrayURL2  = new ArrayList<String>();


	List<WebElement> YouAreHereURL2_elements=YouAreHereURL2.findElements(By.tagName("p"));
	
	
	
	for(int i=0;i<=(YouAreHereURL2_elements).size()-1;i++){
		
		String text=YouAreHereURL2_elements.get(i).getText();
		
		
		YouAreHereArrayURL2.add(text);
		
		String NewText = text.trim();
		YouAreHereArrayURL2.add(NewText);

	}
	
	System.out.println(YouAreHereArrayURL2);
	
	List<String> LinksArrayURL2 = new ArrayList<String>();

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



public  static void verifyLinkActive(String linkUrl) {
	
	

	try 
    {
		
       URL url = new URL(linkUrl);
       
       HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
       
       httpURLConnect.setConnectTimeout(3000);
       
       httpURLConnect.connect();
       
      
       if(httpURLConnect.getResponseCode()==200)
       {
           System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
           
           String text=linkUrl+" - "+httpURLConnect.getResponseMessage();
           if(text.contains("OK")){
        	 
           }
       }
       if(!(httpURLConnect.getResponseCode()==200)){
    	   
    	   System.out.println(linkUrl+"-"+httpURLConnect.getResponseMessage());
    	   
    	   String text=linkUrl+" - "+httpURLConnect.getResponseMessage();
    	   
           if(text.contains("Found")||text.contains("Moved Permanently")||text.contains(" Forbidden")){
        	  
           }
       }
   //    System.out.println("No of links with response code other than OK are "+count2);
       
      if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
       {
           System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
           
           String text=linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND;
           
           if (text.contains("HTTP_NOT_FOUND")){
        	  // count3=count3+1;
           }
           
        }
   
	
      // System.out.println("No of links with response code OK are "+count1);
    }
	catch (Exception e) {
       
    }

	
}
}
