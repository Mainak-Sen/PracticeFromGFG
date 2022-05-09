package com.gfg.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Array_Assignment07 {

	public static ArrayList<Integer> reverseInGroups(ArrayList<Integer> arr, int n, int k) {
		// have two pointers to indicate the left and right of the considered subarray
		int left, right;
		// iterate thorugh the given list in window size of k
		for (int i = 0; i < n; i = i + k) {
			left = i;// left is i considering each window of size k
			if (n - 1 < i + k - 1)// condition when we go beyond the last element
			{
				right = n - 1;
			} else {
				right = i + k - 1;
			}

			while (left < right) {
				// write swap logic
				Collections.swap(arr, left, right);
				// increment left pointer and decrement right pointer
				left++;
				right--;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(5);
		arr.add(6);
		arr.add(8);
		arr.add(9);
		//arr.add(5);
		System.out.println(reverseInGroups(arr, 4, 3));

	}

}
