package pages1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import factory.DataProviderFactory;
import junit.framework.Assert;

public class FeedbackForms1 {
	 static WebDriver driver;

		public FeedbackForms1(WebDriver Idriver){
			this.driver=Idriver;
		}
		//URL1 Elements

		@FindBy(xpath=".//*[@id='feedbackform']/h2")
		static	WebElement headingURL1;
		
		
		
		@FindBy(xpath=".//*[@id='traversed']")
		static WebElement YouAreHereURL1;
		
	
		
		@FindBy(id="contactusNode")
		static WebElement SelectaSubjectAreaURL1;
		
		
		@FindBy(id="yourname")
		static WebElement YournameURL1;

		@FindBy(id="email")
		static WebElement 
		YouremailaddressURL1;
		

		@FindBy(id="subject")
		static WebElement 
		subjectURL1;
		
		@FindBy(id="comment")
		static WebElement 
		commentURL1;
		

		@FindBy(xpath=".//*[@id='comment_form']/p/input")
		static WebElement SendNowURL1;
		
	
		
		
		
		//URL2 Elements
			
			
			
			@FindBy(xpath="") static WebElement headingURL2;
			
			
			@FindBy(xpath="")
			static WebElement YouAreHereURL2;
		

			
			@FindBy(id="contactusNode")
			static WebElement SelectaSubjectAreaURL2;
			
			
			@FindBy(id="yourname")
			static WebElement YournameURL2;

			@FindBy(id="email")
			static WebElement 
			YouremailaddressURL2;
			

			@FindBy(id="subject")
			static WebElement 
			subjectURL2;
			
			@FindBy(id="comment")
			static WebElement 
			commentURL2;
			

			@FindBy(xpath=".//*[@id='comment_form']/p/input")
			static WebElement SendNowURL2;
			
		

			//Comparison Arrays
			
			
			public static List<String> LinksArrayURL1  =null;
			
			public static List<String> LinksArrayURL2  =null;


			public static List<String> YouAreHereArrayURL1  =null;
			
			public static List<String> YouAreHereArrayURL2  =null;




			public static void validateURL1(){
				
				
				String title1=driver.getTitle();
				
				
				
				String heading1= headingURL2.getText();
				Select dropdown1URL1 = new Select(SelectaSubjectAreaURL1);
				
				List<WebElement>e2=dropdown1URL1.getOptions();
				
				for(int i=0;i<=e2.size()-1;i++){
					System.out.println("Select a Subject Area: "+e2.get(i).getText());
				}
				System.out.println("Select a Subject Area: "+e2.size());


	//validation part
				
				
				dropdown1URL1.selectByVisibleText("Education");
				YournameURL1.sendKeys("priya");
				
				YouremailaddressURL1.sendKeys("abc@gmail.com");
				
				subjectURL1.sendKeys("soils");
				
				
				commentURL1.sendKeys("comment submitted");
				
				
				SendNowURL1.click();
			
				driver.get(DataProviderFactory.getConfig().getApplicationUrl2()+"main/az/technical/dma/econ/");

				String heading2= headingURL2.getText();
				



				if(heading1.equals(heading2)){
					
					System.out.println("heading of both urls are same");
					
				}
					
				String title2=driver.getTitle();
				
				
				Assert.assertEquals(title1,title2);
				
Select dropdown1URL2 = new Select(SelectaSubjectAreaURL1);
				
				List<WebElement>e3=dropdown1URL2.getOptions();
				
				for(int i=0;i<=e3.size()-1;i++){
					System.out.println("Select a Subject Area: "+e3.get(i).getText());
				}
				System.out.println("Select a Subject Area: "+e3.size());


	//validation part
				
				
				dropdown1URL1.selectByVisibleText("Education");
				
				/*YournameURL1.sendKeys("priya");
				
				YouremailaddressURL1.sendKeys("abc@gmail.com");
				
				subjectURL1.sendKeys("soils");
				
				
				commentURL1.sendKeys("comment submitted");
				
				
				SendNowURL1.click();
			*/
			
			
			}
			
			
}
