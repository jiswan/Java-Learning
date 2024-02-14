package Static;

public class OverloadStaticExample {

	private static void disp()
	{
		System.out.println("disp() without parameter");
	}
	
	private static void disp(String name)
	{
		System.out.println("disp() using one parameter : "+name);
	}
	
	private static void disp(String name,int n)
	{
		System.out.print("disp() using two parameter :"+name+" second para:"+n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverloadStaticExample.disp();
		OverloadStaticExample.disp("abin");
		OverloadStaticExample.disp("jiswan", 41);
	}

}
