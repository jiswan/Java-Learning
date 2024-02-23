package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class EvenOddElement {

	public static void main(String[] args) {
		
		List<Integer> listofInteger = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		Map<Boolean, List<Integer>> evenOddElement = listofInteger.stream()
														.collect(Collectors.partitioningBy(i->i%2==0));
		Set<Entry<Boolean, List<Integer>>> entryset = evenOddElement.entrySet();
		for(Entry<Boolean, List<Integer>> number : entryset)
		{
			if(number.getKey())
				System.out.println("Even Number");
			else
				System.out.print("odd number");
			List<Integer> list1 = number.getValue();
			for(int j : list1)
			{
				System.out.println(j);
			}
		}
		
	}

}
