package Static;

class Parent {
	public static void disp() {
		System.out.println("Parent with static method");
	}

	public void display() {
		System.out.println("Parent with no static method");
	}
}

public class OverrideStaticMethodChild extends Parent {

	public static void disp() {
		System.out.println("Child class with static");
	}

	public void display() {
		System.out.println("Child class with nonstatic");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p = new Parent();
		p.disp();
		p.display();

		OverrideStaticMethodChild ov = new OverrideStaticMethodChild();
		ov.display();
		ov.disp();

		/*
		 * As per overriding in Java, the disp() method of the Child class
		 * should be called, but since it is a static method overriding, it will
		 * not happen here and hence the Parent class disp() method is called
		 * here. We cannot Override a static method in Java.
		 */

		Parent obj = new OverrideStaticMethodChild();
		obj.display();
		obj.disp();
	}

}
