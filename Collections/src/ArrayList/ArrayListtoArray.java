/*We can convert the ArrayList into an array using the toArray() method
 */
package ArrayList;

import java.util.ArrayList;

public class ArrayListtoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//syntax
		ArrayList<String> cars = new ArrayList<>();
		
		//Add Items
		cars.add("BMW");
		cars.add("Dodge");
		cars.add("Audi");
		cars.add("Ford");
		
		System.out.println("ArrayList "+cars);
		
		String[] car = new String[cars.size()];
		cars.toArray(car);
		System.out.print("Array :");
		
		for(String i : car)
		{
			System.out.print(i+"\t");
		}
		
		
	}

}
