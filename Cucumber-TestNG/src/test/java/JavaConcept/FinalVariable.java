package JavaConcept;

class StudentData{ 
	
	//final restricts modification: variables become constant, methods can't be overridden, and classes can't be inherited.
	    final int ROLL_NO=100;
		
	   /*StudentData(int rnum){
	      ROLL_NO=rnum;
	   }*/
	   void myMethod(){  
	      System.out.println("Roll no is:"+ROLL_NO);
	   }  
}


 
public class FinalVariable {

	public static void main(String[] args) {
		StudentData s1= new StudentData();
		//s1.ROLL_NO=10;
		s1.myMethod();
		StudentData s2= new StudentData();
		s2.myMethod();
	}

}
