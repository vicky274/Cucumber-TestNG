package java8;

public class Stringformat {

	public static void main(String[] args) {
		
		long a=000000111;
		
		System.out.println(String.format("%1d", a));

		

        int num = 7044; 
  
        // Output is 3 zero's("000") + "7044", 
        // in total 7 digits 
        String gfg3 = String.format("%07d", num); 
  
        System.out.println(gfg3); 
        
        String s = "006";
        s = s.replaceFirst ("^0{2}", "");
        System.out.println(s);
	}

}
