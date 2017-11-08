package utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Image {

	static WebDriver driver;

	public static List<Object> image_check(WebElement image1url12) {

		WebElement ImageFile = image1url12;

		Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript(
				"return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
				ImageFile);

		if (!ImagePresent) {
			System.out.println("Image not displayed.");
		} else {
			System.out.println("Image displayed.");
		}

		List<Object> ImageArray = new ArrayList<Object>();

		Dimension dimensions = image1url12.getSize();

		// System.out.println("width is " + dimensions.width);

		int width = dimensions.width;
		int height = dimensions.height;

		// System.out.println("height is " + dimensions.height);

		Point point = image1url12.getLocation();

		int Xposition = point.x;
		int Yposition = point.y;

		// ImageArray.add(width);
		// ImageArray.add(height);
		ImageArray.add(Xposition);
		ImageArray.add(Yposition);

		System.out.println("X position and Y position of image " + ImageArray);
		return ImageArray;

		// System.out.println("x position is " +point.x);
		// System.out.println("y position is " +point.y);

	}

	public static void main(String[] args) {

	}
}
