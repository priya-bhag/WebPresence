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

import factory.DataProviderFactory;

public class ConservationPlanning1 {
	
	

	
	static WebDriver driver;
	
	public ConservationPlanning1(WebDriver Idriver){
		this.driver=Idriver;
	}
	
	//URL1 Elements
	
	
	
	@FindBy(xpath=".//*[@id='overview']/h2/a")
	static	WebElement headingURL1;

	
	@FindBy(xpath=".//*[@id='traversed']")
	static WebElement YouAreHereURL1;
	
	
	@FindBy(xpath=".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[3]/table/tbody/tr/td/table/tbody/tr/td")
	static WebElement BodyURL1;


	@FindBy(xpath=".//*[@id='table24']/tbody/tr/td[1]/p/img")
	static
	WebElement Image1URL1;
	
	@FindBy(xpath=".//*[@id='table28']/tbody/tr/td[1]/p/img")
	static
	WebElement Image2URL1;
	
	
	
	@FindBy(xpath=".//*[@id='table27']/tbody/tr/td[1]/p/img")
	
	static
	WebElement Image3URL1;
	
	
	@FindBy(xpath=".//*[@id='table25']/tbody/tr/td[1]/p/img")
	
	static
	WebElement Image4URL1;
	
	
	@FindBy(xpath=".//*[@id='table31']/tbody/tr/td[1]/p/img")
	
	
	static
	WebElement Image5URL1;
	
	
	@FindBy(xpath=".//*[@id='table30']/tbody/tr/td[1]/p/img")
	
	static
	WebElement Image6URL1;
	
	
	@FindBy(xpath=".//*[@id='table23']/tbody/tr/td[1]/p/img")
	
	static
	WebElement Image7URL1;
	
	
	@FindBy(xpath=".//*[@id='table29']/tbody/tr/td[1]/p/img")
	
	static
	WebElement Image8URL1;
	
	@FindBy(xpath=".//*[@id='table26']/tbody/tr/td[1]/p/img")
	static
	WebElement Image9URL1;
	
	
	@FindBy(xpath=".//*[@id='table22']/tbody/tr/td[1]/p/img")
	static
	WebElement Image10URL1;
	
	
	

	//URL2 Elements
		
		
		
		@FindBy(xpath="") static WebElement headingURL2;
		
		
		@FindBy(xpath="")
		static WebElement YouAreHereURL2;
		
		
		@FindBy(xpath="")
		static WebElement BodyURL2;


		@FindBy(xpath=".//*[@id='overview']/h3[2]/span/b/span/img")
		static
		WebElement Image1URL2;
		
		@FindBy(xpath=".//*[@id='overview']/h3[4]/span/b/span/img")
		static
		WebElement Image2URL2;
		
		
		
		@FindBy(xpath=".//*[@id='overview']/h3[6]/span/b/span/span/img")
		
		static
		WebElement Image3URL2;
		
		
		@FindBy(xpath=".//*[@id='overview']/h3[7]/span/b/span/span/img")
		
		static
		WebElement Image4URL2;
		
		
		@FindBy(xpath=".//*[@id='overview']/h3[8]/span/b/span/span/img")
		
		
		static
		WebElement Image5URL2;
		
		
		@FindBy(xpath=".//*[@id='overview']/h3[9]/span/b/span/span/img")
		
		static
		WebElement Image6URL2;
		
		
		@FindBy(xpath=".//*[@id='overview']/h3[10]/span/b/span/img")
		
		static
		WebElement Image7URL2;
		
		
		@FindBy(xpath=".//*[@id='overview']/h3[11]/span/b/span/span/img")
		
		static
		WebElement Image8URL2;
		
		@FindBy(xpath=".//*[@id='overview']/h3[12]/span/b/span/span/img")
		static
		WebElement Image9URL2;
		
		
		@FindBy(xpath=".//*[@id='overview']/h3[13]/span/b/span/span/img")
		static
		WebElement Image10URL2;
		
		

		//Comparison Arrays
			
			
			public static List<String> LinksArrayURL1  =null;
			
			public static List<String> LinksArrayURL2  =null;


			public static List<String> YouAreHereArrayURL1  =null;
			
			public static List<String> YouAreHereArrayURL2  =null;

			public static List<Object> ImageArray1URL1=null;

			public static  List<Object> ImageArray1URL2 =null;
	

			public static List<Object> ImageArray2URL1=null;

			public static  List<Object> ImageArray2URL2 =null;

			public static List<Object> ImageArray3URL1=null;

			public static  List<Object> ImageArray3URL2 =null;
			
			public static List<Object> ImageArray4URL1=null;

			public static  List<Object> ImageArray4URL2 =null;
			
			public static List<Object> ImageArray5URL1=null;

			public static  List<Object> ImageArray5URL2 =null;
			
			public static List<Object> ImageArray6URL1=null;

			public static  List<Object> ImageArray6URL2 =null;
			
			public static List<Object> ImageArray7URL1=null;

