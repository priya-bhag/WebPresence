package pages1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import factory.DataProviderFactory;

public class CIGProjectSearch1 {

	 
	 static WebDriver driver;

		public CIGProjectSearch1(WebDriver Idriver){
			this.driver=Idriver;
		}
		//URL1 Elements

		@FindBy(xpath=".//*[@id='cigSearch']/h2")
		static	WebElement headingURL1;
	
		
		
		@FindBy(xpath=".//*[@id='traversed']")
		static WebElement YouAreHereURL1;
		
		
		@FindBy(xpath=".//*[@id='cigSearch']")
		static WebElement BodyURL1;;
		
		
		
		@FindBy(xpath=".//*[@id='generalText']")
		static WebElement 
		
		GeneralTextSearchURL1;	
		
		
		

		@FindBy(xpath=".//*[@id='cigSearch']/table/tbody/tr[2]/td[2]/input")
		static WebElement	
		
		SearchButton1URL1;
		
		


		@FindBy(xpath=".//*[@id='keywords']")
		static WebElement	
		KeywordsURL1;
		

		@FindBy(xpath=".//*[@id='cigSearch']/table/tbody/tr[4]/td[2]/div")
		static	List<WebElement> SearchByGrantTypeURL1;
		

		@FindBy(xpath=".//*[@id='cigSearch']/table/tbody/tr[10]/td[2]/ul/li/input")
		static WebElement 
		ResourceConcernsURL1	;
		
	


		@FindBy(xpath=".//*[@id='projEcoReg']")
		static WebElement 
		ProjectEcoregionURL1;
		
		


		@FindBy(xpath=".//*[@id='awardYear']")
		static List<WebElement> 		
		AwardYearURL1;	

		
		


		@FindBy(xpath=".//*[@id='cigSearch']/table/tbody/tr[18]/td[2]")
		static List<WebElement> 		
		GeographiCAreaFocusURL1;
		
		



		@FindBy(xpath=".//*[@id='nationalFocus']")
		static List<WebElement>
		NationalFocusURL1;

		


		@FindBy(xpath=".//*[@id='nationalFocus']")
		static List<WebElement> 		
		RecipientStateTerritoryURL1;
		
		


		@FindBy(xpath=".//*[@id='docType']")
		static List<WebElement> 		
		DocumentTypeURL1;
		


		
		

		@FindBy(xpath=".//*[@id='projState']")
		static List<WebElement> 
		ProjectActivityStateTerritoryURL1;
	
		
		
			
		//URL2 Elements
			
			
			
			@FindBy(xpath="") static WebElement headingURL2;
			
			
			@FindBy(xpath="")
			static WebElement YouAreHereURL2;
			
			
			@FindBy(xpath="")
			static WebElement BodyURL2;
			
		
			
			

			@FindBy(xpath=".//*[@id='generalText']")
			static WebElement 
			
			GeneralTextSearchURL2;	
			
			
			

			@FindBy(xpath=".//*[@id='cigSearch']/table/tbody/tr[2]/td[2]/input")
			static WebElement	
			
			SearchButton1URL2;
			
			


			@FindBy(xpath=".//*[@id='keywords']")
			static WebElement	
			KeywordsURL2;
			

			@FindBy(xpath=".//*[@id='cigSearch']/table/tbody/tr[4]/td[2]/div")
			static	WebElement SearchByGrantTypeURL2;
			

			@FindBy(xpath=".//*[@id='cigSearch']/table/tbody/tr[10]/td[2]/ul/li/input")
			static List<WebElement> 
			ResourceConcernsURL2	;
			
			
			
			



			@FindBy(xpath=".//*[@id='projEcoReg']")
			static List<WebElement> 
			ProjectEcoregionURL2;
			
			


			@FindBy(xpath=".//*[@id='awardYear']")
			static List<WebElement> 		
			AwardYearURL2;	

			
			


			@FindBy(xpath=".//*[@id='cigSearch']/table/tbody/tr[18]/td[2]")
			static List<WebElement> 		
			GeographiCAreaFocusURL2;
			
			



			@FindBy(xpath=".//*[@id='nationalFocus']")
			static List<WebElement>
			NationalFocusURL2;

			


			@FindBy(xpath=".//*[@id='nationalFocus']")
			static List<WebElement> 		
			RecipientStateTerritoryURL2;
			
			


			@FindBy(xpath=".//*[@id='docType']")
			static List<WebElement> 		
			DocumentTypeURL2;
			


			
			

			@FindBy(xpath=".//*[@id='projState']")
			static List<WebElement> 
			ProjectActivityStateTerritoryURL2;
		
			
			
			

			//Comparison Arrays
			
			
			public static List<String> LinksArrayURL1  =null;
			
			public static List<String> LinksArrayURL2  =null;


			public static List<String> YouAreHereArrayURL1  =null;
			
			public static List<String> YouAreHereArrayURL2  =null;
		 
		 

