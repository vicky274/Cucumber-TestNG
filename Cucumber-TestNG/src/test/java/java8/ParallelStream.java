package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStream {

	public static void main(String[] args) {
		
		ForkJoinPool commonpool = ForkJoinPool.commonPool();

		//System.out.println(commonpool.getParallelism());
		
		//parallel method if we use directly on stream
		Stream<String>  stream = Stream.of("vignesh","woo","you","qwerty");
		//stream.forEach(System.out::println);
		//will print in the order 
		stream.parallel().forEachOrdered(System.out::println);
		
		
		//print integer
		IntStream.rangeClosed(1, 10).forEach(System.out::println);
		System.out.println("---Parallel stream");
		IntStream.rangeClosed(1, 10).parallel().forEach(System.out::println);
		
		//print alphabet
		System.out.println("--normal stream");
		getlistofvalues().stream().forEach(System.out::println);
		System.out.println("--Parallel stream");
		getlistofvalues().stream().parallel().forEach(System.out::println);
		
		//check running in parallel mode
		IntStream intstream = IntStream.range(1, 11);
		System.out.println(intstream.isParallel());
		
		IntStream intstream1 = IntStream.range(1, 11).parallel();
		System.out.println(intstream1.isParallel());
	}
	
	public static List<String> getlistofvalues(){
		
		List<String> alpha = new ArrayList<String>();
		int n=97;
		while(n<=122){
			char a = (char)n;
			alpha.add(String.valueOf(a));
			n++;
		}
		return alpha;
	}

}
