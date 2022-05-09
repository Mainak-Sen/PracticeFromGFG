package com.gfg.arrays;

public class max_sum_subarray {

	private static int find_max_sum_subarray(int[] array) {
		int maxending = array[0];
		int result = array[0];
		for (int i = 1; i < array.length; i++) {
			maxending = Math.max(maxending + array[i], array[i]);
			result = Math.max(result, maxending);
		}
		return result;

	}

	public static void main(String[] args) {
		int[] array = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(find_max_sum_subarray(array));

	}

}
