package pages1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.DataProviderFactory;

public class SurfaceWaterSupplyIndex1 {

	

static WebDriver driver;
	
	public SurfaceWaterSupplyIndex1(WebDriver Idriver){
		
		this.driver=Idriver;
	}
	
	//URL1 Elements
	
	static String title1;
	
	@FindBy(xpath=".//*[@id='traversed']")
	static WebElement YouAreHereURL1;
	

	//URL2 Elements
		
	String title2;
		
		@FindBy(id="traversed")
		static WebElement YouAreHereURL2;
		
//Arrays Comaparison

		public static List<String> YouAreHereArrayURL1  =null;
		
		public static List<String> YouAreHereArrayURL2  =null;
	

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

}
	
}
