package intermediate;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class Employee {
	public static enum Gender {
		MALE, FEMALE;
	}
	private long id;
	private String name;
	private Gender gender;
	private LocalDate dateOfBirth;
	private double income;
	public Employee(long id, String name, Gender gender, LocalDate dateOfBirth, double income) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.income = income;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public boolean isMale() {
		return this.gender == Gender.MALE;
	}
	public boolean isFemale() {
		return this.gender ==  Gender.FEMALE;
	}
	@Override
	public String toString() {
		String str = String.format("%s %s %s %s %.2f", id, name, gender, dateOfBirth, income);
		return str;
	}
	public static List<Employee> persons() {
		Employee e1 = new Employee(1, "Hong", Gender.MALE, LocalDate.of(1991, Month.JANUARY, 3), 2343.0);
		Employee e2 = new Employee(2, "LOLO", Gender.MALE, LocalDate.of(1992, Month.FEBRUARY, 25), 6443.0);
		Employee e3 = new Employee(3, "HHHH", Gender.FEMALE, LocalDate.of(1993, Month.JANUARY, 14), 56343.0);
		Employee e4 = new Employee(4, "OOOO", Gender.MALE, LocalDate.of(1994, Month.JULY, 2), 3364.0);
		Employee e5 = new Employee(5, "JJJJ", Gender.FEMALE, LocalDate.of(1995, Month.APRIL, 7), 2463.0);
		Employee e6 = new Employee(6, "LLLL", Gender.MALE, LocalDate.of(1996, Month.JANUARY, 30), 4243.0);
		return Arrays.asList(e1, e2, e3, e4, e5, e6);
	}
	
}
