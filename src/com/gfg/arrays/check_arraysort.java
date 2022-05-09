package com.gfg.arrays;

public class check_arraysort {
	
	private static boolean is_Array_sorted(int[] a) {
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<a[i-1])
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] input= {1};
		System.out.println(is_Array_sorted(input));

	}

}
