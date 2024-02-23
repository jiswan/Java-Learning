package Predicate;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		/*
		 * Predicate Example Predicate is an Functional interface predefined one
		 */
		Predicate<String> value = s -> s.length() > 5;
		System.out.print(value.test("Muhammed jiswan"));
	}

}
