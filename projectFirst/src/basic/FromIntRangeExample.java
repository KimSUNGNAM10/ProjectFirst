package basic;

import java.util.Random;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FromIntRangeExample {
	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(11, 20); //range 메소드는 11포함 20 제외, rangeclosed 11, 20포함
		IntPredicate predicate = new IntPredicate() {
			@Override
			public boolean test(int value) {
				return value % 2 == 1;
			}
		};
//		stream.filter(predicate).forEach(s -> System.out.println(s));
		
		Random random = new Random();
		IntStream intStream = random.ints(10, 11, 100); //11~100수 중에 랜덤으로 10개를 가져온다
		intStream.filter(v -> v>=50 && v<60).forEach(s -> System.out.println(s));
	}
}
