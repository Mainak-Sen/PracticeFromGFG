package com.gfg.arrays;

public class PrefixSumTechnique2 {
	
	//write a program to find the equilibrium point in an array 
	//equilibrium point in an array indicates that the sum of elements to the left
	// and right of it is same 
	
	private static boolean is_equilibriumpt_present(int[] array) {
		
		//compute total sum of elements in the array 
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
		}
		int lsum=0;
		for(int i=0;i<array.length;i++)
		{
			if(lsum==(sum-array[i]))
			{
				return true;
			}
			else
			{
				lsum+=array[i];
				sum-=array[i];
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] array= {3,0,0,-2,2,0};
		System.out.print(is_equilibriumpt_present(array));
		

	}

}
