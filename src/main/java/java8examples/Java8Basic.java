package java8examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Java8Basic {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Alice", 70000, "IT"),
				new Employee("Bob", 80000, "ADMIN"), new Employee("Charlie", 90000, "LAB"));
		// calculate average salary of employee
		OptionalDouble averageSalary = employees.stream().mapToDouble(Employee::getSalary).average();
		if (averageSalary.isPresent()) {
			System.out.println("Average Salary: " + averageSalary.getAsDouble());
		}

		// Get list of Employees as per department

		Map<String, List<Employee>> employeePerDepartment = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));

		System.out.println("Print Employees per department");
		employeePerDepartment.forEach((key, value) -> System.out.println(key + ":" + value));

		// Get count of employees as per department

		Map<String, Long> employeeCountByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println("Print Employees count per department");
		employeeCountByDept.forEach((key, value) -> System.out.println(key + ":" + value));
		
		
		 // Sorting by department first, then by ID
        employees.sort(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getName));
        employees.forEach((key) -> System.out.println(key + ":" ));

	}
}
