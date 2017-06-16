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

import factory.DataProviderFactory;

public class Newsroom1 {

	
	static WebDriver driver;
	
	public Newsroom1(WebDriver Idriver){
		
		this.driver=Idriver;
	}
	
	//URL1 Elements
	
	
	
	@FindBy(xpath=".//*[@id='overview']/h2/a")
	static	WebElement headingURL1;


	

	@FindBy(xpath=".//*[@id='overview']/h3[2]/span/b/span/img")
	static
	WebElement Image1URL1;
	
	@FindBy(xpath=".//*[@id='overview']/h3[4]/span/b/span/img")
	static
	WebElement Image2URL1;
	
	
	
	@FindBy(xpath=".//*[@id='overview']/h3[6]/span/b/span/span/img")
	
	static
	WebElement Image3URL1;
	
	
	@FindBy(xpath=".//*[@id='overview']/h3[7]/span/b/span/span/img")
	
	static
	WebElement Image4URL1;
	
	
	@FindBy(xpath=".//*[@id='overview']/h3[8]/span/b/span/span/img")
	
	
	static
	WebElement Image5URL1;
	
	
	@FindBy(xpath=".//*[@id='overview']/h3[9]/span/b/span/span/img")
	
	static
	WebElement Image6URL1;
	
	
	@FindBy(xpath=".//*[@id='overview']/h3[10]/span/b/span/img")
	
	static
	WebElement Image7URL1;
	
	
	@FindBy(xpath=".//*[@id='overview']/h3[11]/span/b/span/span/img")
	
	static
	WebElement Image8URL1;
	
	@FindBy(xpath=".//*[@id='overview']/h3[12]/span/b/span/span/img")
	static
	WebElement Image9URL1;
	
	
	@FindBy(xpath=".//*[@id='overview']/h3[13]/span/b/span/span/img")
	static
	WebElement Image10URL1;
	
	

	@FindBy(xpath=".//*[@id='overview']/h3[14]/span/b/span/span/img")
	
	static
	WebElement Image11URL1;
	

	@FindBy(xpath=".//*[@id='overview']/h3[15]/span/b/span/span/img")
	
	static
	WebElement Image12URL1;;
	
	

	@FindBy(xpath=".//*[@id='overview']/h3[16]/span/b/span/span/img")
	
	static
	WebElement Image13URL1;
	
	

	@FindBy(xpath=".//*[@id='overview']/h3[17]/span/b/span/span/img")
	
	static
	WebElement Image14URL1;

	

	@FindBy(xpath=".//*[@id='overview']/h3[20]/span/b/span/img")
	
	static
	WebElement Image15URL1;
	

	@FindBy(xpath=".//*[@id='overview']/h3[19]/span/b/span/img")
	
	static
	WebElement Image16URL1;
	
	

	@FindBy(xpath=".//*[@id='overview']/h3[20]/span/b/span/img")
	
	static
	WebElement Image17URL1;

	@FindBy(xpath=".//*[@id='overview']/h3[21]/span/b/span/img")
	
	static
	WebElement Image18URL1;
	

	@FindBy(xpath=".//*[@id='overview']/h3[22]/span/b/span/span/img")
	
	static
	WebElement Image19URL1;
	

	@FindBy(xpath=".//*[@id='overview']/h3[23]/span/b/span/span/img")
	static
	WebElement Image20URL1;
	

	@FindBy(xpath=".//*[@id='overview']/h3[24]/span/b/span/span/img")
	static
	WebElement Image21URL1;
	
	
	
	@FindBy(xpath=".//*[@id='overview']/h3[25]/span/b/span/img")
	static
	WebElement Image22URL1;
	
	
	@FindBy(xpath=".//*[@id='overview']/h3[26]/span/b/span/img")
			
			static
			WebElement Image23URL1;
	
	
			@FindBy(xpath=".//*[@id='overview']/h3[27]/span/b/span/span/img")
			static
			WebElement Image24URL1;
			
			
			
