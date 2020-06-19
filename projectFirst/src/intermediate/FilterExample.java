package intermediate;

import java.util.List;
import java.util.function.Predicate;

public class FilterExample {
	public static void main(String[] args) {
		List<Employee> employees = Employee.persons();
		employees.stream().filter(new Predicate<Employee>() {

			@Override
			public boolean test(Employee t) {
				return t.getIncome() > 3000;
			}
			
		}).filter(new Predicate<Employee>() {

			@Override
			public boolean test(Employee t) {
				return t.isFemale();
			}
			
		})
//		.forEach(s -> System.out.println(s.toString()));
		.forEach(s -> System.out.println(s.getIncome() * 1.1));
		employees.parallelStream().forEach(System.out::println);
		// 람다식 employees.stream().filter((t)-> t.getIncome() > 3000)
		// .filter((t) -> t.isFemale())
		// .forEach(s -> System.out.promtln(s.toString()));
	}
}
