package com.gfg.recursion;

public class stringpalindrome {

	private static boolean isPalindrome(String input,int start,int end) {
		
		if(start>end) {return false;}
		
		return ((input.charAt(start)==input.charAt(end)) && isPalindrome(input,start+1,end-1));
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome("madam",0,4));

	}

}
