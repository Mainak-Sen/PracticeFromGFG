package com.gfg.mathematics;

public class FactorialDigitsCount {

	public static int digitsInFactorial(int N)
	{
		if(N<=0)
		{
			return 0;
		}
		else if(N==1)
		{
			return 1;
		}
		else
		{
			double digits=0;
			for(int i=2;i<=N;i++)
			{
				digits+=Math.log10(i);
			}
			return ((int)Math.floor(digits)+1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(digitsInFactorial(120));

	}

}
