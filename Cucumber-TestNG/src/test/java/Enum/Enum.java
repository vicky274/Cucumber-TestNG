package Enum;
/**
 * 
 * An enum is a special type of data type which is basically a collection (set) of constants.
 * Every enum constant represents an object of type enum.
   enum type can be passed as an argument to switch statement
 * @author FreaKy ThrEE
 *
 */
//THIS IS WHAT HAPPENING INSIDE WHEN WE CREATE CONSTANT IN ENUM
/*class Mobile{
	static final APPLE = new Mobile();
	static final ONEPLUS = new Mobile();
}*/

//Enum
	enum Mobile
	{
		
		APPLE(1000),SAMSUNG(2000),ONEPLUS;
		private final int price;
		
		Mobile(){
			price=80;
			System.out.println("Explicit Constructor :"+price);
		}
		
		Mobile(int p){
			
			price=p;
			System.out.println("Paramaterized Constructor: "+p);
		}
		public int getprice(){
			
			return price;
		}
		
	}
	
public class Enum {

	
	public static void main(String[] args) {
		
		Mobile m1 = Mobile.SAMSUNG;
	
		
		switch(m1){
		case SAMSUNG:
			System.out.println("samsung mobile");
			break;
		}
		
		System.out.println("The price is :"+m1.getprice());
		
		//System.out.println(Mobile.APPLE.getprice());
        System.out.println(Mobile.valueOf("APPLE"));
        System.out.println(Mobile.valueOf("ONEPLUS"));
        System.out.println(Mobile.valueOf("SAMSUNG"));
   
		Mobile[] val = Mobile.values();
		
		for(Mobile m:val){
			System.out.println(m);
		}
	}
	
	

}
