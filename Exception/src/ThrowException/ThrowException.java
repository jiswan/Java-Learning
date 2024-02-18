package ThrowException;
/**
 * The throw keyword in Java is used to explicitly throw an exception from a
 * method or any block of code.
 *
 * We can throw either checked or unchecked exceptions in Java by throw keyword.
 * It is mainly used to throw a custom exception.
 * 
 * If we throw a checked exception using throw keyword, it is must to handle the
 * exception using catch block or the method must declare it using throws
 * declaration.
 */
public class ThrowException {

	static void age(int a)
	{
		if(a<18)
		{
			throw new ArithmeticException("Not Valid");
		}
		else
		{
			System.out.println("Welcome to Vote");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		age(17);
		
		System.out.println("Rest of the code...");
		
	}

}
