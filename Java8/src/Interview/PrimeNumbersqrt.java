package Interview;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumbersqrt {

	public static void main(String[] args) {
		
		 Stream.iterate(1, i->i+1)
				.filter(PrimeNumbersqrt::primenumber)
				.mapToDouble(Math::sqrt).limit(10)
				.forEach(x->System.out.print(x+" "));

	}

	private static Boolean primenumber(Integer num) {
		return (num>1) && IntStream.range(2, num).noneMatch(x->num%x==0);
		
	}

}
