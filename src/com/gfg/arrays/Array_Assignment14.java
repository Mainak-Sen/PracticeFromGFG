package com.gfg.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Array_Assignment14 {

	/*
	 * Given an array A of positive integers. Your task is to find the leaders in
	 * the array. An element of array is leader if it is greater than or equal to
	 * all the elements to its right side. The rightmost element is always a leader.
	 */
	/*
	 * Approach: Scan all the elements from right to left in array and keep track of
	 * maximum till now. When maximum changes it’s value, print it.
	 */

	static ArrayList<Integer> leaders(int arr[], int n) {

		ArrayList<Integer> leaders = new ArrayList<Integer>();
		int current_leader = arr[n - 1];
		leaders.add(current_leader);
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] >= current_leader) {
				current_leader = arr[i];
				leaders.add(arr[i]);
			}
		}

		Collections.reverse(leaders);
		return leaders;
	}

	public static void main(String[] args) {
		int[] arr = { 16, 17, 4, 3, 5, 2 };
		int n = arr.length;
		System.out.println(leaders(arr, n));

	}

}
