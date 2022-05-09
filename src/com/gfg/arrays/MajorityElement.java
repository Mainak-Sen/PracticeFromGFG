package com.gfg.arrays;

public class MajorityElement {

	// program to find the majority element in an array .

	private static int find_potential_candidate(int[] array) {
		int res = 0, count = 1;
		for (int i = 1; i < array.length; i++) {
			if (array[res] == array[i]) {
				count++;
			} else {
				count--;
			}

			if (count == 0) {
				res = i;
				count = 1;
			}
		}
		return res;
	}

	private static int count_occurence_and_returnindex(int[] array) {

		int res = find_potential_candidate(array);
		int count = 0;
		for (int j = 0; j < array.length; j++) {
			if (array[res] == array[j]) {
				count++;
			}
		}
		if (count <= (array.length / 2)) {
			return -1;
		} else {
			return res;
		}
	}

	public static void main(String[] args) {

		int[] array = { 3, 1, 3, 2, 3, 2, 3 };
		System.out.println(find_potential_candidate(array));
		System.out.println(count_occurence_and_returnindex(array));

	}

}
