package JavaConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DifferentCollection {

	public static void main(String[] args) {
		
		List<Integer> lis = new ArrayList<Integer>();
		lis.add(24);lis.add(25);
		
		String[] s = new String[]{"45","23","33"};
		Arrays.sort(s);
		System.out.println(s[0]);
		List<String> li = new ArrayList<String>(Arrays.asList(s));
		li.add("324");
		li.add("466");
		li.add("778");
		li.add("998");
		//sorting in natural order
		//Collections.sort(li,Collections.reverseOrder());
		System.out.println(li);
		
		//sorting in natural order
		/*li.sort((String o1, String o2) -> o1.compareTo(o2));
		System.out.println(li);*/
		
		/*For the example suppose we are returning data from database 
		and if no rows fetched then instead of returning null, we can return immutable List.*/
		List<String> list  = Collections.emptyList();
		
		//Returns the maximum element of the given collection, according to the natural ordering of its elements.
		System.out.println(Collections.max(lis));
		System.out.println(Collections.min(li));
	}

}