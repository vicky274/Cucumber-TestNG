package Interface;


/*With the introduction of default methods in interfaces, it seems that the abstract classes are same as interface in java 8. 
However this is not entirely true, even though we can now have concrete methods(methods with body) in interfaces just like 
abstract class, this doesn’t mean that they are same. There are still few differences between them, one of them is that 
abstract class can have constructor while in interfaces we can’t have constructors.

The purpose of interface is to provide full abstraction, while the purpose of abstract class is to provide partial abstraction. 
This still holds true. The interface is like a blueprint for your class, with the introduction of 
default methods you can simply say that we can add additional features in the interfaces without affecting the end user classes.*/


//The multiple inheritance problem can occur, when we have two interfaces with the default methods of same signature
/*How to solve this issue?
To solve this problem, we can implement this method in the implementation class like this:*/

/*Java 9 introduced private methods in interfaces to remove the redundancy
by sharing the common code of multiple default methods through private methods.*/
interface demoA{
	
	default void methodA()
	{
		System.out.println("MethodA IN DEMO A");
	}
	
	static void MethodB(){
		System.out.println("MethodB IN DEMO A");
	}
	
	void MethodC();
	
}

interface demoB{
	
	default void methodA()
	{
		System.out.println("MethodA IN DEMO B");
	}
	
	static void MethodB(){
		System.out.println("MethodB IN DEMO B");
	}
	
	void MethodC();
	
}
public class Interface8 implements demoA,demoB{

	
	
	public static void main(String[] args) {
		
		Interface8 i = new Interface8();
		i.methodA();
		//i.MethodC();
	}

	
	@Override
	public void MethodC() {
		System.out.println("MethodC IN MAIN METHOD");
		
	}


	@Override
	public void methodA() {
		
		demoA.super.methodA();
	}

}
