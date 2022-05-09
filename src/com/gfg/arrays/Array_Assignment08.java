package com.gfg.arrays;

public class Array_Assignment08 {

	static void rotateArr(int arr[], int d, int n) {
		
		//anticlockwise rotation is  as good as left rotation
		swapArray(arr,0,d-1);
		swapArray(arr,d,n-1);
		swapArray(arr,0,n-1);
	}

	public static void swapArray(int arr[], int left, int right) {
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}

	public static void main(String[] args) {

	}

}
