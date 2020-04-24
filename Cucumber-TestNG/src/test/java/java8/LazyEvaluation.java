package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class LazyEvaluation {

	public static void main(String[] args) {
		
List<Integer> values = Arrays.asList(12,25,34,45,52,65);

		
		Optional<Integer> val= values.stream().filter(LazyEvaluation::filterit).map(LazyEvaluation::Doubleit).findFirst();
		System.out.println(val);
	}

	public static boolean filterit(Integer i){
		
		System.out.println("divisible :"+i);
		return i%5==0;
		
	}
	
public static int Doubleit(Integer i){
		
	System.out.println("multiply :"+i);
		return i*2;
		
	}
}
