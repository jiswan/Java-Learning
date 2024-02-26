package Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class EmployeeApi {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1, 20000, "jiswan", "It"));
		employeeList.add(new Employee(2, 20000, "Abin", "Marketing"));
		employeeList.add(new Employee(3, 15000, "Ijas", "HR"));
		employeeList.add(new Employee(4, 22000, "Basheer", "Marketing"));
		employeeList.add(new Employee(5, 230000, "Hasil", "It"));
		employeeList.add(new Employee(6, 120000, "Goku", "HR"));
		
		Map<String, List<Employee>>newList =employeeList.stream()
		.collect(Collectors.groupingBy(x->x.getCategory(),TreeMap::new,Collectors.toList()));
		
		newList.forEach((name, employees) -> {
            System.out.println("Employees with Category " + name + ":");
            employees.forEach(System.out::println);
        });
		

	}

}
