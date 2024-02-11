package ArrayList;

import java.util.ArrayList;

public class AddItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//syntax
		ArrayList<String> cars = new ArrayList<>();
		
		//Add Items
		cars.add("BMW");
		cars.add("Dodge");
		cars.add("Audi");
		cars.add("Ford");
		
		//Access an Item
		//use the get() method and refer to the index number
		System.out.print(cars.get(0));
		
		//Change an Item
		//use the set() method and refer to the index number
		cars.set(0, "Mazda");
		System.out.print(cars.get(0)+"\n");
		
		/*Remove an Item
		 * remove() method and refer to the index number */
		System.out.print(cars.size()); // to get the size of the ArrayList
		cars.remove(0);
		System.out.print(cars.get(0)+"\n");
		
		/*Loop through the Array list
		 * using for loop*/
		for(int i=0;i<cars.size();i++)
		{
			System.out.println(cars.get(i));
		}
		//Using For-Each
		System.out.print("\nUsing  For each \n");
		for(String i : cars)
		{
			System.out.println(i);
		}
	}

}
