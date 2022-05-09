package com.gfg.arrays;

public class Array_Assignment13 {

	/*
	 * Given an array A of N positive numbers. The task is to find the first
	 * Equilibium Point in the array. Equilibrium Point in an array is a position
	 * such that the sum of elements before it is equal to the sum of elements after
	 * it.
	 */

	/*
	 * Approach: The idea is to get total sum of array first. Then Iterate through
	 * the array and keep updating the left sum which is initialized as zero. In the
	 * loop, we can get right sum by subtracting the elements one by one.
	 */

	public static int equilibriumPoint(long arr[], int n) {

		// find total sum
		long totalSum = 0;
		int equipt = -1;
		if (arr.length == 1) {
			return 1;
		}
		for (int i = 0; i < n; i++) {
			totalSum += arr[i];
		}

		long lsum = 0;
		long rsum = 0;
		for (int i = 0; i < n; i++) {
			if (i - 1 >= 0) {
				lsum += arr[i - 1];
				rsum = totalSum - (arr[i] + lsum);
				if (lsum == rsum) {
					return i + 1;
				}
			}
		}

		return equipt;
	}

	public static void main(String[] args) {
		long[] arr = { 1, 3, 5, 2, 2 };
		int n = arr.length;
		System.out.println(equilibriumPoint(arr, n));

	}

}
