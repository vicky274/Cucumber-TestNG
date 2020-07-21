package JavaConcept;

public class Constructor {

	
	/**
	 * 
	 * There are two rules defined for the constructor.

         Constructor name must be the same as its class name
         A Constructor must have no explicit return type
         A Java constructor cannot be abstract, static, final, and synchronized
         
         Note: We can use access modifiers while declaring a constructor. It controls the object creation. 
         In other words, we can have private, protected, public or default constructor in Java.
         
         final restricts modification: variables become constant, methods can't be overridden, and classes can't be inherited.
         

         static members belong to a class, but the constructor is needed to create an object.


declaring constructor as final
In inheritance whenever you extend a class. The child class inherits all the members of the superclass except the constructors.

In other words, constructors cannot be inherited in Java, therefore, you cannot override constructors.

So, writing final before constructors make no sense. Therefore, java does not allow final keyword before a constructor.

If you try, make a constructor final a compile-time error will be generated saying “modifier final not allowed here”.

	 */
	
	
	/*
	 * Why java doesn’t support static constructor? 
	 * It’s actually pretty simple
	 * to understand – Everything that is marked static belongs to the class
	 * only, for example static method cannot be inherited in the sub class
	 * because they belong to the class in which they have been declared. Refer
	 * static keyword. Lets back to the point, since each constructor is being
	 * called by its subclass during creation of the object of its subclass, so
	 * if you mark constructor as static the subclass will not be able to access
	 * the constructor of its parent class because it is marked static and thus
	 * belong to the class only. This will violate the whole purpose of
	 * inheritance concept and that is reason why a constructor cannot be
	 * static.
	 * 
	 * 
	 * This is the reason why constructor cannot be static –
	 *  Because if we make them static they cannot be called from child class thus object of child class cannot be created.
	 */
}
