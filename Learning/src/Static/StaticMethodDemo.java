package Static;

public class StaticMethodDemo {

	static String eNAME;
	static int id;
	private double salary=100;
	
	public static void displayEmployeeDetails()
	{
		StaticMethodDemo.eNAME="jiswan";
		StaticMethodDemo.id=41;
		System.out.print("Employee id:"+id+"\nEmployee Name :"+eNAME);
		//salary = 1000; // cannot make a reference to non static varriable'
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         StaticMethodDemo.displayEmployeeDetails();
         StaticMethodDemo obj = new StaticMethodDemo();
         System.out.print("\n"+obj.salary);
	}

}
