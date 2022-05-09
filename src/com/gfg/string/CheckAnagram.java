package com.gfg.string;

public class CheckAnagram {
	
	//write a program to check if two strings are anagram of each other(string consist of
	//lower case letters only)
	private static boolean checkAnagram(String str1,String str2)
	{
		int[] count1=new int[26];
		int[] count2=new int[26];
		if(str1.length()!=str2.length())
		{
			return false;
		}
		else
		{
			//both strings are of same length
			int len=str1.length();
			for(int i=0;i<len;i++)
			{
				count1[(str1.charAt(i)-'a')]++;
				count2[(str2.charAt(i)-'a')]++;
			}
			//compare the two count arrays
			for(int j=0;j<26;j++)
			{
				if(count1[j]!=count2[j])
				{
					return false;
				}
			}
			return true;
		}
		
		
	}
	public static void main(String[] args) {
		System.out.println(checkAnagram("a","b"));

	}

}
