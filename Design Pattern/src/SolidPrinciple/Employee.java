package SolidPrinciple;

public class Employee
{

	private int employeeId;
	private String employeeName;
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	
	public Employee(int employeeId, String employeeName2, Address address) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName2;
		this.address = address;
	}

	public void print()
	{
		System.out.println("Employee id : "+employeeId+"\nEmployee Name : "+employeeName+"\n Address : "+address.getAddress());
	}
		

}


