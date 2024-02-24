package Interview;

import java.util.Arrays;
import java.util.List;

public class LimitandSkip {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10,20,30,40,50,60,70,80,90);
		System.out.println("List before Limit");
		numbers.forEach(x->System.out.print(x+" "));
		System.out.println("\nList After using Limit");
		numbers.stream().limit(6).forEach(x->System.out.print(x+" "));
		System.out.println("\nList After using Limit");
		numbers.stream().skip(6).forEach(x->System.out.print(x+" "));
	}

}
