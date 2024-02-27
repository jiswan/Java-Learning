//Find sum of all digits of a number in Java 8?
package StreamCoding;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumDigits {

	public static void main(String[] args) {
		int i = 15623;
		Integer sum = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));

		System.out.print(sum);
	}

}