		@FindBy(xpath=".//*[@id='overview']/h3[28]/span/b/span/span/img")
		static
		WebElement Image25URL1;
		
		
		@FindBy(xpath=".//*[@id='overview']/h3[29]/span/b/span/span/img")
		static
		WebElement Image26URL1;
		
		
		
		@FindBy(xpath=".//*[@id='overview']/h3[30]/span/b/span/span/strong/img")
		static
		WebElement Image27URL1;
		
		
		@FindBy(xpath=".//*[@id='overview']/h3[31]/span/b/span/img")
		static
		WebElement Image28URL1;
		
		
		
		@FindBy(xpath=".//*[@id='overview']/h3[32]/span/b/span/img")
		static
		WebElement Image29URL1;
		
		@FindBy(xpath=".//*[@id='overview']/div[31]/h3/span/b/span/span/img")
		static
		WebElement Image30URL1;
		
		
		@FindBy(xpath=".//*[@id='overview']/h3[33]/span/b/span/span/img")
		static
		WebElement Image31URL1;
		
		@FindBy(xpath=".//*[@id='overview']/h3[34]/span/b/span/span/img")
		static
		WebElement Image32URL1;
		
		
			@FindBy(xpath=".//*[@id='overview']/h3[36]/span/b/span/img")
			static
			WebElement Image33URL1;

			@FindBy(xpath=".//*[@id='overview']/h3[37]/span/b/span/img")
		static
		WebElement Image34URL1;
			
			
		@FindBy(xpath=".//*[@id='overview']/h3[38]/span/b/span/img")
		static
		WebElement Image35URL1;
		
		
	@FindBy(xpath=".//*[@id='overview']/h3[39]/span/b/span/img")
	static
	WebElement Image36URL1;
	
	
			@FindBy(xpath=".//*[@id='overview']/h3[40]/span/b/span/font/img")
			static
			WebElement Image37URL1;
			
			
		@FindBy(xpath=".//*[@id='overview']/h3[41]/span/b/span/img")
		static
		WebElement Image38URL1;
		
		
			@FindBy(xpath=".//*[@id='overview']/h3[42]/span/b/span/img")
			static
			WebElement Image39URL1;
			
			
			@FindBy(xpath=".//*[@id='overview']/h3[43]/span/b/span/span/strong/img")
			static
			WebElement Image40URL1;
			
			
			@FindBy(xpath=".//*[@id='overview']/h3[45]/b/img")
			static
			WebElement Image41URL1;
			
		@FindBy(xpath=".//*[@id='overview']/h3[46]/b/font/img")
		static
		WebElement Image42URL1;
		
		
		@FindBy(xpath=".//*[@id='overview']/h3[47]/b/font/img")
		static
		WebElement Image43URL1;
		
		
		@FindBy(xpath=".//*[@id='overview']/h3[47]/b/font/img")
		static
		WebElement Image44URL1;
	
	@FindBy(xpath=".//*[@id='traversed']")
	static WebElement YouAreHereURL1;
	

	@FindBy(xpath=".//*[@id='selectedTree']/ul/li/a[2]")
	static List<WebElement> Table_MainelementsURL1;
	
	@FindBy(xpath=".//*[@id='mainContent']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[3]/table/tbody/tr/td/table/tbody/tr/td")
	static WebElement BodyURL1;

	

	//URL2 Elements
		
		
		
		@FindBy(xpath="") static WebElement headingURL2;
		
		
		@FindBy(xpath="")
		static WebElement YouAreHereURL2;
		
		
		@FindBy(xpath="")
		static WebElement BodyURL2;


		@FindBy(xpath="")
		static List<WebElement> Table_MainelementsURL2;


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
		
		

		@FindBy(xpath=".//*[@id='overview']/h3[14]/span/b/span/span/img")
		
		static
		WebElement Image11URL2;
		

		@FindBy(xpath=".//*[@id='overview']/h3[15]/span/b/span/span/img")
		
		static
		WebElement Image12URL2;;
		
		

		@FindBy(xpath=".//*[@id='overview']/h3[16]/span/b/span/span/img")
		
		static
		WebElement Image13URL2;
		
		

		@FindBy(xpath=".//*[@id='overview']/h3[17]/span/b/span/span/img")
		
