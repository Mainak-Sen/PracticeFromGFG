package com.gfg.string;

import java.util.Arrays;

public class LeftmostNonRepeatingCharacterBest {

	private static int get_leftmost_nonRepeating_char(String str) {
		
		final int CHAR=256;
		int result=Integer.MAX_VALUE;
		int[] first_indices=new int[256];
		Arrays.fill(first_indices, -1);
		
		for(int i=0;i<str.length();i++)
		{
			if(first_indices[str.charAt(i)]==-1)
			{
				first_indices[str.charAt(i)]=i;
			}
			else
			{
				first_indices[str.charAt(i)]=-2;
			}
		}
		
		for(int j=0;j<CHAR;j++)
		{
			if(first_indices[j]>=0)
			{
				result=Math.min(result,first_indices[j]);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(get_leftmost_nonRepeating_char("geeksforgeeks"));

	}

}

