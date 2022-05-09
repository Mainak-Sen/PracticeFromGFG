package com.gfg.mathematics;

public class TrailingZeroesFactorial {
	
	//trailing zeroes come on the account of number of 2's and 5's in the factorial of the number 
	//its better to take into account the number of 5's as number of 5's will always be less than number of 2s
	//n/5 gives us the single factor as 5 for every 5th number in the factorial 
	//n/25 gives us the other 5 as factor which we have missed out while accounting only the 5th number (since in 25 there are 2 5's)
	//....in this way it continues depending on the number until which we should check for 5's aka trailing zeroes 
	
	private static int count_factorial_trailingzeroes(int n) {
		
		int res=0;
		for(int i=5;i<=n;i=i*5)
		{
			res+=n/i;
		}
		
		return res;
	}

	public static void main(String[] args) {
		System.out.println(count_factorial_trailingzeroes(125));

	}

}
