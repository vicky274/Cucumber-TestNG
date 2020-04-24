package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateinFilter {

	public static void main(String[] args) {
		
		//predicate is a functional interface introduced in java 1.8
		
		List<Integer> values = Arrays.asList(12,25,34,45,52,65);

		
		Predicate<Integer> p = new Predicate<Integer>()
				{

					@Override
					public boolean test(Integer i) {
						
						
						return i%5==0;
					}
			
			
				};
		Integer val= values.stream().filter(p).reduce(0,(c,e) -> (c+e));
		System.out.println(val);
		
		//lamda expression
		
		//System.out.println(values.stream().filter(i -> (i%5==0)).reduce(0,(c,e) -> (c+e)));
		
	}

}
