package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BrowserFactory {
	
	
	public static WebDriver driver;
	
	
	

	public static WebDriver getBrowser(String browserName){
		
		
		if(browserName.equalsIgnoreCase("firefox")){

			// Create object of ProfilesIni class
			 
	        ProfilesIni init=new ProfilesIni();



	        // Get the default session  

	        FirefoxProfile profile=init.getProfile("default");



	       // Pass the session/profile to FirefoxDriver 

	        driver=new FirefoxDriver(profile);
	        
			//driver=new FirefoxDriver();
		}
		
		
		else if(browserName.equalsIgnoreCase("IE")){
			
			
			System.setProperty("webdriver.ie.driver",DataProviderFactory.getConfig().getIEPath());

			
			driver=new InternetExplorerDriver();
		}
		
		
		else if(browserName.equalsIgnoreCase("Chrome")){
			
		
			
			System.setProperty("webdriver.chrome.driver",DataProviderFactory.getConfig().getChromePath());
			
			driver =new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		return driver;
	}
	
	
	public static void closeBrowser(WebDriver Idriver){
		
		Idriver.close();
	}
	
	
	
	
	
}
