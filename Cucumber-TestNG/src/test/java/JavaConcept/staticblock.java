package JavaConcept;

public class staticblock {
	
	staticblock(){
		System.out.println("1");
	}
	static{
		System.out.println("2");
	}
	
	/*You can't have static fields/method in a regular inner classes, because, 
	inner classes will work only with instance of outer classes.
	So, static can't be there with instances.
*/	
	public static class B extends staticblock
	{
	B(){
		System.out.println("3");
	}
	
	static{
		System.out.println("4");
}

	

}
	
	public static void main(String[] args) {
		staticblock b = new staticblock();

	}
}
