package Customer;

/**
 * A final method in a superclass cannot be overridden in a subclass—this guarantees that the final method implementation will be used by all direct and indirect subclasses in the hierarchy. 
 * Methods that are declared private are implicitly final , because it's not possible to override them in a subclass.
 * @author FreaKy ThrEE
 * 
 * **That shows that final methods are (INHERITED) but they are not eligible for overriding.
 *
 */



class democlass{
	
	/**
	 * A final method’s declaration can never change, so all subclasses use the same method implementation, 
	 * and calls to final methods are resolved at compile time—this is known as static binding.
	 */
	public final void show(){
		System.out.println("final method in demo class");
	}
	
	/**
	 * No, a private method cannot be overridden since it is not visible from any other class. 
	 * You have declared a new method for your subclass that has no relation to the superclass method. 
	 */
	
	private void checkdemo(){
		System.out.println("checkdemo method in demo class");

	}

}
public class finalmethod extends democlass{
	
	private void checkdemo(){
		System.out.println("checkdemo method in finalmethod class");

	}
	
	
	public static void main(String[] args) {
		finalmethod f = new finalmethod();
		f.checkdemo();
		f.show();

	}

}
