package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating a map using the HashMap
		Map<String, Integer> number = new HashMap<>();
		
		// Insert elements to the map
		number.put("One", 1);
		number.put("Two", 2);
		number.put("Three", 3);
		number.put("Four", 4);
		number.put("Five", 5);
		
		System.out.println("Aceessing  the Key in Map");
		for(String i : number.keySet())
		{
			System.out.println(i);
		}
		
		System.out.println("Aceess the values in Map");
		for(Integer j : number.values())
		{
			System.out.println(j);
		}
		
		System.out.println("Aceess the Entities in Map");
		for(Entry<String, Integer> entry : number.entrySet())
		{
			System.out.println(entry);
		}
	}

}
