package pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import factory.DataProviderFactory;

public class Agronomy {

	
	static WebDriver driver;
	
	public Agronomy(WebDriver Idriver){
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
	
			String title1= driver.getTitle();
			
			
			List<String>YouAreHereArrayURL1  = new ArrayList<String>();


		List<WebElement> YouAreHereURL1_elements=YouAreHereURL1.findElements(By.tagName("p"));
		
		
		
		for(int i=0;i<=(YouAreHereURL1_elements).size()-1;i++){
			
			String text=YouAreHereURL1_elements.get(i).getText();
			
			String NewText = text.trim();
			
			YouAreHereArrayURL1.add(NewText);
			
		
		}
		
		System.out.println(YouAreHereArrayURL1);
		
		//driver.get(DataProviderFactory.getConfig().getApplicationUrl2()+"az/technical/ecoscience/agronomy");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl3()+"az/technical/ecoscience/agronomy");

		
	List<String>YouAreHereArrayURL2  = new ArrayList<String>();
	
	List<WebElement>YouAreHere_itemsURL2 = YouAreHereURL2.findElements(By.tagName("p"));
	
	for(int j=0; j<=YouAreHere_itemsURL2.size()-1;j++){
		
		System.out.print(YouAreHere_itemsURL2.get(j).getText());

		String Text = (YouAreHere_itemsURL2.get(j).getText());
		
		String NewText = Text.trim();
		
		YouAreHereArrayURL2.add(NewText);

	}
	
	System.out.println(YouAreHereArrayURL2);
	
	
	
	String title2= driver.getTitle();

	System.out.println("Title of URL1 is "+title1);
	System.out.println("Title of URL2 is "+title2);
	
	
	
Assert.assertEquals(title2, title1);
	
	
/*
if(title1.equals(title2)){
	System.out.println("Both titles are equal");
}*/
	
	System.out.println("\t");
	
	System.out.println("inside compare method1"+YouAreHereArrayURL1);

	System.out.println("inside compare method2"+YouAreHereArrayURL2);

	Boolean value2 =Arrays.equals(YouAreHereArrayURL2.toArray(),YouAreHereArrayURL1.toArray());
	
	
try{	
	
if (value2){
		
		System.out.println("You are here items on both urls are same");
	}

else{
	
	System.out.println("You are items on both urls are not same ");
}


}
catch(Exception e){
		
		System.out.println("The exception is "+e.getMessage());
	}
		
}
		
}