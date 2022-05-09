package com.gfg.recursion;

public class tailRecursion {
//writing a tail recursive function to print the factorial of a given number 
	//we will add a parameter k and initialize its value to 1 while passing the parameter
	private static int getFactorial(int n,int k) {
		if(n==0 || n==1)
		{
			return k;
		}
		return getFactorial(n-1,n*k);
	}
	public static void main(String[] args) {
		System.out.println(getFactorial(7,1));

	}

}
