package com.michaelusry.javaWk4.quakes;
//Michael Usry
//Java 1
//Term 1406




public enum Quakes {
	// enum to json data
	quake0("Hot and Humid","http://www.southamerica.com",2), 
	quake1("Mixture","http://www.canada.com",1), 
	quake2("Hot and Humid","http://www.southamerica.com",8), 
	quake3("Mixture","http://www.canada.com",7), 
	quake4("Island Land","http://www.japan.com",5);

	// Strings for this class
	private final String title;
	private final String link;
	private final long mag;

	private Quakes(String title, String link, long mag) {
		this.title = title;
		this.link = link;
		this.mag = mag;
	}

	// method to set the title
	public String setTitle() {
		return title;
	}

	// method to set the link
	public String setLink() {
		return link;
	}

	// Method to set the magnitude
	public long setMag() {
		return mag;
	}
	
}