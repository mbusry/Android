package com.michaelusry.javawk3final;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

// Michael Usry
// Java I
// Term 1406

public class ConnectionStatus {
	static String TAG = "NETWORK DATA - MAINACTIVITY";

//	static Context context;
	// check connection
	public static boolean connectionStatus(Context context) {
		System.out.println("in ConnectionStatus");
		Boolean connection = false;
		ConnectivityManager cm;
		
		

		// status = false
		System.out.println("ConnectionStatus: " + connection);

		cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
		System.out.println("ConnectionManager: " + cm);

		NetworkInfo ni = cm.getActiveNetworkInfo();
		
		System.out.println("NetworkInfo: " + ni);

		if (ni != null) {
			if (ni.isConnected())
				Log.d(TAG, "Connection Type " + ni.getType());
			connection = true;

		}
		System.out.println("ConnectionStatus: " + connection);

		return connection;

	}
}
