package com.gfg.string;

public class AnagramEfficient {
	//here we are using one acount array instead of 2
	//we are adding the count of character of  one string ,on the other hand we are decrementing the count 
	//of character of other string 
	//if they are indeed anagram,the final count of character in the array should be zero.
	private static boolean is_anagram(String str1,String str2) {
		
		int[] count=new int[256];
		if(str1.length()!=str2.length())
		{
			return false;
		}
		else
		{
			for(int i=0;i<str1.length();i++)
			{
				count[str1.charAt(i)]++;
				count[str2.charAt(i)]--;
			}
			
			for(int i=0;i<256;i++)
			{
				if(count[i]!=0) {return false;}	
			}
			return true;
		}
	}

	public static void main(String[] args) {
		System.out.println(is_anagram("listen","silenb"));

	}

}
