package com.gfg.mathematics;

public class numberPalindrome {
	
	private static boolean  is_palindrome(long N) {
		long reverse=0;
		long temp=N;
		
		if(N<0) {return false;}
		else
		{
		
		while(temp>0)
		{
			reverse=(reverse*10)+(temp%10);
			temp=temp/10;
		}
		}
		return(reverse==N);
	}

	public static void main(String[] args) {
		
		System.out.println(is_palindrome(-767));

	}

}
