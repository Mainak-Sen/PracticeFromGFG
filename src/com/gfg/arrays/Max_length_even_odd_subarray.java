package com.gfg.arrays;

public class Max_length_even_odd_subarray {
	
	private static int find_max_lengthOf_evenOddSubarray(int[] array) {
		int result=1;
		int current=1;
		for(int i=1;i< array.length;i++)
		{
			if((array[i]%2==0 && array[i-1]%2!=0) || (array[i]%2!=0 && array[i-1]%2==0))
			{
				current++;
				result=Math.max(result,current);
			}
			else
			{
				current=1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] array= {5,10,20,6,3,8};
		System.out.println("The maximum length of subarray with alternating even and odd numbers is: "
				+ find_max_lengthOf_evenOddSubarray(array));

	}

}
