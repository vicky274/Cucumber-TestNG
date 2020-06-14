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
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.google.common.collect.Multiset.Entry;

import ComparableLogic.Author;
import ComparableLogic.AuthorAgeComparator;

public class HashMapClass {

	public static void main(String[] args) {
		//hashmap
	/*	1 no order
		2 unsunchronized
		3 key value pair
		4 allow  single null key and multiple null value*/
		 Map<String, Integer> map = new TreeMap<>(); //natural order
		  map.put("fire", 10);
		  map.put("land", 5);
		  map.put("air", 6);
		  map.put("space", 20);
		  
		  System.out.println("---------tree map--------------");
		  map.forEach((t,u) -> System.out.println(t +" " +u));
		  map.entrySet().stream().map(x-> x.getValue()).sorted((t,u) -> t>u?-1:1).forEach(System.out::println);
		  
		  
		  
		  
		  
		  
		  //---------------------------------------------------------------------------------------------//
		 Map<String, Integer> unsortMap = new HashMap<>();
	        unsortMap.put("fire", 10);
	        unsortMap.put("land", 5);
	        unsortMap.put("air", 6);
	        unsortMap.put("space", 20);
	        unsortMap.put("water", 1);
	        unsortMap.put("avathar", 7);
	        unsortMap.put("tony", 8);
	        unsortMap.put("scarlet", 99);
	        unsortMap.put("ironman", 50);
	        unsortMap.put("captain", 2);
	        unsortMap.put("thor", 9);
	        
	     System.out.println("--------------Unsort Map-------------");
	     System.out.println(unsortMap);
	    
	     LinkedHashMap<String, Integer> result = unsortMap.entrySet().stream()
	            .sorted(Map.Entry.comparingByKey())
	            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1, e2) -> e1, LinkedHashMap::new));
	     
	     System.out.println("-------------Sorted Key--------------");
		 System.out.println(result);

	     //sort by values, and reserve it, 10,9,8,7,6...
		 LinkedHashMap<String, Integer> result1 = unsortMap.entrySet().stream()
	                .sorted(Map.Entry.comparingByValue())
	                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

			
	        System.out.println("----------------Sorted Value------------");
	        System.out.println(result1);
	        
	       /* 
	        HashMap<String, String> hmap = new HashMap<String, String>();
	        hmap.put("1", "Naveen");
	        hmap.put("2", "Santosh");
	        hmap.put("3", "Ravi");
	        hmap.put("4", "Pramod");
	        hmap.put("5", "Zuck");
	        hmap.put("6", "Abhi");
	 
	        for (java.util.Map.Entry<String, String> entry : hmap.entrySet()) 
	        {
	             System.out.print(entry.getKey() + ": ");
	             System.out.println(entry.getValue());
	        }
	        */
	        

	        
	}

}
