package JavaConcept;

public class MemberInnerclass {


		void show(){
			System.out.println("data :");
			
			class memberclass
			{
				void m()
				{
					
					System.out.println("member class method");
				}
					
		}
		//member inner class can be instantiated inside that method only
			memberclass m1 = new memberclass();
			m1.m();
	}
	
	 public static void main(String args[])
	 {  
		 MemberInnerclass obj=new MemberInnerclass();  
		 obj.show(); 
		  
	 }  
}
