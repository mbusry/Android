//Michael Usry
//Java 1
//Term 1406


package com.michaelusry.javawk2.json;

import org.json.JSONException;
import org.json.JSONObject;

import com.michaelusry.javawk2.months.Months;

public class JSON {
//create JSON data
	public static JSONObject buildJSON() {

		// create the container object
		JSONObject months = new JSONObject();
		try {
			// create an entry object to put in the eachMonth object
			JSONObject entry = new JSONObject();

			// Create the month to go in each entry
			for (Months eachMonth : Months.values()) {

				// create the oneMonth object in entry
				JSONObject oneMonth = new JSONObject();

				// set the number of days, birthstone, and flower
				// from the ENUMs in Months.java
				oneMonth.put("daysNumber", eachMonth.setDaysNumber());
				oneMonth.put("birthstone", eachMonth.setBirthstone());
				oneMonth.put("birthMonthFlower", eachMonth.setBirthMonthFlower());
				oneMonth.put("myMonth", eachMonth.setMyMonth());

				// put the number of days in the month and the object of month info into the
				// entry object
				entry.put(eachMonth.name().toString(), oneMonth);
			}

			// put all entries into the months object
			months.put("months", entry);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// return the months object to the function
		return months;

	}

	//read JSON
	public static String showJSON(String selected) {

		// declare variables
		String result, daysNumber, birthstone, birthMonthFlower;
		Boolean myMonth;

		// create a JSON object and set it equal to the object returned from the
		// buildJSON method
		JSONObject monthResults = buildJSON();

		try {
			// pull the daysNumber from the monthResults object
			daysNumber = monthResults.getJSONObject("months")
					.getJSONObject(selected).getString("daysNumber");
			// pull the birthstone from the monthResults object
			birthstone = monthResults.getJSONObject("months")
					.getJSONObject(selected).getString("birthstone");
			// pull the birthMonthFlower from the monthResults object
			birthMonthFlower = monthResults.getJSONObject("months")
					.getJSONObject(selected).getString("birthMonthFlower");
			// pull the myMonth Bool from the monthResults object
			myMonth = monthResults.getJSONObject("months")
					.getJSONObject(selected).getBoolean("myMonth");

			


			if (!myMonth){
			// String concatenation for the text view results
			result = "Days in Month:" + " " + daysNumber + "\n" + "Birthstone: \n" + " "
					+ birthstone + "\n" + "Month Flower:" + " "
					+ birthMonthFlower;
			}else{
				result = "Days in Month:" + " " + daysNumber + "\n" + "Birthstone: \n" + " "
						+ birthstone + "\n" + "Month Flower:" + " "
						+ birthMonthFlower + "\n" + "It's my Month";

			}

		} catch (JSONException e) {
			e.printStackTrace();
			result = e.toString();
		}

		return result;
	}

}
