//Michael Usry
//Java 1
//Term 1406

package com.michaelusry.javaWk4;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.os.AsyncTask;

//import com.michaelusry.javawk3final;

public class JSON {

	// declare variables
	public static String jsonResult = "";
	public static String[] quakeArray;
	static String url = "http://www.kuakes.com/json/";
	static int selectedMag;

	public static String showJSON(int selectedMag) {

		// declare variables
		String result = "";
		String subResult = "";
		String jsonTitle, jsonLink;
		double jsonMag;
		StringBuilder resultSB = new StringBuilder();

		System.out.println("in showJSON: " + selectedMag);

		// container array
		JSONArray jsonContainerArray = new JSONArray();

		try {
			// call the JSONParser
			getData data = new getData();

			// create string from data to hold JSON
			jsonResult = data.execute(url).get();
			System.out.println("jsonResult: " + jsonResult);

			// create container array from jsonResult
			jsonContainerArray = new JSONArray(jsonResult);
			System.out.println("jsonContainerArray: " + jsonContainerArray);
			System.out.println("length: " + jsonContainerArray.length());

			// **************************
			// depending on selection loop through, set variables, add to
			// string[] and return;

			switch (selectedMag) {
			// jsonMag < 1
			case 0:
				for (int i = 1; i < jsonContainerArray.length(); i++) {
					JSONObject jco = jsonContainerArray.getJSONObject(i);
					// get info and set jsonId, jsonTitle, jsonLink, jsonMag
					jsonTitle = jco.getString("title");
					jsonLink = jco.getString("link");
					jsonMag = jco.getDouble("mag");

					// System.out.println("jcoArray(" + i + ")Title: " +
					// jsonTitle
					// + "/ Link: " + jsonLink + "Mag: " + jsonMag + "\n");

					// check for magnitude <1

					if (jsonMag < 1) {
						subResult = "Title: " + jsonTitle + "\nLink: "
								+ jsonLink + "\nMag: " + jsonMag + "\n\n";
						System.out.println("if jsonMag < 1:subResult: "
								+ subResult);

						resultSB.append(subResult);

						// System.out.println("StringBuilder: " +
						// resultSB.toString());

						result = resultSB.toString();
					}

					if (result.isEmpty()) {
						result = "No data for that range.  Please select another.";
					}
				}

				break;
			// jsonMag >1 <=3

			case 1:
				for (int i = 1; i < jsonContainerArray.length(); i++) {
					JSONObject jco = jsonContainerArray.getJSONObject(i);
					// get info and set jsonId, jsonTitle, jsonLink, jsonMag
					jsonTitle = jco.getString("title");
					jsonLink = jco.getString("link");
					jsonMag = jco.getDouble("mag");

					// System.out.println("jcoArray(" + i + ")Title: " +
					// jsonTitle
					// + "/ Link: " + jsonLink + "Mag: " + jsonMag + "\n");

					if (jsonMag > 1 && jsonMag <= 3) {
						subResult = "Title: " + jsonTitle + "\nLink: "
								+ jsonLink + "\nMag: " + jsonMag + "\n\n";
						System.out.println("if jsonMag < 1:subResult: "
								+ subResult);

						resultSB.append(subResult);

						// System.out.println("StringBuilder: " +
						// resultSB.toString());

						result = resultSB.toString();
					}

					if (result.isEmpty()) {
						result = "No data for that range.  Please select another.";
					}
				}
				break;
			// jsonMag >3 <=4
			case 2:
				for (int i = 1; i < jsonContainerArray.length(); i++) {
					JSONObject jco = jsonContainerArray.getJSONObject(i);
					// get info and set jsonId, jsonTitle, jsonLink, jsonMag
					jsonTitle = jco.getString("title");
					jsonLink = jco.getString("link");
					jsonMag = jco.getDouble("mag");

					// System.out.println("jcoArray(" + i + ")Title: " +
					// jsonTitle
					// + "/ Link: " + jsonLink + "Mag: " + jsonMag + "\n");

					if (jsonMag > 3 && jsonMag <= 4) {
						subResult = "Title: " + jsonTitle + "\nLink: "
								+ jsonLink + "\nMag: " + jsonMag + "\n\n";
						System.out.println("if jsonMag < 1:subResult: "
								+ subResult);

						resultSB.append(subResult);

						// System.out.println("StringBuilder: " +
						// resultSB.toString());

						result = resultSB.toString();
					}

					if (result.isEmpty()) {
						result = "No data for that range.  Please select another.";
					}
				}
				break;
			// jsonMag >4 <=5

			case 3:
				for (int i = 1; i < jsonContainerArray.length(); i++) {
					JSONObject jco = jsonContainerArray.getJSONObject(i);
					// get info and set jsonId, jsonTitle, jsonLink, jsonMag
					jsonTitle = jco.getString("title");
					jsonLink = jco.getString("link");
					jsonMag = jco.getDouble("mag");

					// System.out.println("jcoArray(" + i + ")Title: " +
					// jsonTitle
					// + "/ Link: " + jsonLink + "Mag: " + jsonMag + "\n");

					if (jsonMag > 4 && jsonMag <= 5) {
						subResult = "Title: " + jsonTitle + "\nLink: "
								+ jsonLink + "\nMag: " + jsonMag + "\n\n";
						System.out.println("if jsonMag < 1:subResult: "
								+ subResult);

						resultSB.append(subResult);

						// System.out.println("StringBuilder: " +
						// resultSB.toString());

						result = resultSB.toString();
					}

					if (result.isEmpty()) {
						result = "No data for that range.  Please select another.";
					}
				}
				break;
			// jsonMag >5 <=7

			case 4:
				for (int i = 1; i < jsonContainerArray.length(); i++) {
					JSONObject jco = jsonContainerArray.getJSONObject(i);
					// get info and set jsonId, jsonTitle, jsonLink, jsonMag
					jsonTitle = jco.getString("title");
					jsonLink = jco.getString("link");
					jsonMag = jco.getDouble("mag");

					// System.out.println("jcoArray(" + i + ")Title: " +
					// jsonTitle
					// + "/ Link: " + jsonLink + "Mag: " + jsonMag + "\n");

					if (jsonMag > 5 && jsonMag <= 7) {
						subResult = "Title: " + jsonTitle + "\nLink: "
								+ jsonLink + "\nMag: " + jsonMag + "\n\n";
						System.out.println("if jsonMag < 1:subResult: "
								+ subResult);

						resultSB.append(subResult);

						// System.out.println("StringBuilder: " +
						// resultSB.toString());

						result = resultSB.toString();
					}

					if (result.isEmpty()) {
						result = "No data for that range.  Please select another.";
					}
				}
				break;
			// jsonMag >7 <=8

			case 5:
				for (int i = 1; i < jsonContainerArray.length(); i++) {
					JSONObject jco = jsonContainerArray.getJSONObject(i);
					// get info and set jsonId, jsonTitle, jsonLink, jsonMag
					jsonTitle = jco.getString("title");
					jsonLink = jco.getString("link");
					jsonMag = jco.getDouble("mag");

					// System.out.println("jcoArray(" + i + ")Title: " +
					// jsonTitle
					// + "/ Link: " + jsonLink + "Mag: " + jsonMag + "\n");

					if (jsonMag > 7 && jsonMag <= 8) {
						subResult = "Title: " + jsonTitle + "\nLink: "
								+ jsonLink + "\nMag: " + jsonMag + "\n\n";
						System.out.println("if jsonMag < 1:subResult: "
								+ subResult);

						resultSB.append(subResult);

						// System.out.println("StringBuilder: " +
						// resultSB.toString());

						result = resultSB.toString();
					}

					if (result.isEmpty()) {
						result = "No data for that range.  Please select another.";
					}
				}
				break;
			// jsonMag >8

			case 6:
				for (int i = 1; i < jsonContainerArray.length(); i++) {
					JSONObject jco = jsonContainerArray.getJSONObject(i);
					// get info and set jsonId, jsonTitle, jsonLink, jsonMag
					jsonTitle = jco.getString("title");
					jsonLink = jco.getString("link");
					jsonMag = jco.getDouble("mag");

					// System.out.println("jcoArray(" + i + ")Title: " +
					// jsonTitle
					// + "/ Link: " + jsonLink + "Mag: " + jsonMag + "\n");

					if (jsonMag > 8) {
						subResult = "Title: " + jsonTitle + "\nLink: "
								+ jsonLink + "\nMag: " + jsonMag + "\n\n";
						System.out.println("if jsonMag < 1:subResult: "
								+ subResult);

						resultSB.append(subResult);

						// System.out.println("StringBuilder: " +
						// resultSB.toString());

						result = resultSB.toString();
					}

					if (result.isEmpty()) {
						result = "No data for that range.  Please select another.";
					}
				}
				break;
			// return all by default
			default:
				for (int i = 1; i < jsonContainerArray.length(); i++) {
					JSONObject jco = jsonContainerArray.getJSONObject(i);
					// get info and set jsonId, jsonTitle, jsonLink, jsonMag
					jsonTitle = jco.getString("title");
					jsonLink = jco.getString("link");
					jsonMag = jco.getInt("mag");

					System.out.println("jcoArray(" + i + ")Title: " + jsonTitle
							+ "/ Link: " + jsonLink + "Mag: " + jsonMag + "\n");
					subResult = "Title: " + jsonTitle + "\nLink: " + jsonLink
							+ "\nMag: " + jsonMag + "\n\n";
					System.out.println("subResult: " + subResult);

					resultSB.append(subResult);

					System.out.println("StringBuilder: " + resultSB.toString());

					result = resultSB.toString();

				}
				break;

			}

		} catch (JSONException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println("result: " + result);

		return result;
	}

	public static String getResponse(URL url) {
		System.out.println("starting data retrieval");
		// initialize the response variable
		String response = " ";
		try {
			// open a URL connection
			URLConnection connection = url.openConnection();

			// create a new buffer input stream
			BufferedInputStream bin = new BufferedInputStream(
					connection.getInputStream());

			// set the number of bytes to get at one time
			byte[] contextByte = new byte[1024];
			// set the bytes read to 0
			int bytesRead = 0;
			// create a new string buffer
			StringBuffer responseBuffer = new StringBuffer();

			// while the bytes read is not = -1 get the data and add it to the
			// response buffer
			while ((bytesRead = bin.read(contextByte)) != -1) {
				response = new String(contextByte, 0, bytesRead);
				responseBuffer.append(response);
			}
			// set the response variable to the responseBuffer string value
			response = responseBuffer.toString();
			// System.out.println("Response:" + response);
		} catch (IOException e) {
			// set response in case there is an error
			response = "There was an error";
			e.printStackTrace();
		}
		return response;
	}

	static class getData extends AsyncTask<String, Void, String> {

		protected String doInBackground(String... params) {

			// initialize the responseString variable
			System.out.println("in getData:..... ");
			String responseString = "";

			try {

				System.out.println("getData:try: URL -> " + url);
				// get the mag selected from the main activity
				// selectedMag = MainActivity.selectedMag;

				// set the URL to the queryString
				URL urlSearch = new URL(url);
				responseString = getResponse(urlSearch);
				System.out.println("urlSearch: " + responseString);

				// set urlSearch = array

			} catch (MalformedURLException e) {
				// set the responseString in case of error
				responseString = "There was an error";
				e.printStackTrace();
			}

			return responseString;

		}

		@Override
		protected void onPostExecute(String result) {

			super.onPostExecute(result);
		}

	}

}