		static
		WebElement Image14URL2;

		

		@FindBy(xpath=".//*[@id='overview']/h3[20]/span/b/span/img")
		
		static
		WebElement Image15URL2;
		

		@FindBy(xpath=".//*[@id='overview']/h3[19]/span/b/span/img")
		
		static
		WebElement Image16URL2;
		
		

		@FindBy(xpath=".//*[@id='overview']/h3[20]/span/b/span/img")
		
		static
		WebElement Image17URL2;

		@FindBy(xpath=".//*[@id='overview']/h3[21]/span/b/span/img")
		
		static
		WebElement Image18URL2;
		

		@FindBy(xpath=".//*[@id='overview']/h3[22]/span/b/span/span/img")
		
		static
		WebElement Image19URL2;
		

		@FindBy(xpath=".//*[@id='overview']/h3[23]/span/b/span/span/img")
		static
		WebElement Image20URL2;
		

		@FindBy(xpath=".//*[@id='overview']/h3[24]/span/b/span/span/img")
		static
		WebElement Image21URL2;
		
		
		
		@FindBy(xpath=".//*[@id='overview']/h3[25]/span/b/span/img")
		static
		WebElement Image22URL2;
		
		
		@FindBy(xpath=".//*[@id='overview']/h3[26]/span/b/span/img")
				
				static
				WebElement Image23URL2;
		
		
				@FindBy(xpath=".//*[@id='overview']/h3[27]/span/b/span/span/img")
				static
				WebElement Image24URL2;
				
				
				
			@FindBy(xpath=".//*[@id='overview']/h3[28]/span/b/span/span/img")
			static
			WebElement Image25URL2;
			
			
			@FindBy(xpath=".//*[@id='overview']/h3[29]/span/b/span/span/img")
			static
			WebElement Image26URL2;
			
			
			
			@FindBy(xpath=".//*[@id='overview']/h3[30]/span/b/span/span/strong/img")
			static
			WebElement Image27URL2;
			
			
			@FindBy(xpath=".//*[@id='overview']/h3[31]/span/b/span/img")
			static
			WebElement Image28URL2;
			
			
			
			@FindBy(xpath=".//*[@id='overview']/h3[32]/span/b/span/img")
			static
			WebElement Image29URL2;
			
			@FindBy(xpath=".//*[@id='overview']/div[31]/h3/span/b/span/span/img")
			static
			WebElement Image30URL2;
			
			
			@FindBy(xpath=".//*[@id='overview']/h3[33]/span/b/span/span/img")
			static
			WebElement Image31URL2;
			
			@FindBy(xpath=".//*[@id='overview']/h3[34]/span/b/span/span/img")
			static
			WebElement Image32URL2;
			
			
				@FindBy(xpath=".//*[@id='overview']/h3[36]/span/b/span/img")
				static
				WebElement Image33URL2;

				@FindBy(xpath=".//*[@id='overview']/h3[37]/span/b/span/img")
			static
			WebElement Image34URL2;
				
				
			@FindBy(xpath=".//*[@id='overview']/h3[38]/span/b/span/img")
			static
			WebElement Image35URL2;
			
			
		@FindBy(xpath=".//*[@id='overview']/h3[39]/span/b/span/img")
		static
		WebElement Image36URL2;
		
		
				@FindBy(xpath=".//*[@id='overview']/h3[40]/span/b/span/font/img")
				static
				WebElement Image37URL2;
				
				
			@FindBy(xpath=".//*[@id='overview']/h3[41]/span/b/span/img")
			static
			WebElement Image38URL2;
			
			
				@FindBy(xpath=".//*[@id='overview']/h3[42]/span/b/span/img")
				static
				WebElement Image39URL2;
				
				
			@FindBy(xpath=".//*[@id='overview']/h3[43]/span/b/span/span/strong/img")
				static
				WebElement Image40URL2;
				
				
				@FindBy(xpath=".//*[@id='overview']/h3[45]/b/img")
				static
				WebElement Image41URL2;
				
