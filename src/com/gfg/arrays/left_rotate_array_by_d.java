package com.gfg.arrays;

public class left_rotate_array_by_d {
	
	private static void left_rotate_array_by_d_positions(int[] a,int size,int positions) {
		
		reverse_array(a,0,positions-1);//reversing first "positions" number of elements in the array
		reverse_array(a,positions,size-1);//reversing positions+1 to end of the array
		reverse_array(a,0,size-1);//reversing the whole array
		
	}
	
	private static void reverse_array(int[] a,int low,int high) {
		while(low<high)
		{
			int temp=a[low];
			a[low]=a[high];
			a[high]=temp;
			low++;
			high--;	
		}
	}
	public static void main(String[] args) {
		int a[]= {3,4,5,1,2,7,9};
		left_rotate_array_by_d_positions(a,a.length,4);
		System.out.println("Array after left rotating it by d positions");
		System.out.println("**************************************************");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
