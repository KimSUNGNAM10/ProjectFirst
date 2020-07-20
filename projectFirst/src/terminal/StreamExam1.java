package terminal;

import java.util.Arrays;
import java.util.List;

public class StreamExam1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions");
		
		list.stream().filter(a -> a.toLowerCase().contains("java"))
		.forEach(a -> System.out.println(a));
	}
}
