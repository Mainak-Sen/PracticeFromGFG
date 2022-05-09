package com.gfg.arrays;

public class max_diff_in_array {
	//we have to find the maximum difference between two elements arr[i] and arr[j] in an array 
	//j>i
	
	private static int give_max_diff_in_array(int[] input) {
		
		int current_maxDiff=input[1]-input[0];
		int minVal=input[0];
		
		for(int j=1;j<input.length;j++)
		{
			current_maxDiff=Math.max(current_maxDiff,(input[j]-minVal));
			minVal=Math.min(minVal,input[j]);
		}
		
		return current_maxDiff;
	}

	public static void main(String[] args) {
		int[] a= {7,5,3,4,2};
		System.out.println(give_max_diff_in_array(a));

	}

}
