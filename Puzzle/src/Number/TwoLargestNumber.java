package Number;

public class TwoLargestNumber {

	public void largestNumber(int[] number)
	{
		int Maxone =0;
		int Maxtwo =0;
		
		for(int num : number)
		{
			if(Maxone< num)
			{
				Maxtwo =Maxone;
				Maxone =num;
			}
			else if(Maxtwo<num)
			{
				Maxtwo =num;
			}
		}
		System.out.print(Maxone);
		System.out.print(Maxtwo);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []  number = {5,4,3,2};
		TwoLargestNumber obj = new TwoLargestNumber();
		obj.largestNumber(number);
	}

}
