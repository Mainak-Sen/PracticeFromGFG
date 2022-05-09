package com.gfg.mathematics;

public class PrimeFactors {
	//factors/divisors come in pairs one is the divisor ,the other is the quotient 
	//let x*y<=n where x and y are two factors of n
	//let x<y then x*x<=n then x<=sqroot(n)
	
	private static void print_prime_factors(int n) {
		
		if(n<=1) {System.out.print("Sorry!! no prime factors");}
		while(n%2==0)
		{
			System.out.print(2+" ");
			n=n/2;
		}
		while(n%3==0)
		{
			System.out.print(3+" ");
			n=n/3;
		}
		for(int i=5;i*i<=n;i=i+6)
		{
			while(n%i==0)
			{
				System.out.print(i+" ");
				n=n/i;
			}
			while(n%(i+2)==0)
			{
				System.out.print((i+2)+" ");
				n=n/(i+2);
			}
		}
		if(n>3)
		{
			System.out.print(n+" ");
		}
	}

	public static void main(String[] args) {
		print_prime_factors(84);

	}

}
