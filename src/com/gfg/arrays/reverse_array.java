package com.gfg.arrays;

public class reverse_array {
	
	private static void reverse_array(int[] a) {
		
		int high=(a.length-1);
		int low=0;
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
		int[] a= {5,6,8,4,7,0};
		reverse_array(a);
		System.out.println("Array after reversal");
		System.out.println("**************************************************");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
