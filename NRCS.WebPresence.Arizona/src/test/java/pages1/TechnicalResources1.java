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
import org.testng.Assert;
import org.testng.annotations.Test;

import factory.DataProviderFactory;
import 	pages.Home_Page;


public class TechnicalResources1 {

	
	
	
	static WebDriver driver;
	
	public TechnicalResources1(WebDriver Idriver){
		this.driver=Idriver;
	}
	
	//URL1 Elements
	

	
	
	@FindBy(xpath=".//*[@id='overview']/h2/a")
	static WebElement headingURL1;
	
	
	@FindBy(xpath=".//*[@id='traversed']")
	static WebElement YouAreHereURL1;
	
	
	@FindBy(xpath=".//*[@id='selectedTree']/ul/li")
	static List<WebElement> Table_MainelementsURL1;

	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li/ul/li/a[2]")
	static List<WebElement> Table_SubElementsURL1;

	
	
	@FindBy(xpath=".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[3]/table/tbody/tr/td/table/tbody/tr/td")
	static WebElement BodyURL1;



//URL2 Elements
	
	
	
	@FindBy(xpath="") static WebElement headingURL2;
	
	
	@FindBy(xpath="")
	static WebElement YouAreHereURL2;
	
	@FindBy(xpath="")
	static List<WebElement> Table_MainelementsURL2;


	@FindBy(xpath="")
	static List<WebElement> Table_SubElementsURL2;

	
	
	
	@FindBy(xpath="")
	static WebElement BodyURL2;







//Comparison Arrays
	
	
	public static List<String> LeftMainArrayURL1  =null;
	
	public static List<String> LeftMainArrayURL2  =null;

	public static List<String> LeftSubMenuArrayURL1  =null;
	
	public static List<String> LeftSubMenuArrayURL2 =null;

	
	public static List<String> LinksArrayURL1  =null;
	
	public static List<String> LinksArrayURL2  =null;


	public static List<String> YouAreHereArrayURL1  =null;
	
	public static List<String> YouAreHereArrayURL2  =null;



	
	//buttons URL1
	

	@FindBy(xpath=".//*[@id='firstElement']/div") static WebElement button1URL1;
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[2]/div") static WebElement button2URL1;
	


	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[3]/div") static WebElement button3URL1;
	


	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[5]/div") static WebElement button4URL1;
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li[6]/div") static WebElement button5URL1;
	

	
	
	
	//buttons URL2

	
	

	@FindBy(xpath="") static WebElement button1URL2;
	

	@FindBy(xpath="") static WebElement button2URL2;
	


	@FindBy(xpath="") static WebElement button3URL2;
	


	@FindBy(xpath="") static WebElement button4URL2;
	

	@FindBy(xpath="") static WebElement button5URL2;
	

	
	


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
	
System.out.println("The contents in URL1 are " +contentURL1);

System.out.println("\t");



	List<String> LeftMainArrayURL1 = new ArrayList<String>();


	List<WebElement> Left_MainMenuElementURL1=Table_MainelementsURL1;
	

	
	for(int i=0; i<= Left_MainMenuElementURL1.size()-1; i++){
		
		
		String text = Left_MainMenuElementURL1.get(i).getText();
		
		LeftMainArrayURL1.add(text);
		
	}
	

	System.out.println("Main menu elements are ");
	
	
	System.out.println(LeftMainArrayURL1);
	
	System.out.println("No of main menu elements "+LeftMainArrayURL1.size());
	
	
	System.out.println("\t");
	
	button1URL1.click();
	button2URL1.click();
	button3URL1.click();
	button4URL1.click();
	button5URL1.click();
	
	
	List<String> LeftSubMenuArrayURL1 = new ArrayList<String>();


	List<WebElement> Left_SubMenuElementURL1=Table_SubElementsURL1;
	

	
	for(int i=0; i<= Left_SubMenuElementURL1.size()-1; i++){
		
		
		String text = Left_SubMenuElementURL1.get(i).getText();
		
		LeftSubMenuArrayURL1.add(text);
		
	}

	System.out.println("sub menu elements are;");
	
	
	System.out.println(LeftSubMenuArrayURL1);

	
	System.out.println("No of sub menu elements " +LeftSubMenuArrayURL1.size());
	
	



//URL2 Methods

driver.get(DataProviderFactory.getConfig().getApplicationUrl3()+"main/az/about/");


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

driver.get(DataProviderFactory.getConfig().getApplicationUrl2()+"main/az/technical/");




List<String> LeftMainArrayURL2 = new ArrayList<String>();


List<WebElement> Left_MainMenuElementURL2=Table_MainelementsURL2;



for(int i=0; i<= Left_MainMenuElementURL2.size()-1; i++){
	
	
	String text = Left_MainMenuElementURL2.get(i).getText();
	
	LeftMainArrayURL2.add(text);
	
}

System.out.println("main menu elements are;");

System.out.println(LeftMainArrayURL2);

System.out.println("No of main menu elements in  "+LeftMainArrayURL2.size());


System.out.println("\t");

button1URL2.click();
button2URL2.click();
button3URL2.click();
button4URL2.click();
button5URL2.click();


List<String> LeftSubMenuArrayURL2 = new ArrayList<String>();


List<WebElement> Left_SubMenuElementURL2=Table_SubElementsURL2;



for(int i=0; i<= Left_SubMenuElementURL2.size()-1; i++){
	
	
	String text = Left_SubMenuElementURL2.get(i).getText();
	
	LeftSubMenuArrayURL2.add(text);
	
}

System.out.println("sub menu elements are;");
System.out.println(LeftSubMenuArrayURL2);


System.out.println("No of sub menu elements " +LeftSubMenuArrayURL2.size());



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
	
System.out.println("The contents in URL2 are " +contentURL2);

System.out.println("\t");


Boolean value =Arrays.equals(LeftMainArrayURL1.toArray(),LeftMainArrayURL2.toArray());

try{	if (value=true)

{
	
	System.out.println("Left menu items on both urls are same");
}
}
catch(Exception e){
	
System.out.println(e.toString());	
}
Boolean value1=	Arrays.equals(LeftSubMenuArrayURL1.toArray(),LeftSubMenuArrayURL1.toArray());


if (value1=true){
	
	System.out.println("Left menu sub items on both urls are same");
}



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
