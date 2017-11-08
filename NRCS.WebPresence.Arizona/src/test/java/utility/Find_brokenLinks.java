package utility;

import java.net.HttpURLConnection;
import java.net.URL;

public class Find_brokenLinks {

	public static void verifyLinkActive(String linkUrl) {

		try {

			URL url = new URL(linkUrl);

			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

			httpURLConnect.setConnectTimeout(3000);

			httpURLConnect.connect();

			if (httpURLConnect.getResponseCode() == 200) {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());

				String text = linkUrl + " - " + httpURLConnect.getResponseMessage();
				if (text.contains("OK")) {

				}
			}
			if (!(httpURLConnect.getResponseCode() == 200)) {

				System.out.println(linkUrl + "-" + httpURLConnect.getResponseMessage());

				String text = linkUrl + " - " + httpURLConnect.getResponseMessage();

				if (text.contains("Found") || text.contains("Moved Permanently") || text.contains(" Forbidden")) {

				}
			}
			// System.out.println("No of links with response code other than OK
			// are "+count2);

			if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - "
						+ HttpURLConnection.HTTP_NOT_FOUND);

				String text = linkUrl + " - " + httpURLConnect.getResponseMessage() + " - "
						+ HttpURLConnection.HTTP_NOT_FOUND;

				if (text.contains("HTTP_NOT_FOUND")) {
					// count3=count3+1;
				}

			}

			// System.out.println("No of links with response code OK are
			// "+count1);
		} catch (Exception e) {

		}
	}

	public static void main(String[] args) {

	}
}
