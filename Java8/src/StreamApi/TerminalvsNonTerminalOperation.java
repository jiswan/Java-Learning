package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Employee
{
    private String name;
    private int id;
	public Employee(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	
    
}
public class TerminalvsNonTerminalOperation {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Jiswan", 1);
		Employee e2 = new Employee("Abin", 2);
		Employee e3 = new Employee("Souda", 3);
		Employee e4 = new Employee("Basheer", 4);
		Employee e5 = new Employee("Ijas", 5);
		
		List<Employee> employee = Arrays.asList(e1,e2,e3,e4,e5);
		List<Integer> intlist = Arrays.asList(1,2,3,4,5);
		Stream s = intlist.stream().filter(x->x%2==0).map(i->i+i).filter(x->x>5);
		s.forEach(System.out::println);

	}

}
