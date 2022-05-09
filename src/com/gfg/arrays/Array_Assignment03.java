package com.gfg.arrays;

import java.util.Arrays;

public class Array_Assignment03 {

	public static int median(int A[], int N) {

		Arrays.sort(A);

		if (N % 2 != 0)// if array contains odd number of elements
		{
			return A[N / 2];
		} else // if array contains even number of elements ,then ther are two middle elements
		{
			return (A[N / 2 - 1] + A[N / 2]) / 2;
		}

		// Your code here
		// If median is fraction then conver it to integer and return
	}

	public static int mean(int A[], int N) {
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += A[i];
		}

		return sum / N;
	}

	public static void main(String[] args) {

		System.out.println(median(new int[] { 2, 8, 3, 4, 7, 9 }, 6));
		System.out.println(mean(new int[] { 2, 8, 3, 4, 7, 9 }, 6));

	}

}
