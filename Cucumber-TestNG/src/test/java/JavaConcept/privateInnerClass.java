package JavaConcept;

public class privateInnerClass {

	private int a =10;
	//Write an inner class in it, return the private members from a method within the inner class. 
	//This Way we access private member in inner class.
	
	private class innerdemo
	{
		public void f(){
			System.out.println("private class method"+a);
		}
	}
	
	//private inner class can be accessed via a method inside that class
	public void m(){
		innerdemo demo = new innerdemo();
		demo.f();
	}

}
