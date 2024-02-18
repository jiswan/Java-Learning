package Sorting;

public class BubbleSortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a =  { 64, 34, 25, 12, 22, 11, 90 };
		bubblesorting(a); 
		displaysorting(a);
	}

	private static void displaysorting(int[] a) {
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

	private static void bubblesorting(int[] a) {
		int length = a.length;
		int temp =0;
		for(int i=0;i< length;i++)
		{
			for(int j =0;j<length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]= temp;
				}
			}
		}
		
	}

}
