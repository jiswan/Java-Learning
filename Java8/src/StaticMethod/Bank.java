package StaticMethod;

public interface Bank {
	
	void deposit(double amount);
	
	static double interestRate()
	{
		return (0.12);
	}

}
