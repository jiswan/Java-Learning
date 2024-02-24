/*
 * Find the Duplicate Element from the integer list in java using Stream
 * */
package Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElement {

	public static void main(String[] args) {
		Integer[] numbers = {10,20,30,40,10,20,50,60,70,10,20,30};
		List<Integer> num = Arrays.asList(numbers);
		Set<Integer> newnumber = new HashSet<>();
		num.forEach(System.out::println);
		System.out.println("After stream");
		num.stream()
			.filter(x->!newnumber.add(x))
			.collect(Collectors.toSet())
			.forEach(x->System.out.print(x));
	}

}
