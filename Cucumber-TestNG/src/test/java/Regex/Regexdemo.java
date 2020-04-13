package Regex;

public class Regexdemo {

	public static void main(String[] args) {
		  
		String s="634VICKY-1_2!@#$%^&*&*((){\":\">?>?}<>?....";
		
        //s.replaceAll("\\W+", "");
       
		//word characters
        System.out.println(s.replaceAll("\\W", "").replaceAll("_", ""));
        
        //non word characters
        System.out.println(s.replaceAll("\\w", ""));
        
        //only question mark
        System.out.println(s.replaceAll("[^?]", ""));
        
        //only numbers
        System.out.println(s.replaceAll("\\D+", ""));
        
      //only DIGITS
        System.out.println(s.replaceAll("[^ a-z A-Z]", ""));
        
        //ONLY DOT
        System.out.println(s.replaceAll("[^ .]", ""));
        
        String t="0987654321";
        
        System.out.println(t.matches("[0-9]{10}"));
        
        String phone="99988554433";
        
        System.out.println(phone.matches("[9]{3}[8]{2}[5]{2}[4]{2}[3]{2}"));
        
        String d="@";
        System.out.println(d.matches("\\@"));
        
        //regex to match email id
        String email="vimessidkefkf2367@gmail.com";
        System.out.println(email.matches("\\D+\\d*\\@\\D+\\.\\D{3}"));
	}

}
