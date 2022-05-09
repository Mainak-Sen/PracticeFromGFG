package com.gfg.arrays;

public class left_rotate_array_by_one {
	
	private static void left_rotate_by_one(int[] a) {
		
		int temp=a[0];
		for(int i=1;i<a.length;i++)
		{
			a[i-1]=a[i];
		}
		a[a.length-1]=temp;
	}

	public static void main(String[] args) {
		int a[]= {3,4,5,7,2};
		left_rotate_by_one(a);
		
		System.out.println("Array after rotation: ");
		System.out.println("**************************************************************");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		

	}

}
