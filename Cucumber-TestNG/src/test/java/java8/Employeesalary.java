package java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

public class Employeesalary {

	public static void main(String[] args) {
		
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("1", 20000);
		map.put("2", 10000);
		map.put("3", 20000);
		map.put("4", 30000);
		map.put("5", 12000);
	
		Set<Entry<String, Integer>> keyvalue = map.entrySet();
		
		for(Map.Entry<String, Integer> val : keyvalue){
			String s =val.getKey().replaceAll(val.getKey(),"Employee"+val.getKey());
			System.out.println(s);
		}
		map.entrySet().stream().map(x->x.getValue()).filter(x-> (x>=20000)).forEach(System.out::println);

	}

}
