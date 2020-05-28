package java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConsumerInterface {

	public static void main(String[] args) {
		
		
		
		List<String> list = new ArrayList<String>();
		list.add("this");
		list.add("is");
		list.add("java");
		list.add("project");
		
		//list.forEach(input -> System.out.println(input));
		
		list.forEach(System.out::println);
		
		
        //using java 8 lambda foreach and iterator
		
		Iterator<String> it = list.iterator();
		
		it.forEachRemaining(System.out::println);
		
	}

}
