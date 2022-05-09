package com.gfg.arrays;

public class SlidingWindowTechnique2 {

	//write a program to find if a given array consist of a subarray of k consecutive elements 
	//that sums up to a required one .
	private static boolean findSubarrayWithgivenSum(int array[],int subLength,int requiredsum)
	{
		int sum=0;
		int maxSum=0;
		for(int i=0;i<subLength;i++)
		{
			sum+=array[i];
		}
		if(sum==requiredsum)
		{
			return true;
		}
		else
		{
			for(int i=subLength;i<array.length;i++)
			{
				sum+=(array[i]-array[i-subLength]);
				if(sum==requiredsum)
				{
					return true;
				}
			}
			return false;
		}
	}
	public static void main(String[] args) {
		int[] array= {1,8,30,-5,20,7};
		System.out.println(findSubarrayWithgivenSum(array,3,33));
	}

}
