package java8;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimaryNumberwithParallelStream {

	public static void main(String[] args) {
		
		long t1,t2;
		
         //System.out.println(intprime(997));
		 t1=System.currentTimeMillis();
         long count = Stream.iterate(0, x ->x+1).parallel().limit(2000000).filter(PrimaryNumberwithParallelStream::intprime)
         .peek(System.out::println).count();
         System.out.println("Total count :"+count);
         t2=System.currentTimeMillis();
         System.out.println("total time taken :" +(t2-t1)/1000);
	}

	
	public static boolean intprime(int number) {
		int num = Integer.parseInt(String.valueOf(number).substring(String.valueOf(number).length() - 1));
		if (number <= 1)
			return false;
		if (number == 2 || number == 3 || number == 5 || number == 7 || number == 11)
			return true;
		// 0,2,4,6,8 if it ends its not prime
		if (num == 0 || num % 2 == 0)
			return false;

		// System.out.println(number/2);

		// 2nd step try dividing by 3,5,7,11 if not its prime
		return !IntStream.of(3, 5, 7, 11).anyMatch(new IntPredicate() {
			@Override
			public boolean test(int x) {
				// System.out.println("Number :" +number);
				// System.out.println("divide by :" +x);
				return number % x == 0;
			}

		});
	}
}
