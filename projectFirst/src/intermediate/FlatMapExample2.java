package intermediate;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapExample2 {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3);
		stream.flatMap(new Function<Integer, Stream<Integer>>() {
			@Override
			public Stream<Integer> apply(Integer t) {
				return Stream.of(t * 2);
			}
			
		}).filter(new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {	
				return t > 3;
			}
		}).forEach(s -> System.out.println(s));
		
		//람다식 stream.flatMap(t -> Stream.of(t * 2))
		//     .filter(t -> t > 3 )
		// 	   .forEach(s -> System.out.println(s));
		
		
		stream = Stream.of(1, 2, 3); // Stream 같은 최종처리를 만나면 소진 다시 생성 해야됨
		int sum = stream.flatMapToInt(new Function<Integer, IntStream>() {
			@Override
			public IntStream apply(Integer t) {
				return IntStream.of(t * 2);
			}
			
		}).sum();
		System.out.println("sum : " + sum);
		
		//람다식 int sum = stream.flatMapToInt( t -> IntStream.of(t * 2)).sum();
		//     System.out.println("sum : " + sum);
		
		List<Employee> employees = Employee.persons();
		employees.stream().flatMapToDouble(new Function<Employee, DoubleStream>() {

			@Override
			public DoubleStream apply(Employee t) {
				return DoubleStream.of(t.getIncome());
			}	
		}).forEach(s -> System.out.println(s));
		// 람다식 employees.stream().flatMapToDouble(t -> DoubleStream.of(t.getIncome()))
		//      .forEach(s -> System.out.println(s));
		
		
	}
}
