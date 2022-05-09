package com.gfg.recursion;

public class SubarraySum {
	
	//program to  check sums of all individual elements of each subset of the array and consider it if the sum is equal to the given sum 
	// in this way we will check how many subsets we get whose sum equals to given sum 
	
	private static int findSubarraySum(int[] array,int size,int sum) {
		
		if(size==0)
		{
			return (sum==0)?1:0;
		}
		
		return findSubarraySum(array,size-1,sum)+findSubarraySum(array,size-1,sum-array[size-1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {15,20,25,10};
		int size=array.length;
		int sum=25;
		System.out.println(findSubarraySum(array,size,sum));

	}

}
