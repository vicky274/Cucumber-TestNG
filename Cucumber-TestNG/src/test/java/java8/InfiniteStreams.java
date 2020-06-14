package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.function.DoubleConsumer;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreams {

	public static void main(String[] args) {
		// Java 8 - Generate Infinite Streams using iterate() and generate() methods

		
		System.out.println("----------Iterate------------");
		List<Integer> list = IntStream.iterate(0, x->x+1).mapToObj(x->Integer.valueOf(x)).limit(10).collect(Collectors.toList());
		System.out.println(list);
		
		//2 generate
		System.out.println("----------Generate------------");
		List<Integer> list1 = Stream.generate(() -> (new Random()).nextInt(100)).limit(10).collect(Collectors.toList());
		System.out.println(list1);
		
	    System.out.println("-----------max number--------- ");
		int a =Stream.generate(() -> (new Random()).nextInt(100)).limit(10).max((o1,o2) -> o1>o2?1:-1).get().intValue();
		System.out.println(a);
			
			
		System.out.println("----------average---------");
		OptionalDouble dou = IntStream.of(2,4,6,8,10).average();
		System.out.println(dou);
		
        // Using stream.max() to get maximum 
        // element according to provided Comparator 
        // and storing in variable var

        // Creating a list of integers 
        List<Integer> lis = Arrays.asList(-9, -18, 0, 25, 4); 
  
        System.out.print("The maximum value is : "); 
      
        Integer var = lis.stream().max(Integer::compare).get(); 
  
        System.out.print(var); 
		
		}
}
