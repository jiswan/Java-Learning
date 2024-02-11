
class ParentClassReference
{
     void myMethod()
     {
    	 System.out.print("Hello Welcome to Parent class");
     }
     void myMethodAgain() {
 		System.out.println("\tGeeksforGeeks Again");
 	}
}
public class ChildClassReference extends ParentClassReference{
	
	@Override
	void myMethod()
	{
		 System.out.print("\nHello Welcome to Child class"); 	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParentClassReference parent = new ParentClassReference();
		parent.myMethod();
		parent.myMethodAgain();
		
		ChildClassReference child = new ChildClassReference();
		child.myMethod();
		child.myMethodAgain();
		
		// Creating a object of child and Assigning to parent class
		ParentClassReference child1 = new ChildClassReference();
		child1.myMethod();
		child1.myMethodAgain();
				
	}

}
