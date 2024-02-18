package Sorting;

public class SelectionSortAlgorithm {


	public static void main(String a[]) {
		int[] arr1 = { 5,4,3,2};
		System.out.println("Before Selection Sort:-");
		printArray(arr1);
		System.out.println();

		selectionSort(arr1);

		System.out.println("After Selection Sort:-");
		printArray(arr1);
	}

	private static void printArray(int[] arr1) {
		for(int a : arr1)
		{
			System.out.print(a+" ");
		}
		
	}



	private static void selectionSort(int[] arr1) {
		for(int i =0 ;i<arr1.length-1;i++)
		{
			int index = i ;
			
			for(int j =i+1;j<arr1.length;j++)
			{
				if(arr1[j]<arr1[index])
				{
					index =j;
				}
			}
			swap(arr1,i,index);
		}
		
	}
private static void swap(int[] arr1, int i, int index) {
	int smallestnumber = arr1[index];
	arr1[index]= arr1[i];
	arr1[i]=smallestnumber;
	
	
}
}
