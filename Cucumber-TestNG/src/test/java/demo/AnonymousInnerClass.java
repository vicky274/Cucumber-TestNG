package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Nested class in java
//A class within another class is called nested class. the scope of nested class is with in the enclosing class.
//2 types 1)static 2)non static
/*If you want to create a class which is to be used only by the enclosing class, 
then it is not necessary to create a separate file for that. Instead, you can add it as "Inner Class"

static nested class
If the nested class i.e the class defined within another class, has static modifier applied in it, 
then it is called as static nested class. Since it is, static nested classes can access only static 
members of its outer class i.e it cannot refer to non-static members of its enclosing class directly. 
Because of this restriction, static nested class is rarely used.*/

/*non static nested class:
Non-static Nested class is the most important type of nested class. It is also known as Inner class.
Java compiler generates an error if any code outside Outer class attempts to instantiate Inner class directly.
types:
	1)Member class
    2)local class
    3)Anonymous inner class*/

/*A non-static Nested class that is created outside a method is called Member inner class.

A non-static Nested class that is created inside a method is called local inner class. 
If you want to invoke the methods of local inner class, you must instantiate this class inside the method. 
We cannot use private, 
public or protected access modifiers with local inner class. Only abstract and final modifiers are allowed.
*/
public class AnonymousInnerClass {

	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(99);
		list.add(88);
		list.add(55);
		list.add(66);
		list.add(22);
		
		//(x%10>y%10)?-1:(x%10==y%10)?0:1;
		
		Comparator<Integer> com=(x,y)-> {
			
			return (x%10>y%10)?-1:(x%10==y%10)?0:1;
			
		};
			
		Collections.sort(list,com);
		//Collections.reverse(list);
		
		//list.forEach(System.out::println);

		
		
		//---------------------------------------------------------------------------------------------
        List<Integer> list1 = new ArrayList<Integer>();
		
        list1.add(99);
        list1.add(88);
        list1.add(55);
        list1.add(66);
        list1.add(22);
		
		Collections.sort(list1,Collections.reverseOrder());
		list1.forEach(System.out::println);
	}

}
