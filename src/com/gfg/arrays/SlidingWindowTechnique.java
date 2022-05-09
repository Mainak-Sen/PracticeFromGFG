package com.gfg.arrays;

public class SlidingWindowTechnique {
	
	//we need to find the maximum sum of a subarray of k elements in an array of size n

	private static int printMaxsum(int[] array,int k)
	{
		//first we will find out the sum of first k elements in the array
		int maxSum=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<k;i++)
		{
			sum+=array[i];
			maxSum=Math.max(sum,maxSum);
		}
		for(int i=k;i<array.length;i++)
		{
			sum+=(array[i]-array[i-k]);
			maxSum=Math.max(sum,maxSum);
		}
		return maxSum;
	}
	public static void main(String[] args) {
		int[] array= {1,8,30,-5,0,7};
		System.out.println(printMaxsum(array,3));

	}

}
