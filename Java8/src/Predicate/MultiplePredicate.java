/*
 * Using Multiple Predicate 
 * 	And
 * 	Or
 * 	Negate
 */
package Predicate;

import java.util.function.Predicate;

public class MultiplePredicate {

	public static void main(String[] args) {
		
		Predicate<String> checkLength = s->s.length()>5;
		Predicate<String> checkEven = s-> s.length()%2==0;
		
		System.out.println("Testing or (predicate) "+checkLength.and(checkEven).test("Muhammed jiswan"));
		System.out.println("Testing or (predicate) "+checkLength.or(checkEven).test("Muhammed jiswan"));
		System.out.println("Before Negate() "+checkLength.test("Muhammed jiswan")+"\nAfter  Negate() "+checkLength.negate().test("Muhammed jiswan"));

	}

}
