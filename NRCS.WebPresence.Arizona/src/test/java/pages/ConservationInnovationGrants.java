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

public class ConservationInnovationGrants {

	 static WebDriver driver;

		public ConservationInnovationGrants(WebDriver Idriver){
			this.driver=Idriver;
		}
		//URL1 Elements

		@FindBy(xpath=".//*[@id='overview']/h2/a")
		static	WebElement headingURL1;
		
		
		
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

			//Comparison Arrays
			
			
			public static List<String> LinksArrayURL1  =null;
			
			public static List<String> LinksArrayURL2  =null;


			public static List<String> YouAreHereArrayURL1  =null;
			
			public static List<String> YouAreHereArrayURL2  =null;


		


			public static String getApplicationTitle1() {
				
				return driver.getTitle();
			}

			public static void validateURL1(){
				
				
				String heading1 = headingURL1.getText();
				
			//System.out.println("hading of url1 is "+heading1);
				
				
				List<String>YouAreHereArrayURL1  = new ArrayList<String>();


			List<WebElement> YouAreHereURL1_elements=YouAreHereURL1.findElements(By.tagName("p"));
			
			
			
			for(int i=0;i<=(YouAreHereURL1_elements).size()-1;i++){
				
				String text=YouAreHereURL1_elements.get(i).getText();
				
				
				YouAreHereArrayURL1.add(text);
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
			

	//URL2 Methods

		driver.get(DataProviderFactory.getConfig().getApplicationUrl2()+"main/az/technical/dma/econ/");


		String heading2= headingURL2.getText();
		
		
		if(driver.getTitle().equals(getApplicationTitle1())){
			
			System.out.println("titles of both urls are same");
		}


	if(heading1.equals(heading2)){
		
		System.out.println("heading of both urls are same");
	}
		List<String>YouAreHereArrayURL2  = new ArrayList<String>();


		List<WebElement> YouAreHereURL2_elements=YouAreHereURL2.findElements(By.tagName("p"));
		
		
		
		for(int i=0;i<=(YouAreHereURL2_elements).size()-1;i++){
			
			String text=YouAreHereURL2_elements.get(i).getText();
			
			
			YouAreHereArrayURL2.add(text);
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
				
			System.out.println("No of links in URL2 are "+count);
			
			System.out.println(LinksArrayURL2);
		
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
	       
	      if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
	       {
	           System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
	           
	           String text=linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND;
	           
	           if (text.contains("HTTP_NOT_FOUND")){
	           }
	           
	        }
	   
		
	    }
		catch (Exception e) {
	       
	    }

		
	}
		
}
