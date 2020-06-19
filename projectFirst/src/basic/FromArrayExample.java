package basic;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FromArrayExample {
	public static void main(String[] args) {
		String[] strAry = { "ck", "hong", "park" };
		Stream<String> stream = Arrays.stream(strAry);
		stream.peek(new Consumer<String>() { // peek 1번 Each 1번 Peek1번 Each 1번........

			@Override
			public void accept(String t) {
				System.out.println("peek : " + t.toString());
			}
			
		}).forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("forEach : " + t.toString());
			}
		});;
	}
}
