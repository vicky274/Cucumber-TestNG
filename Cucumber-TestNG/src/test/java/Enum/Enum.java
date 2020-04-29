package Enum;

//THIS IS WHAT HAPPENING INSIDE WHEN WE CREATE CONSTANT IN ENUM
/*class Mobile{
	static final APPLE = new Mobile();
	static final ONEPLUS = new Mobile();
}*/

//Enum
	enum Mobile
	{
		
		APPLE(1000),SAMSUNG(2000),ONEPLUS;
		int price;
		
		Mobile(){
			price=80;
			System.out.println("Constructor");
		}
		
		Mobile(int p){
			price=p;
			System.out.println(p);
		}
		public int getprice(){
			
			return price;
		}
		
	}
	
public class Enum {

	
	public static void main(String[] args) {
		
		/*Mobile m = Mobile.SAMSUNG;
		
		switch(m){
		case SAMSUNG:
			System.out.println("samsung mobile");
			break;
		}*/
		
		//System.out.println(Mobile.APPLE.getprice());

		Mobile[] val = Mobile.values();
		
		for(Mobile m:val){
			System.out.println(m);
		}
	}
	
	

}
