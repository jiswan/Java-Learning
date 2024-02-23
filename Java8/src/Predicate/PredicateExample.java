package Predicate;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<String> value = s-> s.length()>5;
		System.out.print(value.test("Muhammed jiswan"));
	}

}
