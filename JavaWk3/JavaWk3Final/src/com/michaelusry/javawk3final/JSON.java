//Michael Usry
//Java 1
//Term 1406



package com.michaelusry.javawk3final;

import java.util.concurrent.ExecutionException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class JSON {
	
	public static String jsonResult = "";
	
//create JSON data
/*
	//read JSON
	public static String showJSON(String magSelected) {

		// declare variables
		String result, jsonId, jsonTitle, jsonLink, jsonMag, jsonURL;
		
		jsonURL="http://http://www.kuakes.com/json/";
		
		//container array
		JSONArray jsonResult = new JSONArray();
		
		try{
		//call the JSONParser
		JSONParser data = new JSONParser();
		
		//create string from data
		jsonResult = data.execute(jsonURL).get();
		
		
		// create a JSON object and set it equal to the object returned from the
		// buildJSON method
//		JSONObject magObject = new JSONObject(jsonURL);
		
//		JSONArray getArray = magObject.getJSONArray(magSelected);

		} catch (JSONException e){
			e.printStackTrace();
		} catch (InterruptedException e){
			e.printStackTrace();
		} catch (ExecutionException e){
			e.printStackTrace();
		}try {
			// pull the daysNumber from the monthResults object
			jsonId = magObject.getJSONObject("id")
					.getJSONObject(magSelected).getString("jsonId");
			// pull the birthstone from the monthResults object
			jsonTitle = magObject.getJSONObject("title")
					.getJSONObject(magSelected).getString("jsonTitle");
			// pull the birthMonthFlower from the monthResults object
			jsonLink = magObject.getJSONObject("link")
					.getJSONObject(magSelected).getString("jsonLink");
			// pull the myMonth Bool from the monthResults object
			jsonMag = magObject.getJSONObject("mag")
					.getJSONObject(magSelected).getString("jsonMag");


			
				result = "Record ID:" + " " + jsonId + "\n" + "Title: " + " "
						+ jsonTitle + "\n" + "Link:" + " "
						+ jsonLink;


		} catch (JSONException e) {
			e.printStackTrace();
			result = e.toString();
		}

		return result;
	}
	*/
}
