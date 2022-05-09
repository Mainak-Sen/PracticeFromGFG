package com.gfg.arrays;

public class Array_Assignment06 {

//	Given an array arr[] of N positive integers.
//	The task is to find the maximum for every adjacent pairs in the array.
//	Input:
//		N = 6
//		arr[] = {1,2,2,3,4,5}
//		Output: 2 2 3 4 5
//		Explanation: Maximum of arr[0] and arr[1]
//		is 2, that of arr[1] and arr[2] is 2, ...
//		and so on. For last two elements, maximum 
//		is 5.

	public static void maximumAdjacent(int sizeOfArray, int arr[]) {

		/*********************************
		 * Your code here Function should print max adjacents for all pairs Use string
		 * buffer for fast output
		 ***********************************/
		int temp = arr[0];
		for (int i = 1; i < sizeOfArray; i++) {
			if (arr[i] >= temp) {
				System.out.print(arr[i] + " ");
			} else {
				System.out.print(temp + " ");
			}
			temp = arr[i];
		}

	}

	public static void main(String[] args) {
		int[] array = {};
		int sizeOfArray = array.length;
		maximumAdjacent(sizeOfArray, array);
		

	}

}
