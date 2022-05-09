package com.gfg.string;

public class ReverseWordsInAGivenString {
	
	private static void print_string_reversing_words(String str) {
	
		String[] words=str.split("\\s+");
		int low=0;
		int high=words.length-1;
		String tempstr;
		while(low<high)
		{
			tempstr=words[0];
			words[0]=words[words.length-1];
			words[words.length-1]=tempstr;
			
			low++;
			high--;	
		}
		
		for(int j=0;j<words.length;j++)
		{
			System.out.print(words[j]+" ");
		}
		
	}
	public static void main(String[] args) {
		print_string_reversing_words("welcome to Gfg Mainak!!");

	}

}
