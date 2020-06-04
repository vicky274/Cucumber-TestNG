package java8;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreams {

	public static void main(String[] args) {
		// Java 8 - Generate Infinite Streams using iterate() and generate() methods

		
		
		List<Integer> list = IntStream.iterate(0, x->x+1).mapToObj(x->Integer.valueOf(x)).limit(10).collect(Collectors.toList());
		System.out.println(list);
		
		//2 generate
		List<Integer> list1 = Stream.generate(() -> (new Random()).nextInt(100)).limit(10).collect(Collectors.toList());
		System.out.println(list1);
	}

}
