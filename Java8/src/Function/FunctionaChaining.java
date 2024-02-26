package Function;

import java.util.function.Function;

public class FunctionaChaining {

	public static void main(String[] args) {


		Function<Integer, Integer> doubleNumber = i -> 2*i;
		Function<Integer, Integer> cubeNumber = i->i*i*i;
		
		System.out.println("Double of theNumber is "+ doubleNumber.apply(5));
		System.out.println("Cube of the Number is "+cubeNumber.apply(5));
		
		//Function Chaining
		Integer number = doubleNumber.andThen(cubeNumber).apply(5); //First f1 then  f2
		System.out.println(number);
		Integer number1 = doubleNumber.compose(cubeNumber).apply(5); //First f2 then f1
		System.out.println(number1);
	}

}
