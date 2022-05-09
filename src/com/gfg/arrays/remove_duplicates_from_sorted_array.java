package com.gfg.arrays;

public class remove_duplicates_from_sorted_array {
	
	private static int remove_duplicates(int[] a) {
		
		if(a.length==0) {return 0;}
		int current_size=1;
		for(int i=1;i<a.length;i++)
		{
			if(a[current_size-1]!=a[i])
			{
				a[current_size]=a[i];
				current_size++;
			}
		}
		
		return current_size;
	}

	public static void main(String[] args) {
		int[] a= {1,1,2};
		int size=remove_duplicates(a);
		System.out.println("The size of the array after removing duplicates is: "+size);
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		

	}

}
