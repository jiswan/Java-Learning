package String;

public class StringBuffervsStringBuiderPerfoamce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =77777;
		{
			StringBuffer sbf = new StringBuffer();
			long beforetime = System.currentTimeMillis();
			for(int i =n;i>0;i--)
			{
				sbf.append("");
			}
			long aftertime = System.currentTimeMillis();
			System.out.println("Time Taken by StringBuffer "+(aftertime-beforetime));
		}
		{
			StringBuilder sbf = new StringBuilder();
			long beforetime = System.currentTimeMillis();
			for(int i =n;i>0;i--)
			{
				sbf.append("");
			}
			long aftertime = System.currentTimeMillis();
			System.out.println("Time Taken by StringBuilder "+(aftertime-beforetime));
		}
		
	}

}
