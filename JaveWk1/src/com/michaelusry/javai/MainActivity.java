package com.michaelusry.javai;

import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {


	/*
	 Java Variables
	Java Loops
	Java Conditionals
	Java Functions
		The application must contain, at minimum, 1 of each of the following Java components:
	
	int or float variable-
	boolean variable-
	String variable-
	loop (any type)
	condition-
	function-
	click event handler-
		The application must also utilize, at minimum, 1 of each of the following Android components:
	
	Android resource value-
	TextView -
	EditText -
	Button -
	LinearLayout -

	  
	 */
	
// Variables used
	EditText studentName, testAverageText, ruStudent, studentNumber;
	TextView header,student_info;
	int min, max, testAverage,sn;
	Boolean student;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void onClick(View view)
	{
		//student = true;
	System.out.println("onClick");
	System.out.println("onClick:student: " + student);

	//dismiss the KB after the click
	getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);	
	
		//create random student number
		
		min = 1000;
		max = 2000;
		
int sn = min + (int) (Math.random() * ((max - min) + 1));

//System.out.println(sn);

// get the input
studentName = (EditText) findViewById(R.id.student_name);
testAverageText = (EditText) findViewById(R.id.test_avg);
ruStudent = (EditText) findViewById(R.id.are_you_student);




//create strings to hold input
String studentNameText = studentName.getText().toString();
String ruStud = ruStudent.getText().toString();
String tAT = testAverageText.getText().toString();

//System.out.println(studentNameText);
//System.out.println(ruStud);
//System.out.println(tAT);


// convert int to String
String studentNumber = Integer.toString(sn);
//System.out.println(studentNumber);


//Is this person a student

if (ruStud.equals("y") || ruStud.equals("Y"))
{
	student = true;
	System.out.println("ruStud==y: " + ruStud);
	System.out.println("student: " + student);

}else
{
	student = false;
	System.out.println("ruStud==y: " + ruStud);
	System.out.println("student: " + student);

}


		//show studentMessage with variables
studentMessage(student, studentNameText, studentNumber, tAT);

	}
	
	
	//Method to display the student name, GPA and message
	public void studentMessage(Boolean student, String studentNameText, String studentNumber, String tAT)
	{
		//System.out.println("studentMessage:\n");
		//System.out.println("student:" + student);
		//System.out.println("student name: " + studentNameText);
		//System.out.println("student number: " + studentNumber);
		//System.out.println("test avg: " + tAT);
	

		// local variables
		String GPA;
		String a_student="You are a great student!";
	    String no_student="We would like for you to join us!";
	    String failing_student="I hate it, but your not passing.";
	    String studentMessage;
	    String studentAward ="";


	 // convert String to int
	   if (!tAT.equals("")){
	    Integer testAvg = Integer.valueOf(tAT);
	    //System.out.println("testAvg: " + testAvg);
		
	  if (testAvg >90){
			GPA = "4.0";
		}else if (testAvg >85 & testAvg <90){
			GPA = "3.0";
		}else if (testAvg >80 & testAvg <85){
			GPA = "2.0";
		}else if (testAvg >70 & testAvg <79){
			GPA = "1.0";
		}else {
		    GPA = "Failing";
		}
	    }else {
	    	GPA = "";
	 
	    }
	   
	   //random number 0-2
	   min = 1;
	   max = 3;
	   
	   Random rn = new Random();
	   int random_number = rn.nextInt(3)+1;
//	   System.out.println("rand #" + random_number);

	   //array for studentAward
	   String[] awards = {"Top Student","Biggest Flirt","Most Studious"};
	   int arrayNumber = random_number-1;
//	   System.out.println("arrayNumber: " + arrayNumber);
//	   System.out.println("random_number: " + random_number);


//	   System.out.println("array: " + awards[arrayNumber]);
	 
	   
	   //loop studentAward
	   for(int x = 0; x <= random_number; x++)
	   {
		   if (x == arrayNumber){
		   studentAward = awards[arrayNumber];
//		   studentAward = ss;
//		   System.out.println("loop: " + ss);
//		   System.out.println("loop: " + studentAward);


}
	   }
//System.out.println(studentAward);
	   

	    if (!tAT.equals(""))
	    {
		    Integer testAvg = Integer.valueOf(tAT);
		if (testAvg >=70){
			studentMessage = a_student; 
		}else{
			studentMessage = failing_student;
			}
	    }else{
	    	studentMessage = no_student;
	    }
	
	
//	    GPA = "test";
	   // studentMessage = "test";
		student_info = (TextView) findViewById(R.id.si);
	
		if (student == true){
		student_info.setText("Student info:\nStudent Name: " + studentNameText + "\n" + "Student Number: " + studentNumber +"\n"
				+ "GPA: " + GPA +"\n" + "School Note:" + studentMessage + "\nStudent Award for this semester: " + studentAward);
		}else {
			student_info.setText("I'm sorry " + studentNameText + ", but you are not a student with us.  " + no_student);
		}

	}
	
}
