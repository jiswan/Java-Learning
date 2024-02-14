package Static;

import Static.NestedClass.disp1;

class NestedClass
{
     static class disp
     {
    	 public void display()
    	 {
    		 System.out.println("This is a Static class");
    	 }
     }
     
     class disp1
     {
    	 public void display1()
    	 {
    		 System.out.print("This is a non static class");
    	 }
     }
}
public class NestedClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NestedClass.disp obj = new NestedClass.disp();
		obj.display();
		
		// Nested non-static class require instantiation of the outer class
		NestedClass obj1 = new NestedClass();
		NestedClass.disp1 obj2 = obj1.new disp1();
		obj2.display1();
	}

}
