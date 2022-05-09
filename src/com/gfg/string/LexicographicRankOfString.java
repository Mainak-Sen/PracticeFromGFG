package com.gfg.string;

public class LexicographicRankOfString {

	//we have to write a program to find out the lexicographic rank of a given string 
	
	private static int find_lexicographic_rank(String input)
	{
		final int CHAR =256;
		//creating a count array of 256 characters to count the occurences of respective characters 
		//of the string 
		int[] count=new int[CHAR];
		//initially after creating the array ,all the elements in it are having value 0
		// we are assuming all the characters are distinct
		//feeding the count of each character in the string into the array.
		for(int i=0;i<input.length();i++)
		{
			count[input.charAt(i)]++;
		}
		//now we have to find the cumulative count of each character at that particuar index position 
		//in the count array
		for(int i=1;i<CHAR;i++)
		{
			count[i]+=count[i-1];
		}
		int result=1;//taking it as 1 because anyways the lexicographic rank would be 1+the number of 
		             //lexicographically smaller strings that we find out 
		int mul=get_factorial(input.length());
		
		for(int j=0;j<input.length()-1;j++)
		{
			mul=(mul/(input.length()-j));
			result+=count[input.charAt(j)-1]*mul;
			for(int k=input.charAt(j);k<CHAR;k++)
			{
				count[k]--;
			}
		}
		return result;
	}
	
	private static int get_factorial(int n) {
		
		if(n==0) {return 1;}
		else {return n*get_factorial(n-1);}
	}
	public static void main(String[] args) {
			
		System.out.println(find_lexicographic_rank("mona"));

	}

}
