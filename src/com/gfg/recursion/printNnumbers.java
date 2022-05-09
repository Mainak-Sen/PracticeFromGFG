package com.gfg.recursion;

public class printNnumbers {
	
	private static void printnnumbers(int n)
	{
		//think of recursively calling the function for (n-1) times and then print n
		//non tail recursive
		if(n==0) {return;}
		printnnumbers(n-1);
		System.out.print(n+" ");
		
		
	}

	public static void main(String[] args) {
		printnnumbers(10);
	}

}
