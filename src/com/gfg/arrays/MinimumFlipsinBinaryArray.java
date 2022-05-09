package com.gfg.arrays;

public class MinimumFlipsinBinaryArray {
	
	private static void print_groups(int[] array)
	{
		for(int i=1;i<array.length;i++)
		{
			if(array[i]!=array[i-1])
			{
				if(array[i]!=array[0])
				{
					System.out.print("From "+i+" to ");
				}
				else
				{
					System.out.print((i-1));
					System.out.println();
				}
			}
		}
		if(array[array.length-1]!=array[0])
		{
			System.out.print(array.length-1);
		}
	}

	public static void main(String[] args) {
		
		int[] array= {0,1,0,0,1,0,1,1,0,1};
		print_groups(array);

	}

}
