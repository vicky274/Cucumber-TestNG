package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class mapReduce {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		Optional<Integer> val=values.stream().map(new Function<Integer,Integer>(){

			@Override
			public Integer apply(Integer i) {
				
				return i*2;	
			}
			
		}).reduce(new BinaryOperator<Integer>(){

			@Override
			public Integer apply(Integer i, Integer j) {
				
				return i+j;
			}	
		});

		if(val.isPresent()){
			System.out.println(val.get());
		}
		else{
			
			System.out.println(val.orElse(0));
		}
		
		//2
		/*Optional<Integer> valu=values.stream().map((i) -> {return i*2;})
				.reduce((i,j) -> {
				return i+j;
			});*/
	}

	
}
