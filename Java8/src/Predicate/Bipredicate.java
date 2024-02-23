package Predicate;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Bipredicate {

	public static void main(String[] args) {
		
	 BiPredicate<Integer, Integer> number = (p,o)->p+o>5;
	 System.out.println(number.test(5, 7));
	 
	 BiFunction<Integer, Integer, Integer> multiNumber = (i,q)->i*q;
	 System.out.println(multiNumber.apply(5, 7));

	}

}
