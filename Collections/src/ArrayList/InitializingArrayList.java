/*We use the Arrays.asList() method to create and initialize an arraylist in a single line.*/
package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class InitializingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> program = new ArrayList<>(Arrays.asList("Java","c#","c++"));
		
		System.out.print("ArrayList :"+program);
	}

}
