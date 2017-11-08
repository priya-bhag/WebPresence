package utility;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class imageComparison {

	static WebDriver driver;

	public static List<String> ImagesArrayProd = null;

	public static void image(WebElement AZ) {

		int counter1 = 0;

		int counter2 = 0;

		List<WebElement> total_imagesTest = AZ.findElements(By.tagName("img"));

		System.out.println("Total Number of images found on page : are = " + total_imagesTest.size());

		// for loop to open all images one by one to check response code.

		for (int i = 0; i < total_imagesTest.size(); i++) {

			String url_imageTest = total_imagesTest.get(i).getAttribute("src");

			ImagesArrayProd.add(url_imageTest);

			if (url_imageTest != null) {

				try {

					URL url_Image = new URL(url_imageTest);

					HttpURLConnection httpURLConnect = (HttpURLConnection) url_Image.openConnection();

					httpURLConnect.setConnectTimeout(3000);

					httpURLConnect.connect();

					if (httpURLConnect.getResponseCode() >= 400)

					{

						counter1 = counter1 + 1;

						System.out.println(url_imageTest + " - " + httpURLConnect.getResponseMessage());

					}

					else {

						System.out.println(url_imageTest + "-" + httpURLConnect.getResponseMessage());

						if (httpURLConnect.getResponseMessage().contains("OK")) {

							counter2 = counter2 + 1;
						}
					}

				}

				catch (Exception e) {
					e.toString();
				}

			}

		}

		System.out.println("Number of valid Images  are " + counter2);

		System.out.println("Number of Invalid Images  are " + counter1);
		System.out.println(ImagesArrayProd);

	}

	public static void main(String[] args) {

	}
}
