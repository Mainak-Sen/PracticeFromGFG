package com.gfg.arrays;

public class Array_Assignment10_Optimized {

	public static int maxOccured(int L[], int R[], int n, int maxx) {
//		Initialize an array arr[] to 0.
		int[] array = new int[maxx + 2];// setting it to max+2,because while setting the
										// array[R[i]+1],it will undergo Array Out of Bounds Exception
										// had we set it to maxx or max+1

//		For each range i, add +1 at Li index and -1 at index 1 + Ri of the array.
		for (int i = 0; i < n; i++) {
			array[L[i]] += 1;
			array[R[i] + 1] -= 1;
		}

		int maxi = 0;
		int max = array[0];
		for (int i = 1; i <= maxx; i++) {
			// get the prefix sum
			array[i] += array[i - 1];

			// find the smallest index having maximum prefix sum.
			if (array[i] > max) {
				max = array[i];
				maxi = i;
			}
		}
		return maxi;
	}

	public static void main(String[] args) {
		int[] L = { 1, 5, 9, 13, 21 };
		int[] R = { 15, 8, 12, 20, 30 };
		int n = L.length;
		int maxx = 30;
		System.out.println(maxOccured(L, R, n, maxx));

	}

}
