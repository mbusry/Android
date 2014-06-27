//Michael Usry
//Java 1
//Term 1406

//
package com.michaelusry.javaWk4;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.michaelusry.javaWk4.quakes.Quakes;

public class JSONLocal {
	// create JSON data
	public static JSONObject buildJSON() {

		// create the container object
		JSONObject quakes = new JSONObject();
		try {
			// create an entry object to put in the eachQuake object
			JSONObject entry = new JSONObject();

			// Create the month to go in each entry
			for (Quakes eachQuake : Quakes.values()) {

				// create the oneMonth object in entry
				JSONObject oneQuake = new JSONObject();

				// set the title, link, and mag
				// from the ENUMs in quakes.java
				oneQuake.put("title", eachQuake.setTitle());
				oneQuake.put("link", eachQuake.setLink());
				oneQuake.put("mag", eachQuake.setMag());

				// put the quake info into the entry object
				entry.put(eachQuake.name().toString(), oneQuake);
			}

			// put all entries into the quakes object
			quakes.put("quakes", entry);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// return the months object to the function
		return quakes;

	}

	// read JSON
	public static String showJSONLocal(int selectedMag) {

		
		
		
		// declare variables
		String result = "";
		String title, link;
		long mag;

		if (selectedMag >= 0 && selectedMag <= 6) {
			//
			// for (Quakes eachQuake : Quakes.values()) {
			// System.out.println("eachQuake ENUM: " + eachQuake);
			System.out.println("in selectedMag........");
			JSONObject quakeResults = buildJSON();
			System.out.println("quakeResults........" + quakeResults);

			// **************************
			// depending on selection loop through, set variables, add to
			// string[] and return;

			// WORKS FOR GET ALL ****************************
			// ORIGINAL CODE ******************************
			JSONArray jsonContainerArray = new JSONArray();
			System.out.println("JCA length........" + jsonContainerArray.length());

			System.out.println("quakeResults: " + quakeResults);
			System.out.println("quakeResults.length: " + quakeResults.length());

			System.out.println("enum loop, selectMag: " + selectedMag);

			// if (quake.Results.getJSONObject("quakes").getJSONObject)

			try {
				for (int i = 0; i < quakeResults.length(); i++) {
					System.out.println("i = " + i);
					// pull the daysNumber from the monthResults object
					title = quakeResults.getJSONObject("quakes")
							.getJSONObject("quake" + i).getString("title");
					System.out.println("title: " + title);

					link = quakeResults.getJSONObject("quakes")
							.getJSONObject("quake" + i).getString("link");
					System.out.println("link: " + link);

					mag = quakeResults.getJSONObject("quakes")
							.getJSONObject("quake" + i).getLong("mag");
					System.out.println("before if to test mag: mag: " + mag);

					if (mag < 1) {
						System.out.println("if mag <1 mag=" + mag);
						// String concatenation for the text view results
						result = "Title:" + " " + title + "\n" + "Link: " + " "
								+ link + "\n" + "Magnitude:" + " " + mag;
						System.out.println("result: " + result);

					}

					if (mag >= 1 && mag <= 3) {
						System.out.println("if mag >=1 and <=3 mag=" + mag);

						// String concatenation for the text view results
						result = "Title:" + " " + title + "\n" + "Link: " + " "
								+ link + "\n" + "Magnitude:" + " " + mag;

						System.out.println("result: " + result);
					}

					if (mag > 3 && mag <= 4) {
						System.out.println("if mag >3 and <=4 mag=" + mag);

						// String concatenation for the text view results
						result = "Title:" + " " + title + "\n" + "Link: " + " "
								+ link + "\n" + "Magnitude:" + " " + mag;

						System.out.println("result: " + result);
					}

					if (mag > 4 && mag <= 5) {
						System.out.println("if mag >4 and <=5 mag=" + mag);

						// String concatenation for the text view results
						result = "Title:" + " " + title + "\n" + "Link: " + " "
								+ link + "\n" + "Magnitude:" + " " + mag;

						System.out.println("result: " + result);
					}

					if (mag > 5 && mag <= 7) {
						System.out.println("if mag >5 and <=7 mag=" + mag);

						// String concatenation for the text view results
						result = "Title:" + " " + title + "\n" + "Link: " + " "
								+ link + "\n" + "Magnitude:" + " " + mag;

						System.out.println("result: " + result);
					}

					if (mag > 7 && mag <= 8) {
						System.out.println("if mag >7 and <=8 mag=" + mag);

						// String concatenation for the text view results
						result = "Title:" + " " + title + "\n" + "Link: " + " "
								+ link + "\n" + "Magnitude:" + " " + mag;

						System.out.println("result: " + result);
					}

					if (mag > 8) {
						System.out.println("if mag >8 mag=" + mag);

						// String concatenation for the text view results
						result = "Title:" + " " + title + "\n" + "Link: " + " "
								+ link + "\n" + "Magnitude:" + " " + mag;

						System.out.println("result: " + result);
					}
				}
			} catch (JSONException e) {
				e.printStackTrace();
				result = e.toString();
			}        
		} else {
			JSONObject quakeResults = buildJSON();

			System.out.println("else statment");

			try {
				title = quakeResults.getJSONObject("quakes")
						.getJSONObject("quake").getString("title");
				System.out.println("title: " + title);

				link = quakeResults.getJSONObject("quakes")
						.getJSONObject("quake").getString("link");
				System.out.println("link: " + link);

				mag = quakeResults.getJSONObject("quakes")
						.getJSONObject("quake").getLong("mag");
				System.out.println("before if to test mag: mag: " + mag);

				result = "Title:" + " " + title + "\n" + "Link: " + " " + link
						+ "\n" + "Magnitude:" + " " + mag;

			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //END OF ORIGINAL CODE *******************************/

		}

		// System.out.println("in showJSONLocal: " + selectedMag);

		// create a JSON object and set it equal to the object returned from the
		// buildJSON method

		return result;
	}
}
