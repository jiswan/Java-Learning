/*We use the asList() method of the Arrays class. 
  To use asList(), we must import the java.util.Arrays package first*/
package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraytoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] program = {"java","C#","C++"};
		
		System.out.print("Array :");
		for(String i : program)
		{
			System.out.print(i+"\t");
		}
		
		ArrayList<String> programs = new ArrayList<>(Arrays.asList(program));
		
		System.out.print("\nArrayList :"+programs);
	}

}
