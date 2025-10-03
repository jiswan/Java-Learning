package NestedTryCode;

public class NestedTryException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Parent Try block
		try {
			// Child Try Block1
			try {
				System.out.println("Inside block1");
				int b = 45 / 0;
				System.out.println(b);

				} catch (ArithmeticException e1) {
					System.out.println("Exception : e1");
				}
			
			//Child try block2
			try{
				System.out.println("Inside block2");
				//int[] b= new int[4];
				//b[5]=6;
				System.out.println("b");
				}
				catch (ArrayIndexOutOfBoundsException e2) {
					System.out.println("Exception :e2 "+e2);
				}
			
			    System.out.println("end of parent try");
			
			
			    
		} catch (ArithmeticException e3) {
			System.out.println("Arithmetic Exception");
			System.out.println("Inside parent try catch block");
			
		}
		catch(ArrayIndexOutOfBoundsException e4)
		{
			System.out.println("ArrayIndexOutOfBoundsException Exception");
			System.out.println("Inside parent try catch block");	
		}
	}

}
