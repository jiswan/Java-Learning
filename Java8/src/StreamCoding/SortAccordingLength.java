//Given a list of strings, sort them according to increasing order of their length?
package StreamCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAccordingLength {

	public static void main(String[] args) {
		
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
		
		List<String>sortedList =listOfStrings.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
		
		sortedList.forEach(System.out::println);

	}

}
