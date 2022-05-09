package com.gfg.string;

public class LeftmostNonRepeatingCharacter {
	
	private static int getLeftmostNonRepatingChar(String str) {
		
		final int CHAR=256;
		int[] count=new int[CHAR];
		int result=0;
		
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;
		}
		for(int i=0;i<str.length();i++)
		{
			if(count[str.charAt(i)]==1)
			{
				result=i;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(getLeftmostNonRepatingChar("geeksforgeeks"));
	}

}
