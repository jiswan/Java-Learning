package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				//syntax
				ArrayList<String> cars = new ArrayList<>();
				
				//Add Items
				cars.add("BMW");
				cars.add("Dodge");
				cars.add("Audi");
				cars.add("Ford");
				
				System.out.print("Before Sort \n");
				for(String i : cars)
				{
					System.out.println(i);
				}
				
				//Sorting
				Collections.sort(cars);
				System.out.print("After Sort \n");
				for(String i : cars)
				{
					System.out.println(i);
				}
			
	}

}
