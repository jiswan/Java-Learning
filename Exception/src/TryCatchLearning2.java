
public class TryCatchLearning2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			int i =50;
			System.out.print(i/0);
		}
		catch (NullPointerException e) {
			// try to handle the ArithmeticException instead of
			// ArrayIndexOutOfBoundsException
			System.out.println(e);
		}
	}

}
