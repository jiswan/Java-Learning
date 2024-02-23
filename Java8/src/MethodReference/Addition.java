package MethodReference;

interface AdditionTwoNumber
{
   void add(int a, int b);	
}
public class Addition {
	
	static void additionNumber(int c,int v)
	{
		System.out.print("Sum of Two Numbers "+c +" and "+v+" is "+(c+v));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Using Lambda
		AdditionTwoNumber result = (a,b)->System.out.println("Sum of Two Numbers "+a +" and "+b+" is "+(a+b));
		result.add(5, 10);
	    
		// Using Method Reference
		AdditionTwoNumber result2 = Addition::additionNumber;
		result2.add(12, 10);
		
	}

}
