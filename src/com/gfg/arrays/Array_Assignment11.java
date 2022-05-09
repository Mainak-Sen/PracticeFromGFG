package com.gfg.arrays;

public class Array_Assignment11 {

	// Function to convert the given array to wave like array
	// arr: input array
	// n: size of the array

//	Approach:
//		This can be done in O(n) time by doing a single traversal of given array. 
//	The idea is based on the fact that if we make sure that all even positioned (at index 0, 2, 4, ..) 
//	elements are greater than their adjacent odd elements,
//	we don’t need to worry about odd positioned element. Following are simple steps.
//		1) Traverse all even positioned elements of input array, and do following.
//		….a) If current element is smaller than previous odd element, swap previous and current.
//		….b) If current element is smaller than next odd element, swap next and current.
	public static void convertToWave(int arr[], int n) {

		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0) {
				if (i - 1 > 0 && arr[i] < arr[i - 1]) {
					swapArray(arr, i, i - 1);
				}
				if (i + 1 < n && arr[i] < arr[i + 1]) {
					swapArray(arr, i, i + 1);
				}
			}
		}

	}

	public static void swapArray(int[] arr, int idx1, int idx2) {
		int temp = arr[idx2];
		arr[idx2] = arr[idx1];
		arr[idx1] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 7, 8, 9, 10 };
		int n = arr.length;
		convertToWave(arr, n);
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
