package com.gfg.arrays;

public class max_consecutive_ones {
	//program to find the maximum consecutive 1's in binary array
	private static int find_max_consecutive_ones(int[] array) {
		int count=0;
		int max_count=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==1)
			{
				count=count+1;
				if(count>max_count)
				{
					max_count=count;
				}
			}
			else
			{
				count=0;
			}
		}
		return max_count;
	}

	public static void main(String[] args) {
		int[] array= {};
		System.out.println("The maximum consecutive 1's in the given array is: "+find_max_consecutive_ones(array));

	}

}
