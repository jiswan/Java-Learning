//How do you find frequency of each character in a string using Java 8 streams?
package StreamCoding;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyCharacter {

	public static void main(String[] args) {
		String inputString = "Java Concept Of The Day";
		Map<Character, Long>charcount= inputString.chars().mapToObj(x->(char)x) 
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.print(charcount);
	}

}
