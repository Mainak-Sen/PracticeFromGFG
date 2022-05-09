package com.gfg.arrays;

public class ArrayReversepractice {
	
	private static void reverse_array(int[] array) {
		
		int low=0;
		int high=array.length-1;
		if(array.length==0) {System.out.println("Array is empty,reverse is empty array: []");}
		while(low<high)
		{
			swap(array,low,high);
			low++;
			high--;
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	
	private static void swap(int[] array,int lowIndex,int highIndex)
	{
		int temp=array[highIndex];
		array[highIndex]=array[lowIndex];
		array[lowIndex]=temp;
	}

	public static void main(String[] args) {
		int[] array= {4,2};
		reverse_array(array);
		

	}
	

}
