package ThrowException;

public class ThrowException2 {

	void method1()  {
		throw new ArithmeticException("Calculation error");
	}

	void method2() throws ArithmeticException {
		method1();
	}

	void method3() {
		try {
			method2();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException handled");
		}
	}

	public static void main(String args[]) {
		ThrowException2 obj = new ThrowException2();
		obj.method3();
		System.out.println("End Of Program");
	}

}
