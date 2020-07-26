package Singletonclass;

public class Singleton_Class {

	
	public static void main(String[] args) {
		 
		 
	}

}

/*The use of private constructor is to serve singleton classes. 
A singleton class is one which limits the number of objects creation to one. Using private constructor 
we can ensure that no more than one object can be created at a time. By providing a private constructor 
you prevent class instances from being created in any place other than this very class. 
We will see in the below example how to use private constructor for limiting the number of objects for a singleton class.*/

class Single_Design{
	
	
	private static Single_Design obj=null;
	
	
	private Single_Design() {
		
	}
	
	public static Single_Design getinstance()
	{
		 if(obj==null)
		 {
			 obj=new Single_Design();		 
		 }
		return obj;
	}
}


