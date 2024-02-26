package Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeNumber {

	public static void main(String[] args) {
		Boolean primeNumber = functionprime(1);
        if(primeNumber)
        {
        	System.out.print("Prime Number");
        }
        else
        {
        	System.out.print("Not Prime");
        }
	}

	private static Boolean functionprime(int num) {
		return ((num>1)&& IntStream.range(2, num).noneMatch(n->num%n==0));
	}

}
