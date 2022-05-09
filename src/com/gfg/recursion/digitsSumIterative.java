package com.gfg.recursion;

public class digitsSumIterative {
	
	private static int findDigitsSum(int n)
	{
		int sum=0;
		if(n<10) {return n;}
		else
		{
			while(n>0)
			{
				int rem=n%10;
				sum+=rem;
				n/=10;
			}
		}
		
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(findDigitsSum(8));

	}

}
