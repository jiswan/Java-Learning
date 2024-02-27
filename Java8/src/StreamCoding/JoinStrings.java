//Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
package StreamCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStrings {

	public static void main(String[] args) {
		
		List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		
		String joinedString= listOfStrings.stream() 
		.collect(Collectors.joining(",","[","]"));
		
		System.out.print(joinedString);

	}

}
