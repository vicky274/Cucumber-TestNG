package Webautomation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
		//23-11-2009 15:47:36  

		//local date
		
		LocalDate myObj = LocalDate.now(); // Create a date object
	    System.out.println(myObj); // Display the current date
	 
	    
	    
	    LocalDateTime now = LocalDateTime.now();  
        System.out.println("Before Formatting: " + now);  
        DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
        String formatDateTime = now.format(forma);  
        System.out.println("After Formatting: " + formatDateTime);  
	    
        
        
        
	    LocalDateTime time = LocalDateTime.now();
	    System.out.println(time);
	    
	    SimpleDateFormat s2 = new SimpleDateFormat("dd-MM-yyyy");
	    System.out.println(s2.format(new Date()));
	    
	    
	   /* //format date
		String s = "2020-01-25";

		SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd");

		SimpleDateFormat s2 = new SimpleDateFormat("yyyy/MM/dd");

		Date date = s1.parse(s);

		System.out.println(s2.format(date));
	*/
		
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy_HH_mm_ss");
	    Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, +1);
        
        System.out.println(format.format(c.getTime()));
        
        
   /*     String s="19-08-2020 15:47:36";
        String s1 = s.split(" ")[0];
        System.out.println(s1);
        
        SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
	    Calendar c1 = Calendar.getInstance();
	    System.out.println(format1.format(c1.getTime()));*/
        
     
    	SimpleDateFormat format4 = new SimpleDateFormat("HH:mm");
	    Calendar c1 = Calendar.getInstance();
	    c1.add(Calendar.MINUTE, +15);
	    String  hourandminute = format4.format(c1.getTime());
	    System.out.println(hourandminute);
	    System.out.println(hourandminute.substring(3, 4));
	    System.out.println(hourandminute.substring(4));
	    
	    String rep = hourandminute.substring(3,4).replaceAll("[12]", "3").replaceAll("[45]", "0");
	    
	    String repl = hourandminute.substring(4).replaceAll("[1-9]", "0");
        System.out.println(hourandminute.substring(0, 3)+rep+repl);
	    
	}

}