			@FindBy(xpath=".//*[@id='overview']/h3[46]/b/font/img")
			static
			WebElement Image42URL2;
			
			
			@FindBy(xpath=".//*[@id='overview']/h3[47]/b/font/img")
			static
			WebElement Image43URL2;
			
			
			@FindBy(xpath=".//*[@id='overview']/h3[47]/b/font/img")
			static
			WebElement Image44URL2;
		

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
			public static List<Object> ImageArray11URL1=null;

			public static  List<Object> ImageArray11URL2 =null;
			
			public static List<Object> ImageArray12URL1=null;

			public static  List<Object> ImageArray12URL2 =null;
			
			public static List<Object> ImageArray13URL1=null;

			public static  List<Object> ImageArray13URL2 =null;
			
			public static List<Object> ImageArray14URL1=null;

			public static  List<Object> ImageArray14URL2 =null;
			
			
			public static List<Object> ImageArray15URL1=null;

			public static  List<Object> ImageArray15URL2 =null;
			
			public static List<Object> ImageArray16URL1=null;

			public static  List<Object> ImageArray16URL2 =null;
			
			public static List<Object> ImageArray17URL1=null;

			public static  List<Object> ImageArray17URL2 =null;
			
			public static List<Object> ImageArray18URL1=null;

			public static  List<Object> ImageArray18URL2 =null;
			
			
			public static List<Object> ImageArray19URL1=null;

			public static  List<Object> ImageArray19URL2 =null;
			
			
			public static List<Object> ImageArray20URL1=null;

			public static  List<Object> ImageArray20URL2 =null;
			
			public static List<Object> ImageArray21URL1=null;

			public static  List<Object> ImageArray21URL2 =null;
			public static List<Object> ImageArray22URL1=null;

			public static  List<Object> ImageArray22URL2 =null;
			
			public static List<Object> ImageArray23URL1=null;

			public static  List<Object> ImageArray23URL2 =null;
			
			public static List<Object> ImageArray24URL1=null;

			public static  List<Object> ImageArray24URL2 =null;
			
			public static List<Object> ImageArray25URL1=null;

			public static  List<Object> ImageArray25URL2 =null;
			
			public static List<Object> ImageArray26URL1=null;

			public static  List<Object> ImageArray26URL2 =null;
			
			public static List<Object> ImageArray27URL1=null;

			public static  List<Object> ImageArray27URL2 =null;
			
			public static List<Object> ImageArray28URL1=null;

			public static  List<Object> ImageArray28URL2 =null;
			
			public static List<Object> ImageArray29URL1=null;

			public static  List<Object> ImageArray29URL2 =null;
			
			public static List<Object> ImageArray30URL1=null;

			public static  List<Object> ImageArray30URL2 =null;
			
			public static List<Object> ImageArray31URL1=null;

			public static  List<Object> ImageArray31URL2 =null;
			
			public static List<Object> ImageArray32URL1=null;

			public static  List<Object> ImageArray32URL2 =null;
			
			public static List<Object> ImageArray33URL1=null;
			

			public static  List<Object> ImageArray33URL2 =null;
			
			public static List<Object> ImageArray34URL1=null;

			public static  List<Object> ImageArray34URL2 =null;
			
			public static List<Object> ImageArray35URL1=null;

			public static  List<Object> ImageArray35URL2 =null;
			
			public static List<Object> ImageArray36URL1=null;

			public static  List<Object> ImageArray36URL2 =null;
			
			public static List<Object> ImageArray37URL1=null;

			public static  List<Object> ImageArray37URL2 =null;
			
			
			public static List<Object> ImageArray38URL1=null;

			public static  List<Object> ImageArray38URL2 =null;
			
			public static List<Object> ImageArray39URL1=null;

			public static  List<Object> ImageArray39URL2 =null;
			
			
			public static List<Object> ImageArray40URL1=null;

			public static  List<Object> ImageArray40URL2 =null;
			
			
			public static List<Object> ImageArray41URL1=null;

			public static  List<Object> ImageArray41URL2 =null;
			
			
			public static List<Object> ImageArray42URL1=null;

			public static  List<Object> ImageArray42URL2 =null;
			
			
			public static List<Object> ImageArray43URL1=null;

