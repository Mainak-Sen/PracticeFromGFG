package com.gfg.mathematics;

public class factorial {
	
	public static long factorial(int n)
	{
		if(n==0) {return 1;}
		else {return n*factorial(n-1);}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(15));
	}

}
