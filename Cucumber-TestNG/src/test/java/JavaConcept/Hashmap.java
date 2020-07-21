package JavaConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiConsumer;

public class Hashmap {

	private int hash;
	private final String value;
	
	public Hashmap(String s) {
        this.value = s;
    }
	
	public int hashCode() {
        int h = hash;
        if (h == 0 && value.length() > 0) {
            char val[] = value.toCharArray();
System.out.println(val.length);
            for (int i = 0; i < val.length; i++) {
            	System.out.println(h +" "+val[i]);
            	int a =val[i];
            	System.out.println(a);
                h = 31 * h + val[i];
            }
            hash = h;
        }
        return h;
    }


	public static void main(String[] args) {
	
		
		
		Hashmap Hashmap= new Hashmap("vignesh");
		
	    System.out.println(Hashmap.hashCode());
	   
		
	/*	
	HashMap<String,Integer> value = new HashMap<String,Integer>();
	
	value.put("Vignesh", 1234);
	value.put("Vignesh", 123);
	value.put("jack", 1234);
	
	//use biconsumer interface accept method to achieve
	value.forEach(( t,  u) -> { System.out.println("key :" +t +" value :"+u);});
	
	*/
	
	}
	
}

