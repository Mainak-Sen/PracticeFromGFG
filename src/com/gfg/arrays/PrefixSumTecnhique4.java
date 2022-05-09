package com.gfg.arrays;

import java.util.HashMap;

public class PrefixSumTecnhique4 {
	
	//write a program to find if theres a subarray in the array with required sum 
	//provided : Array can contain both positive and negative elements 
	
	private static void subarray_with_given_sum(int[] array,int requiredSum) {
		
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int currentSum=0;
		int start=0;
		int end=-1;
		
		for(int i=0;i<array.length;i++)
		{
			currentSum+=array[i];
			if(currentSum==requiredSum)
			{
				start=0;
				end=i;
				break;
			}
			
			else if(hm.containsKey(currentSum-requiredSum))
			{
				start=(hm.get((currentSum-requiredSum)))+1;
				end=i;
				break;
			}
			else
			{
				hm.put(currentSum,i);
			}
		}
		
		if(end==-1)
		{
			System.out.println("Sorry!!! no subarray found with the required sum");
		}
		else
		{
			System.out.println("Sum found in the given index: from "+start+" to "+end);
		}
	}
	public static void main(String[] args) {
		int[] array= {7,5,-3,4,-8,6,-6};
		subarray_with_given_sum(array,12);
		

	}

}
