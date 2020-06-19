package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class DistinctExample {
	public static void main(String[] args) { //중복숫자된는제외 하고 sum
		IntStream is = IntStream.of(1,2,2,3,3,4,5,6,5);
		int sum = 0;
//		sum = is.distinct().peek(System.out::println).sum();
		//sum = 중간처리 is.distinct().peek(System.out::println).//최종처리sum();
//		System.out.println("sum : " + sum);
		
		List<Student> list = Arrays.asList (
				new Student("Hong", 33), 
				new Student("Ho", 53), 
				new Student("ng", 23),
				new Student("Hg", 43));
				list.stream().distinct().forEach(s -> System.out.println(s));
				
	}
}
