
package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeList {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1, 1500.00, "Abin"));
		employeeList.add(new Employee(2, 500.00, "Basheer"));
		employeeList.add(new Employee(3, 7500.00, "souda"));
		employeeList.add(new Employee(4, 5200.00, "Ijas"));
		employeeList.add(new Employee(5, 100.00, "jiswan"));
		employeeList.add(new Employee(6, 15000.00, "Hasil"));

		List<Employee> sortedList = employeeList.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
				.collect(Collectors.toList());

		System.out.print("\nSorted by Salary \n");
		sortedList.forEach(x -> System.out.println(x));

		List<Employee> sortedListName = employeeList.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
				.collect(Collectors.toList());
		System.out.print("\nSorted by Name \n");
		sortedListName.forEach(x -> System.out.println(x));

		System.out.print("\nSorted by Top 3 Earning Employee \n");
		List<Employee> earningTop = employeeList.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
				.limit(3).collect(Collectors.toList());
		earningTop.forEach(x -> System.out.println(x));

	}

}
