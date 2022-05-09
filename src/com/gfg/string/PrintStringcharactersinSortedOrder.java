package com.gfg.string;

public class PrintStringcharactersinSortedOrder {
	//given a string of lower case alphabets 
	//we have to print the characters of the string in sorted order 
	private static void printStringCharactersSorted(String str) {
		
		int[] count=new int[26];
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)-'a']++;
		}
		
		for(int i=0;i<26;i++)
		{
			for(int j=0;j<count[i];j++)
			{
				System.out.print((char)(i+'a'));
			}
		}
	}
	
	
	public static void main(String[] args) {
		String str="geeksforgeeks";
		printStringCharactersSorted(str);

	}

}
