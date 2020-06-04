package Webautomation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import org.joda.time.DateTime;

public class Calenderclass {

	public static void main(String[] args) throws ParseException {

		/**
		 * Formatting Date and Time
The "T" in the example above is used to separate the date from the time. 
You can use the DateTimeFormatter class with the ofPattern() method in the 
same package to format or parse date-time objects. 
The following example will remove both the "T" and milliseconds from the date-time:
		 */
		/*
		//local date
		LocalDate myObj = LocalDate.now(); // Create a date object
	    System.out.println(myObj); // Display the current date
	    
	    //format date
		String s = "2020-01-25";

		SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd");

		SimpleDateFormat s2 = new SimpleDateFormat("yyyy/MM/dd");

		Date date = s1.parse(s);

		System.out.println(s2.format(date));*/
	
		/*
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
	    Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, +5);
        
        System.out.println(format.format(c.getTime()));*/
        
     
	}

}
