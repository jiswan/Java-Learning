package Static;

public class StaticVarriable {

	private static int i=10;
	
	private int j=2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println("StaticCarriable i :"+StaticVarriable.i);
		
		StaticVarriable obj = new StaticVarriable();
		System.out.println("Obj i :"+obj.i);
		
		StaticVarriable obj1 = new StaticVarriable();
		StaticVarriable.i++;
		System.out.println("Obj i :"+obj.i);
		System.out.println("Obj j :"+obj.j);
		obj1.j++;
		
		System.out.println("increased i variable of obj1");
		System.out.println("obj1 j" + ": " + obj1.j);
		System.out.println();
		
		StaticVarriable obj2 = new StaticVarriable();
		System.out.println("Obj i :"+obj2.i);
		System.out.println("Obj j :"+obj2.j);
		
		
		
		
		
	}

}
