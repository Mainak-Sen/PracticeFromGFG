package com.gfg.arrays;

public class Array_Assignment12 {

	// reference link
	// https://kuldipmochi96.medium.com/frequencies-of-limited-range-array-elements-c35398e2429a

	/*
	 * 1) Subtract 1 from every element so that the elements become in range from 0
	 * to n-1 for (int j =0; j < n; j++) arr[j] = arr[j]-1;
	 * 
	 * 2) Use every element arr[i] as index and add 'n' to element present at
	 * arr[i]%n to keep track of count of occurrences of arr[i] for (int i=0; i < n;
	 * i++) arr[arr[i]%n] = arr[arr[i]%n] + n;
	 * 
	 * 3) To print counts, simply print the number of times n was added at index
	 * corresponding to every element for (int i =0; i < n; i++) print
	 * "(i + 1) -> arr[i] "
	 */

	// we can use HashMap and solve the problem but it will use O(N) extra space
	// So we will be implementing the above steps for an optimised solution

	public static void frequencycount(int arr[], int n) {

		// Step 1)
		for (int i = 0; i < n; i++) {
			arr[i] = arr[i] - 1;
		}

		// Step2
		for (int i = 0; i < n; i++) {
			arr[arr[i] % n] = arr[arr[i] % n] + n;
		}

		// Step 3
		for (int i = 0; i < n; i++) {
			arr[i] /= n;
		}

	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 2, 3, 5 };
		int n = arr.length;
		frequencycount(arr, n);

		System.out.println("Printing the frequency of each element in the array");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
