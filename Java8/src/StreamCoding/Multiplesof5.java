//From the given list of integers, print the numbers which are multiples of 5?
package StreamCoding;

import java.util.Arrays;
import java.util.List;

public class Multiplesof5 {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		
		listOfIntegers.stream() 
		.filter(x->x%5==0).forEach(System.out::println);

	}

}
