package com.gfg.arrays;

import java.util.ArrayList;
import java.util.List;

public class Array_Assignment05 {

	public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[]) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int largest = arr[0];
		int second_largest = Integer.MIN_VALUE;

		for (int i = 1; i < sizeOfArray; i++) {
			if (arr[i] > largest) {
				second_largest = largest;
				largest = arr[i];
			} else {
				if (arr[i] > second_largest && arr[i] != largest) {
					second_largest = arr[i];
				}
			}
		}

		if (largest == second_largest || second_largest == Integer.MIN_VALUE) {
			result.add(largest);
			result.add(-1);
			return result;
		} else {
			result.add(largest);
			result.add(second_largest);
			return result;
		}

	}

	public static void main(String[] args) {
		System.out.println(largestAndSecondLargest(3, new int[] { 1, 1, 1 }));

	}

}
