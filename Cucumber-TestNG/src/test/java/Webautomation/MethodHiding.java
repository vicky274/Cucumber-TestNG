package Webautomation;

public class MethodHiding {

	public static class A{
		
		static void method(){
			System.out.println("print class Parent");
		}
		
	}
	
public static class B extends A{
		
		static void method(){
			System.out.println("print class Child");
		}
		
	}

	public static void main(String[] args) {
		A a = new A();
		A b =new B();
		a.method();
		B.method();

	}

}
