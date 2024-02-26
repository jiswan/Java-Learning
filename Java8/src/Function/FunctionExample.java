/*
 * Funtional Intrface (predifined)
 * take two argument return type is not always boolean like predicate 
 */
package Function;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {

		Function<Integer, Integer> square = i -> i * i;  
		System.out.print(square.apply(5));

	}

}
