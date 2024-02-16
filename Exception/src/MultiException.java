
public class MultiException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n = 9;
			if (99 % n == 0)
				System.out.println(n + " is a factor of 99");
		} catch (NumberFormatException | ArithmeticException ex) {
			System.out.println("Exception encountered " + ex);
		} finally {
			System.out.println("Finally");
		}

		System.out.println("");
	}
}
