package Map;

import java.util.LinkedHashMap;

public class LinkedHashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer, String> numbers = new LinkedHashMap<>();
		numbers.put(1, "one");
		numbers.put(2, "Two");
		numbers.put(3, "Three");
		numbers.put(4, "Four");
		
		System.out.print("LinkedHashMap :"+numbers);
		
		LinkedHashMap<Integer, String> numbers2 = new LinkedHashMap<>(8,0.6f);// 8 is the capacity and 0.6f is the load factor 
	}

}
