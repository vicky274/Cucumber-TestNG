package Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Exceptioninjava {
/**
 * 
 * To avoid the ConcurrentModificationException in a multi-threaded environment, we can follow the following ways-

Instead of iterating over the collection class, we can iterate over the array. In this way, we can work very well with small-sized lists, but this will deplete the performance if the array size is very large.
Another way can be locking the list by putting it in the synchronized block. This is not an effective approach as the sole purpose of using multi-threading is relinquished by this.
JDK 1.5 or higher provides with ConcurrentHashMap and CopyOnWriteArrayList classes. These classes help us in avoiding concurrent modification exception.
 * @param args
 */
	public static void main(String[] args) {
		
		
		/*//arrayindexoutofBound Exception
		int[] a = new int[]{1,2,3};
		System.out.println(a[3]);*/
		
		
		//Numberformat Exception
		String s="vicky";
	    int i = Integer.parseInt(s);
		
		
		//classcast Exception
		/**
		 * Thrown to indicate that the code has attempted to cast an object to a subclass of which it is not an instance. 
		 * For example, the following code generates a ClassCastException:
		 */
		
		Object x = new String("abc");
	     System.out.println((Integer)x);
	     
	     
		 Object x1 = new Integer(0);
		 if(x1 instanceof String)
	     System.out.println((String)x1);
	}
	     
	     //ConcurrentModificationException
	     /**
	      * 
	      * The ConcurrentModificationException occurs when an object is tried to be modified concurrently 
	      * when it is not permissible. This exception usually comes when one is working with Java Collection 
	      * classes.
	      */
	    /* 
	      List<String>  list = new ArrayList<String>();
	      list.add("space");
	      list.add("air");
	      list.add("land");
	      list.add("water");
	      list.add("fire");
	     
	    Iterator<String> itr =list.iterator();
	      
	      while(itr.hasNext()){
	    	  String s = itr.next();
	    	  System.out.println(s);
	    	  itr.remove();
	    	  //list.remove(0);
	      }
	      
	      System.out.println("After removal :"+ list);
	      */
	     /* //reverse direction
	      Collections.reverse(list);
	      System.out.println(list);
	      
	      ListIterator<String> listitr =list.listIterator(list.size());
	      
	      while(listitr.hasPrevious()){
	    	  
	    	  String s = listitr.previous();
	    	  System.out.println(s);
	    	  //listitr.add("vicky");
	    	 // listitr.set(e);
	      }
	      */
	      
	      //Java.lang.NullPointer Exception
	      /*try{
	  		String str=null;
	  		System.out.println (str.length());
	  	}
	          catch(NullPointerException e){
	  		System.out.println("NullPointerException..");
	  	}*/
	      
	      //StringindexoutofBound Exception
	      /*try{
	    		 String str="beginnersbook";
	    		 System.out.println(str.length());;
	    		 char c = str.charAt(0);
	    		 c = str.charAt(40);
	    		 System.out.println(c);
	    	      }catch(StringIndexOutOfBoundsException e){
	    		  System.out.println("StringIndexOutOfBoundsException!!");
	    	       }*/
	//}

}
