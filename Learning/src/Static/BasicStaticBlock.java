package Static;

public class BasicStaticBlock {

	{
		System.out.println("basic block");
	}
	
	static
	{
		System.out.println("Basic Static block");
	}
	
	public BasicStaticBlock() {
		System.out.println("Constructor basic block");
	}
	
	public void disp()
	{
		System.out.println("nomral function");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main ");
		BasicStaticBlock obj = new BasicStaticBlock();
		obj.disp();
	}

}
