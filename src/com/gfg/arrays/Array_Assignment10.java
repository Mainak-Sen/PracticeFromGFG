package com.gfg.arrays;

public class Array_Assignment10 {
	// L[] and R[] are input ranges
	// n : size of array
	// maxx: maximum element in R[]
	// arr[]: declared globally with size equal to 1000000

	public static int maxOccured(int L[], int R[], int n, int maxx) {

		// lets create an array which will keep track of occurences of the entire range
		int[] array = new int[maxx + 1];// initialized the array
		for (int i = 0; i < n; i++) {
			for (int j = L[i]; j <= R[i]; j++) {
				array[j] += 1;
			}
		}
		int index = 0;
		int max_occuring = array[0];
		for (int i = 0; i <= maxx; i++) {
			if (array[i] > max_occuring) {
				max_occuring = array[i];
				index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int[] L = { 1, 5, 9, 13, 21 };
		int[] R = { 15, 8, 12, 20, 30 };
		int n = L.length;
		int maxx = 30;
		System.out.println(maxOccured(L, R, n, maxx));

	}
}