			public static  List<Object> ImageArray43URL2 =null;
			
			
			
			public static List<Object> ImageArray44URL1=null;

			public static  List<Object> ImageArray44URL2 =null;
			
			

			public static List<String> Table_MainelementsArrayURL1 =null;
			

			public static List<String> Table_MainelementsArrayURL2  =null;
	
	public static void validateURL(){
		
		
		String title1 = driver.getTitle();	

		String heading1 = headingURL1.getText();
		
		
		List<String>YouAreHereArrayURL1  = new ArrayList<String>();


	List<WebElement> YouAreHereURL1_elements=YouAreHereURL1.findElements(By.tagName("p"));
	
	
	
	for(int i=0;i<=(YouAreHereURL1_elements).size()-1;i++){
		
		String text=YouAreHereURL1_elements.get(i).getText();
		
		String NewText = text.trim();
		
		YouAreHereArrayURL1.add(NewText);

	}
	
	System.out.println("The breadcrumb of url1 is " +YouAreHereArrayURL1);
	
	
	
	System.out.println("\t");
	
	
	List<String>Table_MainelementsArrayURL1  = new ArrayList<String>();


	List<WebElement> Table_MainelementsURL1_elements=Table_MainelementsURL1;
	
	
	for(int i=0;i<=(Table_MainelementsURL1_elements).size()-1;i++){
		
		String text=Table_MainelementsURL1_elements.get(i).getText();
		
		//String NewText = text.trim();
		
		
		System.out.println("array elements are "+ text);
		
		Table_MainelementsArrayURL1.add(text);

	}
	
	System.out.println("The Left menu items are of url1 is " +Table_MainelementsArrayURL1 );
	
	
	
	
	

	
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

	 
	 
	 ImageArray11URL1=image_check(Image11URL1);

	
	 ImageArray12URL1=image_check(Image12URL1);

	 
	 ImageArray13URL1=image_check(Image13URL1);

	 
	 ImageArray14URL1=image_check(Image14URL1);
	 
	 ImageArray15URL1=image_check(Image15URL1);
	 
	 
	 ImageArray16URL1=image_check(Image16URL1);
	 
	 
	 ImageArray17URL1=image_check(Image17URL1);
	 
	 
	 ImageArray18URL1=image_check(Image18URL1);
	 
	 
	 ImageArray19URL1=image_check(Image19URL1);

	
	 ImageArray20URL1=image_check(Image20URL1);
	 
 ImageArray21URL1=image_check(Image21URL1);
 
 ImageArray22URL1=image_check(Image22URL1);

 ImageArray23URL1=image_check(Image23URL1);

	ImageArray24URL1=image_check(Image24URL1);
	
	
	
	ImageArray25URL1=image_check(Image25URL1);

	ImageArray26URL1=image_check(Image26URL1);
	
	ImageArray27URL1=image_check(Image27URL1);
	
	
	
	ImageArray28URL1=image_check(Image28URL1);
	
	
	ImageArray29URL1=image_check(Image29URL1);
	
	
	ImageArray30URL1=image_check(Image30URL1);
	
	
	ImageArray31URL1=image_check(Image31URL1);

	ImageArray32URL1=image_check(Image32URL1);
	
	
	ImageArray33URL1=image_check(Image33URL1);
	
	ImageArray34URL1=image_check(Image34URL1);
	
	
	ImageArray35URL1=image_check(Image35URL1);
	
	
	ImageArray36URL1=image_check(Image36URL1);
	
	
	ImageArray37URL1=image_check(Image37URL1);
	
	
	
	ImageArray38URL1=image_check(Image38URL1);
	
	ImageArray39URL1=image_check(Image39URL1);
	
	
	ImageArray40URL1=image_check(Image40URL1);
	
	
	ImageArray41URL1=image_check(Image41URL1);
	
	
	ImageArray42URL1=image_check(Image42URL1);
	
	
	
	ImageArray43URL1=image_check(Image43URL1);
	
	ImageArray44URL1=image_check(Image44URL1);
	
	
//URL2 Methods

driver.get(DataProviderFactory.getConfig().getApplicationUrl2()+"main/az/about/civilrights/");


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


List<WebElement> Table_MainelementsURL2_elements=Table_MainelementsURL2;


for(int i=0;i<=(Table_MainelementsURL2_elements).size()-1;i++){
	
	String text=Table_MainelementsURL2_elements.get(i).getText();
	
	String NewText = text.trim();
	
	Table_MainelementsArrayURL2 .add(NewText);

}

System.out.println("The Left menu items are of URL2 is " +Table_MainelementsArrayURL2 );






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

 
 
 ImageArray11URL2=image_check(Image11URL2);


 ImageArray12URL2=image_check(Image12URL2);

 
 ImageArray13URL2=image_check(Image13URL2);

 
 ImageArray14URL2=image_check(Image14URL2);
 
 ImageArray15URL2=image_check(Image15URL2);
 
 
 ImageArray16URL2=image_check(Image16URL2);
 
 
 ImageArray17URL2=image_check(Image17URL2);
 
 
 ImageArray20URL2=image_check(Image20URL2);
 
 
 ImageArray19URL2=image_check(Image19URL2);


 ImageArray20URL2=image_check(Image20URL2);
 
ImageArray21URL2=image_check(Image21URL2);

ImageArray22URL2=image_check(Image22URL2);

ImageArray23URL2=image_check(Image23URL2);

ImageArray24URL2=image_check(Image24URL2);



ImageArray25URL2=image_check(Image25URL2);

ImageArray26URL2=image_check(Image26URL2);

ImageArray27URL2=image_check(Image27URL2);



ImageArray28URL2=image_check(Image28URL2);


ImageArray29URL2=image_check(Image29URL2);


ImageArray30URL2=image_check(Image30URL2);


ImageArray31URL2=image_check(Image31URL2);

ImageArray32URL1=image_check(Image32URL2);


ImageArray33URL2=image_check(Image33URL2);

ImageArray34URL2=image_check(Image34URL2);


ImageArray35URL2=image_check(Image35URL2);


ImageArray36URL2=image_check(Image36URL2);


ImageArray37URL2=image_check(Image37URL2);



ImageArray38URL2=image_check(Image38URL2);

ImageArray39URL2=image_check(Image39URL2);


ImageArray40URL2=image_check(Image40URL2);


ImageArray41URL2=image_check(Image41URL2);


ImageArray42URL2=image_check(Image42URL2);



ImageArray43URL2=image_check(Image43URL2);

ImageArray44URL2=image_check(Image44URL2);


List<String>YouAreHereArrayURL2  = new ArrayList<String>();


List<WebElement> YouAreHereURL2_elements=YouAreHereURL2.findElements(By.tagName("p"));



for(int i=0;i<=(YouAreHereURL2_elements).size()-1;i++){
	
	String text=YouAreHereURL2_elements.get(i).getText();
	
	String NewText = text.trim();
	
	YouAreHereArrayURL2.add(NewText);

}

System.out.println("The breadcrumb of url2 is " +YouAreHereArrayURL2);

System.out.println("\t");





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





Boolean f11 =Arrays.equals(ImageArray11URL1.toArray(),ImageArray11URL2.toArray());


try{	

if (f11==true){
	
	System.out.println("Image11 on both urls are same");
}


if(f11==false){
System.out.println("image11 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}








Boolean f12 =Arrays.equals(ImageArray12URL1.toArray(),ImageArray12URL2.toArray());


try{	

if (f12==true){
	
	System.out.println("Image12 on both urls are same");
}


if(f12==false){
System.out.println("image12 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}









Boolean f13 =Arrays.equals(ImageArray13URL1.toArray(),ImageArray13URL2.toArray());


try{	

if (f13==true){
	
	System.out.println("Image13 on both urls are same");
}


if(f13==false){
System.out.println("image13 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}






Boolean f14 =Arrays.equals(ImageArray14URL1.toArray(),ImageArray14URL2.toArray());


try{	

if (f14==true){
	
	System.out.println("Image14 on both urls are same");
}


if(f14==false){
System.out.println("image14 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}




Boolean f15 =Arrays.equals(ImageArray15URL1.toArray(),ImageArray15URL2.toArray());


try{	

if (f15==true){
	
	System.out.println("Image15 on both urls are same");
}


if(f15==false){
System.out.println("image15 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}







Boolean f16 =Arrays.equals(ImageArray16URL1.toArray(),ImageArray16URL2.toArray());


try{	

if (f16==true){
	
	System.out.println("Image16 on both urls are same");
}


if(f16==false){
System.out.println("image16 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}


Boolean f17 =Arrays.equals(ImageArray17URL1.toArray(),ImageArray17URL2.toArray());


try{	

if (f17==true){
	
	System.out.println("Image17 on both urls are same");
}


if(f17==false){
System.out.println("image17 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}



Boolean f18 =Arrays.equals(ImageArray18URL1.toArray(),ImageArray18URL2.toArray());


try{	

if (f18==true){
	
	System.out.println("Image18 on both urls are same");
}


if(f18==false){
System.out.println("image18 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}




Boolean f19 =Arrays.equals(ImageArray19URL1.toArray(),ImageArray19URL2.toArray());


try{	

if (f19==true){
	
	System.out.println("Image19 on both urls are same");
}


if(f19==false){
System.out.println("image19 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}










Boolean f0 =Arrays.equals(ImageArray20URL1.toArray(),ImageArray20URL2.toArray());


try{	

if (f0==true){
	
	System.out.println("Image20 on both urls are same");
}


if(f0==false){
System.out.println("image20 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}




Boolean f21 =Arrays.equals(ImageArray21URL1.toArray(),ImageArray21URL2.toArray());


try{	

if (f21==true){
	
	System.out.println("Image21 on both urls are same");
}


if(f21==false){
System.out.println("image21 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}





Boolean f22 =Arrays.equals(ImageArray22URL1.toArray(),ImageArray22URL2.toArray());


try{	

if (f22==true){
	
	System.out.println("Image22 on both urls are same");
}


if(f22==false){
System.out.println("image22 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}







Boolean f23 =Arrays.equals(ImageArray23URL1.toArray(),ImageArray23URL2.toArray());


try{	

if (f23==true){
	
	System.out.println("Image23 on both urls are same");
}


if(f23==false){
System.out.println("image23 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}




Boolean f24 =Arrays.equals(ImageArray24URL1.toArray(),ImageArray24URL2.toArray());


try{	

if (f24==true){
	
	System.out.println("Image24 on both urls are same");
}


if(f24==false){
System.out.println("image24 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}





Boolean f25 =Arrays.equals(ImageArray25URL1.toArray(),ImageArray25URL2.toArray());


try{	

if (f25==true){
	
	System.out.println("Image25 on both urls are same");
}


if(f25==false){
System.out.println("image25 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}



Boolean f26 =Arrays.equals(ImageArray26URL1.toArray(),ImageArray26URL2.toArray());


try{	

if (f26==true){
	
	System.out.println("Image26 on both urls are same");
}


if(f26==false){
System.out.println("image26 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}





Boolean f27 =Arrays.equals(ImageArray27URL1.toArray(),ImageArray27URL2.toArray());


try{	

if (f27==true){
	
	System.out.println("Image27 on both urls are same");
}


if(f27==false){
System.out.println("image27 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}







Boolean f28 =Arrays.equals(ImageArray28URL1.toArray(),ImageArray28URL2.toArray());


try{	

if (f28==true){
	
	System.out.println("Image28 on both urls are same");
}


if(f28==false){
System.out.println("image28 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}





Boolean f29 =Arrays.equals(ImageArray29URL1.toArray(),ImageArray29URL2.toArray());


try{	

if (f29==true){
	
	System.out.println("Image29 on both urls are same");
}


if(f29==false){
System.out.println("image29 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}





Boolean f30 =Arrays.equals(ImageArray30URL1.toArray(),ImageArray30URL2.toArray());


try{	

if (f30==true){
	
	System.out.println("Image30 on both urls are same");
}


if(f30==false){
System.out.println("image30 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}






Boolean f31 =Arrays.equals(ImageArray31URL1.toArray(),ImageArray31URL2.toArray());


try{	

if (f31==true){
	
	System.out.println("Image31 on both urls are same");
}


if(f31==false){
System.out.println("image31 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}




Boolean f32 =Arrays.equals(ImageArray32URL1.toArray(),ImageArray32URL2.toArray());


try{	

if (f32==true){
	
	System.out.println("Image32 on both urls are same");
}


if(f32==false){
System.out.println("image32 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}




Boolean f33 =Arrays.equals(ImageArray33URL1.toArray(),ImageArray33URL2.toArray());


try{	

if (f33==true){
	
	System.out.println("Image33 on both urls are same");
}


if(f33==false){
System.out.println("image33 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}




Boolean f34 =Arrays.equals(ImageArray34URL1.toArray(),ImageArray34URL2.toArray());


try{	

if (f34==true){
	
	System.out.println("Image34 on both urls are same");
}


if(f34==false){
System.out.println("image34 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}






Boolean f35 =Arrays.equals(ImageArray35URL1.toArray(),ImageArray35URL2.toArray());


try{	

if (f35==true){
	
	System.out.println("Image35 on both urls are same");
}


if(f35==false){
System.out.println("image35 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}


Boolean f36 =Arrays.equals(ImageArray36URL1.toArray(),ImageArray36URL2.toArray());


try{	

if (f36==true){
	
	System.out.println("Image36 on both urls are same");
}


if(f36==false){
System.out.println("image36 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}


Boolean f37 =Arrays.equals(ImageArray37URL1.toArray(),ImageArray37URL2.toArray());


try{	

if (f37==true){
	
	System.out.println("Image37 on both urls are same");
}


if(f37==false){
System.out.println("image37 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}





Boolean f38 =Arrays.equals(ImageArray38URL1.toArray(),ImageArray38URL2.toArray());


try{	

if (f38==true){
	
	System.out.println("Image38 on both urls are same");
}


if(f38==false){
System.out.println("image38 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}




Boolean f39 =Arrays.equals(ImageArray39URL1.toArray(),ImageArray39URL2.toArray());


try{	

if (f39==true){
	
	System.out.println("Image39 on both urls are same");
}


if(f39==false){
System.out.println("image39 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}


Boolean f40 =Arrays.equals(ImageArray40URL1.toArray(),ImageArray40URL2.toArray());


try{	

if (f40==true){
	
	System.out.println("Image40 on both urls are same");
}


if(f40==false){
System.out.println("image40 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}





Boolean f41 =Arrays.equals(ImageArray41URL1.toArray(),ImageArray41URL2.toArray());


try{	

if (f41==true){
	
	System.out.println("Image41 on both urls are same");
}


if(f41==false){
System.out.println("image41 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}





Boolean f42 =Arrays.equals(ImageArray42URL1.toArray(),ImageArray42URL2.toArray());


try{	

if (f42==true){
	
	System.out.println("Image42 on both urls are same");
}


if(f42==false){
System.out.println("image42 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}







Boolean f43 =Arrays.equals(ImageArray43URL1.toArray(),ImageArray43URL2.toArray());


try{	

if (f43==true){
	
	System.out.println("Image43 on both urls are same");
}


if(f43==false){
System.out.println("image43 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}



Boolean f44 =Arrays.equals(ImageArray44URL1.toArray(),ImageArray44URL2.toArray());


try{	

if (f44==true){
	
	System.out.println("Image44 on both urls are same");
}


if(f44==false){
System.out.println("image44 of both urls are not same");

}

}
catch(Exception e){
	
	System.out.println("The exception is "+e.getMessage());
	
}




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



try{	
if(count==count1){

System.out.println("Both URLs has got same number of internal and external links");
}

else{

System.out.println("No of links doesnt match in both URLs");
}


}catch(Exception e){

System.out.println("No of links doesnt match in both URLs");
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
			
			
			System.out.println("X position and Y position of image "+ImageArray);
			return ImageArray;
			
	//System.out.println("x position is " +point.x);
	//System.out.println("y position is " +point.y);


	}
		
	}

