package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterface {

	public static void main(String[] args) {
		
		
		/**
		 * @FunctionalInterface public interface Predicate<T> \
		 * Represents a predicate (boolean-valued function) of one argument.
		 */
		
		Predicate<Integer> pred = x->x>5;
		boolean s = pred.test(1);
		
		System.out.println(s);

		
		//predicate negate function 
		List<String> list = Arrays.asList("java","ruby","python","javaEE");
		Predicate<String> pred1 = x->x.startsWith("java");
		
		 List<String> list1 = list.stream().filter(pred1.negate()).collect(Collectors.toList());
		 System.out.println(list1);
	}

}
