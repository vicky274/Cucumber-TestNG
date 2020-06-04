package demo;

public class staticInnerClass {
/**
 * We can instantiate a static inner class with reflection using InnerClass.class.newInstance(). If we 
 * need an instance of the outer class to instantiate a non-static inner class, we can specify it before a new operator.
 * @param args
 * 
 *
 A static class i.e. created inside a class is called static nested class in java. 
 It cannot access non-static data members and methods. It can be accessed by outer class name.

 It can access static data members of outer class including private.
 Static nested class cannot access non-static (instance) data member or method.
 */
	//1 ST WAY USING class.newInstance()
	public static void main(String[] args) {
		try {
	         InnerClass inner = (InnerClass) InnerClass.class.newInstance();
	         inner.test();
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
	   }
	   // inner class
	   static class InnerClass {
	      public void test() {
	         System.out.println("Welcome to TutorialsPoint !!!");
	      }
	   }
	}

//2ND WAY
/*class TestOuter1{  
	  static int data=30;  
	  static class Inner{  
	   void msg(){System.out.println("data is "+data);}  
	  }  
	  public static void main(String args[]){  
	  TestOuter1.Inner obj=new TestOuter1.Inner();  
	  obj.msg();  
	  }  
	} */ 