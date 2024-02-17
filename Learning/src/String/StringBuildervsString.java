package String;

public class StringBuildervsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 ="abc";
		StringBuilder s2 = new StringBuilder(s1);

		/**
		 * It will print false because s2 is not of type String. If you will look at the
		 * equals method implementation in the String class, you will find a check using
		 * instanceof operator to check if the type of passed object is String? If not,
		 * then return false.
		 */
		System.out.println(s1.equals(s2));			
		//Converted the Stringbuilder to String
		System.out.println(s1.equals(s2.toString())); 
	}

}
