public class MultipleCatchExample {

	public static void main(String[] args) {
		try {
			int[] i = new int[5];
			i[5] = 40 / 0;
			System.out.println("This won't print because there is an exception before this.");
		} catch (ArithmeticException e) {
			System.out.println("error :"+e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("Rest of the code");
	}

}
