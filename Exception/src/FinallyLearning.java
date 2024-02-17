/**
 * Java finally block is always executed whether an exception is handled or not.
 * Therefore, it contains all the necessary statements that need to be printed
 * regardless of the exception occurs or not.
 * 
 * Only one finally block.
 * 
 * The finally block will not be executed if the program exits (either by
 * calling System.exit() or by causing a fatal error that causes the process to
 * abort).
 */

public class FinallyLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		finallyReturn();
		
		System.out.println("\nTesting Return ");
		int a = tetsingReturn();
		System.out.println("Value "+a);
		
		System.out.println("\nTesting return in finally");
		String s = testReturnFinally();
		System.out.println(s);
		
		System.out.println("\nAbrupt aborting");
		abruptAborting();
		System.out.println("When you abort using System.exit(), this will not run.");
	}

	private static void abruptAborting() {
		try {
			int data =25/5;
			System.exit(data);
		} catch (Exception e) {
			System.out.print("Error "+e);
		}
		finally {
			System.out.println("Finally block is always executed. Or is it so!!!");
		}
		
	}

	private static String testReturnFinally() {
		try {
			int b =20/4;
			return "in try";
		} catch (Exception e) {
			System.out.print("Error "+e);
		}
		finally {
			System.out.println("Finally block is always executed");
			return "in finally block";
		}
		//return null;
	}

	private static int tetsingReturn() {
		try {
			int b =25/5;
			return b;
		} catch (Exception e) {
			System.out.println("Eroor "+e);
		}
		finally {
			System.out.println("Finally block is always executed");
		}
		return 0;
	}

	private static void finallyReturn() {
		try {
			int data =25/5;
			System.out.println(data);
		} catch (Exception e) {
			System.out.println("Error "+e);
		}
		//Executed regardless of exception occurred or not
		finally{
			System.out.println("Finally block is always executed");
		}
		
	}

}
