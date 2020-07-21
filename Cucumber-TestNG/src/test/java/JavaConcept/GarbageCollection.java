package JavaConcept;

public class GarbageCollection {

	/**
	 * When JVM starts up, it creates a heap area which is known as runtime data area. 
	 * This is where all the objects (instances of class) are stored. Since this area is limited, 
	 * it is required to manage this area efficiently by removing the objects that are no longer in use. 
	 * The process of removing unused objects from heap memory is known as Garbage collection and 
	 * this is a part of memory management in Java.
	 * @param args
	 */
	 public static void main(String args[]){  
	        /* Here we are intentionally assigning a null 
	         * value to a reference so that the object becomes
	         * non reachable
	         */
		 GarbageCollection obj=new GarbageCollection();  
		obj=null;  
			
	        /* Here we are intentionally assigning reference a 
	         * to the another reference b to make the object referenced
	         * by b unusable.
	         */
		GarbageCollection a = new GarbageCollection();
		GarbageCollection b = new GarbageCollection();
		b = a;
		System.gc();  
	   }  
	   protected void finalize() throws Throwable
	   {
	        System.out.println("Garbage collection is performed by JVM");
	   }

}
