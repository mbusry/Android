//Michael Usry
// Jave 1
// Term 1406

package com.michaelusry.javaWk4;


//import com.michaelusry.javaWk4.ConnectionStatus;
import com.michaelusry.javawk3final.R;
import com.michaelusry.javaWk4.JSONLocal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends Activity {


	// declare variables
	Context context;

	Spinner spinner;
	ListView list;
	String[] months;
	String[] magArray;
	TextView instructions, result;
	public static int selectedMag;
	public static String[] quakeArray;
	
	
	static String TAG = "NETWORK DATA - MAINACTIVITY";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		// context is now the mainactivity
		context = this;		
			
		// check connection
		ConnectionStatus cs = new ConnectionStatus();


		if (cs.isOnline(context)) {
			System.out.println("Connected");

		} else {
			System.out.println("Not connected");

			// Alert user not connected and is required
			AlertDialog.Builder alert = new AlertDialog.Builder(this);
			alert.setTitle("There is not internet connection. Local file in use.")
					.setPositiveButton("OK", null);
			alert.show();

			// use the result view (textView1) to show it needs connection
			result = (TextView) findViewById(R.id.textView1);
			result.setText(R.string.connection_error);
			result.setTextColor(Color.RED);

		}


		// any instructions needs, set to blank at beginning
		instructions = (TextView) findViewById(R.id.textView2);
		instructions.setText("Select a magnitude range from above then press Get below");

		// display of any results
		result = (TextView) findViewById(R.id.textView1);

		// set the variable of the array from strings.xml
		magArray = getResources().getStringArray(R.array.mag_array);

		spinner = (Spinner) findViewById(R.id.spinner1);

		System.out.println("mag: " + magArray);

		// spinner adapter
		ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, magArray);

		spinnerAdapter
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


		// create spinner

		spinner.setAdapter(spinnerAdapter);
		spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				System.out.println("onItemSelected " + magArray[position]);

				Toast.makeText(spinner.getContext(),
						"You have selected Magnitude: " + magArray[position],
						Toast.LENGTH_LONG).show();
				selectedMag = position;
				System.out.println("item selected: selectedMag = " +selectedMag);
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub

			}

		});

	}

	// press the GET button

	public void onClick(View view) {
		System.out.println(" Button clicked");
		System.out.println("itemSelected =" + selectedMag);
		// get and set the result view
		result = (TextView) findViewById(R.id.textView1);

		// check connection
		ConnectionStatus cs = new ConnectionStatus();


		if (cs.isOnline(context)) {
			System.out.println("Connected");
//			System.out.println("object: " + object);
			// grab the showJSON from JSON by the selectedMonth;
			result.setText(JSON.showJSON(selectedMag));

		} else {
			System.out.println("Not connected");

//			// Alert user not connected and is required
//			AlertDialog.Builder alert = new AlertDialog.Builder(this);
//			alert.setTitle("There is not internet connection. Local file in use.")
//					.setPositiveButton("OK", null);
//			alert.show();

			// use the result view (textView1) to show it needs connection
			result = (TextView) findViewById(R.id.textView1);
//			result.setText(R.string.connection_error);
			result.setTextColor(Color.BLACK);
			System.out.println("onClick/No connection: selectedMag: " + selectedMag);
			result.setText(JSONLocal.showJSONLocal(selectedMag));


		}

	}

}
