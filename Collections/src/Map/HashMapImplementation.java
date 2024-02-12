package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapImplementation {

	public static void main(String[] args) {
		

		// Creating a map using the HashMap
		Map<String, Integer> number = new HashMap<>();
		
		// Insert elements to the map
		number.put("One", 1);
		number.put("Two", 2);
		number.put("Three", 3);
		number.put("Four", 4);
		number.put("Five", 5);
		
		//Access keys of the map
		System.out.println("Key :"+number.keySet());
		
		//Access values of the map
		System.out.println("Value :"+number.values());
		
		//Access entries of the map
		System.out.print("Entries :"+number.entrySet());
	}

}
