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

public class Agronomy_NScenario {

	
	static WebDriver driver;
	
	public Agronomy_NScenario(WebDriver Idriver){
		this.driver=Idriver;
	}
	
	//URL1 Elements
	
	
	@FindBy(xpath=".//*[@id='traversed']")
	static WebElement YouAreHereURL1;
	

	//URL2 Elements
		
		// demo find xpath for new dev page - Priya
		
		@FindBy(xpath=".//*[@id='traversed']")
		static WebElement YouAreHereURL2;
		
//Arrays Comaparison

		public static List<String> YouAreHereArrayURL1  =null;
		
		public static List<String> YouAreHereArrayURL2  =null;
	

		public static String getApplicationTitle1() {
			
			return driver.getTitle();
		}

		public static void validateURL(){
	
	
			
			List<String>YouAreHereArrayURL1  = new ArrayList<String>();


		List<WebElement> YouAreHereURL1_elements=YouAreHereURL1.findElements(By.tagName("p"));
		
		
		
		for(int i=0;i<=(YouAreHereURL1_elements).size()-1;i++){
			
			String text=YouAreHereURL1_elements.get(i).getText();
			
			
			YouAreHereArrayURL1.add(text);
		}
		
		System.out.println(YouAreHereArrayURL1);
		
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl2()+"main/az/technical/ecoscience/bio/");

	
	List<String>YouAreHereArrayURL2  = new ArrayList<String>();


	List<WebElement> YouAreHereURL2_elements=YouAreHereURL2.findElements(By.tagName("p"));
	
	
	
	for(int i=0;i<=(YouAreHereURL2_elements).size()-1;i++){
		
		String text=YouAreHereURL2_elements.get(i).getText();
		
		
		YouAreHereArrayURL2.add(text);
	}
	
	System.out.println(YouAreHereArrayURL2);
	
	
	Assert.assertEquals(getApplicationTitle1(),getApplicationTitle2());
	
	System.out.println("inside compare method1"+YouAreHereArrayURL2);

	System.out.println("inside compare method2"+YouAreHereArrayURL1);

	/*Boolean value2 =Arrays.deepEquals(YouAreHereArrayURL2.toArray(),YouAreHereArrayURL1.toArray());
	
	
try{	
	
if (value2=true){
		
		System.out.println("You are here items on both urls are same");
	}
}
catch(Exception e){
		
		System.out.println("The exception is "+e.getMessage());
	}
		}
		*/
	
	
	 String[] arrayA = null;
	 String[] arrayB = null;
	
	if ( YouAreHereArrayURL2.size() > 0 )
	{
		  System.out.println("size: "+ YouAreHereArrayURL2.size());
    arrayA =YouAreHereArrayURL2.toArray(new String[YouAreHereArrayURL2.size()]);
   	}
	if ( YouAreHereArrayURL1.size() > 0 )
	{
	arrayB =  YouAreHereArrayURL1.toArray(new String[YouAreHereArrayURL1.size()]);
	}
  
	
    boolean foundSwitch = false;

  try {
      if (arrayA != null )
       {
        for(int K = 0; K < arrayA.length; K++)
        {
         	if(arrayB!=null)
	       {
             for (int j = 0; j < arrayB.length;j++)
             {
               if( arrayA[K].equals(arrayB[j]))
                {
            	 //  System.out.println("arrayA "+ arrayA[K]);
            	   // System.out.println("arrayB "+ arrayB[j]);
                foundSwitch = true;
               
                 }
               else
               {
            	   foundSwitch = false;
               }
              }
             
            // System.out.println("Arrays are "+foundSwitch);
            }

        }
       }
      if(foundSwitch == true)
      {
    	  System.out.println("Contents of both URL Arrays are same");  
      }
      if(foundSwitch == false )
      {
    	  System.out.println("Contents of both URL Arrays are not same");    
      }
  }catch(Exception e){
	  System.out.println(e.getMessage());
  }
		}

public static String getApplicationTitle2(){
	
	return driver.getTitle();
	
}

	

}
