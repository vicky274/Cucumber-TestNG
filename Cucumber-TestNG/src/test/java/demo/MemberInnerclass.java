package demo;

public class MemberInnerclass {

	
	private int a=20;
	
	class innerclass{
		
		void show(){
			System.out.println("data :"+a);
		}
	}
	
	 public static void main(String args[])
	 {  
		 MemberInnerclass obj=new MemberInnerclass();  
		 MemberInnerclass.innerclass in=obj.new innerclass();  
		  in.show(); 
		  
	 }  
}
