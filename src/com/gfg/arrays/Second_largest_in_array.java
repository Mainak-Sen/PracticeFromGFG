package com.gfg.arrays;

public class Second_largest_in_array {
	
	private static int get_second_largest(int[] array) {
		
		int max1=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max1)
			{
				max1=array[i];
			}
		}
		int res = -1;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=max1)
			{
				if(res==-1)
				{
					res=i;
				}
				else if(array[i]>array[res])
				{
					res=i;
				}
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		int[] array= {9,9,9,9};
		System.out.println(get_second_largest(array));

	}

}
