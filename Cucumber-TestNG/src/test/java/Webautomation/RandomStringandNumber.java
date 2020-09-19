package Webautomation;

import java.util.Random;

public class RandomStringandNumber {

	public static void main(String[] args) {

		Random rand = new Random();

		/*for (int i = 1; i <= 10; i++) {

			long rand_int1 = rand.nextInt(1000000000);
			System.out.println(rand_int1);
		}*/

		/*
		for (int i = 1; i <= 10; i++) {
			long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
			System.out.println(number);
		}
		*/
		
		
		
		
		//System.out.println(generateID(3));
		
		System.out.println(bau_RandomDigit(2,99));
		
		//System.out.println(ModemNumber());
		
		withgivenrange(10, 1000);
	}
	
	public static long generateID(int length) 
	{ 
	    Random rnd = new Random();
	    
	    char [] digits = new char[length];
	    
	    digits[0] = (char) ('0');
	    
	    for(int i=1; i<digits.length; i++) 
	    {
	        digits[i] = (char) (rnd.nextInt(9) + '0');
	    }
	    
	    return Long.parseLong(new String(digits));
	}
	
public static String bau_RandomDigit(int i,int max) {
		
		return String.format("%0"+i+"d", new Random().nextInt(max));
	}

/*public  static String ModemNumber(){
	String s="12345";
	StringBuilder ss = new StringBuilder();
	switch(s.length()){
	case 5:
		ss.append(s).append(bau_RandomDigit(7));
		System.out.println(ss.length());
		return ss.toString();
	case 6:
		ss.append(s).append(bau_RandomDigit(6));
		System.out.println(ss.length());
		return ss.toString();
	case 7:
		ss.append(s).append(bau_RandomDigit(5));
		System.out.println(ss.length());
		return ss.toString();
	case 8:
		ss.append(s).append(bau_RandomDigit(4));
		System.out.println(ss.length());
		return ss.toString();
	case 9:
		ss.append(s).append(bau_RandomDigit(3));
		System.out.println(ss.length());
		return ss.toString();
	case 10:
		ss.append(s).append(bau_RandomDigit(2));
		System.out.println(ss.length());
		return ss.toString();
	default :
		throw new AssertionError("Customer Number length not between 5 and 9");	
	
	}
	
	
}*/

public static void withgivenrange(int min, int max){
	Random r = new Random();
	
	int result = r.nextInt(max-min) + min;
	System.out.println(result);
}

}
