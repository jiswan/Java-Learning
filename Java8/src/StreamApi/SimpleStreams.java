package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SimpleStreams {

	public static void main(String[] args) {
		
		List<Integer> number = new ArrayList<Integer>();
		number.add(15);
		number.add(40);
		number.add(25);
		number.add(5);
		
		//Without using Streams 
		System.out.println("Before using Stream API");
		List<Integer> newnumber = filternumber(number); // filternumber method is called 
		newnumber.forEach(System.out::println);
		
		// Using Stream API
		System.out.println("After using Stream API");
		Stream s =number.stream().filter(x->x>15);     
		s.forEach(System.out::println);

		
	}

	private static List<Integer> filternumber(List<Integer> number) {
		
		List<Integer> funnumber = new ArrayList<>();
		for(int i : number)
		{
			if(i>15)
			{
				funnumber.add(i);
			}
		}
		return funnumber;
	}

}
