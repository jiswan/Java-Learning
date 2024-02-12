/*SortedMap is an interface, we cannot create objects from it.
In order to use the functionalities of the SortedMap interface, 
we need to use the class TreeMap that implements it.*/

package Map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedmapCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortedMap<Integer, Integer> numbers = new TreeMap<>();
		numbers.put(1, 1);
		numbers.put(2, 2);
		numbers.put(3, 3);
		numbers.put(4, 4);
		numbers.put(5, 5);
		numbers.put(6, 6);
		numbers.put(7, 7);
		
		
		System.out.println("First key :"+numbers.firstKey()); // Access the frist key
		System.out.println("Last key :"+numbers.lastKey());   //Access the Last Key
		System.out.println("Sub key :"+numbers.subMap(3, 6)); // Access the map between the range of keys
		System.out.println("Tail key :"+numbers.tailMap(5));  // Access the map from the key to end 
		System.out.print("Head key :"+numbers.headMap(3));    // Access the map from first to the key
	}

}
