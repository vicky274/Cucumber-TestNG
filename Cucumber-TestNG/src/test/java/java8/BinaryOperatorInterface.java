package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BinaryOperatorInterface {

	public static void main(String[] args) {
		
		/**
		 * Functional Interface: This is a functional interface and can
		 * therefore be used as the assignment target for a lambda expression or
		 * method reference.
		 * 
		 * @FunctionalInterface public interface BinaryOperator<T> extends
		 *                      BiFunction<T,T,T> 
		 *                      
		 *                      Represents an operation upon
		 *                      two operands of the same type, producing a
		 *                      result of the same type as the operands. This is
		 *                      a specialization of BiFunction for the case
		 *                      where the operands and the result are all of the
		 *                      same type.
		 */
		
		
		
		BinaryOperator<Integer> bi = new BinaryOperator<Integer>(){

			@Override
			public Integer apply(Integer t, Integer u) {
				
				return t+u;
			}
			
		};
		
		int a =bi.apply(10, 20);
		System.out.println(a);


		/**
		 * @FunctionalInterface
	public interface UnaryOperator<T>
	extends Function<T,T>

		 * Represents an operation on a single operand that produces a result of the same type as its operand. 
		 * This is a specialization of Function for the case where the operand and result are of the same type.
		 */
		
		UnaryOperator<Integer> ui = new UnaryOperator<Integer>(){

			@Override
			public Integer apply(Integer t) {
				
				return t*7;
			}
			
		};
		
		
		List<String> list = Arrays.asList("java","ruby","python");
		list.replaceAll(ele -> ele.concat(" -vignesh"));
		
		System.out.println(list);
	}
	
}

