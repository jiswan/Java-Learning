//How do you remove duplicate elements from a list using Java 8 streams?
package StreamCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
		List<String>noDuplicate =listOfStrings.stream() 
		.distinct().collect(Collectors.toList());
        noDuplicate.forEach(System.out::println);
	}

}
