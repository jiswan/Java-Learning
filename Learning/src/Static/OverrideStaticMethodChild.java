package Static;

class Parent
{
	public static void disp()
	{
		System.out.println("Parent with static method");
	}
	
	public void display()
	{
		System.out.println("Parent with no static method");
	}
	}
public class OverrideStaticMethodChild extends Parent {

	public static void disp()
	{
		System.out.println("Child class with static");
	}
	public void display()
	{
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
		
		Parent obj =new OverrideStaticMethodChild();
		obj.display();
		obj.disp();
	}

}
