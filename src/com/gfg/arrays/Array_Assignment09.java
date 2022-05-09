package com.gfg.arrays;

public class Array_Assignment09 {

	// write a program to find minimum adjacent difference in a circular array

	public static int minAdjDiff(int arr[], int n) {
		// let the first element is the minimum
		int temp = arr[0];
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < arr.length; i++) {
			if (Math.abs(arr[i] - temp) < min) {
				min = Math.abs(arr[i] - temp);
			}
			temp = arr[i];
		}
		// since its circular we should consider the abosulte diff between first and
		// last elemnt
		if (Math.abs(arr[0] - arr[n - 1]) < min) {
			min = Math.abs(arr[0] - arr[n - 1]);
		}
		return min;

	}

	public static void main(String[] args) {
		int[] array = { 10, -3, -4, 7, 6, 5, -4, -1 };
		int n = array.length;
		System.out.println(minAdjDiff(array, n));

	}

}
