package Regex;

public class Regexdemo {

/*	1	[abc]	        a, b, or c (simple class)
	2	[^abc]	        Any character except a, b, or c (negation)
	3	[a-zA-Z]	    a through z or A through Z, inclusive (range)
	4	[a-d[m-p]]	    a through d, or m through p: [a-dm-p] (union)
	5	[a-z&&[def]]	d, e, or f (intersection)
	6	[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
	7	[a-z&&[^m-p]]	a through z, and not m through p: [a-lq-z](subtraction)*/
	
	
	public static void main(String[] args) {
		  
		String s="634VICKY-1_2!@#$%^&*&*((){\":\">?>?}<>?....";
		
        //s.replaceAll("\\W+", "");
       
		//word characters
        System.out.println(s.replaceAll("\\W", "").replaceAll("_", ""));
        
        //non word characters
        System.out.println(s.replaceAll("\\w", ""));
        
        //only question mark
        System.out.println(s.replaceAll("^[?]", ""));
        
        //only numbers
        System.out.println(s.replaceAll("\\d+", ""));
        
      //only DIGITS
        System.out.println(s.replaceAll("[^ a-z A-Z]", ""));
        
        //ONLY DOT and it should start with . example: .vicky
        System.out.println(s.replaceAll("^[.]", ""));
        
        String t="0987654321";
        
        System.out.println(t.matches("[0-9]{10}"));
        
        String phone="99988554433";
        
        System.out.println(phone.matches("[9]{3}[8]{2}[5]{2}[4]{2}[3]{2}"));
        
        String d="@";
        System.out.println(d.matches("\\@"));
        
        //regex to match email id
        String email="vimessidkefkf2367@gmail.com";
        System.out.println(email.matches("\\D+\\d*\\@\\D+\\.\\D{3}"));
        
        String q="0987654321";
        System.out.println(q.matches("^[0][789]\\d+"));
     
        
        String x="hello";
        char[] c = x.toCharArray();
        System.out.println(c.length);
        
        for(int i=c.length-1;i>=0;i--)
        {
        	System.out.print(c[i]);
        }
	}

}
