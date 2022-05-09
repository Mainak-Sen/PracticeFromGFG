package com.gfg.arrays;

public class LinearSearch {
	
	//O(N) time complexity where N is the size of the array.
	private static int linear_search(int[] a,int size,int to_search) {
		
	for(int i=0;i<size;i++)
	{
		if(a[i]==to_search)
		{
			return i;
		}
	}
	return -1;
	}

	public static void main(String[] args) {
		int a[]= {54,78,9,32,454};
		int size=a.length;
		System.out.println(linear_search(a,size,9));

	}

}
