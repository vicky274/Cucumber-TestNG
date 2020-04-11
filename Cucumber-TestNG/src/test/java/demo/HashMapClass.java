package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Multiset.Entry;

import ComparableLogic.Author;
import ComparableLogic.AuthorAgeComparator;

public class HashMapClass {

	public static void main(String[] args) {
		
		
		/* Map<String, Integer> unsortMap = new HashMap<>();
	        unsortMap.put("z", 10);
	        unsortMap.put("b", 5);
	        unsortMap.put("a", 6);
	        unsortMap.put("c", 20);
	        unsortMap.put("d", 1);
	        unsortMap.put("e", 7);
	        unsortMap.put("y", 8);
	        unsortMap.put("n", 99);
	        unsortMap.put("g", 50);
	        unsortMap.put("m", 2);
	        unsortMap.put("f", 9);
	        
	     System.out.println("Unsort Map");
	     System.out.println(unsortMap);
	    
	     LinkedHashMap<String, Integer> result = unsortMap.entrySet().stream()
	            .sorted(Map.Entry.comparingByKey())
	            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1, e2) -> e1, LinkedHashMap::new));
	     
	     System.out.println("Sorted Key...");
		 System.out.println(result);

	     //sort by values, and reserve it, 10,9,8,7,6...
		 LinkedHashMap<String, Integer> result1 = unsortMap.entrySet().stream()
	                .sorted(Map.Entry.comparingByValue())
	                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

			
	        System.out.println("Sorted Value...");
	        System.out.println(result1);
	        */
	        
	        HashMap<String, String> hmap = new HashMap<String, String>();
	        hmap.put("1", "Naveen");
	        hmap.put("2", "Santosh");
	        hmap.put("3", "Ravi");
	        hmap.put("4", "Pramod");
	        hmap.put("5", "Zuck");
	        hmap.put("6", "Abhi");
	       
	       /* hmap.put("Naveen", "10");
	        hmap.put("Ravi", "5");
	        hmap.put("zuck", "6");
	        hmap.put("Pramod", "20");
	        hmap.put("abhi", "1");
	 */
	        List list = new LinkedList(hmap.entrySet());
	       // HashMap<String, String> map = sortByValues(hmap); 
	        Collections.sort(list, new HashmapComparator());
	        System.out.println("After Sorting:");
	        
	        for (java.util.Map.Entry<String, String> entry : hmap.entrySet()) 
	        {
	             System.out.print(entry.getKey() + ": ");
	             System.out.println(entry.getValue());
	        }
	        
	        

	        
	}

	//******************************sorting hashmap by values***************************
	/*private static HashMap<String, String> sortByValues(HashMap<String, String> map) { 
		
        List list = new LinkedList(map.entrySet());
        // Defined Custom Comparator here
        Collections.sort(list, new Comparator() {
             public int compare(Object o1, Object o2) 
             {
                return ((Comparable) ((Map.Entry) (o1)).getValue())
                   .compareTo(((Map.Entry) (o2)).getValue());
                
        
             }
             
            

        });

        // Here I am copying the sorted list in HashMap
        // using LinkedHashMap to preserve the insertion order
        HashMap<String, String>  sortedHashMap = new LinkedHashMap<String, String> ();
        
        for (Iterator it = list.iterator(); it.hasNext();) 
        {
               Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
               sortedHashMap.put(entry.getKey(), entry.getValue());
        } 
        return sortedHashMap;
   }*/
}
