package com.gfg.mathematics;

import java.util.Arrays;

//Sieve algorithm of Eratosthenes 
public class printAllprimes {
	
	private static void print_all_primes(int n)
	{
		if(n<=1) {System.out.println("Sorry!! No prime numbers found in the given range ");}
		boolean[] is_prime=new boolean[n+1];
		Arrays.fill(is_prime, true);
		
		for(int i=2;i*i<=n;i++)
		{
			if(is_prime[i])
			{
				for(int j=i*i;j<=n;j=j+i)
				{
					is_prime[j]=false;
				}
			}
		}
		
		for (int k=2;k<=n;k++)
		{
			if(is_prime[k])
			{
				System.out.print(k+" ");
			}
		}
		
		
		
	}
	public static void main(String[] args) {
		print_all_primes(20);

	}

}
