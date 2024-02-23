package StaticMethod;

public class AccountDetail implements Bank{

	double balance;
	
	public AccountDetail(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		this.balance+=amount;
		
		
	}
	public void display()
	{
		System.out.println("The Balance "+this.balance);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccountDetail obj = new AccountDetail(100);
		obj.display();
		obj.deposit(1250.25);
		obj.display();
		//using Static Method
		System.out.print("Interest Rate "+Bank.interestRate());
		
		
		
	}



	



	

}
