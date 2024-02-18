package ThrowException;

public class ThrowsException {

	static void validate(int age) throws ArithmeticException {
		if (age < 18)
			throw new ArithmeticException("not valid");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String args[]) {
		try {
			validate(13);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException catched");
		}
		System.out.println("Rest of the code...");
	}

}
