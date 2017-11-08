package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	
	
	Properties pro;
	
	
	public ConfigDataProvider(){
		
		
		File src = new File("C:\\Users\\Sivapriya Bhagavathi\\Desktop\\WorkSpace\\NRCS.WebPresence.Arizona\\Configuration\\config.properties.txt");
		
		
		try {
			
			
			FileInputStream fis =new FileInputStream(src);
			
			pro =new Properties();
			
			pro.load(fis);
			
			
		} catch (Exception e) {
			
			
          System.out.println("Exception is " +e.getMessage());	

		}
		
		
	}
	
	public String getApplicationUrl1(){
		
		
		String url1=pro.getProperty("url1");
		
		return url1;
	}
	
	
	
	
	public String getApplicationUrl2(){

	

		String url2=pro.getProperty("url2");
		
		return url2;
	}
	
	
	public String getChromePath(){

	String ChromePath = pro.getProperty("chromePath");
	
	return ChromePath;
	
	}
	
	
	public String getIEPath(){

		String IEPath = pro.getProperty("iePath");
		
		return IEPath;
		
		}

	public String getApplicationUrl3() {


		String url3=pro.getProperty("url3");
		
		return url3;
	}
	 
	

}
