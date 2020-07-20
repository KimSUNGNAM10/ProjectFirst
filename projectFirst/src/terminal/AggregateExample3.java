package terminal;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

import intermediate.Employee;

public class AggregateExample3 {
	public static void main(String[] args) {
		// 1
		double a = Employee.persons().stream().map(new Function<Employee, Double>() {
			@Override
			public Double apply(Employee t) {
				return t.getIncome();
			}
		}).reduce(0.0, new BinaryOperator<Double>() {
			@Override
			public Double apply(Double t, Double u) {
				return t + u;
			}
		});
		System.out.println(a);

		// 2
		double b = Employee.persons().stream().reduce(0.0, new BiFunction<Double, Employee, Double>() {
			@Override
			public Double apply(Double t, Employee u) {
				System.out.println("t : " + t + " u : " + u.getIncome());
				return t + u.getIncome();
			}
		}, 
		new BinaryOperator<Double>() {
			@Override
			public Double apply(Double t, Double u) {
				return t + u;
			}
		});
		System.out.println(b);
	}
}