package com.gfg.string;

import java.util.Arrays;

public class LongestDistinctSubstring {
	//we have to write a program to find out the largest substring 
	//with distinct characters from a given string
	private static int find_largest_distinct_substr(String str) {
		
		final int CHAR=256;
		int[] previous=new int[256];
		Arrays.fill(previous, -1);
		int start=0,result=0;
		int maxending=0;
		for(int end=0;end<str.length();end++)
		{
			start=Math.max(start,previous[str.charAt(end)]+1);
			maxending=(end-start+1);
			result=Math.max(maxending,result);
			previous[str.charAt(end)]=end;	
		}
		
		return result;
	}
	public static void main(String[] args) {
		System.out.println(find_largest_distinct_substr("abadfcgabc"));

	}

}
