package intermediate;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MappingExample3 {
	public static void main(String[] args) {
		int[] intAry = { 1, 2, 3, 4, 5, 6, 7 };
		double[] doubleAry = { 1.1, 2.3, 5.3, 7.4 };
		
		IntStream intStream = Arrays.stream(intAry);
		DoubleStream doubleStream = Arrays.stream(doubleAry);
		
		doubleStream = intStream.asDoubleStream();
		doubleStream.forEach(s -> System.out.println(s));
		
		intStream = Arrays.stream(intAry);
		intStream.asLongStream().forEach(System.out::println);
		
		intStream = Arrays.stream(intAry);
		Stream<Integer> iStream = intStream.boxed();
		iStream.forEach(s -> System.out.println(s));
	}
	
}
