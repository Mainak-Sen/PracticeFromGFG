package com.gfg.recursion;

public class PrintallSubsetsofString {
	
	private static void print_all_substrings(String input, String current,int index) {
		
		if(index==input.length()) {
			System.out.print(current+" ");
			return;
		}
		print_all_substrings(input,current,index+1);
		print_all_substrings(input,current+input.charAt(index),index+1);
		
	}

	public static void main(String[] args) {
		print_all_substrings("ABC","",0);

	}

}
