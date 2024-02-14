/*
In Java, you cannot directly access non-static variables from within a static method because static methods belong to the class itself and not to any specific instance of the class. Non-static variables, on the other hand, belong to individual instances of the class.
However, if you want to access non-static variables within a static method, you'll need an instance of the class. You can either create a new instance of the class within the static method or pass an instance as a parameter to the static method.*/
package Static;

public class StaticMethodDemo {

	static String eNAME;
	static int id;
	private double salary = 100;

	public static void displayEmployeeDetails() {
		StaticMethodDemo.eNAME = "jiswan";
		StaticMethodDemo.id = 41;
		System.out.print("Employee id:" + id + "\nEmployee Name :" + eNAME);
		// salary = 1000; // cannot make a reference to non static varriable'

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethodDemo.displayEmployeeDetails();
		StaticMethodDemo obj = new StaticMethodDemo();
		System.out.print("\n" + obj.salary);
	}

}
