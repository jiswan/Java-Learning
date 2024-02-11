interface InterfaceLearning
{
       int a = 10 ;
       void run();
}
class ImplementationExample implements InterfaceLearning
{
	@Override
	public void run()
	{
		System.out.print("hello this is a subclass");
	}
	
	int a =112;
}
public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationExample obj = new ImplementationExample();
		obj.run();
		System.out.print(obj.a);
	}

}
