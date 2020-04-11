package Enum;

public class Enum {
//Enum
	enum Mobile
	{
		
		APPLE(1000),SAMSUNG(2000),ONEPLUS;
		int price;
		
		Mobile(){
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
	
	public static void main(String[] args) {
		
		System.out.println(Mobile.APPLE.getprice());

	}
	
	

}
