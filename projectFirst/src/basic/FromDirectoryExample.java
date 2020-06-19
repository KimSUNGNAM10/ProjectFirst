package basic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FromDirectoryExample {
	public static void main(String[] args) {
		//path
		Path path = Paths.get("c:/program files");
		try {
			Stream<Path> stream = Files.list(path);
			stream.forEach(new Consumer<Path>() { //인터페이스 구현이 안되서 구현 해야됨 accept

				@Override
				public void accept(Path t) {
					System.out.println(t.getFileName());
				}
				
			});
			//람다식 stream.forEach((t) -> System.out.println(t.getFileName()));
			stream.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//file 
		path = Paths.get(".project"); //StreamProject 하위 ..root 디렉토리/
		try {
			Stream<String> strStream = Files.lines(path);
			strStream.forEach(t -> System.out.println(t.toString()));//메소드참조방식 ~~forEach(System.out::println);
			strStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
