package java8;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStream {

	public static void main(String[] args) {

          Stream<String> stream =  Stream.of("a1","a2","a3");

          stream.findFirst().ifPresent(System.out::println);
          
          
          //primitives
          int[]  a = new int[]{1,2,3,4,5};
          IntStream str = Arrays.stream(a);
          str.findFirst().ifPresent(System.out::println);
          
          //average
         // Arrays.stream(a).map(n-> 2*n+1).average().ifPresent(System.out::println);
          
          //another type
        //  Stream<int[]> stream1 =  Stream.of(a);
          //IntStream  number = stream1.flatMapToInt(x-> Arrays.stream(x)).filter(x-> (x%2)==0);
          //number.forEach(System.out::println);
          
          /*//String
          String[] s = new String[]{"a1","a2","a3"};
          Arrays.stream(s).map(x->x.substring(1)).mapToInt(Integer::parseInt).max().ifPresent(System.out::println);*/
          
          int[]  a1 = new int[]{1,2,3,4,5};
          IntStream str1 = Arrays.stream(a1);
          str1.max().ifPresent(System.out::println);
        /*  //INSTREAM
          IntStream.range(1, 6).forEach(System.out::println);
          
          IntStream.concat(IntStream.range(1, 6), IntStream.range(6, 11)).forEach(System.out::println);*/
          
         //double to String
         // Stream.of(1.0,2.0,3.0).mapToInt(Double::intValue).mapToObj(i-> "a"+i).forEach(System.out::println);
         
          
          //iterate limit
          //Stream.iterate(0, n -> n+1).limit(10).forEach(System.out::println);
          
          //Stream.iterate(0, n -> n+1).limit(20).filter(x -> (x%2)==1).forEach(System.out::println);
	}

}
