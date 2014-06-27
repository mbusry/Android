//Michael Usry
//Java 1
//Term 1406


package com.michaelusry.javawk2.months;

public enum Months {
	// enum to json data
	January("31","Garnet","Carnation",false), 
	February("28","Amethyst","Violet",false), 
	March("31","Aquamarine","Daffodil",false), 
	April("30","Diamond","Sweet Pea",true), 
	May("31","Emerald","Lily of the Valley",false), 
	June("30","Pearl","Rose",false), 
	July("31","Ruby","Larkspur",false), 
	August("31","Peridot","Gladiolus",false), 
	September("30","Sapphire","Aster",false), 
	October("31","Opal","Cosmo",false), 
	November("30","Topaz","Chrysanthemum",false), 
	December("31","Turquoise","Holly",false);

	// Strings for this class
	private final String daysNumber;
	private final String birthstone;
	private final String birthMonthFlower;
	private final Boolean myMonth;

	private Months(String daysNumber, String birthstone, String birthMonthFlower, Boolean myMonth) {
		this.daysNumber = daysNumber;
		this.birthstone = birthstone;
		this.birthMonthFlower = birthMonthFlower;
		this.myMonth = myMonth;
	}

	// method to set the days of the month
	public String setDaysNumber() {
		return daysNumber;
	}

	// method to set the birthstone
	public String setBirthstone() {
		return birthstone;
	}

	// Method to set the birth Month Flower
	public String setBirthMonthFlower() {
		return birthMonthFlower;
	}
	
	//Method to load Boolean
	public boolean setMyMonth(){
		return myMonth;
	}
}