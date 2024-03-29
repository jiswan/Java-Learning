package StreamApi;

import java.util.ArrayList;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Created a list of integers
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(12);
		list.add(23);
		list.add(45);
		list.add(6);

		list.stream() // Created a stream from the list
				.filter(n -> n > 10) // filter operation to get only numbers
										// greater than 10
				.forEach(System.out::println); // Printing each number in the
												// list after filtering.

		// Again printing the elements of List to show that the original list is not modified.
		list.stream().forEach(System.out::println);
	}

}
