package Interview;

public class Employee {

	private int id;
	private double salary;
	private String name;
	private String category;

	public Employee(int id, double salary, String name, String category) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + ", category=" + category + "]";
	}



	

}
