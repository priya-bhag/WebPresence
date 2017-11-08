package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

	public static Date date;

	public static String capturescreenshot(WebDriver driver, String screenshotName) {

		date = new Date();
		
		SimpleDateFormat ft = new SimpleDateFormat ("MM-dd-yyyy''HH_mm_ss''");


		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);
		

		String path = "C:\\Users\\Sivapriya Bhagavathi\\Desktop\\screenshot\\";

		String destination = path+ screenshotName +ft.format(date)
				+ ".png";

		try {
			FileUtils.copyFile(src, new File(destination));
		} catch (IOException e) {
			System.out.println("Failed to capture screenshot " + e.getMessage());
		}

		return destination;
	}
	


}
