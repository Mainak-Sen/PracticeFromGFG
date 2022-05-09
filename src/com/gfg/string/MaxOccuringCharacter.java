package com.gfg.string;

public class MaxOccuringCharacter {
	//write a java program to count the maximum occuring character in a string
	private static String get_max_occuringChar(String input)
	{
		final int CHAR=256;
		int[] count=new int[CHAR];
		for(int i=0;i<input.length();i++)
		{
			count[input.charAt(i)]++;
		}
		int max=Integer.MIN_VALUE;
		int result=0;
		for(int i=0;i<CHAR;i++)
		{
			if(count[i]>max) {max=count[i];
			result=i;
			}
		}
		
		return Character.toString((char) result);
	}
	public static void main(String[] args) {
		System.out.println(get_max_occuringChar("GeeksForGeek**"));

	}

}
