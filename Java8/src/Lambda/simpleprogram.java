package Lambda;

@FunctionalInterface
interface Myinterface
{
      double pivalue();	
}
public class simpleprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Myinterface ref ;
		ref = ()-> 3.14;
		
		System.out.print("Pi Value ="+ref.pivalue());
	}

}
