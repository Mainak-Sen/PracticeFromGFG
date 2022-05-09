package com.gfg.arrays;

public class Array_Asignment01 {
	
	// You only need to insert the given element at 
    // the end, i.e., at index sizeOfArray - 1. You may 
    // assume that the array already has sizeOfArray - 1
    // elements. 
    public static void insertAtEnd(int arr[],int sizeOfArray,int element)
    {
        arr[sizeOfArray-1] = element;
        for(int ele : arr)
        {
        	System.out.print(ele+" ");
        }
    }

	public static void main(String[] args) {
		
		insertAtEnd(new int[] {1,4,6,3,8},5,6);
	}

}
