package com.gfg.arrays;

public class moveZeroestoEnd {
	//given an array ,we have to write a program to move the zeroes to the 
	//end keeping the order of non zero elements as present in the array 
	
	private static void print_array_move_zeroes_to_end(int[] array) {
		int count_non_zero=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=0)
			{
				swap(array,i,count_non_zero);
				count_non_zero++;
			}
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	
	private static void swap(int[] array,int index1,int index2)
	{
		int temp=array[index2];
		array[index2]=array[index1];
		array[index1]=temp;	
	}
	public static void main(String[] args) {
		int[] array= {9,0,7,6,3,0,22,0,0,0,5};
		print_array_move_zeroes_to_end(array);

	}

}
