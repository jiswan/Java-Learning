package CustomException;

class CustomException1 extends Exception
{
    	public CustomException1(String message)
    	{
    		super(message);
    	}
}
public class CustomException {

	
	public static void main(String[] args) {
		try{
		divide();
		}
		catch (CustomException1 e) {
			System.out.print(e.getMessage());
		}

	}

	private static void divide() throws CustomException1{
		
		String password = "1234";
		String oldpassword ="2345";
		if(password!=oldpassword)
			throw new CustomException1("Password not matching");
		
	}

}