			public static  List<Object> ImageArray7URL2 =null;
			public static List<Object> ImageArray8URL1=null;

			public static  List<Object> ImageArray8URL2 =null;
			public static List<Object> ImageArray9URL1=null;

			public static  List<Object> ImageArray9URL2 =null;
			public static List<Object> ImageArray10URL1=null;

			public static  List<Object> ImageArray10URL2 =null;
	

	
	public static void validateURL(){
		
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
		
		//image_check(Image1URL1);

		ImageArray1URL1 =image_check(Image1URL1);
		
		ImageArray2URL1 =image_check(Image2URL1);
		
		ImageArray3URL1 =image_check(Image3URL1);
		
		ImageArray4URL1 =image_check(Image4URL1);
		
		ImageArray5URL1 =image_check(Image5URL1);
		
		ImageArray6URL1 =image_check(Image6URL1);
		
		ImageArray7URL1 =image_check(Image7URL1);

		ImageArray8URL1 =image_check(Image8URL1);
		
		ImageArray9URL1 =image_check(Image9URL1);
		
		
		 ImageArray10URL1=image_check(Image10URL1);;

		
		String content1=BodyURL1.getText();
		
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl2()+"main/az/technical/cp/#");
		
		String content2=BodyURL2.getText();
		
		if (content1.contentEquals(content2)){
			System.out.println("Contents on both URLs are same");
		}

		
	String title2=	driver.getTitle();


	String heading2= headingURL2.getText();
	
//ystem.out.println(heading2);
	
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
			
		System.out.println("No of links in URL2 are "+count1);
		
		System.out.println(LinksArrayURL2);
			
				
	  //  image_check(Image1URL2);
		


ImageArray1URL2 =image_check(Image1URL2);

ImageArray2URL2 =image_check(Image2URL2);

ImageArray3URL2 =image_check(Image3URL2);

ImageArray4URL2 =image_check(Image4URL2);

ImageArray5URL2 =image_check(Image5URL2);

ImageArray6URL2 =image_check(Image6URL2);

ImageArray7URL2 =image_check(Image7URL2);

ImageArray8URL2 =image_check(Image8URL2);

ImageArray9URL2 =image_check(Image9URL2);


 ImageArray10URL2=image_check(Image10URL2);;



if(heading1.equals(heading2)){
		
		System.out.println("heading of both urls are same");
	}




Boolean value =Arrays.equals(ImageArray1URL1.toArray(),ImageArray1URL2.toArray());


try{	

if (value==true){
	
	System.out.println("Image1 on both urls are same");
}


if(value==false){
System.out.println("image1 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}

System.out.println("\t");


Boolean value5 =Arrays.equals(ImageArray2URL1.toArray(),ImageArray2URL2.toArray());


try{	

if (value5==true){
	
	System.out.println("Image2 on both urls are same");
}


if(value5==false){
System.out.println("image2 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}




Boolean a =Arrays.equals(ImageArray3URL1.toArray(),ImageArray3URL2.toArray());


try{	

if (a==true){
	
	System.out.println("Image3 on both urls are same");
}


if(a==false){
System.out.println("image3 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}




Boolean b =Arrays.equals(ImageArray4URL1.toArray(),ImageArray4URL2.toArray());


try{	

if (b==true){
	
	System.out.println("Image4 on both urls are same");
}


if(b==false){
System.out.println("image4 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}









Boolean c =Arrays.equals(ImageArray5URL1.toArray(),ImageArray5URL2.toArray());


try{	

if (c==true){
	
	System.out.println("Image5 on both urls are same");
}


if(c==false){
System.out.println("image5 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}








Boolean d =Arrays.equals(ImageArray6URL1.toArray(),ImageArray6URL2.toArray());


try{	

if (d==true){
	
	System.out.println("Image6 on both urls are same");
}


if(d==false){
System.out.println("image6 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}




Boolean f =Arrays.equals(ImageArray7URL1.toArray(),ImageArray7URL2.toArray());


try{	

if (f==true){
	
	System.out.println("Image7 on both urls are same");
}


if(f==false){
System.out.println("image7 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}



Boolean g=Arrays.equals(ImageArray8URL1.toArray(),ImageArray8URL2.toArray());


try{	

if (g==true){
	
	System.out.println("Image8 on both urls are same");
}


if(g==false){
System.out.println("image8 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}




Boolean f1 =Arrays.equals(ImageArray9URL1.toArray(),ImageArray9URL2.toArray());


try{	

if (f1==true){
	
	System.out.println("Image9 on both urls are same");
}


if(f1==false){
System.out.println("image9 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}






Boolean f2 =Arrays.equals(ImageArray10URL1.toArray(),ImageArray10URL2.toArray());


try{	

if (f2==true){
	
	System.out.println("Image10 on both urls are same");
}


if(f2==false){
System.out.println("image10 of both urls are not same");

}

}
catch(Exception e){
	
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
			
			//ImageArray.add(width);
			//ImageArray.add(height);
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