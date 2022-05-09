package com.gfg.arrays;

public class SlidingWindowTechnique3 {
	//only positive elements 
	//subarray is always considered with contiguous elements 
	private static boolean findIfSubarrayPresentWithGivenSum(int[] array,int requiredSum) {
		
		int Currentsum=array[0];
		int start=0;
		for(int end=1;end<=array.length;end++)
		{
			while(Currentsum>requiredSum && start<end)
			{
				Currentsum-=array[start];
				start++;
			}
			if(Currentsum==requiredSum)
			{
				return true;
			}
			
			Currentsum+=array[end];
			
			
		}
		return (Currentsum==requiredSum);
		
	}

	public static void main(String[] args) {
		int[] array= {1,4,20,3,10,5};
		System.out.println(findIfSubarrayPresentWithGivenSum(array,15));
	}

}
