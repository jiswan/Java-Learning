
public class UncheckedExceptionExample {

	public static void UncheckedExample()
	{
		int i =10;
		try {
			System.out.print(i/0);
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("This is the final block");
		}
		System.out.println("rest of the code");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UncheckedExample();
	}

}
