package Sorting;

public class InsertionSortAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {4,3,2,10};
		System.out.println("Before Sorting ");
		display(a);
		/*
		for(int i : a)
		{
			System.out.print(i+" ");
		}*/
		insertionSorting(a);
		System.out.println("\nAfter Sorting ");
		display(a);
	}

	private static void display(int[] a) {
		for(int i:a)
		{ 
			System.out.print(i+" ");
		}
		
	}

	private static void insertionSorting(int[] a) {
		
		for(int i=1;i<a.length;++i)
		{
			int key = a[i];
			int j =i-1;
			
			while(j>=0 &&a[j]> key)
			{
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=key;
		}
		
	}

}
