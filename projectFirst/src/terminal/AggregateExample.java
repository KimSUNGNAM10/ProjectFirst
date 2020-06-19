package terminal;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.function.DoubleConsumer;
import java.util.stream.IntStream;

public class AggregateExample {
	public static void main(String[] args) {
		int[] intAry = { 1, 2, 3, 4, 5 };
		IntStream iStream = Arrays.stream(intAry);
		OptionalDouble od = iStream.filter(n -> n > 3).average();
		double result;
//		방법3  
		od.ifPresent(new DoubleConsumer() { // 조건에 맞아야 실행 맞지않으면 실행 x
			@Override
			public void accept(double value) {
				System.out.println("결과는 : " + value);	
			}
		});
		
//		방법2
//		result = od.orElse(0.0);  맞는 값이 없으면 0.0출력
//		System.out.println(result);
	
		
//		방법1
//		if(od.isPresent()) {
//		result = od.getAsDouble();
//		System.out.println(result);
//	} else
//			System.out.println("값이 없습니다");
	}
}
