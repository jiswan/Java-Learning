//Given a list of integers, find maximum and minimum of those numbers?
package StreamCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaximumandMinimum {

	public static void main(String[] args) {

		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		Integer maxNumber = listOfIntegers.stream().max(Comparator.naturalOrder()).get();

		System.out.println(maxNumber);

		Integer minNumber = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
		System.out.print(minNumber);
	}

}
