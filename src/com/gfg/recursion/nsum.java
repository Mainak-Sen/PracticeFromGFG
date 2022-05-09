package com.gfg.recursion;

public class nsum {
	//recursive finction to find sum of n natural numbers 
	private static int nsum(int n) {
		if(n==0) {return 0;}
		return n+nsum(n-1);
		
	}
	public static void main(String[] args) {
		System.out.println(nsum(90));
		

	}

}
