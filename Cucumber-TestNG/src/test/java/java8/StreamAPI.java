package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamAPI {

	/*Java 8:
		1)We can declare methods in interface
		2)this is functional programming
		3)LAMDA EXPRESSION for functional interface to remove boiler plate codes.
		4)stream API - To work with shared variable or mutable varibale shared in different thread.
		5)java 8 interfacee can have method but access modifier should be DEFAULT
		6)Object class methods cant be override in interface
		7)interface once published no other method declaration cant be added.as it will affect classes that implements this.
		STREAM API:
		1)For internal Iterations
		2)it supports method reference system.out::println();
*/

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		/*values.forEach(new Consumer<Integer>(){

			@Override
			public void accept(Integer i) {
				System.out.println(i);
				
			}
			
			
			
		});*/
		//values.forEach((i) ->System.out.println(i));
		
		//values.forEach((i) -> System.out.println(i));
		
		//2)it supports method reference system.out::println();
//here println is method of object out belongs to class system
		
		//values.forEach(System.out::println);
		
		//example
		//values.forEach(StreamAPI::doubleit);
		
		
		values.stream().filter(i -> 
		{
			System.out.println(i);
			return true;
		});
		
	}

	
	
	public static void doubleit(int i){
		
		System.out.println(i*2);
	}
	
	
	
}
