package com.gfg.arrays;

public class max_sum_circularSubArray {
	
	private static int maxsum_normalSubArray(int[] array) {
		
		int maxSum=array[0];
		int currentSum=array[0];
		for(int i=1;i<array.length;i++)
		{
			currentSum=Math.max(currentSum+array[i],array[i]);
			maxSum=Math.max(currentSum,maxSum);
		}
		
		return maxSum;
	}
    private static int max_sum_circularSubArray(int[] array) {
    	
    	int max_normalSubArraysum=maxsum_normalSubArray(array);
    	if(max_normalSubArraysum<0)
    	{
    		return max_normalSubArraysum;
    	}
    	int arrSum=0;
    	for(int i=0;i<array.length;i++)
    	{
    		arrSum+=array[i];
    		array[i]=-array[i];
    	}
    	int circularSum=arrSum+maxsum_normalSubArray(array);
    	return Math.max(max_normalSubArraysum, circularSum);
    }
	public static void main(String[] args) {
		int[] array= {8,-4,3,-5,4};
		System.out.println("The maximum sum considering circular subarray is: "+
		
max_sum_circularSubArray(array));

	}

}
