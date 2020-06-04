package Customer;


class demo{
	
	public void show(){
		System.out.println("show method in demo class");
	}
	
	public static void showcase(){
		System.out.println("static method in demo class");
	}
}

public class Inheritance extends demo{

	
/*	Abstraction: Abstraction is a process where you show only “relevant” data and “hide” unnecessary 
	details of an object from the user.

	Encapsulation: Encapsulation simply means binding object state(fields) and behaviour(methods) together. 
	If you are creating class, you are doing encapsulation.*/
	
	@Override
	public void show(){
		System.out.println("show method in Inheritance class");
	}
	
	/**
	 * static method cannot be inherited in the sub class
	 * because they belong to the class in which they have been declared. Refer
	 * static keyword.
	 */
	public static void showcase(){
		System.out.println("static method in Inheritance class");
	}
	
	public static void main(String[] args)
	{
		//overriding late binding
		//Method overriding is the example of run time polymorphism.
		Inheritance i = new Inheritance();
		i.show();
		
		/**
		 * When super class and sub class contains same method including
		 * parameters and if they are static.
		 * 
		 * The method in the super class will be hidden by the one that is in
		 * the sub class. This mechanism is known as method hiding.
		 */
		//method hiding early binding
		Inheritance.showcase();
		
	}
	
}
