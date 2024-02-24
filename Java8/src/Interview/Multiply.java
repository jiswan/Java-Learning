package Interview;

import java.util.function.Function;

public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Numbers num1 = (x,y)->x*y;
		System.out.print(num1.mutiliply(12, 2));
		
	}

}
@FunctionalInterface
interface Numbers
{
   	public int mutiliply(int a, int b);
}
