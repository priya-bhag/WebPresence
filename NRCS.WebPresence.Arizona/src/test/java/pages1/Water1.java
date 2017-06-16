package pages1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.DataProviderFactory;

public class Water1 {
	

	
static WebDriver driver;
	
	public Water1(WebDriver Idriver){
		
		this.driver=Idriver;
	}
	
	//URL1 Elements
	
	static String title1;
	
	@FindBy(xpath=".//*[@id='traversed']")
	static WebElement YouAreHereURL1;
	
	
	

@FindBy(xpath=".//*[@id='selectedTree']/ul/li/a[2]")
static List<WebElement> Table_MainelementsURL1;



	
	
	

	//URL2 Elements
		
	String title2;
		
		@FindBy(id="traversed")
		static WebElement YouAreHereURL2;
		
		
		

		@FindBy(xpath="")
		static List<WebElement> Table_MainelementsURL2;

		
//Arrays Comaparison

		public static List<String> YouAreHereArrayURL1  =null;
		
		public static List<String> YouAreHereArrayURL2  =null;
		
		
		
		

		public static List<String> LeftMainArrayURL1  =null;
		
		public static List<String> LeftMainArrayURL2  =null;

	

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


//URL2 Methods

driver.get(DataProviderFactory.getConfig().getApplicationUrl2()+"main/az/water/");


String title2=driver.getTitle();

System.out.println("Title of URL1 is " +title1);

System.out.println("\t");


System.out.println("Title of URL2 is " +title2);
System.out.println("\t");


if(title1.equals(title2)){

System.out.println("Titles of both URLs are same");
}

System.out.println("\t");



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



Boolean value =Arrays.equals(LeftMainArrayURL1.toArray(),LeftMainArrayURL2.toArray());

try{	if (value=true)

{
	
	System.out.println("Left menu items on both urls are same");
}
}
catch(Exception e){
	
System.out.println(e.toString());	
}

}
}
