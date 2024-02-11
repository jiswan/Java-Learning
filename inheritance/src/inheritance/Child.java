/**
 * extends is the keyword used to inherit the properties of a class.
 * 
 * The super keyword is similar to this keyword: -
 * 
 * It is used to differentiate the members of superclass from the members of
 * subclass, if they have same names.
 * 
 * It is used to invoke the superclass constructor from subclass. 
 */
package inheritance;

public class Child extends Parent{
	
	int num =10;
	
	public void display()
	{
		System.out.print("Hello this is the Child class");
	}
	
	void m1()
	{
		int num = 10;
		Child c = new Child();
		num++;
		
		c.display();
		super.display();
		++num;
		System.out.print("\n"+c.num); // child class
		System.out.print(this.num);// child class
		System.out.print(num); // local class
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child v = new Child();
		v.m1();
	}

}
