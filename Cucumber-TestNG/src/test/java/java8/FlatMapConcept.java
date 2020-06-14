package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.GsonBuildConfig;

public class FlatMapConcept {

	public static void main(String[] args) {
		
		/**
		 * Returns a stream consisting of the results of replacing each element of this stream with the contents of a
		 *  mapped stream produced by applying the provided mapping function to each element. 
		 *  Each mapped stream is closed after its contents have been placed into this stream. 
		 * (If a mapped stream is null an empty stream is used, instead.) 
		 */
		//Stream over static array won't work so first we need to convert 

		/*String data[][] = new String[][]{{"a","ba"},{"cb","da"},{"e","f"}};
		
		
		Stream<String>  datafilter = Arrays.stream(data).flatMap(x -> Arrays.stream(x)).filter(x -> x.contains("a"));
		
		datafilter.forEach(System.out::println);*/
		
		
		
		//another example
		FlatmapPojo emplist1 = new FlatmapPojo();
		emplist1.setName("Naveen");
		
		emplist1.addDevices("Iphone");
		emplist1.addDevices("Samsung");
		emplist1.addDevices("Oneplus");
		
		FlatmapPojo emplist2 = new FlatmapPojo();
		emplist2.setName("Vignesh");
		
		emplist2.addDevices("Iphone");
		emplist2.addDevices("Redmi");
		emplist2.addDevices("Vivo");
		
		List<FlatmapPojo> list = new ArrayList<FlatmapPojo>();
		list.add(emplist1);
		list.add(emplist2);
		System.out.println("the list :"+list);
		
		/*Map<String, List<FlatmapPojo>> map = new HashMap<String, List<FlatmapPojo>>();
		map.put("map", list);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(gson.toJson(map));*/
		
		
		List<String> distinctlist = list.stream().map( x -> x.getDevices()).flatMap(x-> x.stream())
				                    .distinct().collect(Collectors.toList());
		
		
		distinctlist.forEach(System.out::println);
		
		
		//for primitive type  use flatmaptoint Method
		int[] a ={1,2,3,4,5,6};
		Stream<int[]>  datastream = Stream.of(a);	
		IntStream filterdata  =datastream.flatMapToInt(x-> Arrays.stream(x)).distinct();
		
		filterdata.forEach(System.out::println);
	}

}
