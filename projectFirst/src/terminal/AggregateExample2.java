package terminal;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntFunction;

import intermediate.Student;

public class AggregateExample2 {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("A", 56), new Student("B", 42),
				new Student("C", 96));
		
		int result = students.stream().mapToInt(new ToIntFunction<Student>() {

			@Override
			public int applyAsInt(Student value) {
				return value.getScore();
			}
		}).sum();
		System.out.println("집계결과 : " + result);
		
//\\\\\\\\\\\\\\\\\\=\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\		
		
		result = students.stream().filter(n -> n.getScore() > 100)
				.mapToInt(s -> s.getScore())
				.reduce(new IntBinaryOperator() {
				
				@Override
				public int applyAsInt(int left, int right) {
					System.out.println("left : " + left +  "right : " + right );
					 
					return left + right;
				}
			}).orElse(0);
		System.out.println("집계결과2 : " + result);		
		
		result = students.stream().filter(n -> n.getScore() > 100)
						.mapToInt(s -> s.getScore())
						.reduce(0, new IntBinaryOperator() {
				@Override
				public int applyAsInt(int left, int right) {	 
						return left + right;
				}
		});
		System.out.println("집계결과3 : " + result);	
		
	} // end of main
}