			public static void validateURL1(){
				
				
			
				String title1 = driver.getTitle();	

				String heading1 = headingURL1.getText();
				
				
				
		//	System.out.println("Title of URL1 is " +title1);
				
		//	System.out.println("Heading of url1 is "+heading1);
				
				
				List<String>YouAreHereArrayURL1  = new ArrayList<String>();


			List<WebElement> YouAreHereURL1_elements=YouAreHereURL1.findElements(By.tagName("p"));
			
			
			
			for(int i=0;i<=(YouAreHereURL1_elements).size()-1;i++){
				
				String text=YouAreHereURL1_elements.get(i).getText();
				
				String NewText = text.trim();
				
				YouAreHereArrayURL1.add(NewText);

			}
			
			System.out.println("The breadcrumb of url1 is " +YouAreHereArrayURL1);
			
			
			System.out.println("\t");
			
			
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
				System.out.println("\t");

				
			//	System.out.println("first url arrays are "+LinksArrayURL1);
				
				
				
			String contentURL1 =BodyURL1.getText();
				

			System.out.println("The contents in URL1 are ");
			System.out.println(contentURL1);
			
			System.out.println("\t");

			List<WebElement>el=SearchByGrantTypeURL1;
			

			
			for(int i=0; i<=el.size()-1; i++){
				System.out.println("Search By Grant Type are ");
			System.out.println(el.get(i).getText());	
			}
			
			//validating search (GeneralTextSearch)

			GeneralTextSearchURL1.sendKeys("soil");
			
			SearchButton1URL1.click();
			
			String heading_searchResult = driver.findElement(By.xpath(".//*[@id='cigSearch']/h2")).getText();
			
			if(heading_searchResult.equalsIgnoreCase("Search Results - Conservation Innovation Grants")){
				System.out.println("the search worked");
			}
			
			
	
			//Validating search (Keywords)
			
			/*
			KeywordsURL1.sendKeys("soil");
			
			SearchButton1URL1.click();
			
			String heading_searchResult2 = driver.findElement(By.xpath(".//*[@id='cigSearch']/h2")).getText();
			
			if(heading_searchResult2.equalsIgnoreCase("Search Results - Conservation Innovation Grants")){
				System.out.println("the search worked");
			}
			
			
			
			*/
	/*		
			
WebElement el1= ResourceConcernsURL1;

List<WebElement>items  = el1.findElements(By.tagName("li"));
		
		for(int i=0; i<=items.size()-1; i++){
			System.out.println("SResource Concern(s) are " );
			
			
			System.out.println(items.get(i).getText());
		}
		
		
		Select dropdown = new Select(ProjectEcoregionURL1);
		List<WebElement>e2=dropdown.getOptions();
		for(int i=0;i<=e2.size()-1;i++){
			System.out.println("Project Activity State/Territory ");
			
			System.out.println(e2.get(i).getText());
		}
		System.out.println("Project Activity State/Territory "+e2.size());


			
			
			
		Select dropdown1= new Select(ProjectEcoregionURL1);
		List<WebElement>e3=dropdown.getOptions();
		for(int i=0;i<=e3.size()-1;i++){
			System.out.println("Project Ecoregion(s)");
			System.out.println(e3.get(i).getText());
		}
		System.out.println("Project Ecoregion(s) "+e3.size());
	
			
			*/
			
			
			
	//URL2 Methods

		driver.get(DataProviderFactory.getConfig().getApplicationUrl2()+"ciglanding/az/programs/financial/cig/cigsearch/");


		String heading2= headingURL2.getText();
		
		String title2=driver.getTitle();

		System.out.println("Title of URL1 is " +title1);
		
		System.out.println("\t");


		System.out.println("Title of URL2 is " +title2);
		System.out.println("\t");


					
		System.out.println("Heading of url1 is "+heading1);
		System.out.println("\t");



        System.out.println("Heading of URL2 is " +heading2);
		System.out.println("\t");


	if(heading1.equals(heading2)){
		
		System.out.println("heading of both urls are same");
		
	}
		

	System.out.println("\t");

if(title1.equals(title2)){
	
	System.out.println("Titles of both URLs are same");
}
	
System.out.println("\t");

	List<String>YouAreHereArrayURL2  = new ArrayList<String>();


		List<WebElement> YouAreHereURL2_elements=YouAreHereURL2.findElements(By.tagName("p"));
		
		
		
		for(int i=0;i<=(YouAreHereURL2_elements).size()-1;i++){
			
			String text=YouAreHereURL2_elements.get(i).getText();
			
			String NewText = text.trim();
			
			YouAreHereArrayURL2.add(NewText);

		}
		
		System.out.println("The breadcrumb of url2 is " +YouAreHereArrayURL2);
		
		System.out.println("\t");

		
		Boolean value2 =Arrays.equals(YouAreHereArrayURL2.toArray(),YouAreHereArrayURL1.toArray());
		
		
	try{	
		
	if (value2==true){
			
			System.out.println("You are here items on both urls are same");
		}
	

	if(value2==false){
System.out.println("Breadcrumb of both urls are not same");
		
	}
	
	}
	catch(Exception e){
			
			System.out.println("The exception is "+e.getMessage());
			
		}
	
	
	System.out.println("\t");

		
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
			
			//System.out.println(LinksArrayURL2);
			
			System.out.println("\t");

			
			
			
			
			String contentURL2=BodyURL2.getText();
				

			System.out.println("The contents in URL2 are ");
			System.out.println(contentURL2);			
			System.out.println("\t");

	
	
try{	
	if(count==count1){
		
		System.out.println("Both URLs has got same number of internal and external links");
	}
	
	else{
		
		System.out.println("No of links doesnt match in both URLs");
	}
	
	
}catch(Exception e){
	
	System.out.println(e.getMessage());
}
	
System.out.println("\t");


if(	contentURL1.equals(contentURL2)){
	
	System.out.println("The contents in both URLs are same");
}

else{
	
	System.out.println("The contents in both URLs are not same");
}
	
System.out.println("\t");

	
			}
/*
	Boolean value3 =Arrays.equals(LinksArrayURL1.toArray(),LinksArrayURL2.toArray());
		
	try{
		
	if (value3=true){
		
		System.out.println("Links on both urls are same");
	}

	}catch(Exception e){
		
		System.out.println("The exception is "+e.getMessage());
	}
	}
*/


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
