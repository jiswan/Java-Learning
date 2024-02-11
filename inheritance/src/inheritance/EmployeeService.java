package inheritance;

import java.util.ArrayList;
import java.util.List;

class Eaddress
{
   private String street;
   private String city;
   private String zipcode;
   public Eaddress(String street, String city, String zipcode) {
	this.street = street;
	this.city = city;
	this.zipcode = zipcode;
   }
   
   @Override
   public String toString()
   {
	   return street+" "+city+" "+zipcode;
   }
   
   
}
class Employee
{
   private String Ename;
   private Eaddress address;
   private String department;
public String getEname() {
	return Ename;
}
public void setEname(String ename) {
	Ename = ename;
}
public Eaddress getAddress() {
	return address;
}
public void setAddress(Eaddress address) {
	this.address = address;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
   @Override
   public String toString()
   {
	  return "Employee [name=" + Ename + ", department=" + department
       + ", address=" + address + "]";
   }
}

class Student 
{
   private String rollnumber;
   private String sName;
   private List<Eaddress> address;
public List<Eaddress> getAddress() {
	return address;
}
public void setAddress(List<Eaddress> address) {
	this.address = address;
}
public String getRollnumber() {
	return rollnumber;
}
public void setRollnumber(String rollnumber) {
	this.rollnumber = rollnumber;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}

@Override
public String toString() {
    return "Student [sName=" + sName + ", rollnumber=" + rollnumber + ", address=" + address + "]";
}
}
public class EmployeeService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee();
		employee.setEname("jiswan");
		employee.setDepartment("Software");
		Eaddress eaddress = new Eaddress("387 burton ave", "sudbury", "p3c4k4");
		employee.setAddress(eaddress);
		System.out.print(employee);
		Student student = new Student();
		student.setRollnumber("41");
		student.setsName("Muhammed Jiswan");
		List<Eaddress> studentAddresses = new ArrayList<>();
		Eaddress eaddress1 = new Eaddress("387 burton ave", "sudbury", "p3c4k4");
		studentAddresses.add(eaddress1);
		System.out.println(student);
		
		
		
	}

}
