package com.gfg.mathematics;

public class Exactly3DivisorsO1space {
	
	private static boolean  is_prime(int n) {
		
		if(n<=1) {return false;}
		for(int i=2;i*i<=n;i++)
		{
			if((n%i)==0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	private static int exactly3divisors(int N)
	{
			int n=(int)Math.sqrt(N);
			int count=0;
			for(int i=1;i<=n;i++)
			{
				if(is_prime(i))
				{
					count++;
				}
			}
			return count;
	}

	public static void main(String[] args) {
		System.out.println(exactly3divisors(999999));

	}

}
