package com.michaelusry.javawk2;


import org.json.JSONArray;
import org.json.JSONObject;

import com.michaelusry.javawk2.json.JSON;

import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends ActionBarActivity 
{
	Context mContext;
	String[] mListItems;
	TextView result;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		// Initializing Constants
		mContext = this;
		//from strings.xml
		mListItems = getResources().getStringArray(R.array.view_array);
		
	
	
	
		// Create Linear Layout
		LinearLayout linearLayoutMain = new LinearLayout(mContext);
		linearLayoutMain.setOrientation(LinearLayout.VERTICAL);
		LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		linearLayoutMain.setLayoutParams(lp);

		// Spinner adapter
		ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(mContext, android.R.layout.simple_spinner_item,mListItems);
		spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		// create spinner
		Spinner viewSpinner = new Spinner(mContext);
		viewSpinner.setAdapter(spinnerAdapter);
		lp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
		viewSpinner.setLayoutParams(lp);
		viewSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
	String selected = mListItems[position];
	System.out.println(id);

//	result.setText(JSON.showJSON(selected));
	
	
		Toast.makeText(mContext, "You have selected Month: " + selected, Toast.LENGTH_LONG).show();
//	Toast.makeText(mContext, "Month selected: " + jsonObject.JSON, Toast.LENGTH_LONG).show();
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
});
		
		//Add LayoutView
		linearLayoutMain.addView(viewSpinner);
		setContentView(linearLayoutMain);
	}


	public void onClick(View view)
	{
//		int id = rg.ge
		System.out.println("click");
	}
	
	




	
}

