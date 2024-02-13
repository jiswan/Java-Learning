package Final;

// The class cannot be inherited as its final one 
final class Example1 {
	void run() {
		System.out.print("Enough");
	}

}

class Example2 {
	final void message() {
		System.out.print("final method");
	}
}

public class FinalInitailization extends Example2 {

	@Override
    void message() // cannot override the final method 
    {
    	int pi;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int i;

		{
			i = 10;
		}
		System.out.println(i);
		
        Example1 obj = new Example1();
        obj.run();
        
	}

}
