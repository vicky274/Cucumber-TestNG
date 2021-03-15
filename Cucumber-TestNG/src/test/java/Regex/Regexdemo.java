package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexdemo {

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
/*	The Java Regex or Regular Expression is an API to define a pattern for searching or manipulating strings.

	It is widely used to define the constraint on strings such as password and email validation. 
	After learning Java regex tutorial, you will be able to test your regular expressions by the Java Regex Tester Tool.

	Java Regex API provides 1 interface and 3 classes in java.util.regex package.*/
	
	
/*	1	[abc]	        a, b, or c (simple class)
	2	[^abc]	        Any character except a, b, or c (negation)
	3	[a-zA-Z]	    a through z or A through Z, inclusive (range)
	4	[a-d[m-p]]	    a through d, or m through p: [a-dm-p] (union)
	5	[a-z&&[def]]	d, e, or f (intersection)
	6	[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
	7	[a-z&&[^m-p]]	a through z, and not m through p: [a-lq-z](subtraction)*/
	

	public static boolean validate(String emailStr) {
	        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
	        
	        System.out.println(emailStr+" - "+matcher.find());
	        return matcher.find();
	}
	
	
	public static void main(String[] args) {
		
		validate("vimessi2@gmail.com");
        String ss="            ";
        System.out.println(ss.matches("\\s+"));
		 
        String s1="6789617946790- TEST";
        System.out.println(s1.replaceAll("\\W+", "").replaceAll("\\D+", ""));
        
		String s="634VICKY-1_2!@#$%^&*&*((){\":\">?>?}<>?....";
		
        //s.replaceAll("\\W+", "");
       
		//only word characters
        System.out.println(s.replaceAll("\\W", "").replaceAll("_", ""));
        
        //only non word characters
        System.out.println(s.replaceAll("\\w", ""));
        
        //only question mark
        System.out.println("Other than question mark :"+s.replaceAll("[?]", ""));
        
        //only numbers
        System.out.println("Only Numbers :"+s.replaceAll("[^0-9]", ""));
        
      //only DIGITS
        System.out.println("Only Digits :"+s.replaceAll("[^ a-z A-Z]", ""));
        
        //ONLY DOT and it should start with . example: .vicky
        System.out.println(s.replaceAll("[.]", ""));
        
        String t="0987654321";
        
        System.out.println(t.matches("[0-9]{10}"));
        
        String phone="99988554433";
        
        System.out.println(phone.matches("[9]{3}[8]{2}[5]{2}[4]{2}[3]{2}"));
        
        String d="@";
        System.out.println(d.matches("\\@"));
        
        //regex to match email id
        String email="vimessidkefkf2367@gmail.com";
        System.out.println("Email matches :"+email.matches("\\D+\\d*\\@\\D+\\.\\D{3}"));
        
        String q="0987654321";
        System.out.println(q.matches("^[0][789]\\d+"));
        
        String date="31/12/1995";
        System.out.println("date matches :"+date.matches("^([0][1-9]|[12][0-9]|[3][01])/([0][1-9]|[1][012])/\\d{4}"));
     
       /* //to print/reverse a string 
        String x="hello";
        char[] c = x.toCharArray();
        System.out.println(c.length);
        
        for(int i=c.length-1;i>=0;i--)
        {
        	System.out.print(c[i]);
        }
        */
        
        int[] a = new int[]{1,2,3,4,5};
System.out.println(a.length);
        int temp=0;

      /*  for(int i=0;i<a.length;i++){

        if(a[i]<a[i+1]){

        temp=a[i];
System.out.println(temp);
        }
        else{
        temp=a[i+1];
        System.out.println(temp);
        }

        }

        System.out.println("Smallest Number :"+temp);*/
	}
	


}
