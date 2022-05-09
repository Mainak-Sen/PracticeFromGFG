package com.gfg.string;

import java.util.Arrays;

public class LeftmostRepeatingCharacterOptimized1 {

	private static int get_leftmost_repeating_char(String str) {
		
		final int CHAR=256;
		int[] alphabetsFirstIndex=new int[CHAR];
		Arrays.fill(alphabetsFirstIndex, -1);
		int result=Integer.MAX_VALUE;
		
		for(int i=0;i<str.length();i++)
		{
			int fi=alphabetsFirstIndex[str.charAt(i)];
			if(fi==-1)
			{
				alphabetsFirstIndex[str.charAt(i)]=i;
			}
			else
			{
				result=Math.min(result,fi);
			}
		}
		return (result==Integer.MAX_VALUE)?-1:result;
	}
	public static void main(String[] args) {
		System.out.println(get_leftmost_repeating_char("xgeeksforgeeks"));

	}

}
