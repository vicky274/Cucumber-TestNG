package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapVsFlatMap {

	public static void main(String[] args) {
		
		/**
		 * In order to understand the flatMap() method, you first need to understand the map() function of Java 8. 
		 * The map() function is declared in  the java.util.stream.Stream class and uses to transform one Stream 
		 * into another, 
		 * 
		 * for example, it can convert a stream of integer numbers into another stream of ints where each element 
		 * is the square of the corresponding element in the source stream. 
		 * In the map() operation, a function is applied to each element of the source Stream and return values are 
		 * inserted into a new Stream which is returned to the caller. 
		 * The key point to note here is that the function used by map() operation returns a single value.

Now, if the map operation uses a function which instead of returning a single value returns a Stream of values like when you give a number 
and it returns all prime factors of the number then you have a Stream of Stream of integers. 
That's where flatmap function helps.

The flatMap() method can be used to flatten that stream into a Stream of integers. 
For example, suppose, you have a list of numbers like [21, 23, 42] and we call getPrimeFactors() method 
along with the map() operation to transform this stream.

The result would be [[3,7],[23],[2,3,7]]. If you want to flatten this stream of a stream into a stream of values, 
you can use the flatMap() which will finally return [3,7,2,3,2,3,7].

Read more: https://www.java67.com/2016/03/how-to-use-flatmap-in-java-8-stream.html#ixzz6O5Yk73Rv
		 */

		List<Integer> list = new ArrayList<Integer>();
		list.add(21);
		list.add(23);
		list.add(42);
		
		Stream<Integer> data = list.stream().map(x -> x+2);
		
		data.forEach(System.out::println);
		
	}

}
