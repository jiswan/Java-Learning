package MethodReference;

import java.util.ArrayList;
import java.util.List;

public class ListUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> name = new ArrayList<>();
		name.add("jiswan");
		name.add("abin");
		name.add("souda");
		name.add("basheer");
		
		//Using Method Reference
		System.out.println("Using Method Reference ");
		name.forEach(System.out::println);
		
		List<Integer> number = new ArrayList<>();
		number.add(4);
		number.add(5);
		number.add(9);
		number.add(12);
		
		
		//using Lambda
		System.out.println("Using Lambda");
		number.forEach(num->{
			int squareNumber = num*num;
			System.out.println(squareNumber);
		});

		//Using Method Reference 
		System.out.println("Using Method Reference");
		number.forEach(ListUse::squareNumber);
	}
	static void squareNumber(int num1)
	{
		System.out.println(num1*num1);
	}

}
