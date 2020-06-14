package ComparableLogic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Hashmapsortbyvalue {

	// function to sort hashmap by values 
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<String, Integer> > list = 
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
        	
            public int compare(Map.Entry<String, Integer> o1,  
                               Map.Entry<String, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
  
        HashMap<String, Integer> hm = new HashMap<String, Integer>(); 
  
        // enter data into hashmap 
        hm.put("John", 98); 
        hm.put("Will", 85); 
        hm.put("Vignesh", 91); 
        hm.put("Boby", 95); 
        hm.put("Peter", 79); 
        hm.put("Jack", 80); 
       
        Map<String, Integer> hm1 = sortByValue(hm); 
        
        // print the sorted hashmap 
        for (Map.Entry<String, Integer> en : hm1.entrySet()) { 
        	
            System.out.println("Key = " + en.getKey() +  
                          ", Value = " + en.getValue()); 
        } 
        
        
        //java 8 Comparator.reverseOrder()
        List<Integer> list = new ArrayList<Integer>();
        
       for (Map.Entry<String, Integer> en : hm1.entrySet()) { 
	        list.add(en.getValue());
        } 
        list.stream().sorted((o1,o2)->  o1.compareTo(02)).forEach(System.out::println);

        Map<String, Integer> sorted = hm
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(/*Comparator.reverseOrder()*/))
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                        LinkedHashMap::new));

            System.out.println("------map after sorting by values:------- ");
           sorted.forEach(new BiConsumer<String, Integer>(){

					@Override
					public void accept(String t, Integer u) {
						System.out.println(t + ":" + u);
						
					}
		});
        
    } 
} 


