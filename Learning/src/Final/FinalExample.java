package Final;

class Example
{
   final String message = "Hello welcome";
   void printmessage()
   {
	   System.out.println(message);
   }
   
   void printnewmessage()
   {
	   final String message = "new hello";
	   System.out.print(message);
   }
}
public class FinalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int i =10;
		
		System.out.println(i);
		Example obj = new Example();
		obj.printmessage();
		obj.printnewmessage();
	}

}
